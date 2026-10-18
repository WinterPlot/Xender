package androidx.media3.common.util;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ m0(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                return n0.lambda$newSingleThreadExecutor$3(str, runnable);
            default:
                return n0.lambda$newSingleThreadScheduledExecutor$4(str, runnable);
        }
    }
}
