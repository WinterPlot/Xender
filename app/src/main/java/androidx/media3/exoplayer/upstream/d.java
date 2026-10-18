package androidx.media3.exoplayer.upstream;

import android.os.Handler;
import androidx.media3.datasource.v;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface d {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a {

        /* JADX INFO: renamed from: androidx.media3.exoplayer.upstream.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public static final class C0187a {
            private final CopyOnWriteArrayList<C0188a> a = new CopyOnWriteArrayList<>();

            /* JADX INFO: renamed from: androidx.media3.exoplayer.upstream.d$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
            public static final class C0188a {
                private final Handler a;
                private final a b;
                private boolean c;

                public C0188a(Handler handler, a aVar) {
                    this.a = handler;
                    this.b = aVar;
                }

                public void release() {
                    this.c = true;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void lambda$bandwidthSample$0(C0188a c0188a, int i, long j, long j2) {
                c0188a.b.onBandwidthSample(i, j, j2);
            }

            public void addListener(Handler handler, a aVar) {
                com.google.common.base.m.checkNotNull(handler);
                com.google.common.base.m.checkNotNull(aVar);
                removeListener(aVar);
                this.a.add(new C0188a(handler, aVar));
            }

            public void bandwidthSample(int i, long j, long j2) {
                final int i2;
                final long j3;
                final long j4;
                for (final C0188a c0188a : this.a) {
                    if (c0188a.c) {
                        i2 = i;
                        j3 = j;
                        j4 = j2;
                    } else {
                        i2 = i;
                        j3 = j;
                        j4 = j2;
                        c0188a.a.post(new Runnable() { // from class: androidx.media3.exoplayer.upstream.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                d.a.C0187a.lambda$bandwidthSample$0(c0188a, i2, j3, j4);
                            }
                        });
                    }
                    i = i2;
                    j = j3;
                    j2 = j4;
                }
            }

            public void removeListener(a aVar) {
                for (C0188a c0188a : this.a) {
                    if (c0188a.b == aVar) {
                        c0188a.release();
                        this.a.remove(c0188a);
                    }
                }
            }
        }

        void onBandwidthSample(int i, long j, long j2);
    }

    void addEventListener(Handler handler, a aVar);

    long getBitrateEstimate();

    long getTimeToFirstByteEstimateUs();

    v getTransferListener();

    void removeEventListener(a aVar);
}
