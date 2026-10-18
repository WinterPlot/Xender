package com.google.common.hash;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class p {
    private p() {
    }

    public static Object clone(MessageDigest messageDigest) throws CloneNotSupportedException {
        return messageDigest.clone();
    }
}
