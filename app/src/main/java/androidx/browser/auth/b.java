package androidx.browser.auth;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.IBinder;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private final android.support.customtabs.a a;
    private final ComponentName b;
    private final PendingIntent c;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a {
        private final PendingIntent a;
        private final Executor b;
        private final androidx.browser.auth.a c;

        public a(PendingIntent pendingIntent, Executor executor, androidx.browser.auth.a aVar) {
            this.a = pendingIntent;
            this.b = executor;
            this.c = aVar;
        }

        public androidx.browser.auth.a getCallback() {
            return this.c;
        }

        public Executor getExecutor() {
            return this.b;
        }

        public PendingIntent getId() {
            return this.a;
        }
    }

    public b(android.support.customtabs.a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.a = aVar;
        this.b = componentName;
        this.c = pendingIntent;
    }

    public IBinder getBinder() {
        return this.a.asBinder();
    }

    public ComponentName getComponentName() {
        return this.b;
    }

    public PendingIntent getId() {
        return this.c;
    }
}
