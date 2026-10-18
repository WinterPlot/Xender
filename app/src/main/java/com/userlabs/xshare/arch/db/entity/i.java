package com.userlabs.xshare.arch.db.entity;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class i {
    private long a;
    private String b;
    private String c;
    private long d;
    private String e;
    private String f;
    private int g;
    private Map<String, String> h;
    private int i;

    public Map<String, String> getEx_info() {
        return this.h;
    }

    public int getNet() {
        return this.i;
    }

    public String getReason() {
        return this.c;
    }

    public String getRecord_id() {
        return this.e;
    }

    public long getTime() {
        return this.d;
    }

    public String getType() {
        return this.b;
    }

    public int getVer_code() {
        return this.g;
    }

    public String getVer_name() {
        return this.f;
    }

    public long get_id() {
        return this.a;
    }

    public void setEx_info(Map<String, String> map) {
        this.h = map;
    }

    public void setNet(int i) {
        this.i = i;
    }

    public void setReason(String str) {
        this.c = str;
    }

    public void setRecord_id(String str) {
        this.e = str;
    }

    public void setTime(long j) {
        this.d = j;
    }

    public void setType(String str) {
        this.b = str;
    }

    public void setVer_code(int i) {
        this.g = i;
    }

    public void setVer_name(String str) {
        this.f = str;
    }

    public void set_id(long j) {
        this.a = j;
    }
}
