package com.google.android.datatransport.cct.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a {
        public abstract o build();

        public abstract a setClearBlob(byte[] bArr);

        public abstract a setEncryptedBlob(byte[] bArr);
    }

    public static a builder() {
        return new g.b();
    }

    public abstract byte[] getClearBlob();

    public abstract byte[] getEncryptedBlob();
}
