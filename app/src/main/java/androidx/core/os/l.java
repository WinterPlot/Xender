package androidx.core.os;

import android.os.OutcomeReceiver;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    public static final <R, E extends Throwable> OutcomeReceiver asOutcomeReceiver(kotlin.coroutines.d<? super R> dVar) {
        dVar.getClass();
        return new ContinuationOutcomeReceiver(dVar);
    }
}
