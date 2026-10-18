package com.google.android.datatransport.cct.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class g extends o {
    private final byte[] a;
    private final byte[] b;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b extends o.a {
        private byte[] a;
        private byte[] b;

        @Override // com.google.android.datatransport.cct.internal.o.a
        public o build() {
            return new g(this.a, this.b);
        }

        @Override // com.google.android.datatransport.cct.internal.o.a
        public o.a setClearBlob(byte[] bArr) {
            this.a = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.o.a
        public o.a setEncryptedBlob(byte[] bArr) {
            this.b = bArr;
            return this;
        }
    }

    private g(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            boolean z = oVar instanceof g;
            if (Arrays.equals(this.a, z ? ((g) oVar).a : oVar.getClearBlob())) {
                if (Arrays.equals(this.b, z ? ((g) oVar).b : oVar.getEncryptedBlob())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.o
    public byte[] getClearBlob() {
        return this.a;
    }

    @Override // com.google.android.datatransport.cct.internal.o
    public byte[] getEncryptedBlob() {
        return this.b;
    }

    public int hashCode() {
        return Arrays.hashCode(this.b) ^ ((Arrays.hashCode(this.a) ^ 1000003) * 1000003);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }
}
