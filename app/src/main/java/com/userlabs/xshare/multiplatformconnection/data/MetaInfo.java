package com.userlabs.xshare.multiplatformconnection.data;

import androidx.camera.camera2.pipe.w;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class MetaInfo {
    private String song_alias_id;
    private String song_artist;
    private long song_duration;
    private String song_name;

    public String getSong_alias_id() {
        return this.song_alias_id;
    }

    public String getSong_artist() {
        return this.song_artist;
    }

    public long getSong_duration() {
        return this.song_duration;
    }

    public String getSong_name() {
        return this.song_name;
    }

    public void setSong_alias_id(String str) {
        this.song_alias_id = str;
    }

    public void setSong_artist(String str) {
        this.song_artist = str;
    }

    public void setSong_duration(long j) {
        this.song_duration = j;
    }

    public void setSong_name(String str) {
        this.song_name = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MetaInfo{song_name='");
        sb.append(this.song_name);
        sb.append("', song_artist='");
        sb.append(this.song_artist);
        sb.append("', song_alias_id='");
        return w.t(sb, this.song_alias_id, "'}");
    }
}
