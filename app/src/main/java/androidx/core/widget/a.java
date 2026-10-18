package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.t0;
import com.userlabs.xshare.core.create.XCreateApException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    private static final int y = ViewConfiguration.getTapTimeout();
    final View c;
    private Runnable d;
    private int g;
    private int h;
    private boolean l;
    boolean m;
    boolean p;
    boolean v;
    private boolean w;
    private boolean x;
    final C0140a a = new C0140a();
    private final Interpolator b = new AccelerateInterpolator();
    private float[] e = {0.0f, 0.0f};
    private float[] f = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] i = {0.0f, 0.0f};
    private float[] j = {0.0f, 0.0f};
    private float[] k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class C0140a {
        private int a;
        private int b;
        private float c;
        private float d;
        private float j;
        private int k;
        private long e = Long.MIN_VALUE;
        private long i = -1;
        private long f = 0;
        private int g = 0;
        private int h = 0;

        private float getValueAt(long j) {
            long j2 = this.e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.i;
            if (j3 < 0 || j < j3) {
                return a.constrain((j - j2) / this.a, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.j;
            return (a.constrain((j - j3) / this.k, 0.0f, 1.0f) * f) + (1.0f - f);
        }

        private float interpolateValue(float f) {
            return (f * 4.0f) + ((-4.0f) * f * f);
        }

        public void computeScrollDelta() {
            if (this.f == 0) {
                com.userlabs.xshare.p.a("Cannot compute scroll delta before calling start()");
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fInterpolateValue = interpolateValue(getValueAt(jCurrentAnimationTimeMillis));
            long j = jCurrentAnimationTimeMillis - this.f;
            this.f = jCurrentAnimationTimeMillis;
            float f = j * fInterpolateValue;
            this.g = (int) (this.c * f);
            this.h = (int) (f * this.d);
        }

        public int getDeltaX() {
            return this.g;
        }

        public int getDeltaY() {
            return this.h;
        }

        public int getHorizontalDirection() {
            float f = this.c;
            return (int) (f / Math.abs(f));
        }

        public int getVerticalDirection() {
            float f = this.d;
            return (int) (f / Math.abs(f));
        }

        public boolean isFinished() {
            return this.i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.i + ((long) this.k);
        }

        public void requestStop() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.k = a.constrain((int) (jCurrentAnimationTimeMillis - this.e), 0, this.b);
            this.j = getValueAt(jCurrentAnimationTimeMillis);
            this.i = jCurrentAnimationTimeMillis;
        }

        public void setRampDownDuration(int i) {
            this.b = i;
        }

        public void setRampUpDuration(int i) {
            this.a = i;
        }

        public void setTargetVelocity(float f, float f2) {
            this.c = f;
            this.d = f2;
        }

        public void start() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.e = jCurrentAnimationTimeMillis;
            this.i = -1L;
            this.f = jCurrentAnimationTimeMillis;
            this.j = 0.5f;
            this.g = 0;
            this.h = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.v) {
                if (aVar.m) {
                    aVar.m = false;
                    aVar.a.start();
                }
                C0140a c0140a = a.this.a;
                if (c0140a.isFinished() || !a.this.shouldAnimate()) {
                    a.this.v = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.p) {
                    aVar2.p = false;
                    aVar2.cancelTargetTouch();
                }
                c0140a.computeScrollDelta();
                a.this.scrollTargetBy(c0140a.getDeltaX(), c0140a.getDeltaY());
                t0.postOnAnimation(a.this.c, this);
            }
        }
    }

    public a(View view) {
        this.c = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        setMaximumVelocity(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        setMinimumVelocity(f3, f3);
        setEdgeType(1);
        setMaximumEdges(Float.MAX_VALUE, Float.MAX_VALUE);
        setRelativeEdges(0.2f, 0.2f);
        setRelativeVelocity(1.0f, 1.0f);
        setActivationDelay(y);
        setRampUpDuration(XCreateApException.CODE_IP_NULL);
        setRampDownDuration(XCreateApException.CODE_IP_NULL);
    }

    private float computeTargetVelocity(int i, float f, float f2, float f3) {
        float edgeValue = getEdgeValue(this.e[i], f2, this.f[i], f);
        if (edgeValue == 0.0f) {
            return 0.0f;
        }
        float f4 = this.i[i];
        float f5 = this.j[i];
        float f6 = this.k[i];
        float f7 = f4 * f3;
        return edgeValue > 0.0f ? constrain(edgeValue * f7, f5, f6) : -constrain((-edgeValue) * f7, f5, f6);
    }

    public static float constrain(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    private float constrainEdgeValue(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.g;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.v && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    private float getEdgeValue(float f, float f2, float f3, float f4) {
        float interpolation;
        float fConstrain = constrain(f * f2, 0.0f, f3);
        float fConstrainEdgeValue = constrainEdgeValue(f2 - f4, fConstrain) - constrainEdgeValue(f4, fConstrain);
        if (fConstrainEdgeValue < 0.0f) {
            interpolation = -this.b.getInterpolation(-fConstrainEdgeValue);
        } else {
            if (fConstrainEdgeValue <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.b.getInterpolation(fConstrainEdgeValue);
        }
        return constrain(interpolation, -1.0f, 1.0f);
    }

    private void requestStop() {
        if (this.m) {
            this.v = false;
        } else {
            this.a.requestStop();
        }
    }

    private void startAnimating() {
        int i;
        Runnable bVar = this.d;
        if (bVar == null) {
            bVar = new b();
            this.d = bVar;
        }
        this.v = true;
        this.m = true;
        if (this.l || (i = this.h) <= 0) {
            bVar.run();
        } else {
            t0.postOnAnimationDelayed(this.c, bVar, i);
        }
        this.l = true;
    }

    public abstract boolean canTargetScrollHorizontally(int i);

    public abstract boolean canTargetScrollVertically(int i);

    public void cancelTargetTouch() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public boolean isEnabled() {
        return this.w;
    }

    public boolean isExclusive() {
        return this.x;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.w) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                requestStop();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    requestStop();
                }
            }
            return !this.x && this.v;
        }
        this.p = true;
        this.l = false;
        this.a.setTargetVelocity(computeTargetVelocity(0, motionEvent.getX(), view.getWidth(), this.c.getWidth()), computeTargetVelocity(1, motionEvent.getY(), view.getHeight(), this.c.getHeight()));
        if (!this.v && shouldAnimate()) {
            startAnimating();
        }
        if (this.x) {
        }
    }

    public abstract void scrollTargetBy(int i, int i2);

    public a setActivationDelay(int i) {
        this.h = i;
        return this;
    }

    public a setEdgeType(int i) {
        this.g = i;
        return this;
    }

    public a setEnabled(boolean z) {
        if (this.w && !z) {
            requestStop();
        }
        this.w = z;
        return this;
    }

    public a setExclusive(boolean z) {
        this.x = z;
        return this;
    }

    public a setMaximumEdges(float f, float f2) {
        float[] fArr = this.f;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public a setMaximumVelocity(float f, float f2) {
        float[] fArr = this.k;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public a setMinimumVelocity(float f, float f2) {
        float[] fArr = this.j;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public a setRampDownDuration(int i) {
        this.a.setRampDownDuration(i);
        return this;
    }

    public a setRampUpDuration(int i) {
        this.a.setRampUpDuration(i);
        return this;
    }

    public a setRelativeEdges(float f, float f2) {
        float[] fArr = this.e;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public a setRelativeVelocity(float f, float f2) {
        float[] fArr = this.i;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public boolean shouldAnimate() {
        C0140a c0140a = this.a;
        int verticalDirection = c0140a.getVerticalDirection();
        int horizontalDirection = c0140a.getHorizontalDirection();
        if (verticalDirection == 0 || !canTargetScrollVertically(verticalDirection)) {
            return horizontalDirection != 0 && canTargetScrollHorizontally(horizontalDirection);
        }
        return true;
    }

    public static int constrain(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        return i < i2 ? i2 : i;
    }
}
