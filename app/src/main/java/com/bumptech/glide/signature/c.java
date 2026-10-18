package com.bumptech.glide.signature;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements com.bumptech.glide.load.c {
    private static final c b = new c();

    private c() {
    }

    public static c obtain() {
        return b;
    }

    public String toString() {
        return "EmptySignature";
    }

    @Override // com.bumptech.glide.load.c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
    }
}
