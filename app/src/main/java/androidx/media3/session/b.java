package androidx.media3.session;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
final class b {
    private static final Uri g = Uri.parse("content://androidx.car.app.connection");
    private final Context a;
    private final Runnable b;
    private final Executor c;
    private final C0211b d;
    private final AtomicBoolean e;
    private final AtomicBoolean f;

    /* JADX INFO: renamed from: androidx.media3.session.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public final class C0211b extends BroadcastReceiver {
        private C0211b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            b.this.c.execute(new androidx.media3.session.a(b.this, 2));
        }
    }

    public b(Context context, Runnable runnable) {
        this.a = context.getApplicationContext();
        this.b = runnable;
        Executor executor = androidx.media3.common.util.a.get();
        this.c = executor;
        this.d = new C0211b();
        this.e = new AtomicBoolean();
        this.f = new AtomicBoolean();
        executor.execute(new androidx.media3.session.a(this, 1));
    }

    public static /* synthetic */ void access$200(b bVar) {
        bVar.updateConnectionState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        IntentFilter intentFilter = new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED");
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i >= 33) {
            context.registerReceiver(this.d, intentFilter, 2);
        } else {
            context.registerReceiver(this.d, intentFilter);
        }
        updateConnectionState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$1() {
        this.a.unregisterReceiver(this.d);
    }

    private boolean queryConnectionState() {
        try {
            Cursor cursorQuery = this.a.getContentResolver().query(g, new String[]{"CarConnectionState"}, null, null, null);
            if (cursorQuery == null) {
                if (cursorQuery != null) {
                }
                return false;
            }
            try {
                int columnIndex = cursorQuery.getColumnIndex("CarConnectionState");
                if (columnIndex != -1 && cursorQuery.moveToNext()) {
                    boolean z = cursorQuery.getInt(columnIndex) != 0;
                    cursorQuery.close();
                    return z;
                }
            } catch (Throwable th) {
                try {
                    cursorQuery.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            return false;
            cursorQuery.close();
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateConnectionState() {
        boolean z = this.e.get();
        boolean zQueryConnectionState = queryConnectionState();
        this.e.set(zQueryConnectionState);
        if (z == zQueryConnectionState || this.f.get()) {
            return;
        }
        this.b.run();
    }

    public boolean isConnected() {
        return this.e.get();
    }

    public void release() {
        if (this.f.getAndSet(true)) {
            return;
        }
        this.c.execute(new androidx.media3.session.a(this, 0));
    }
}
