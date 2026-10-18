package com.google.android.datatransport.cct.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class i extends q {
    private final p a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b extends q.a {
        private p a;

        @Override // com.google.android.datatransport.cct.internal.q.a
        public q build() {
            return new i(this.a);
        }

        @Override // com.google.android.datatransport.cct.internal.q.a
        public q.a setPrequest(p pVar) {
            this.a = pVar;
            return this;
        }
    }

    private i(p pVar) {
        this.a = pVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        p pVar = this.a;
        if (pVar == null) {
            return qVar.getPrequest() == null;
        }
        return pVar.equals(qVar.getPrequest());
    }

    @Override // com.google.android.datatransport.cct.internal.q
    public p getPrequest() {
        return this.a;
    }

    public int hashCode() {
        p pVar = this.a;
        return (pVar == null ? 0 : pVar.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.a + "}";
    }
}
