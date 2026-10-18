package com.google.android.datatransport.cct.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class h extends p {
    private final Integer a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b extends p.a {
        private Integer a;

        @Override // com.google.android.datatransport.cct.internal.p.a
        public p build() {
            return new h(this.a);
        }

        @Override // com.google.android.datatransport.cct.internal.p.a
        public p.a setOriginAssociatedProductId(Integer num) {
            this.a = num;
            return this;
        }
    }

    private h(Integer num) {
        this.a = num;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        Integer num = this.a;
        if (num == null) {
            return pVar.getOriginAssociatedProductId() == null;
        }
        return num.equals(pVar.getOriginAssociatedProductId());
    }

    @Override // com.google.android.datatransport.cct.internal.p
    public Integer getOriginAssociatedProductId() {
        return this.a;
    }

    public int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.a + "}";
    }
}
