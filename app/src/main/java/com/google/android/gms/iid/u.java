package com.google.android.gms.iid;

import android.util.Base64;
import java.security.KeyPair;

/* JADX INFO: loaded from: classes4.dex */
final class u {
    private final KeyPair a;
    private final long b;

    public u(KeyPair keyPair, long j) {
        this.a = keyPair;
        this.b = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzq() {
        return Base64.encodeToString(this.a.getPublic().getEncoded(), 11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzr() {
        return Base64.encodeToString(this.a.getPrivate().getEncoded(), 11);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.b == uVar.b && this.a.getPublic().equals(uVar.a.getPublic()) && this.a.getPrivate().equals(uVar.a.getPrivate());
    }

    public final long getCreationTime() {
        return this.b;
    }

    public final KeyPair getKeyPair() {
        return this.a;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.l.hashCode(this.a.getPublic(), this.a.getPrivate(), Long.valueOf(this.b));
    }
}
