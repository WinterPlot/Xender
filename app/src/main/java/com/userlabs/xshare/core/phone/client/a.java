package com.userlabs.xshare.core.phone.client;

import com.userlabs.xshare.nlist.h;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ a(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e.lambda$sendClientInfoToClient$4(this.b, this.c);
                break;
            case 1:
                com.userlabs.xshare.multiplatformconnection.client.d.postMsgSync(this.b, this.c);
                break;
            default:
                h.lambda$exeSelectActive$1(this.b, this.c);
                break;
        }
    }
}
