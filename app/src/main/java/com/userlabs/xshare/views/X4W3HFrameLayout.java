package com.userlabs.xshare.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class X4W3HFrameLayout extends FrameLayout {
    public X4W3HFrameLayout(Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Float.valueOf((View.MeasureSpec.getSize(i) * 3.0f) / 4.0f).intValue(), 1073741824));
    }

    public X4W3HFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public X4W3HFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
