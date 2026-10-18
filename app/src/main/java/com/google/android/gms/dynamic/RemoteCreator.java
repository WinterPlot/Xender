package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.m;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class RemoteCreator<T> {
    private final String a;
    private Object b;

    public RemoteCreator(String str) {
        this.a = str;
    }

    public abstract T getRemoteCreator(IBinder iBinder);

    public final T getRemoteCreatorInstance(Context context) throws RemoteCreatorException {
        T t = (T) this.b;
        if (t != null) {
            return t;
        }
        m.checkNotNull(context);
        Context remoteContext = d.getRemoteContext(context);
        if (remoteContext == null) {
            throw new RemoteCreatorException("Could not get remote context.");
        }
        try {
            T remoteCreator = getRemoteCreator((IBinder) remoteContext.getClassLoader().loadClass(this.a).newInstance());
            this.b = remoteCreator;
            return remoteCreator;
        } catch (ClassNotFoundException e) {
            throw new RemoteCreatorException("Could not load creator class.", e);
        } catch (IllegalAccessException e2) {
            throw new RemoteCreatorException("Could not access creator.", e2);
        } catch (InstantiationException e3) {
            throw new RemoteCreatorException("Could not instantiate creator.", e3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class RemoteCreatorException extends Exception {
        public RemoteCreatorException(String str) {
            super(str);
        }

        public RemoteCreatorException(String str, Throwable th) {
            super(str, th);
        }
    }
}
