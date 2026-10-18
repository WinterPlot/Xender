package androidx.core.view;

import android.view.WindowInsetsController;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n0 implements WindowInsetsController.OnControllableInsetsChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                m0.b.lambda$hide$0((AtomicBoolean) obj, windowInsetsController, i);
                break;
            default:
                ((o1.d) obj).lambda$addOnControllableInsetsChangedListener$0(null, windowInsetsController, i);
                break;
        }
    }
}
