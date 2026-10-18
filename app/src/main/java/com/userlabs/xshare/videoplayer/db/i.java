package com.userlabs.xshare.videoplayer.db;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class i {
    private final String a;
    private String b;
    private long c;
    private long d;
    private long e;
    private String f;
    private String g;
    private List<String> h;
    private List<String> i;

    public i(String str) {
        this.a = str;
    }

    public List<String> getAssociatedAiSubtitleFiles() {
        return this.i;
    }

    public List<String> getAssociatedExternalSubtitleFiles() {
        return this.h;
    }

    public long getCurrentPosition() {
        return this.e;
    }

    public long getDuration() {
        return this.d;
    }

    public String getName() {
        return this.b;
    }

    public String getPath() {
        return this.a;
    }

    public String getSelectedAudioTrack() {
        return this.f;
    }

    public String getSelectedSubtitleTrack() {
        return this.g;
    }

    public long getSize() {
        return this.c;
    }

    public void setAssociatedAiSubtitleFiles(List<String> list) {
        this.i = list;
    }

    public void setAssociatedExternalSubtitleFiles(List<String> list) {
        this.h = list;
    }

    public void setCurrentPosition(long j) {
        this.e = j;
    }

    public void setDuration(long j) {
        this.d = j;
    }

    public void setName(String str) {
        this.b = str;
    }

    public void setSelectedAudioTrack(String str) {
        this.f = str;
    }

    public void setSelectedSubtitleTrack(String str) {
        this.g = str;
    }

    public void setSize(long j) {
        this.c = j;
    }
}
