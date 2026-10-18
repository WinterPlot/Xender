package com.userlabs.xshare.arch.db.entity;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class r {
    private String a;
    private int b;
    private String c;
    private boolean d;
    private boolean e;
    private String f;
    private String g;
    private String h;
    private long i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private long s;
    private long t;
    private long u;
    private long v;
    private int w;
    private boolean x = false;
    private int y = 0;
    private int z = 10;

    public String getAppid() {
        return this.c;
    }

    public long getClickTime() {
        return this.s;
    }

    public int getClick_net_state() {
        return this.z;
    }

    public String getContain() {
        return this.j;
    }

    public String getContainexpression() {
        return this.k;
    }

    public String[] getContains() {
        String str = this.j;
        return str != null ? str.split(",") : new String[0];
    }

    public String getDesc() {
        return this.g;
    }

    public String getExclude() {
        return this.l;
    }

    public String getExcludeexpression() {
        return this.m;
    }

    public long getExpire() {
        return this.i;
    }

    public String getIconurl() {
        return this.h;
    }

    public String getInstruction() {
        return this.n;
    }

    public int getJobsplit() {
        return this.w;
    }

    public long getNotifyTime() {
        return this.t;
    }

    public int getNotify_net_state() {
        return this.y;
    }

    public String getParam1() {
        return this.o;
    }

    public String getParam2() {
        return this.p;
    }

    public String getParam3() {
        return this.q;
    }

    public String getParam4() {
        return this.r;
    }

    public long getReceiveTime() {
        return this.v;
    }

    public String getTitle() {
        return this.f;
    }

    public int getType() {
        return this.b;
    }

    public long getUpdateTime() {
        return this.u;
    }

    public String getX_mid() {
        return this.a;
    }

    public boolean isExecuted() {
        return this.x;
    }

    public boolean isSound() {
        return this.d;
    }

    public boolean isViberate() {
        return this.e;
    }

    public void setAppid(String str) {
        this.c = str;
    }

    public void setClickTime(long j) {
        this.s = j;
    }

    public void setClick_net_state(int i) {
        this.z = i;
    }

    public void setContain(String str) {
        this.j = str;
    }

    public void setContainexpression(String str) {
        this.k = str;
    }

    public void setDesc(String str) {
        this.g = str;
    }

    public void setExclude(String str) {
        this.l = str;
    }

    public void setExcludeexpression(String str) {
        this.m = str;
    }

    public void setExecuted(boolean z) {
        this.x = z;
    }

    public void setExpire(long j) {
        this.i = j;
    }

    public void setIconurl(String str) {
        this.h = str;
    }

    public void setInstruction(String str) {
        this.n = str;
    }

    public void setJobsplit(int i) {
        this.w = i;
    }

    public void setNotifyTime(long j) {
        this.t = j;
    }

    public void setNotify_net_state(int i) {
        this.y = i;
    }

    public void setParam1(String str) {
        this.o = str;
    }

    public void setParam2(String str) {
        this.p = str;
    }

    public void setParam3(String str) {
        this.q = str;
    }

    public void setParam4(String str) {
        this.r = str;
    }

    public void setReceiveTime(long j) {
        this.v = j;
    }

    public void setSound(boolean z) {
        this.d = z;
    }

    public void setTitle(String str) {
        this.f = str;
    }

    public void setType(int i) {
        this.b = i;
    }

    public void setUpdateTime(long j) {
        this.u = j;
    }

    public void setViberate(boolean z) {
        this.e = z;
    }

    public void setX_mid(String str) {
        this.a = str;
    }
}
