package com.userlabs.xshare.vdlist;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class f {
    public long a;
    public List<String> b;

    public f(long j, List<String> list) {
        this.a = j;
        this.b = list;
    }

    public String toString() {
        return "VdFileListUpdate{id=" + this.a + ", targetFileList=" + this.b + '}';
    }
}
