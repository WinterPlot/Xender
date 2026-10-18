package com.userlabs.xshare.arch.repository;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class j extends p0 {
    private List<String> c;
    private long d;
    private final boolean e;

    public j(Boolean bool, Boolean bool2, Boolean bool3) {
        super(bool, bool2);
        boolean zEquals = Boolean.TRUE.equals(bool3);
        this.e = zEquals;
        if (zEquals) {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(".mp3");
            this.c.add(".m4a");
            this.d = 500000L;
        }
    }

    public List<String> getFilterExtList() {
        return this.c;
    }

    public long getFilterMinSize() {
        return this.d;
    }

    public String getSelection() {
        StringBuilder sb = new StringBuilder();
        if (!isShowHidden()) {
            sb.append("isHiddenFile=false and ");
        }
        if (!isShowNoMedia()) {
            sb.append("isNomediaFile=false");
        }
        return sb.toString();
    }

    public boolean isMusicFilterOpen() {
        return this.e;
    }
}
