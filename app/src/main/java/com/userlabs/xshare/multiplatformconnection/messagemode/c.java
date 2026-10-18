package com.userlabs.xshare.multiplatformconnection.messagemode;

import com.userlabs.xshare.multiplatformconnection.data.request.MPCCommonRequestData;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends h {
    public c(String str, MPCCommonRequestData mPCCommonRequestData) {
        super(str, mPCCommonRequestData);
    }

    @Override // com.userlabs.xshare.multiplatformconnection.messagemode.h
    public final int generatePriority() {
        return 10;
    }
}
