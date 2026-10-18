package com.userlabs.xshare.views.showcaseview;

import android.content.Context;
import android.widget.RelativeLayout;
import com.userlabs.xshare.R;
import com.userlabs.xshare.core.utils.s;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class PositionsUtil {
    public static float a = 64.0f;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum ItemPosition {
        TOP_LEFT,
        TOP_CENTER,
        TOP_RIGHT,
        CENTER_LEFT,
        CENTER,
        CENTER_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_CENTER,
        BOTTOM_RIGHT
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ItemPosition.values().length];
            a = iArr;
            try {
                iArr[ItemPosition.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ItemPosition.TOP_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ItemPosition.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ItemPosition.CENTER_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ItemPosition.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ItemPosition.CENTER_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ItemPosition.BOTTOM_LEFT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ItemPosition.BOTTOM_CENTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ItemPosition.BOTTOM_RIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static RelativeLayout.LayoutParams configureParams(Context context, ItemPosition itemPosition) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        int statusBarHeight = getStatusBarHeight(context) + ((int) context.getResources().getDimension(R.dimen.x_dp_48));
        switch (a.a[itemPosition.ordinal()]) {
            case 1:
                layoutParams.addRule(10);
                layoutParams.addRule(9);
                layoutParams.setMargins(80, statusBarHeight, 80, 0);
                break;
            case 2:
                layoutParams.addRule(10);
                layoutParams.addRule(14);
                layoutParams.setMargins(0, statusBarHeight, 0, 0);
                break;
            case 3:
                layoutParams.addRule(10);
                layoutParams.addRule(11);
                layoutParams.setMargins(16, statusBarHeight, 16, 0);
                break;
            case 4:
                layoutParams.addRule(15);
                layoutParams.addRule(9);
                layoutParams.setMargins(80, 0, 80, 0);
                break;
            case 5:
                layoutParams.addRule(13);
                layoutParams.setMargins(80, 0, 80, 0);
                break;
            case 6:
                layoutParams.addRule(15);
                layoutParams.addRule(11);
                layoutParams.setMargins(80, 0, 80, 0);
                break;
            case 7:
                layoutParams.addRule(12);
                layoutParams.addRule(11);
                layoutParams.setMargins(16, 0, 16, (int) (getDensity(context) * (a + 40.0f + 35.0f)));
                break;
            case 8:
                layoutParams.addRule(12);
                layoutParams.addRule(14);
                float f = a;
                layoutParams.setMargins(16, 0, (((int) f) * 2) + 10, (int) f);
                break;
            case 9:
                layoutParams.addRule(12);
                layoutParams.addRule(11);
                layoutParams.setMargins(16, 0, 16, (context.getResources().getDisplayMetrics().heightPixels / 3) - (((int) getDensity(context)) * 16));
                break;
        }
        return layoutParams;
    }

    public static float floatToSP(Context context, float f) {
        return (f / context.getResources().getDisplayMetrics().scaledDensity) + 1.0f;
    }

    public static float getDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int getStatusBarHeight(Context context) {
        return s.getStatusBarHeight(context);
    }
}
