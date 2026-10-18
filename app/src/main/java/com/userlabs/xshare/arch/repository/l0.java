package com.userlabs.xshare.arch.repository;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class l0 extends p0 {
    Boolean c;

    public l0(Boolean bool, Boolean bool2, Boolean bool3) {
        super(bool, bool2);
        this.c = bool3;
    }

    public boolean isHasPhotoSizeFilter() {
        Boolean bool = this.c;
        return bool != null && bool.booleanValue();
    }
}
