package com.userlabs.xshare.multiplatformconnection.db;

import com.userlabs.xshare.multiplatformconnection.data.MetaInfo;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    private String a;
    private String b;
    private String c;
    private MetaInfo d;

    public String getDlKey() {
        return this.a;
    }

    public MetaInfo getMetaInfo() {
        return this.d;
    }

    public String getPath() {
        return this.b;
    }

    public String getToDeviceId() {
        return this.c;
    }

    public void setDlKey(String str) {
        this.a = str;
    }

    public void setMetaInfo(MetaInfo metaInfo) {
        this.d = metaInfo;
    }

    public void setPath(String str) {
        this.b = str;
    }

    public void setToDeviceId(String str) {
        this.c = str;
    }
}
