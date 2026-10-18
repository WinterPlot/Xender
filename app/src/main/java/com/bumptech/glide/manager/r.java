package com.bumptech.glide.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class r {
    private static volatile r d;
    private final c a;
    final Set<com.bumptech.glide.manager.b.a> b = new HashSet();
    private boolean c;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a implements com.bumptech.glide.util.f.b<ConnectivityManager> {
        final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bumptech.glide.util.f.b
        public ConnectivityManager get() {
            return (ConnectivityManager) this.a.getSystemService("connectivity");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class b implements com.bumptech.glide.manager.b.a {
        public b() {
        }

        @Override // com.bumptech.glide.manager.b.a
        public void onConnectivityChanged(boolean z) {
            ArrayList arrayList;
            com.bumptech.glide.util.l.assertMainThread();
            synchronized (r.this) {
                arrayList = new ArrayList(r.this.b);
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((com.bumptech.glide.manager.b.a) obj).onConnectivityChanged(z);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface c {
        boolean register();

        void unregister();
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class d implements c {
        boolean a;
        final com.bumptech.glide.manager.b.a b;
        private final com.bumptech.glide.util.f.b<ConnectivityManager> c;
        private final ConnectivityManager.NetworkCallback d = new a();

        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public class a extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: renamed from: com.bumptech.glide.manager.r$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
            public class RunnableC0411a implements Runnable {
                final /* synthetic */ boolean a;

                public RunnableC0411a(boolean z) {
                    this.a = z;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.onConnectivityChange(this.a);
                }
            }

            public a() {
            }

            private void postOnConnectivityChange(boolean z) {
                com.bumptech.glide.util.l.postOnUiThread(new RunnableC0411a(z));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                postOnConnectivityChange(true);
            }

            public void onConnectivityChange(boolean z) {
                com.bumptech.glide.util.l.assertMainThread();
                d dVar = d.this;
                boolean z2 = dVar.a;
                dVar.a = z;
                if (z2 != z) {
                    dVar.b.onConnectivityChanged(z);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                postOnConnectivityChange(false);
            }
        }

        public d(com.bumptech.glide.util.f.b<ConnectivityManager> bVar, com.bumptech.glide.manager.b.a aVar) {
            this.c = bVar;
            this.b = aVar;
        }

        @Override // com.bumptech.glide.manager.r.c
        public boolean register() {
            this.a = this.c.get().getActiveNetwork() != null;
            try {
                this.c.get().registerDefaultNetworkCallback(this.d);
                return true;
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e);
                }
                return false;
            }
        }

        @Override // com.bumptech.glide.manager.r.c
        public void unregister() {
            this.c.get().unregisterNetworkCallback(this.d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class e implements c {
        static final Executor g = AsyncTask.SERIAL_EXECUTOR;
        final Context a;
        final com.bumptech.glide.manager.b.a b;
        private final com.bumptech.glide.util.f.b<ConnectivityManager> c;
        volatile boolean d;
        volatile boolean e;
        final BroadcastReceiver f = new a();

        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                e.this.onConnectivityChange();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.d = eVar.isConnected();
                try {
                    e eVar2 = e.this;
                    eVar2.a.registerReceiver(eVar2.f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    e.this.e = true;
                } catch (SecurityException e) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e);
                    }
                    e.this.e = false;
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (e.this.e) {
                    e.this.e = false;
                    e eVar = e.this;
                    eVar.a.unregisterReceiver(eVar.f);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z = e.this.d;
                e eVar = e.this;
                eVar.d = eVar.isConnected();
                if (z != e.this.d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + e.this.d);
                    }
                    e eVar2 = e.this;
                    eVar2.notifyChangeOnUiThread(eVar2.d);
                }
            }
        }

        /* JADX INFO: renamed from: com.bumptech.glide.manager.r$e$e, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public class RunnableC0412e implements Runnable {
            final /* synthetic */ boolean a;

            public RunnableC0412e(boolean z) {
                this.a = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.b.onConnectivityChanged(this.a);
            }
        }

        public e(Context context, com.bumptech.glide.util.f.b<ConnectivityManager> bVar, com.bumptech.glide.manager.b.a aVar) {
            this.a = context.getApplicationContext();
            this.c = bVar;
            this.b = aVar;
        }

        public boolean isConnected() {
            try {
                NetworkInfo activeNetworkInfo = this.c.get().getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
                }
                return true;
            }
        }

        public void notifyChangeOnUiThread(boolean z) {
            com.bumptech.glide.util.l.postOnUiThread(new RunnableC0412e(z));
        }

        public void onConnectivityChange() {
            g.execute(new d());
        }

        @Override // com.bumptech.glide.manager.r.c
        public boolean register() {
            g.execute(new b());
            return true;
        }

        @Override // com.bumptech.glide.manager.r.c
        public void unregister() {
            g.execute(new c());
        }
    }

    private r(Context context) {
        com.bumptech.glide.util.f.b bVarMemorize = com.bumptech.glide.util.f.memorize(new a(context));
        b bVar = new b();
        this.a = Build.VERSION.SDK_INT >= 24 ? new d(bVarMemorize, bVar) : new e(context, bVarMemorize, bVar);
    }

    public static r get(Context context) {
        if (d == null) {
            synchronized (r.class) {
                try {
                    if (d == null) {
                        d = new r(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    private void maybeRegisterReceiver() {
        if (this.c || this.b.isEmpty()) {
            return;
        }
        this.c = this.a.register();
    }

    private void maybeUnregisterReceiver() {
        if (this.c && this.b.isEmpty()) {
            this.a.unregister();
            this.c = false;
        }
    }

    public static void reset() {
        d = null;
    }

    public synchronized void register(com.bumptech.glide.manager.b.a aVar) {
        this.b.add(aVar);
        maybeRegisterReceiver();
    }

    public synchronized void unregister(com.bumptech.glide.manager.b.a aVar) {
        this.b.remove(aVar);
        maybeUnregisterReceiver();
    }
}
