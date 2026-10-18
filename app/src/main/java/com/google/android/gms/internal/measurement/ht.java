package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class ht implements Runnable {
    static final /* synthetic */ ht a = new ht();

    private /* synthetic */ ht() {
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
    }
}
