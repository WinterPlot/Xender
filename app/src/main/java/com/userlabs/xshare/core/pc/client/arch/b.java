package com.userlabs.xshare.core.pc.client.arch;

import androidx.lifecycle.i0;
import com.userlabs.xshare.importdata.ExParentDialogFragment;
import com.userlabs.xshare.ui.fragment.tomp3.ToMp3Fragment;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements i0 {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    @Override // androidx.lifecycle.i0
    public final void onChanged(Object obj) {
        switch (this.a) {
            case 0:
                c.lambda$startObserve$0((Integer) obj);
                break;
            case 1:
                e.lambda$startObserve$0((Integer) obj);
                break;
            case 2:
                g.lambda$startObserve$0((Integer) obj);
                break;
            case 3:
                h.lambda$startObserve$0((Integer) obj);
                break;
            case 4:
                ExParentDialogFragment.lambda$onViewCreated$5((com.userlabs.xshare.importdata.message.h) obj);
                break;
            default:
                ToMp3Fragment.lambda$subscribe$2((com.userlabs.xshare.arch.entry.b) obj);
                break;
        }
    }
}
