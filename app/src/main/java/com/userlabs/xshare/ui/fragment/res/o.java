package com.userlabs.xshare.ui.fragment.res;

import androidx.lifecycle.i0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements i0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileDirFragment b;

    public /* synthetic */ o(FileDirFragment fileDirFragment, int i) {
        this.a = i;
        this.b = fileDirFragment;
    }

    @Override // androidx.lifecycle.i0
    public final void onChanged(Object obj) {
        int i = this.a;
        FileDirFragment fileDirFragment = this.b;
        switch (i) {
            case 0:
                fileDirFragment.lambda$subscribeViewModel$1((com.userlabs.xshare.arch.vo.a) obj);
                break;
            case 1:
                fileDirFragment.lambda$subscribeViewModel$2((String) obj);
                break;
            case 2:
                fileDirFragment.lambda$subscribeViewModel$3((com.userlabs.xshare.arch.entry.b) obj);
                break;
            default:
                fileDirFragment.lambda$onResumeFirstTimeThisLifecycle$0((com.userlabs.xshare.arch.entry.b) obj);
                break;
        }
    }
}
