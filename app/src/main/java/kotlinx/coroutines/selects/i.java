package kotlinx.coroutines.selects;

import kotlin.jvm.functions.q;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public interface i {
    Object getClauseObject();

    q<j<?>, Object, Object, q<Throwable, Object, kotlin.coroutines.g, y>> getOnCancellationConstructor();

    q<Object, Object, Object, Object> getProcessResFunc();

    q<Object, j<?>, Object, y> getRegFunc();
}
