package kotlin.time;

import kotlin.ranges.s;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
class g extends f {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DurationUnit.values().length];
            try {
                iArr[DurationUnit.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DurationUnit.HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DurationUnit.MINUTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DurationUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DurationUnit.MILLISECONDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DurationUnit.NANOSECONDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DurationUnit.MICROSECONDS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    public static final long convertDurationUnitToMilliseconds(long j, DurationUnit durationUnit) {
        durationUnit.getClass();
        return multiplyNonNegativeWithoutOverflow$DurationUnitKt__DurationUnitKt(j, getMillisMultiplier$DurationUnitKt__DurationUnitKt(durationUnit));
    }

    private static final long getMillisMultiplier$DurationUnitKt__DurationUnitKt(DurationUnit durationUnit) {
        int i = a.a[durationUnit.ordinal()];
        if (i == 1) {
            return 86400000L;
        }
        if (i == 2) {
            return 3600000L;
        }
        if (i == 3) {
            return 60000L;
        }
        if (i == 4) {
            return 1000L;
        }
        if (i == 5) {
            return 1L;
        }
        com.google.gson.internal.a.t("Wrong unit for millisMultiplier: ", durationUnit);
        return 0L;
    }

    private static final long multiplyNonNegativeWithoutOverflow$DurationUnitKt__DurationUnitKt(long j, long j2) {
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            return s.coerceAtMost(j2, 4611686018427387903L);
        }
        if (j2 == 1) {
            return s.coerceAtMost(j, 4611686018427387903L);
        }
        int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
        if (iNumberOfLeadingZeros < 63) {
            return j * j2;
        }
        if (iNumberOfLeadingZeros > 63) {
            return 4611686018427387903L;
        }
        return s.coerceAtMost(j * j2, 4611686018427387903L);
    }

    public static final String shortName(DurationUnit durationUnit) {
        durationUnit.getClass();
        switch (a.a[durationUnit.ordinal()]) {
            case 1:
                return "d";
            case 2:
                return "h";
            case 3:
                return "m";
            case 4:
                return "s";
            case 5:
                return "ms";
            case 6:
                return "ns";
            case 7:
                return "us";
            default:
                com.google.gson.internal.a.t("Unknown unit: ", durationUnit);
                return null;
        }
    }
}
