package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class e {
    private final Context a;
    private final f b;
    private final b c;
    private final a d;
    private VelocityTracker e;
    private float f;
    private int g;
    private int h;
    private int i;
    private final int[] j;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a {
        float getCurrentVelocity(VelocityTracker velocityTracker, MotionEvent motionEvent, int i);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface b {
        void calculateFlingVelocityThresholds(Context context, int[] iArr, MotionEvent motionEvent, int i);
    }

    public e(Context context, f fVar, b bVar, a aVar) {
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = new int[]{Integer.MAX_VALUE, 0};
        this.a = context;
        this.b = fVar;
        this.c = bVar;
        this.d = aVar;
    }

    private boolean calculateFlingVelocityThresholds(MotionEvent motionEvent, int i) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.h == source && this.i == deviceId && this.g == i) {
            return false;
        }
        b bVar = this.c;
        Context context = this.a;
        int[] iArr = this.j;
        ((d) bVar).getClass();
        calculateFlingVelocityThresholds(context, iArr, motionEvent, i);
        this.h = source;
        this.i = deviceId;
        this.g = i;
        return true;
    }

    private float getCurrentVelocity(MotionEvent motionEvent, int i) {
        VelocityTracker velocityTrackerObtain = this.e;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.e = velocityTrackerObtain;
        }
        ((d) this.d).getClass();
        return getCurrentVelocity(velocityTrackerObtain, motionEvent, i);
    }

    public void onMotionEvent(MotionEvent motionEvent, int i) {
        boolean zCalculateFlingVelocityThresholds = calculateFlingVelocityThresholds(motionEvent, i);
        if (this.j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.e = null;
                return;
            }
            return;
        }
        float scaledScrollFactor = this.b.getScaledScrollFactor() * getCurrentVelocity(motionEvent, i);
        float fSignum = Math.signum(scaledScrollFactor);
        if (zCalculateFlingVelocityThresholds || (fSignum != Math.signum(this.f) && fSignum != 0.0f)) {
            this.b.stopDifferentialMotionFling();
        }
        float fAbs = Math.abs(scaledScrollFactor);
        int[] iArr = this.j;
        if (fAbs < iArr[0]) {
            return;
        }
        int i2 = iArr[1];
        float fMax = Math.max(-i2, Math.min(scaledScrollFactor, i2));
        this.f = this.b.startDifferentialMotionFling(fMax) ? fMax : 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float getCurrentVelocity(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
        q0.addMovement(velocityTracker, motionEvent);
        q0.computeCurrentVelocity(velocityTracker, 1000);
        return q0.getAxisVelocity(velocityTracker, i);
    }

    public e(Context context, f fVar) {
        this(context, fVar, new d(), new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void calculateFlingVelocityThresholds(Context context, int[] iArr, MotionEvent motionEvent, int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = w0.getScaledMinimumFlingVelocity(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
        iArr[1] = w0.getScaledMaximumFlingVelocity(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
    }
}
