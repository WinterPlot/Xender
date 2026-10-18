package com.userlabs.xshare.arch.db.entity;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends com.userlabs.xshare.beans.a {
    private long a;
    private String b;
    private String c;
    private String d;
    private long e;
    private long f;
    private String g;
    private String h;
    private boolean i;

    public String getA_gaid() {
        return this.b;
    }

    public String getB_gaid() {
        return this.c;
    }

    public String getEvent_id() {
        return this.d;
    }

    public String getEvent_info() {
        return this.h;
    }

    public long getEvent_time() {
        return this.e;
    }

    public String getPn() {
        return this.g;
    }

    public long getPost_time() {
        return this.f;
    }

    public String getShowContent() {
        return "Event id: " + this.d + "\nA Gaid: " + this.b + "\nB Gaid: " + this.c + "\npost_time:" + com.userlabs.xshare.core.utils.c.getDate(this.f, "yyyy-MM-dd kk:mm:ss") + "\nevent_time:" + com.userlabs.xshare.core.utils.c.getDate(this.e, "yyyy-MM-dd kk:mm:ss") + "\npn:" + this.g + "\nsuccess:" + this.i;
    }

    public long get_id() {
        return this.a;
    }

    public boolean isPost_success() {
        return this.i;
    }

    public void setA_gaid(String str) {
        this.b = str;
    }

    public void setB_gaid(String str) {
        this.c = str;
    }

    public void setEvent_id(String str) {
        this.d = str;
    }

    public void setEvent_info(String str) {
        this.h = str;
    }

    public void setEvent_time(long j) {
        this.e = j;
    }

    public void setPn(String str) {
        this.g = str;
    }

    public void setPost_success(boolean z) {
        this.i = z;
    }

    public void setPost_time(long j) {
        this.f = j;
    }

    public void set_id(long j) {
        this.a = j;
    }
}
