package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
abstract class o {
    final TextInputLayout a;
    final n b;
    final Context c;
    final CheckableImageButton d;

    public o(n nVar) {
        this.a = nVar.a;
        this.b = nVar;
        this.c = nVar.getContext();
        this.d = nVar.getEndIconView();
    }

    public int getIconContentDescriptionResId() {
        return 0;
    }

    public int getIconDrawableResId() {
        return 0;
    }

    public View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
        return null;
    }

    public View.OnClickListener getOnIconClickListener() {
        return null;
    }

    public View.OnFocusChangeListener getOnIconViewFocusChangeListener() {
        return null;
    }

    public AccessibilityManager.TouchExplorationStateChangeListener getTouchExplorationStateChangeListener() {
        return null;
    }

    public boolean isBoxBackgroundModeSupported(int i) {
        return true;
    }

    public boolean isIconActivable() {
        return false;
    }

    public boolean isIconActivated() {
        return false;
    }

    public boolean isIconCheckable() {
        return false;
    }

    public boolean isIconChecked() {
        return false;
    }

    public final void refreshIconState() {
        this.b.refreshIconState(false);
    }

    public boolean shouldTintIconOnError() {
        return false;
    }

    public void setUp() {
    }

    public void tearDown() {
    }

    public void afterEditTextChanged(Editable editable) {
    }

    public void onEditTextAttached(EditText editText) {
    }

    public void onSuffixVisibilityChanged(boolean z) {
    }

    public void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.c cVar) {
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
    }

    public void beforeEditTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
