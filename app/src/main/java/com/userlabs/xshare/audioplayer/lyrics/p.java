package com.userlabs.xshare.audioplayer.lyrics;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class p {
    private final String a;
    private final boolean b;
    private final boolean c;
    private final String d;
    private final boolean e;
    private final String f;
    private final String g;
    private final String h;
    private boolean i = false;

    public p(String str, boolean z, boolean z2, String str2, boolean z3, String str3, String str4) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = str2;
        this.e = z3;
        this.f = str3;
        this.g = str4;
        if (j.isGooglePath(str)) {
            this.h = "gle";
        } else if (j.isLrcLibPath(str)) {
            this.h = "lrc";
        } else {
            this.h = "unknown";
        }
    }

    public static p create(String str, boolean z, boolean z2, String str2, boolean z3, String str3, String str4) {
        return new p(str, z, z2, str2, z3, str3, str4);
    }

    public String getArtist() {
        return this.g;
    }

    public String getLyricsPath() {
        return this.a;
    }

    public String getTitle() {
        return this.f;
    }

    public String getUniqueId() {
        return this.d;
    }

    public boolean isGleSearch() {
        return "gle".equals(this.h);
    }

    public boolean isLrcLibSearch() {
        return "lrc".equals(this.h);
    }

    public boolean isLyricsConnected() {
        return this.e;
    }

    public boolean isPoorNetwork() {
        return this.i;
    }

    public boolean isSuccess() {
        return this.c;
    }

    public boolean isSyncedLyrics() {
        return this.b;
    }

    public p setPoorNetwork(boolean z) {
        this.i = z;
        return this;
    }
}
