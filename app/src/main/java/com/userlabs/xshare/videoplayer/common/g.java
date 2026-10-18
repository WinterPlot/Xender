package com.userlabs.xshare.videoplayer.common;

import android.app.Activity;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class g {
    private Activity a;
    private final a b;
    private int c;
    private int d = -1;
    private int e = 10;
    private int f = 0;
    private int g = 0;
    private int h = 0;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a {
        void onLockStateChanged(boolean z);

        void onOrientationChanged(int i);
    }

    public g(Activity activity, a aVar) {
        this.a = activity;
        this.b = aVar;
        this.c = activity.getResources().getConfiguration().orientation;
    }

    private void applyOrientationStrategy() {
        int targetOrientationByCurrentPriority = getTargetOrientationByCurrentPriority();
        if (this.a.getRequestedOrientation() != targetOrientationByCurrentPriority) {
            this.a.setRequestedOrientation(targetOrientationByCurrentPriority);
            Log.d("VideoOrientationManager", String.format("Applied orientation: %d, Priority: %s", Integer.valueOf(targetOrientationByCurrentPriority), Integer.valueOf(this.e)));
            a aVar = this.b;
            if (aVar != null) {
                aVar.onOrientationChanged(targetOrientationByCurrentPriority);
            }
        }
    }

    private int calculateVideoOptimalOrientation() {
        int i;
        int i2;
        if (!hasValidVideoInfo()) {
            return -1;
        }
        int i3 = this.h;
        if (i3 == 90 || i3 == 270) {
            i = this.g;
            i2 = this.f;
        } else {
            i = this.f;
            i2 = this.g;
        }
        return i > i2 ? 0 : 1;
    }

    private void forceRotateToOrientation(int i) {
        this.e = 100;
        this.d = i;
        applyOrientationStrategy();
    }

    private int getNextClockwiseOrientation() {
        return this.c == 1 ? 0 : 1;
    }

    private int getTargetOrientationByCurrentPriority() {
        int i = this.e;
        if (i == 100) {
            return this.d;
        }
        if (i == 50) {
            return 14;
        }
        return i == 10 ? 10 : -1;
    }

    private boolean hasValidVideoInfo() {
        return this.f > 0 && this.g > 0;
    }

    public void forceRotate90Degrees() {
        forceRotateToOrientation(getNextClockwiseOrientation());
    }

    public boolean isAutoRotateLocked() {
        return this.e >= 50;
    }

    public boolean isForcedRotation() {
        return this.e >= 100;
    }

    public void setAutoRotationLocked(boolean z) {
        if (isAutoRotateLocked() && !z) {
            this.e = 10;
            applyOrientationStrategy();
            a aVar = this.b;
            if (aVar != null) {
                aVar.onLockStateChanged(false);
                return;
            }
            return;
        }
        if (isAutoRotateLocked() || !z) {
            return;
        }
        this.e = 50;
        applyOrientationStrategy();
        a aVar2 = this.b;
        if (aVar2 != null) {
            aVar2.onLockStateChanged(true);
        }
    }

    public void setVideoInfo(int i, int i2, int i3) {
        this.f = i;
        this.g = i2;
        this.h = i3;
        int iCalculateVideoOptimalOrientation = calculateVideoOptimalOrientation();
        int i4 = this.c;
        if (i4 == 2 && iCalculateVideoOptimalOrientation == 1) {
            forceRotateToOrientation(1);
        } else if (i4 == 1 && iCalculateVideoOptimalOrientation == 0) {
            forceRotateToOrientation(0);
        }
    }

    public void start() {
        applyOrientationStrategy();
    }

    public void toggleAutoRotationLock() {
        setAutoRotationLocked(!isAutoRotateLocked());
    }

    public void updateCurrentConfigurationOrientation(int i) {
        this.c = i;
    }

    public void stop() {
    }
}
