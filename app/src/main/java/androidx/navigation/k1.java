package androidx.navigation;

import android.os.Bundle;
import android.view.View;
import com.userlabs.xshare.playlist.dialog.SongsOperateDialogFragment;
import com.userlabs.xshare.ui.fragment.pc.NewPcGalleryFragment;
import com.userlabs.xshare.ui.fragment.res.AudioNavFragment;
import com.userlabs.xshare.ui.fragment.res.HistoryNavFragment;
import com.userlabs.xshare.ui.fragment.res.MediaVideoNavFragment;
import com.userlabs.xshare.ui.fragment.res.NewBaseResLoadAndHasOrderFragment;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k1(int i, Bundle bundle) {
        this.a = 0;
        this.b = i;
        this.c = bundle;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                l1.createNavigateOnClickListener$lambda$0(i2, (Bundle) obj, view);
                break;
            case 1:
                ((SongsOperateDialogFragment) obj).lambda$onViewCreated$0(i2, view);
                break;
            case 2:
                ((NewPcGalleryFragment) obj).lambda$installOrderLayout$2(i2, view);
                break;
            case 3:
                ((AudioNavFragment) obj).lambda$addOrderLayout$1(i2, view);
                break;
            case 4:
                ((HistoryNavFragment) obj).lambda$installOrderLayout$0(i2, view);
                break;
            case 5:
                ((MediaVideoNavFragment) obj).lambda$addOrderLayout$1(i2, view);
                break;
            case 6:
                ((NewBaseResLoadAndHasOrderFragment) obj).lambda$installOrderPart$0(i2, view);
                break;
            default:
                ((com.userlabs.xshare.ui.fragment.res.adapters.a) obj).lambda$getView$0(i2, view);
                break;
        }
    }

    public /* synthetic */ k1(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
