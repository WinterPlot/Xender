package kotlin.coroutines.intrinsics;

import kotlin.NotImplementedError;
import kotlin.coroutines.d;
import kotlin.jvm.functions.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public class b extends IntrinsicsKt__IntrinsicsJvmKt {
    public static Object getCOROUTINE_SUSPENDED() {
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    private static final <T> Object suspendCoroutineUninterceptedOrReturn(l<? super d<? super T>, ? extends Object> lVar, d<? super T> dVar) {
        throw new NotImplementedError("Implementation of suspendCoroutineUninterceptedOrReturn is intrinsic");
    }

    public static /* synthetic */ void getCOROUTINE_SUSPENDED$annotations() {
    }
}
