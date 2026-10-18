package com.google.android.datatransport.cct.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class f extends ComplianceData {
    private final q a;
    private final ComplianceData.ProductIdOrigin b;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b extends ComplianceData.a {
        private q a;
        private ComplianceData.ProductIdOrigin b;

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.a
        public ComplianceData build() {
            return new f(this.a, this.b);
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.a
        public ComplianceData.a setPrivacyContext(q qVar) {
            this.a = qVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.a
        public ComplianceData.a setProductIdOrigin(ComplianceData.ProductIdOrigin productIdOrigin) {
            this.b = productIdOrigin;
            return this;
        }
    }

    private f(q qVar, ComplianceData.ProductIdOrigin productIdOrigin) {
        this.a = qVar;
        this.b = productIdOrigin;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ComplianceData) {
            ComplianceData complianceData = (ComplianceData) obj;
            q qVar = this.a;
            if (qVar != null ? qVar.equals(complianceData.getPrivacyContext()) : complianceData.getPrivacyContext() == null) {
                ComplianceData.ProductIdOrigin productIdOrigin = this.b;
                if (productIdOrigin != null ? productIdOrigin.equals(complianceData.getProductIdOrigin()) : complianceData.getProductIdOrigin() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    public q getPrivacyContext() {
        return this.a;
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    public ComplianceData.ProductIdOrigin getProductIdOrigin() {
        return this.b;
    }

    public int hashCode() {
        q qVar = this.a;
        int iHashCode = ((qVar == null ? 0 : qVar.hashCode()) ^ 1000003) * 1000003;
        ComplianceData.ProductIdOrigin productIdOrigin = this.b;
        return iHashCode ^ (productIdOrigin != null ? productIdOrigin.hashCode() : 0);
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + this.b + "}";
    }
}
