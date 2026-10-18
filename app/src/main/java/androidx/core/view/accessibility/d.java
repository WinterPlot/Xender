package androidx.core.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ AccessibilityNodeInfo.Selection a(AccessibilityNodeInfo.SelectionPosition selectionPosition, AccessibilityNodeInfo.SelectionPosition selectionPosition2) {
        return new AccessibilityNodeInfo.Selection(selectionPosition, selectionPosition2);
    }

    public static /* synthetic */ AccessibilityNodeInfo.SelectionPosition b(View view, int i) {
        return new AccessibilityNodeInfo.SelectionPosition(view, i);
    }

    public static /* synthetic */ AccessibilityNodeInfo.SelectionPosition c(View view, int i, int i2) {
        return new AccessibilityNodeInfo.SelectionPosition(view, i, i2);
    }

    public static /* synthetic */ AccessibilityNodeInfo.SelectionPosition d(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        return new AccessibilityNodeInfo.SelectionPosition(accessibilityNodeInfo, i);
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void f() {
    }
}
