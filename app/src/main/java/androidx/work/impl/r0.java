package androidx.work.impl;

import androidx.work.WorkerParameters;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public interface r0 {
    void startWork(w wVar);

    void startWork(w wVar, WorkerParameters.a aVar);

    void stopWork(w wVar);

    void stopWork(w wVar, int i);

    void stopWorkWithReason(w wVar, int i);
}
