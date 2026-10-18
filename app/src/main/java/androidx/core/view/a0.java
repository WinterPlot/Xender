package androidx.core.view;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface a0 extends z {
    /* synthetic */ int getNestedScrollAxes();

    /* synthetic */ boolean onNestedFling(View view, float f, float f2, boolean z);

    /* synthetic */ boolean onNestedPreFling(View view, float f, float f2);

    /* synthetic */ void onNestedPreScroll(View view, int i, int i2, int[] iArr);

    /* synthetic */ void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3);

    /* synthetic */ void onNestedScroll(View view, int i, int i2, int i3, int i4);

    /* synthetic */ void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5);

    void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr);

    /* synthetic */ void onNestedScrollAccepted(View view, View view2, int i);

    /* synthetic */ void onNestedScrollAccepted(View view, View view2, int i, int i2);

    /* synthetic */ boolean onStartNestedScroll(View view, View view2, int i);

    /* synthetic */ boolean onStartNestedScroll(View view, View view2, int i, int i2);

    /* synthetic */ void onStopNestedScroll(View view);

    /* synthetic */ void onStopNestedScroll(View view, int i);
}
