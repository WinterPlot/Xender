package com.userlabs.xshare.audioplayer.exo.dlg;

import com.userlabs.xshare.audioplayer.exo.ui.XMPlayerFragment;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements com.userlabs.xshare.audioplayer.manager.b.InterfaceC0317b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.userlabs.xshare.audioplayer.manager.b.InterfaceC0317b
    public final void onTick(long j) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((c) obj).lambda$onViewCreated$0(j);
                break;
            case 1:
                ((XSleepTimerLeftFragment) obj).lambda$onViewCreated$2(j);
                break;
            default:
                ((XMPlayerFragment) obj).lambda$addSleepTimeComponentIfNeed$18(j);
                break;
        }
    }
}
