package com.google.android.datatransport.runtime.scheduling.persistence;

import okio.j0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class a extends e {
    private final long b;
    private final int c;
    private final int d;
    private final long e;
    private final int f;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b extends e.a {
        private Long a;
        private Integer b;
        private Integer c;
        private Long d;
        private Integer e;

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.e.a
        public e build() {
            String strConcat = this.a == null ? " maxStorageSizeInBytes" : "";
            if (this.b == null) {
                strConcat = strConcat.concat(" loadBatchSize");
            }
            if (this.c == null) {
                strConcat = strConcat.concat(" criticalSectionEnterTimeoutMs");
            }
            if (this.d == null) {
                strConcat = strConcat.concat(" eventCleanUpAge");
            }
            if (this.e == null) {
                strConcat = strConcat.concat(" maxBlobByteSizePerRow");
            }
            if (strConcat.isEmpty()) {
                return new a(this.a.longValue(), this.b.intValue(), this.c.intValue(), this.d.longValue(), this.e.intValue());
            }
            j0.g("Missing required properties:".concat(strConcat));
            return null;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.e.a
        public e.a setCriticalSectionEnterTimeoutMs(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.e.a
        public e.a setEventCleanUpAge(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.e.a
        public e.a setLoadBatchSize(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.e.a
        public e.a setMaxBlobByteSizePerRow(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.e.a
        public e.a setMaxStorageSizeInBytes(long j) {
            this.a = Long.valueOf(j);
            return this;
        }
    }

    private a(long j, int i, int i2, long j2, int i3) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = j2;
        this.f = i3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.b == eVar.getMaxStorageSizeInBytes() && this.c == eVar.getLoadBatchSize() && this.d == eVar.getCriticalSectionEnterTimeoutMs() && this.e == eVar.getEventCleanUpAge() && this.f == eVar.getMaxBlobByteSizePerRow()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    public int getCriticalSectionEnterTimeoutMs() {
        return this.d;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    public long getEventCleanUpAge() {
        return this.e;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    public int getLoadBatchSize() {
        return this.c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    public int getMaxBlobByteSizePerRow() {
        return this.f;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    public long getMaxStorageSizeInBytes() {
        return this.b;
    }

    public int hashCode() {
        long j = this.b;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        long j2 = this.e;
        return this.f ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.b);
        sb.append(", loadBatchSize=");
        sb.append(this.c);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.d);
        sb.append(", eventCleanUpAge=");
        sb.append(this.e);
        sb.append(", maxBlobByteSizePerRow=");
        return defpackage.a.s(sb, "}", this.f);
    }
}
