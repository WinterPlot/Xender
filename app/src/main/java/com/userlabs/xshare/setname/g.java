package com.userlabs.xshare.setname;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class g {
    private int a;
    private long b;
    private int c;
    private int d;
    private int e;
    private int f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    List<a> l;

    public g(int i, int i2, long j, int i3, int i4) {
        this.g = 0L;
        this.h = 0L;
        this.i = 0L;
        this.j = 0L;
        this.k = 0L;
        this.a = i + i2;
        this.b = j;
        this.c = i3;
        this.d = i4;
        this.e = i;
        this.f = i2;
    }

    public void computeTransferedFilesCount() {
        this.a = this.e + this.f;
    }

    public void computeTransferedFilesSize() {
        this.b = this.g + this.h + this.i + this.j + this.k;
    }

    public long getAppSize() {
        return this.g;
    }

    public long getAudioSize() {
        return this.i;
    }

    public List<a> getAvatarInfos() {
        return this.l;
    }

    public long getImageSize() {
        return this.h;
    }

    public long getOtherSize() {
        return this.k;
    }

    public int getReceFiles() {
        return this.f;
    }

    public int getRequestCode() {
        return this.d;
    }

    public int getSendFiles() {
        return this.e;
    }

    public int getTransferedFilesCount() {
        return this.a;
    }

    public long getTransferedFilesSize() {
        return this.b;
    }

    public int getTransferedPeople() {
        return this.c;
    }

    public long getVideoSize() {
        return this.j;
    }

    public void setAppSize(long j) {
        this.g = j;
    }

    public void setAudioSize(long j) {
        this.i = j;
    }

    public void setAvatarInfos(List<a> list) {
        this.l = list;
    }

    public void setImageSize(long j) {
        this.h = j;
    }

    public void setOtherSize(long j) {
        this.k = j;
    }

    public void setReceFiles(int i) {
        this.f = i;
    }

    public void setSendFiles(int i) {
        this.e = i;
    }

    public void setTransferedPeople(int i) {
        this.c = i;
    }

    public void setVideoSize(long j) {
        this.j = j;
    }

    public g(int i) {
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0L;
        this.h = 0L;
        this.i = 0L;
        this.j = 0L;
        this.k = 0L;
        this.d = i;
    }
}
