package com.userlabs.xshare.arch.db.entity;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class q {
    private String a;
    private byte[] b;
    private int c;
    private String d;
    private int e;
    private long f;
    private int g;
    private String h;
    private String i;
    private int j;

    public byte[] getAvatar() {
        return this.b;
    }

    public int getAvatar_change_flag() {
        return this.j;
    }

    public int getConnect_times() {
        return this.e;
    }

    public int getDeleted() {
        return this.g;
    }

    public String getDevice_id() {
        return this.a;
    }

    public int getDevice_type() {
        return this.c;
    }

    public long getLast_connect_date() {
        return this.f;
    }

    public String getMac() {
        return this.h;
    }

    public String getNick_name() {
        return this.d;
    }

    public String get_u_id() {
        return this.i;
    }

    public void setAvatar(byte[] bArr) {
        this.b = bArr;
    }

    public void setAvatar_change_flag(int i) {
        this.j = i;
    }

    public void setConnect_times(int i) {
        this.e = i;
    }

    public void setDeleted(int i) {
        this.g = i;
    }

    public void setDevice_id(String str) {
        this.a = str;
    }

    public void setDevice_type(int i) {
        this.c = i;
    }

    public void setLast_connect_date(long j) {
        this.f = j;
    }

    public void setMac(String str) {
        this.h = str;
    }

    public void setNick_name(String str) {
        this.d = str;
    }

    public void set_u_id(String str) {
        this.i = str;
    }
}
