package com.userlabs.xshare.worker.data;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class RequestResultStatusMessage implements Serializable {
    private int code = -1;
    private String reason;

    public int getCode() {
        return this.code;
    }

    public String getReason() {
        return this.reason;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setReason(String str) {
        this.reason = str;
    }
}
