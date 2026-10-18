package com.google.firebase.sessions;

import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {
    private final DataCollectionState a;
    private final DataCollectionState b;
    private final double c;

    public /* synthetic */ e(DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d, int i, r rVar) {
        this((i & 1) != 0 ? DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : dataCollectionState, (i & 2) != 0 ? DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : dataCollectionState2, (i & 4) != 0 ? 1.0d : d);
    }

    public static /* synthetic */ e copy$default(e eVar, DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            dataCollectionState = eVar.a;
        }
        if ((i & 2) != 0) {
            dataCollectionState2 = eVar.b;
        }
        if ((i & 4) != 0) {
            d = eVar.c;
        }
        return eVar.copy(dataCollectionState, dataCollectionState2, d);
    }

    public final DataCollectionState component1() {
        return this.a;
    }

    public final DataCollectionState component2() {
        return this.b;
    }

    public final double component3() {
        return this.c;
    }

    public final e copy(DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d) {
        dataCollectionState.getClass();
        dataCollectionState2.getClass();
        return new e(dataCollectionState, dataCollectionState2, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b && Double.compare(this.c, eVar.c) == 0;
    }

    public final DataCollectionState getCrashlytics() {
        return this.b;
    }

    public final DataCollectionState getPerformance() {
        return this.a;
    }

    public final double getSessionSamplingRate() {
        return this.c;
    }

    public int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.c);
        return iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.a + ", crashlytics=" + this.b + ", sessionSamplingRate=" + this.c + ')';
    }

    public e(DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d) {
        dataCollectionState.getClass();
        dataCollectionState2.getClass();
        this.a = dataCollectionState;
        this.b = dataCollectionState2;
        this.c = d;
    }

    public e() {
        this(null, null, 0.0d, 7, null);
    }
}
