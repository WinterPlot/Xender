package kotlinx.coroutines.flow.internal;

import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c<F> {
    public abstract boolean allocateLocked(F f);

    public abstract kotlin.coroutines.d<y>[] freeLocked(F f);
}
