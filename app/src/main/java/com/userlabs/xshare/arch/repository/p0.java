package com.userlabs.xshare.arch.repository;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class p0 {
    Boolean a;
    Boolean b;

    public p0(Boolean bool, Boolean bool2) {
        this.a = bool;
        this.b = bool2;
    }

    public boolean isShowHidden() {
        Boolean bool = this.a;
        return bool != null && bool.booleanValue();
    }

    public boolean isShowNoMedia() {
        Boolean bool = this.b;
        return bool != null && bool.booleanValue();
    }
}
