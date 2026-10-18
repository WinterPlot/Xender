package androidx.camera.core.impl.utils;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    private static final Object a = new Object();
    private static final Map<String, WeakReference<Context>> b = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a {
        private a() {
        }

        public static Context createAttributionContext(Context context, String str) {
            return context.createAttributionContext(str);
        }

        public static String getAttributionTag(Context context) {
            return context.getAttributionTag();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class b {
        private b() {
        }

        public static Context createDeviceContext(Context context, int i) {
            return context.createDeviceContext(i);
        }

        public static int getDeviceId(Context context) {
            return context.getDeviceId();
        }
    }

    private g() {
    }

    public static Application getApplication(Context context) {
        for (Context applicationContext = context.getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
            if (applicationContext instanceof Application) {
                return (Application) applicationContext;
            }
        }
        return null;
    }

    private static String getApplicationContextHashKey(Context context) {
        return String.format("%d-%d-%s", Integer.valueOf(context.getApplicationContext().hashCode()), Integer.valueOf(getDeviceId(context)), Build.VERSION.SDK_INT >= 30 ? a.getAttributionTag(context) : null);
    }

    private static Context getCachedContext(String str) {
        Map<String, WeakReference<Context>> map = b;
        WeakReference<Context> weakReference = map.get(str);
        if (weakReference == null) {
            return null;
        }
        Context context = weakReference.get();
        if (context != null) {
            return context;
        }
        map.remove(str);
        return null;
    }

    public static int getDefaultDeviceId() {
        return 0;
    }

    public static int getDeviceId(Context context) {
        return Build.VERSION.SDK_INT >= 34 ? b.getDeviceId(context) : getDefaultDeviceId();
    }

    public static Context getPersistentApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        String applicationContextHashKey = getApplicationContextHashKey(context);
        synchronized (a) {
            try {
                Context cachedContext = getCachedContext(applicationContextHashKey);
                if (cachedContext != null) {
                    return cachedContext;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 34) {
                    applicationContext = b.createDeviceContext(applicationContext, b.getDeviceId(context));
                }
                if (i >= 30) {
                    String attributionTag = a.getAttributionTag(context);
                    if (!Objects.equals(attributionTag, a.getAttributionTag(applicationContext))) {
                        applicationContext = a.createAttributionContext(applicationContext, attributionTag);
                    }
                }
                b.put(applicationContextHashKey, new WeakReference<>(applicationContext));
                return applicationContext;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
