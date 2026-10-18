package com.userlabs.xshare.playlist.db;

import android.text.TextUtils;
import com.userlabs.xshare.core.R;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class n {
    private long a;
    private String b;
    private String c;
    private long d;
    private long e;
    private int f;

    public static n newMyListData(String str) {
        n nVar = new n();
        nVar.setName(str);
        nVar.set_id(-222L);
        return nVar;
    }

    public static n newPlaylistData(String str) {
        n nVar = new n();
        nVar.setName(str);
        nVar.set_id(-111L);
        nVar.setCreateTime(1L);
        return nVar;
    }

    public int getContainsCount() {
        return this.f;
    }

    public String getCoverUrl() {
        return this.c;
    }

    public long getCreateTime() {
        return this.d;
    }

    public long getLastModifyTime() {
        return this.e;
    }

    public String getName() {
        return isFavourites() ? com.userlabs.xshare.core.c.getInstance().getString(R.string.x_play_list_favourites) : this.b;
    }

    public long get_id() {
        return this.a;
    }

    public boolean isFavourites() {
        return TextUtils.equals("pl_favourites", this.b);
    }

    public void setContainsCount(int i) {
        this.f = i;
    }

    public void setCoverUrl(String str) {
        this.c = str;
    }

    public void setCreateTime(long j) {
        this.d = j;
    }

    public void setLastModifyTime(long j) {
        this.e = j;
    }

    public void setName(String str) {
        this.b = str;
    }

    public void set_id(long j) {
        this.a = j;
    }
}
