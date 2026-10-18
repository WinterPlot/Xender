package com.google.android.material.internal;

import android.animation.TimeInterpolator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public class r implements TimeInterpolator {
    private final TimeInterpolator a;

    public r(TimeInterpolator timeInterpolator) {
        this.a = timeInterpolator;
    }

    public static TimeInterpolator of(boolean z, TimeInterpolator timeInterpolator) {
        return z ? timeInterpolator : new r(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return 1.0f - this.a.getInterpolation(f);
    }
}
