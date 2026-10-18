package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.tracing.h0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.uuid.Uuid;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private static volatile a d;
    private static final Object e = new Object();
    final Context c;
    final Set<Class<? extends b<?>>> b = new HashSet();
    final Map<Class<?>, Object> a = new HashMap();

    public a(Context context) {
        this.c = context.getApplicationContext();
    }

    private <T> T doInitialize(Class<? extends b<?>> cls, Set<Class<?>> set) {
        T t;
        if (h0.isEnabled()) {
            try {
                h0.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                h0.endSection();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (this.a.containsKey(cls)) {
            t = (T) this.a.get(cls);
        } else {
            set.add(cls);
            try {
                b<?> bVarNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends b<?>>> listDependencies = bVarNewInstance.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class<? extends b<?>> cls2 : listDependencies) {
                        if (!this.a.containsKey(cls2)) {
                            doInitialize(cls2, set);
                        }
                    }
                }
                t = (T) bVarNewInstance.create(this.c);
                set.remove(cls);
                this.a.put(cls, t);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        h0.endSection();
        return t;
    }

    public static a getInstance(Context context) {
        if (d == null) {
            synchronized (e) {
                try {
                    if (d == null) {
                        d = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public static void setDelegate(a aVar) {
        synchronized (e) {
            d = aVar;
        }
    }

    public void discoverAndInitialize(Bundle bundle) {
        String string = this.c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (b.class.isAssignableFrom(cls)) {
                            this.b.add((Class<? extends b<?>>) cls);
                        }
                    }
                }
                Iterator<Class<? extends b<?>>> it = this.b.iterator();
                while (it.hasNext()) {
                    doInitialize(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e2) {
                throw new StartupException(e2);
            }
        }
    }

    public <T> T initializeComponent(Class<? extends b<T>> cls) {
        return (T) doInitialize(cls);
    }

    public boolean isEagerlyInitialized(Class<? extends b<?>> cls) {
        return this.b.contains(cls);
    }

    public void discoverAndInitialize(Class<? extends InitializationProvider> cls) {
        try {
            try {
                h0.beginSection("Startup");
                discoverAndInitialize(this.c.getPackageManager().getProviderInfo(new ComponentName(this.c, cls), Uuid.SIZE_BITS).metaData);
                h0.endSection();
            } catch (PackageManager.NameNotFoundException e2) {
                throw new StartupException(e2);
            }
        } catch (Throwable th) {
            h0.endSection();
            throw th;
        }
    }

    public <T> T doInitialize(Class<? extends b<?>> cls) {
        T t;
        synchronized (e) {
            try {
                t = (T) this.a.get(cls);
                if (t == null) {
                    t = (T) doInitialize(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }
}
