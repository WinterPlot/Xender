package com.userlabs.xshare.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.userlabs.xshare.R;
import okhttp3.b0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class HistoryProgressLayout extends RelativeLayout {
    private int a;
    private int b;
    private Context c;
    private HistoryProgress d;
    private Paint e;
    int f;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class HistoryProgress extends View {
        private float a;

        public HistoryProgress(Context context) {
            super(context);
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            canvas.drawRect(0.0f, 0.0f, (this.a * HistoryProgressLayout.this.a) / 100.0f, HistoryProgressLayout.this.b, HistoryProgressLayout.this.e);
        }
    }

    public HistoryProgressLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = context;
        setWillNotDraw(false);
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (isInEditMode()) {
            return;
        }
        if (attributeSet == null) {
            b0.i("Attributes should be provided to this view,");
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HistoryProgressLayout);
        this.f = typedArrayObtainStyledAttributes.getColor(R.styleable.HistoryProgressLayout_progressColor, -1);
        typedArrayObtainStyledAttributes.recycle();
        HistoryProgress historyProgress = new HistoryProgress(this.c);
        this.d = historyProgress;
        addView(historyProgress);
        Paint paint = new Paint();
        this.e = paint;
        paint.setAntiAlias(true);
        this.e.setColor(this.f);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a = getWidth();
        this.b = getHeight();
    }

    public HistoryProgressLayout(Context context) {
        super(context);
        this.c = context;
    }

    public HistoryProgressLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        init(context, attributeSet);
    }
}
