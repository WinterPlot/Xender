package com.userlabs.xshare.range;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    private String a;
    private String b;
    private String c;
    private String d;
    private long e;
    private boolean f;
    private String g;

    public static String generateKey(a aVar) {
        return Integer.toHexString((aVar.c + aVar.e).hashCode());
    }

    public long getChild_file_size() {
        return this.e;
    }

    public String getE_tag() {
        return this.d;
    }

    public String getReal_path() {
        return this.g;
    }

    public String getRelative_path() {
        return this.c;
    }

    public String getT_id() {
        return this.b;
    }

    public String get_key() {
        return this.a;
    }

    public boolean isDownloaded() {
        return this.f;
    }

    public void setChild_file_size(long j) {
        this.e = j;
    }

    public void setDownloaded(boolean z) {
        this.f = z;
    }

    public void setE_tag(String str) {
        this.d = str;
    }

    public void setReal_path(String str) {
        this.g = str;
    }

    public void setRelative_path(String str) {
        this.c = str;
    }

    public void setT_id(String str) {
        this.b = str;
    }

    public void set_key(String str) {
        this.a = str;
    }
}
