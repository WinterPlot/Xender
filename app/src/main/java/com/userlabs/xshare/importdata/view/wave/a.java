package com.userlabs.xshare.importdata.view.wave;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.userlabs.xshare.importdata.R;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
class a extends View {
    private Paint a;

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) getResources().getDimension(R.dimen.ex_dp_240), -2);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(getLeft(), 0.0f, getRight(), getBottom(), this.a);
    }

    public void setBlowWavePaint(Paint paint) {
        this.a = paint;
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
