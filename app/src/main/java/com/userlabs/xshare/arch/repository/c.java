package com.userlabs.xshare.arch.repository;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class c {
    private boolean a;
    private boolean b;
    private boolean c = false;
    private boolean d;

    public c(Boolean bool, Boolean bool2, Boolean bool3) {
        this.a = bool.booleanValue();
        this.b = bool2.booleanValue();
        this.d = bool3.booleanValue();
    }

    public boolean isFilterRepeat() {
        return this.b;
    }

    public boolean isShowHidden() {
        return this.a;
    }

    public boolean isShowSystemType() {
        return this.d;
    }

    public boolean isTimeLimit() {
        return this.c;
    }
}
