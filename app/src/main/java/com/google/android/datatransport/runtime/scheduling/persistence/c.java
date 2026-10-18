package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface c {
    com.google.android.datatransport.runtime.firebase.transport.a loadClientMetrics();

    void recordLogEventDropped(long j, LogEventDropped.Reason reason, String str);

    void resetClientMetrics();
}
