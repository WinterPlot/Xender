package j$.time.temporal;

import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes2.dex */
public interface Temporal extends l {
    Temporal a(long j, n nVar);

    Temporal b(long j, TemporalUnit temporalUnit);

    long d(Temporal temporal, TemporalUnit temporalUnit);

    /* JADX INFO: renamed from: g */
    Temporal l(LocalDate localDate);

    Temporal m(long j, ChronoUnit chronoUnit);
}
