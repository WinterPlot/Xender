package androidx.core.view;

import android.content.Context;
import android.view.ContentInfo;
import android.view.MotionEvent;
import android.view.VelocityTracker;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements e.b, e.a {
    public static /* bridge */ /* synthetic */ ContentInfo c(Object obj) {
        return (ContentInfo) obj;
    }

    @Override // androidx.core.view.e.b
    public void calculateFlingVelocityThresholds(Context context, int[] iArr, MotionEvent motionEvent, int i) {
        e.calculateFlingVelocityThresholds(context, iArr, motionEvent, i);
    }

    @Override // androidx.core.view.e.a
    public float getCurrentVelocity(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
        return e.getCurrentVelocity(velocityTracker, motionEvent, i);
    }
}
