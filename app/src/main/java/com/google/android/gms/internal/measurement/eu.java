package com.google.android.gms.internal.measurement;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final class eu extends com.google.common.base.w {
    @Override // com.google.common.base.w
    public final long read() {
        return SystemClock.elapsedRealtime() * 1000000;
    }
}
