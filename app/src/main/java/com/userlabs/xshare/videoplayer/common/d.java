package com.userlabs.xshare.videoplayer.common;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.userlabs.xshare.videoplayer.R;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class d extends GestureDetector.SimpleOnGestureListener {
    private Activity b;
    private Rect d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    a k;
    String a = "vp_gesture";
    private final Map<String, String> c = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a {
        void onGestureStart();

        void onLeftScreenEventMovingUpDown(float f);

        void onLeftScreenEventUpDownEnd();

        void onLeftScreenEventUpDownStart();

        void onLongPressEnd();

        void onLongPressStart();

        void onMovingLeftRight(float f, float f2);

        void onMovingLeftRightEnd();

        void onMovingLeftRightStart();

        void onRightScreenEventMovingUpDown(float f);

        void onRightScreenEventUpDownEnd();

        void onRightScreenEventUpDownStart();

        void onScreenCenterOneThirdsDoubleTap();

        void onScreenLeftOneThirdsDoubleTap();

        void onScreenRightOneThirdsDoubleTap();

        void onSingleClick();
    }

    public d(Activity activity, a aVar) {
        this.b = activity;
        this.k = aVar;
        refreshCanUseRect();
    }

    private boolean isValidRect(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        Rect rect = this.d;
        return x >= ((float) rect.left) && x <= ((float) rect.right) && y >= ((float) rect.top) && y <= ((float) rect.bottom);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (!isValidRect(motionEvent)) {
            return false;
        }
        float x = motionEvent.getX();
        Rect rect = this.d;
        if (x > rect.left && x < this.i) {
            this.k.onScreenLeftOneThirdsDoubleTap();
            return true;
        }
        if (x > this.i && x < this.j) {
            this.k.onScreenCenterOneThirdsDoubleTap();
            return true;
        }
        if (x <= this.j || x >= rect.right) {
            return super.onDoubleTap(motionEvent);
        }
        this.k.onScreenRightOneThirdsDoubleTap();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.k.onGestureStart();
        this.c.clear();
        if (!isValidRect(motionEvent)) {
            return true;
        }
        this.c.put("down", "true");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        super.onLongPress(motionEvent);
        if (isValidRect(motionEvent)) {
            this.c.put("long_press", "true");
            this.k.onLongPressStart();
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent == null) {
            return false;
        }
        if (!this.c.containsKey("down")) {
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float x2 = motionEvent2.getX();
        float y2 = motionEvent2.getY();
        if (!this.c.containsKey("scroll_left_right") && !this.c.containsKey("scroll_up_down")) {
            if (Math.abs((y - y2) / (x2 - x)) > 2.0f) {
                float f3 = this.g;
                Map<String, String> map = this.c;
                if (x > f3) {
                    map.put("scroll_up_down_on_right_screen", "true");
                    this.k.onRightScreenEventUpDownStart();
                } else {
                    map.put("scroll_up_down_on_left_screen", "true");
                    this.k.onLeftScreenEventUpDownStart();
                }
                this.c.put("scroll_up_down", "true");
            } else {
                this.c.put("scroll_left_right", "true");
                this.k.onMovingLeftRightStart();
            }
        }
        if (this.c.containsKey("scroll_left_right")) {
            this.k.onMovingLeftRight(x, x2);
            return true;
        }
        if (this.c.containsKey("scroll_up_down")) {
            if (this.c.containsKey("scroll_up_down_on_right_screen")) {
                this.k.onRightScreenEventMovingUpDown(((y - y2) / this.f) * 2.0f);
                return true;
            }
            if (this.c.containsKey("scroll_up_down_on_left_screen")) {
                this.k.onLeftScreenEventMovingUpDown(((y - y2) / this.f) * 2.0f);
                return true;
            }
        }
        return super.onScroll(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (!isValidRect(motionEvent)) {
            return false;
        }
        this.k.onSingleClick();
        return true;
    }

    public final boolean onUp(MotionEvent motionEvent) {
        Log.e(this.a, "on up");
        Map<String, String> map = this.c;
        if (map.isEmpty() || !map.containsKey("down")) {
            this.c.clear();
            return false;
        }
        int size = map.size();
        if (size != 1) {
            if (size == 2) {
                if (map.containsKey("scroll_left_right")) {
                    this.k.onMovingLeftRightEnd();
                } else if (map.containsKey("long_press")) {
                    this.k.onLongPressEnd();
                }
            } else if (size == 3 && map.containsKey("scroll_up_down")) {
                if (map.containsKey("scroll_up_down_on_right_screen")) {
                    this.k.onRightScreenEventUpDownEnd();
                } else if (map.containsKey("scroll_up_down_on_left_screen")) {
                    this.k.onLeftScreenEventUpDownEnd();
                }
            }
        }
        this.c.clear();
        return true;
    }

    public void refreshCanUseRect() {
        int dimensionPixelOffset = this.b.getResources().getDimensionPixelOffset(R.dimen.vp_dp_30);
        int i = Build.VERSION.SDK_INT;
        Activity activity = this.b;
        if (i >= 30) {
            Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
            this.e = bounds.width();
            this.f = bounds.height();
        } else {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            this.e = defaultDisplay.getWidth();
            this.f = defaultDisplay.getHeight();
        }
        this.d = new Rect(dimensionPixelOffset, this.b.getResources().getDimensionPixelOffset(R.dimen.vp_dp_48) + dimensionPixelOffset, this.e - dimensionPixelOffset, (this.f - dimensionPixelOffset) - this.b.getResources().getDimensionPixelOffset(R.dimen.vp_dp_96));
        int i2 = this.e;
        this.g = i2 / 2;
        this.h = this.f / 2;
        int i3 = i2 / 3;
        this.i = i3;
        this.j = i3 * 2;
    }
}
