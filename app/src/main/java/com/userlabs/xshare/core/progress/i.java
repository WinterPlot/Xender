package com.userlabs.xshare.core.progress;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class i {
    private final int a;
    private final int b;
    private final int c;

    public i(int[] iArr) {
        this.a = iArr[0];
        this.b = iArr[1];
        this.c = iArr[2];
    }

    public int getAllTaskCount() {
        return this.b + this.a;
    }

    public int getUnfinishUpdateCount() {
        return this.c;
    }

    public int getUnfinishedReceiveTaskCount() {
        return this.b;
    }

    public int getUnfinishedSendTaskCount() {
        return this.a;
    }
}
