package com.userlabs.xshare.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.userlabs.xshare.R;
import com.userlabs.xshare.core.utils.s;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class i {
    private static final AtomicBoolean c = new AtomicBoolean(true);
    private final View a;
    private final Context b;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a implements View.OnLayoutChangeListener {
        final /* synthetic */ View a;

        public a(View view) {
            this.a = view;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.a.removeOnLayoutChangeListener(this);
            i.this.showPop();
        }
    }

    public i(Context context, View view) {
        this.b = context;
        this.a = view;
        if (c.compareAndSet(true, false)) {
            view.addOnLayoutChangeListener(new a(view));
        } else if (com.userlabs.xshare.core.log.h.a) {
            com.userlabs.xshare.core.log.h.d("RelateAppPop", "already show...");
        }
    }

    private int[] calculatePopWindowPos(View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (com.userlabs.xshare.core.log.h.a) {
            com.userlabs.xshare.core.log.h.d("calculatePopWindowPos", "anchorView pos x:" + iArr[0]);
            androidx.versionedparcelable.b.y(new StringBuilder("anchorView pos y:"), "calculatePopWindowPos", iArr[1]);
        }
        view2.measure(0, 0);
        int measuredHeight = view2.getMeasuredHeight();
        int measuredWidth = view2.getMeasuredWidth();
        if (com.userlabs.xshare.core.log.h.a) {
            com.userlabs.xshare.core.log.h.d("calculatePopWindowPos", "pop window height:" + measuredHeight);
            com.userlabs.xshare.core.log.h.d("calculatePopWindowPos", "pop window width:" + measuredWidth);
        }
        return new int[]{((view.getWidth() / 2) + iArr[0]) - (measuredWidth / 2), iArr[1] - measuredHeight};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showPop$0() {
        if (com.userlabs.xshare.core.log.h.a) {
            com.userlabs.xshare.core.log.h.d("RelateAppPop", "dismiss");
        }
        c.compareAndSet(false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showPop() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.b);
        int i = R.layout.relation_app_pop;
        View view = this.a;
        View viewInflate = layoutInflaterFrom.inflate(i, view instanceof ViewGroup ? (ViewGroup) view : null, false);
        PopupWindow popupWindow = new PopupWindow(viewInflate, this.a.getWidth(), s.dip2px(48.0f), false);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setAnimationStyle(R.style.popupWindowAnim);
        int[] iArrCalculatePopWindowPos = calculatePopWindowPos(this.a, viewInflate);
        popupWindow.setOnDismissListener(new h());
        popupWindow.showAtLocation(this.a, 8388659, iArrCalculatePopWindowPos[0], iArrCalculatePopWindowPos[1]);
    }
}
