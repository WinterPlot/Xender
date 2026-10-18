package com.userlabs.xshare.worker.data;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class SmsConfig {
    private int day_limit;
    private int hour_limit;
    private int time_out;
    private String tips;

    public int getDay_limit() {
        return this.day_limit;
    }

    public int getHour_limit() {
        return this.hour_limit;
    }

    public int getTime_out() {
        return this.time_out;
    }

    public String getTips() {
        return this.tips;
    }

    public void setDay_limit(int i) {
        this.day_limit = i;
    }

    public void setHour_limit(int i) {
        this.hour_limit = i;
    }

    public void setTime_out(int i) {
        this.time_out = i;
    }

    public void setTips(String str) {
        this.tips = str;
    }
}
