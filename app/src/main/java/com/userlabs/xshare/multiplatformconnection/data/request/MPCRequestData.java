package com.userlabs.xshare.multiplatformconnection.data.request;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class MPCRequestData<Data> {
    private Data data;
    private MPCHeader header;

    public Data getData() {
        return this.data;
    }

    public MPCHeader getHeader() {
        return this.header;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setHeader(MPCHeader mPCHeader) {
        this.header = mPCHeader;
    }
}
