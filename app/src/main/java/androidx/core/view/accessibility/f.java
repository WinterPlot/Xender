package androidx.core.view.accessibility;

import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class f {
    private final AccessibilityRecord a;

    @Deprecated
    public f(Object obj) {
        this.a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public static f obtain(f fVar) {
        return new f(AccessibilityRecord.obtain(fVar.a));
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        AccessibilityRecord accessibilityRecord = this.a;
        AccessibilityRecord accessibilityRecord2 = ((f) obj).a;
        if (accessibilityRecord == null) {
            return accessibilityRecord2 == null;
        }
        return accessibilityRecord.equals(accessibilityRecord2);
    }

    @Deprecated
    public int getAddedCount() {
        return this.a.getAddedCount();
    }

    @Deprecated
    public CharSequence getBeforeText() {
        return this.a.getBeforeText();
    }

    @Deprecated
    public CharSequence getClassName() {
        return this.a.getClassName();
    }

    @Deprecated
    public CharSequence getContentDescription() {
        return this.a.getContentDescription();
    }

    @Deprecated
    public int getCurrentItemIndex() {
        return this.a.getCurrentItemIndex();
    }

    @Deprecated
    public int getFromIndex() {
        return this.a.getFromIndex();
    }

    @Deprecated
    public Object getImpl() {
        return this.a;
    }

    @Deprecated
    public int getItemCount() {
        return this.a.getItemCount();
    }

    @Deprecated
    public int getMaxScrollX() {
        return getMaxScrollX(this.a);
    }

    @Deprecated
    public int getMaxScrollY() {
        return getMaxScrollY(this.a);
    }

    @Deprecated
    public Parcelable getParcelableData() {
        return this.a.getParcelableData();
    }

    @Deprecated
    public int getRemovedCount() {
        return this.a.getRemovedCount();
    }

    @Deprecated
    public int getScrollX() {
        return this.a.getScrollX();
    }

    @Deprecated
    public int getScrollY() {
        return this.a.getScrollY();
    }

    @Deprecated
    public c getSource() {
        return c.wrapNonNullInstance(this.a.getSource());
    }

    @Deprecated
    public List<CharSequence> getText() {
        return this.a.getText();
    }

    @Deprecated
    public int getToIndex() {
        return this.a.getToIndex();
    }

    @Deprecated
    public int getWindowId() {
        return this.a.getWindowId();
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public boolean isChecked() {
        return this.a.isChecked();
    }

    @Deprecated
    public boolean isEnabled() {
        return this.a.isEnabled();
    }

    @Deprecated
    public boolean isFullScreen() {
        return this.a.isFullScreen();
    }

    @Deprecated
    public boolean isPassword() {
        return this.a.isPassword();
    }

    @Deprecated
    public boolean isScrollable() {
        return this.a.isScrollable();
    }

    @Deprecated
    public void recycle() {
        this.a.recycle();
    }

    @Deprecated
    public void setAddedCount(int i) {
        this.a.setAddedCount(i);
    }

    @Deprecated
    public void setBeforeText(CharSequence charSequence) {
        this.a.setBeforeText(charSequence);
    }

    @Deprecated
    public void setChecked(boolean z) {
        this.a.setChecked(z);
    }

    @Deprecated
    public void setClassName(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    @Deprecated
    public void setContentDescription(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    @Deprecated
    public void setCurrentItemIndex(int i) {
        this.a.setCurrentItemIndex(i);
    }

    @Deprecated
    public void setEnabled(boolean z) {
        this.a.setEnabled(z);
    }

    @Deprecated
    public void setFromIndex(int i) {
        this.a.setFromIndex(i);
    }

    @Deprecated
    public void setFullScreen(boolean z) {
        this.a.setFullScreen(z);
    }

    @Deprecated
    public void setItemCount(int i) {
        this.a.setItemCount(i);
    }

    @Deprecated
    public void setMaxScrollX(int i) {
        setMaxScrollX(this.a, i);
    }

    @Deprecated
    public void setMaxScrollY(int i) {
        setMaxScrollY(this.a, i);
    }

    @Deprecated
    public void setParcelableData(Parcelable parcelable) {
        this.a.setParcelableData(parcelable);
    }

    @Deprecated
    public void setPassword(boolean z) {
        this.a.setPassword(z);
    }

    @Deprecated
    public void setRemovedCount(int i) {
        this.a.setRemovedCount(i);
    }

    @Deprecated
    public void setScrollX(int i) {
        this.a.setScrollX(i);
    }

    @Deprecated
    public void setScrollY(int i) {
        this.a.setScrollY(i);
    }

    @Deprecated
    public void setScrollable(boolean z) {
        this.a.setScrollable(z);
    }

    @Deprecated
    public void setSource(View view) {
        this.a.setSource(view);
    }

    @Deprecated
    public void setToIndex(int i) {
        this.a.setToIndex(i);
    }

    @Deprecated
    public static void setMaxScrollX(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollX(i);
    }

    @Deprecated
    public static void setMaxScrollY(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollY(i);
    }

    @Deprecated
    public void setSource(View view, int i) {
        setSource(this.a, view, i);
    }

    @Deprecated
    public static int getMaxScrollX(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }

    @Deprecated
    public static int getMaxScrollY(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }

    @Deprecated
    public static void setSource(AccessibilityRecord accessibilityRecord, View view, int i) {
        accessibilityRecord.setSource(view, i);
    }

    @Deprecated
    public static f obtain() {
        return new f(AccessibilityRecord.obtain());
    }
}
