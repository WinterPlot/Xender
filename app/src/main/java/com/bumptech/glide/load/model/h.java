package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class h implements com.bumptech.glide.load.c {
    private final i b;
    private final URL c;
    private final String d;
    private String e;
    private URL f;
    private volatile byte[] g;
    private int h;

    public h(URL url, i iVar) {
        this.c = (URL) com.bumptech.glide.util.k.checkNotNull(url);
        this.d = null;
        this.b = (i) com.bumptech.glide.util.k.checkNotNull(iVar);
    }

    private byte[] getCacheKeyBytes() {
        if (this.g == null) {
            this.g = getCacheKey().getBytes(com.bumptech.glide.load.c.a);
        }
        return this.g;
    }

    private String getSafeStringUrl() {
        if (TextUtils.isEmpty(this.e)) {
            String string = this.d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) com.bumptech.glide.util.k.checkNotNull(this.c)).toString();
            }
            this.e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.e;
    }

    private URL getSafeUrl() throws MalformedURLException {
        URL url = this.f;
        if (url != null) {
            return url;
        }
        URL url2 = new URL(getSafeStringUrl());
        this.f = url2;
        return url2;
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (getCacheKey().equals(hVar.getCacheKey()) && this.b.equals(hVar.b)) {
                return true;
            }
        }
        return false;
    }

    public String getCacheKey() {
        String str = this.d;
        return str != null ? str : ((URL) com.bumptech.glide.util.k.checkNotNull(this.c)).toString();
    }

    public Map<String, String> getHeaders() {
        return this.b.getHeaders();
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        int iHashCode = getCacheKey().hashCode();
        this.h = iHashCode;
        int iHashCode2 = this.b.hashCode() + (iHashCode * 31);
        this.h = iHashCode2;
        return iHashCode2;
    }

    public String toString() {
        return getCacheKey();
    }

    public String toStringUrl() {
        return getSafeStringUrl();
    }

    public URL toURL() throws MalformedURLException {
        return getSafeUrl();
    }

    @Override // com.bumptech.glide.load.c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(getCacheKeyBytes());
    }

    public h(String str) {
        this(str, i.b);
    }

    public h(URL url) {
        this(url, i.b);
    }

    public h(String str, i iVar) {
        this.c = null;
        this.d = com.bumptech.glide.util.k.checkNotEmpty(str);
        this.b = (i) com.bumptech.glide.util.k.checkNotNull(iVar);
    }
}
