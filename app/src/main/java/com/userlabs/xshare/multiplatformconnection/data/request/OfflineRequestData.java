package com.userlabs.xshare.multiplatformconnection.data.request;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class OfflineRequestData extends MPCRequestData<Object> {
    public static OfflineRequestData create(String str) {
        OfflineRequestData offlineRequestData = new OfflineRequestData();
        MPCHeader mPCHeaderNewInstance = MPCHeader.newInstance("offline", 256);
        mPCHeaderNewInstance.setSession_id(str);
        offlineRequestData.setHeader(mPCHeaderNewInstance);
        offlineRequestData.setData(new Object());
        return offlineRequestData;
    }
}
