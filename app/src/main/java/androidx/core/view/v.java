package androidx.core.view;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface v extends x {
    @Override // androidx.core.view.x
    /* synthetic */ boolean dispatchNestedFling(float f, float f2, boolean z);

    @Override // androidx.core.view.x
    /* synthetic */ boolean dispatchNestedPreFling(float f, float f2);

    @Override // androidx.core.view.x
    /* synthetic */ boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2);

    boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3);

    @Override // androidx.core.view.x
    /* synthetic */ boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr);

    boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5);

    @Override // androidx.core.view.x
    /* synthetic */ boolean hasNestedScrollingParent();

    boolean hasNestedScrollingParent(int i);

    @Override // androidx.core.view.x
    /* synthetic */ boolean isNestedScrollingEnabled();

    @Override // androidx.core.view.x
    /* synthetic */ void setNestedScrollingEnabled(boolean z);

    @Override // androidx.core.view.x
    /* synthetic */ boolean startNestedScroll(int i);

    boolean startNestedScroll(int i, int i2);

    @Override // androidx.core.view.x
    /* synthetic */ void stopNestedScroll();

    void stopNestedScroll(int i);
}
