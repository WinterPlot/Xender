package com.userlabs.xshare.af;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class AfAndLogUrlData {
    private String af_url;
    private long eventTs;
    private long signature_expires_date;
    private String user_agent;
    private int vn;

    public static AfAndLogUrlData newInstance(String str, long j, String str2) {
        AfAndLogUrlData afAndLogUrlData = new AfAndLogUrlData();
        afAndLogUrlData.setVn(2);
        afAndLogUrlData.setAf_url(str);
        afAndLogUrlData.setEventTs(System.currentTimeMillis());
        afAndLogUrlData.setSignature_expires_date(j);
        afAndLogUrlData.setUser_agent(str2);
        return afAndLogUrlData;
    }

    public String getAf_url() {
        return this.af_url;
    }

    public long getEventTs() {
        return this.eventTs;
    }

    public long getSignature_expires_date() {
        return this.signature_expires_date;
    }

    public String getUser_agent() {
        return this.user_agent;
    }

    public int getVn() {
        return this.vn;
    }

    public void setAf_url(String str) {
        this.af_url = str;
    }

    public void setEventTs(long j) {
        this.eventTs = j;
    }

    public void setSignature_expires_date(long j) {
        this.signature_expires_date = j;
    }

    public void setUser_agent(String str) {
        this.user_agent = str;
    }

    public void setVn(int i) {
        this.vn = i;
    }
}
