package com.google.android.datatransport;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class c extends g {
    private final Integer a;

    public c(Integer num) {
        this.a = num;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        Integer num = this.a;
        if (num == null) {
            return gVar.getProductId() == null;
        }
        return num.equals(gVar.getProductId());
    }

    @Override // com.google.android.datatransport.g
    public Integer getProductId() {
        return this.a;
    }

    public int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.a + "}";
    }
}
