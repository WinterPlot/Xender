package com.userlabs.xshare.multiplatformconnection.data.request;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class HeartRequestData extends MPCRequestData<Object> {
    public static HeartRequestData create(String str) {
        HeartRequestData heartRequestData = new HeartRequestData();
        MPCHeader mPCHeaderNewInstance = MPCHeader.newInstance("heart", 768);
        mPCHeaderNewInstance.setSession_id(str);
        heartRequestData.setHeader(mPCHeaderNewInstance);
        heartRequestData.setData(new Object());
        return heartRequestData;
    }
}
