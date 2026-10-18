package com.userlabs.xshare.arch.db.entity;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class JsEntity {
    private String alias;
    private String date;
    private long fileSize;
    private String jsVersion;
    private String k;
    private String md5;
    private String site = "";
    private String url;

    public String getAlias() {
        return this.alias;
    }

    public String getDate() {
        return this.date;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public String getJsVersion() {
        return this.jsVersion;
    }

    public String getK() {
        return this.k;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getSite() {
        return this.site;
    }

    public String getUrl() {
        return this.url;
    }

    public void setAlias(String str) {
        this.alias = str;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public void setFileSize(long j) {
        this.fileSize = j;
    }

    public void setJsVersion(String str) {
        this.jsVersion = str;
    }

    public void setK(String str) {
        this.k = str;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setSite(String str) {
        this.site = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("JsEntity{site='");
        sb.append(this.site);
        sb.append("', date=");
        sb.append(this.date);
        sb.append(", url='");
        sb.append(this.url);
        sb.append("', k='");
        sb.append(this.k);
        sb.append("', jsVersion='");
        sb.append(this.jsVersion);
        sb.append("', alias='");
        return androidx.camera.camera2.pipe.w.t(sb, this.alias, "'}");
    }
}
