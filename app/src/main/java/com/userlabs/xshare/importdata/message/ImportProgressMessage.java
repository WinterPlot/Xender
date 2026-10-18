package com.userlabs.xshare.importdata.message;

import com.userlabs.xshare.utils.l;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class ImportProgressMessage {
    private String cate;
    private int finished;
    private String status;
    private int total;

    public static ImportProgressMessage getJavaBeen(String str) {
        return (ImportProgressMessage) l.getGson().fromJson(str, ImportProgressMessage.class);
    }

    public String getCate() {
        return this.cate;
    }

    public int getFinished() {
        return this.finished;
    }

    public String getStatus() {
        return this.status;
    }

    public int getTotal() {
        return this.total;
    }

    public void setCate(String str) {
        this.cate = str;
    }

    public void setFinished(int i) {
        this.finished = i;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTotal(int i) {
        this.total = i;
    }

    public String toString() {
        return l.getGson().toJson(this);
    }

    public void setFail_code(String str) {
    }
}
