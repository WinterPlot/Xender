package com.userlabs.xshare.core.progress;

import com.userlabs.xshare.utils.j;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class f {
    private String a;
    private float b;
    private String c;
    private int d;

    private f(float f, long j, long j2) {
        computeSpeed(f);
        computeTransferred(j);
        computeTotalProgress(j, j2);
    }

    private void computeSpeed(float f) {
        this.b = f;
        this.a = j.formatBytes(Float.valueOf(f).longValue()) + "/s";
    }

    private void computeTotalProgress(long j, long j2) {
        if (j2 > 0) {
            this.d = (int) ((j * 100) / j2);
        } else {
            this.d = 100;
        }
    }

    private void computeTransferred(long j) {
        this.c = j.formatBytes(j);
    }

    public static f create(float f, long j, long j2) {
        return new f(f, j, j2);
    }

    public String getSpeed() {
        return this.a;
    }

    public float getSpeedBytes() {
        return this.b;
    }

    public int getTotalProgress() {
        return this.d;
    }

    public String getTransferred() {
        return this.c;
    }
}
