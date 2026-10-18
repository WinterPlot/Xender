package com.google.android.datatransport;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class b extends f {
    private final String a;
    private final byte[] b;
    private final byte[] c;

    /* JADX INFO: renamed from: com.google.android.datatransport.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class C0543b extends f.a {
        private String a;
        private byte[] b;
        private byte[] c;

        @Override // com.google.android.datatransport.f.a
        public f build() {
            return new b(this.a, this.b, this.c);
        }

        @Override // com.google.android.datatransport.f.a
        public f.a setExperimentIdsClear(byte[] bArr) {
            this.b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.f.a
        public f.a setExperimentIdsEncrypted(byte[] bArr) {
            this.c = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.f.a
        public f.a setPseudonymousId(String str) {
            this.a = str;
            return this;
        }
    }

    private b(String str, byte[] bArr, byte[] bArr2) {
        this.a = str;
        this.b = bArr;
        this.c = bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str = this.a;
            if (str != null ? str.equals(fVar.getPseudonymousId()) : fVar.getPseudonymousId() == null) {
                boolean z = fVar instanceof b;
                if (Arrays.equals(this.b, z ? ((b) fVar).b : fVar.getExperimentIdsClear())) {
                    if (Arrays.equals(this.c, z ? ((b) fVar).c : fVar.getExperimentIdsEncrypted())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.f
    public byte[] getExperimentIdsClear() {
        return this.b;
    }

    @Override // com.google.android.datatransport.f
    public byte[] getExperimentIdsEncrypted() {
        return this.c;
    }

    @Override // com.google.android.datatransport.f
    public String getPseudonymousId() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        return Arrays.hashCode(this.c) ^ (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    public String toString() {
        return "EventContext{pseudonymousId=" + this.a + ", experimentIdsClear=" + Arrays.toString(this.b) + ", experimentIdsEncrypted=" + Arrays.toString(this.c) + "}";
    }
}
