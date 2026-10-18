package org.apache.commons.io.function;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u0 implements c0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // org.apache.commons.io.function.c0
    public final Runnable asRunnable() {
        switch (this.a) {
            case 0:
                break;
        }
        return new b(this, 1);
    }

    @Override // org.apache.commons.io.function.c0
    public final void run() throws IOException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Runnable) obj).run();
                break;
            default:
                ((w) obj).remove();
                break;
        }
    }
}
