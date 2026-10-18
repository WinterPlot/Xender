package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public class b {
    public static final TimeInterpolator a = new LinearInterpolator();
    public static final TimeInterpolator b = new androidx.interpolator.view.animation.b();
    public static final TimeInterpolator c = new androidx.interpolator.view.animation.a();
    public static final TimeInterpolator d = new androidx.interpolator.view.animation.c();
    public static final TimeInterpolator e = new DecelerateInterpolator();

    public static float lerp(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        return f5 >= f4 ? f2 : lerp(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int lerp(int i, int i2, float f) {
        return Math.round(f * (i2 - i)) + i;
    }

    public static float lerp(float f, float f2, float f3) {
        return defpackage.a.c(f2, f, f3, f);
    }
}
