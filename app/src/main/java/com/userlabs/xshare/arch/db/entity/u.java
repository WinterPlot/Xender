package com.userlabs.xshare.arch.db.entity;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class u {
    private long a;
    private String b;
    private int c;
    private String d;
    private String e;
    private boolean f;
    private Pattern g;

    public String getGroup_name() {
        return this.d;
    }

    public long getId() {
        return this.a;
    }

    public int getIdx() {
        return this.c;
    }

    public String getPattern() {
        return this.b;
    }

    public String getPn() {
        return this.e;
    }

    public Pattern getRealPattern() {
        Pattern pattern = this.g;
        if (pattern != null) {
            return pattern;
        }
        Pattern patternCompile = Pattern.compile(this.b, 2);
        this.g = patternCompile;
        return patternCompile;
    }

    public boolean isShow() {
        return this.f;
    }

    public void setGroup_name(String str) {
        this.d = str;
    }

    public void setId(long j) {
        this.a = j;
    }

    public void setIdx(int i) {
        this.c = i;
    }

    public void setPattern(String str) {
        this.b = str;
    }

    public void setPn(String str) {
        this.e = str;
    }

    public void setShow(boolean z) {
        this.f = z;
    }
}
