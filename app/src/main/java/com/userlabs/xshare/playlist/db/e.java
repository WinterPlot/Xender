package com.userlabs.xshare.playlist.db;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class e {
    private long a;
    private long b;
    private long c;
    private long d;
    private int e;

    public long getPlaylistId() {
        return this.b;
    }

    public long getSongId() {
        return this.c;
    }

    public int getSort() {
        return this.e;
    }

    public long getTimeMs() {
        return this.d;
    }

    public long get_id() {
        return this.a;
    }

    public void setPlaylistId(long j) {
        this.b = j;
    }

    public void setSongId(long j) {
        this.c = j;
    }

    public void setSort(int i) {
        this.e = i;
    }

    public void setTimeMs(long j) {
        this.d = j;
    }

    public void set_id(long j) {
        this.a = j;
    }
}
