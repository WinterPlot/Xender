package com.userlabs.xshare.uploadlog.data;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class FailedInfo {
    private Map<String, String> ex_info;
    private String reason;
    private String record_id;
    private long time;
    private String type;
    private int v_code;
    private String v_name;

    public Map<String, String> getEx_info() {
        return this.ex_info;
    }

    public String getReason() {
        return this.reason;
    }

    public String getRecord_id() {
        return this.record_id;
    }

    public long getTime() {
        return this.time;
    }

    public String getType() {
        return this.type;
    }

    public int getV_code() {
        return this.v_code;
    }

    public String getV_name() {
        return this.v_name;
    }

    public void setEx_info(Map<String, String> map) {
        this.ex_info = map;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public void setRecord_id(String str) {
        this.record_id = str;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setV_code(int i) {
        this.v_code = i;
    }

    public void setV_name(String str) {
        this.v_name = str;
    }
}
