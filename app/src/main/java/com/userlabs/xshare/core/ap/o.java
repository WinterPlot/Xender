package com.userlabs.xshare.core.ap;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class o implements f {
    @Override // com.userlabs.xshare.core.ap.f
    public boolean accept(String str) {
        return n.startWithXShareFix(str) || n.startWithExchangeFix(str) || n.startWithPcFix(str) || n.startWithWebShare(str);
    }
}
