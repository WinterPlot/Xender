package com.userlabs.xshare.importdata.view.wave;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.userlabs.xshare.importdata.R;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
class b extends View {
    public final int a;
    private final float b;
    private final Path c;
    private final Paint d;
    private int e;
    private float f;
    private float g;
    private int h;
    private float i;
    private final float j;
    private final int k;
    private int l;
    private float m;
    private float p;
    private a v;
    private int w;
    private int x;
    private int y;
    private double z;

    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 204;
        this.b = 20.0f;
        this.c = new Path();
        this.d = new Paint();
        this.j = 0.19f;
        this.k = 10;
        this.m = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void calculatePath() {
        this.c.reset();
        getWaveOffset();
        this.c.moveTo(this.w, this.y);
        int i = this.l;
        if (i >= 50) {
            this.h = ((int) ((1.0f - (i / 100.0f)) * 60.0f)) + 10;
        } else {
            this.h = ((int) ((i / 100.0f) * 60.0f)) + 10;
        }
        float f = 0.0f;
        while (true) {
            float f2 = this.i;
            Path path = this.c;
            if (f > f2) {
                int i2 = this.x;
                path.lineTo(i2, i2);
                return;
            } else {
                path.lineTo(f, (float) ((Math.sin((this.z * ((double) f)) + ((double) this.p)) * ((double) this.h)) + ((double) this.h)));
                f += 20.0f;
            }
        }
    }

    private void getWaveOffset() {
        float f = this.p;
        if (f > Float.MAX_VALUE) {
            this.p = 0.0f;
        } else {
            this.p = f + 0.19f;
        }
        float f2 = this.m;
        if (f2 > Float.MAX_VALUE) {
            this.m = 0.0f;
        } else {
            this.m = f2 + 0.19f;
        }
    }

    private void startWave() {
        if (getWidth() != 0) {
            this.g = getWidth() * this.f;
            this.w = getLeft();
            this.x = getRight();
            this.y = getBottom() + 1;
            this.i = this.x + 20.0f;
            this.z = 12.566370614359172d / ((double) this.g);
        }
    }

    public Paint getBlowWavePaint() {
        return this.d;
    }

    public void initializePainters() {
        this.d.setColor(this.e);
        this.d.setAlpha(204);
        this.d.setStyle(Paint.Style.FILL);
        this.d.setAntiAlias(true);
    }

    public void initializeWaveSize() {
        this.f = 3.0f;
        this.h = 60;
        this.p = 60;
        setLayoutParams(new ViewGroup.LayoutParams((int) getResources().getDimension(R.dimen.ex_dp_240), this.h * 2));
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.c, this.d);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setBlowWaveColor(int i) {
        this.e = i;
    }

    public void setProgress(int i) {
        this.l = i;
        if (this.g == 0.0f) {
            startWave();
        }
    }

    public void start() {
        removeCallbacks(this.v);
        a aVar = new a(this, 0);
        this.v = aVar;
        post(aVar);
    }

    public void stop() {
        removeCallbacks(this.v);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (b.this) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                b.this.calculatePath();
                b.this.invalidate();
                long jCurrentTimeMillis2 = 16 - (System.currentTimeMillis() - jCurrentTimeMillis);
                b bVar = b.this;
                if (jCurrentTimeMillis2 < 0) {
                    jCurrentTimeMillis2 = 0;
                }
                bVar.postDelayed(this, jCurrentTimeMillis2);
            }
        }

        public /* synthetic */ a(b bVar, int i) {
            this();
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.waveViewStyle);
    }
}
