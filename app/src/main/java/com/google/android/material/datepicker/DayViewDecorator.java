package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class DayViewDecorator implements Parcelable {
    public ColorStateList getBackgroundColor(Context context, int i, int i2, int i3, boolean z, boolean z2) {
        return null;
    }

    public Drawable getCompoundDrawableBottom(Context context, int i, int i2, int i3, boolean z, boolean z2) {
        return null;
    }

    public Drawable getCompoundDrawableLeft(Context context, int i, int i2, int i3, boolean z, boolean z2) {
        return null;
    }

    public Drawable getCompoundDrawableRight(Context context, int i, int i2, int i3, boolean z, boolean z2) {
        return null;
    }

    public Drawable getCompoundDrawableTop(Context context, int i, int i2, int i3, boolean z, boolean z2) {
        return null;
    }

    public ColorStateList getTextColor(Context context, int i, int i2, int i3, boolean z, boolean z2) {
        return null;
    }

    public void initialize(Context context) {
    }

    public CharSequence getContentDescription(Context context, int i, int i2, int i3, boolean z, boolean z2, CharSequence charSequence) {
        return charSequence;
    }
}
