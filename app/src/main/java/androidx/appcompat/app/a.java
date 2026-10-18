package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import androidx.appcompat.R;
import okhttp3.b0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    @Deprecated
    public interface c {
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    @Deprecated
    public static abstract class d {
        public abstract CharSequence getContentDescription();

        public abstract View getCustomView();

        public abstract Drawable getIcon();

        public abstract int getPosition();

        public abstract Object getTag();

        public abstract CharSequence getText();

        public abstract void select();

        public abstract d setContentDescription(int i);

        public abstract d setContentDescription(CharSequence charSequence);

        public abstract d setCustomView(int i);

        public abstract d setCustomView(View view);

        public abstract d setIcon(int i);

        public abstract d setIcon(Drawable drawable);

        public abstract d setTabListener(e eVar);

        public abstract d setTag(Object obj);

        public abstract d setText(int i);

        public abstract d setText(CharSequence charSequence);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    @Deprecated
    public interface e {
    }

    public abstract void addOnMenuVisibilityListener(b bVar);

    @Deprecated
    public abstract void addTab(d dVar);

    @Deprecated
    public abstract void addTab(d dVar, int i);

    @Deprecated
    public abstract void addTab(d dVar, int i, boolean z);

    @Deprecated
    public abstract void addTab(d dVar, boolean z);

    public boolean closeOptionsMenu() {
        return false;
    }

    public boolean collapseActionView() {
        return false;
    }

    public abstract View getCustomView();

    public abstract int getDisplayOptions();

    public float getElevation() {
        return 0.0f;
    }

    public abstract int getHeight();

    public int getHideOffset() {
        return 0;
    }

    @Deprecated
    public abstract int getNavigationItemCount();

    @Deprecated
    public abstract int getNavigationMode();

    @Deprecated
    public abstract int getSelectedNavigationIndex();

    @Deprecated
    public abstract d getSelectedTab();

    public abstract CharSequence getSubtitle();

    @Deprecated
    public abstract d getTabAt(int i);

    @Deprecated
    public abstract int getTabCount();

    public Context getThemedContext() {
        return null;
    }

    public abstract CharSequence getTitle();

    public abstract void hide();

    public boolean invalidateOptionsMenu() {
        return false;
    }

    public boolean isHideOnContentScrollEnabled() {
        return false;
    }

    public abstract boolean isShowing();

    public boolean isTitleTruncated() {
        return false;
    }

    @Deprecated
    public abstract d newTab();

    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        return false;
    }

    public boolean onMenuKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    public boolean openOptionsMenu() {
        return false;
    }

    @Deprecated
    public abstract void removeAllTabs();

    public abstract void removeOnMenuVisibilityListener(b bVar);

    @Deprecated
    public abstract void removeTab(d dVar);

    @Deprecated
    public abstract void removeTabAt(int i);

    public boolean requestFocus() {
        return false;
    }

    @Deprecated
    public abstract void selectTab(d dVar);

    public abstract void setBackgroundDrawable(Drawable drawable);

    public abstract void setCustomView(int i);

    public abstract void setCustomView(View view);

    public abstract void setCustomView(View view, C0024a c0024a);

    public abstract void setDisplayHomeAsUpEnabled(boolean z);

    public abstract void setDisplayOptions(int i);

    public abstract void setDisplayOptions(int i, int i2);

    public abstract void setDisplayShowCustomEnabled(boolean z);

    public abstract void setDisplayShowHomeEnabled(boolean z);

    public abstract void setDisplayShowTitleEnabled(boolean z);

    public abstract void setDisplayUseLogoEnabled(boolean z);

    public void setElevation(float f) {
        if (f == 0.0f) {
            return;
        }
        b0.p("Setting a non-zero elevation is not supported in this action bar configuration.");
    }

    public void setHideOffset(int i) {
        if (i == 0) {
            return;
        }
        b0.p("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z) {
            b0.p("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    public abstract void setIcon(int i);

    public abstract void setIcon(Drawable drawable);

    @Deprecated
    public abstract void setListNavigationCallbacks(SpinnerAdapter spinnerAdapter, c cVar);

    public abstract void setLogo(int i);

    public abstract void setLogo(Drawable drawable);

    @Deprecated
    public abstract void setNavigationMode(int i);

    @Deprecated
    public abstract void setSelectedNavigationItem(int i);

    public abstract void setSubtitle(int i);

    public abstract void setSubtitle(CharSequence charSequence);

    public abstract void setTitle(int i);

    public abstract void setTitle(CharSequence charSequence);

    public abstract void show();

    public androidx.appcompat.view.b startActionMode(androidx.appcompat.view.b.a aVar) {
        return null;
    }

    public void setHomeActionContentDescription(CharSequence charSequence) {
    }

    public void setHomeAsUpIndicator(Drawable drawable) {
    }

    public void onDestroy() {
    }

    public void dispatchMenuVisibilityChanged(boolean z) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void setDefaultDisplayHomeAsUpEnabled(boolean z) {
    }

    public void setHomeActionContentDescription(int i) {
    }

    public void setHomeAsUpIndicator(int i) {
    }

    public void setHomeButtonEnabled(boolean z) {
    }

    public void setShowHideAnimationEnabled(boolean z) {
    }

    public void setSplitBackgroundDrawable(Drawable drawable) {
    }

    public void setStackedBackgroundDrawable(Drawable drawable) {
    }

    public void setWindowTitle(CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class C0024a extends ViewGroup.MarginLayoutParams {
        public int a;

        public C0024a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActionBarLayout);
            this.a = typedArrayObtainStyledAttributes.getInt(R.styleable.ActionBarLayout_android_layout_gravity, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0024a(int i, int i2) {
            super(i, i2);
            this.a = 8388627;
        }

        public C0024a(int i, int i2, int i3) {
            super(i, i2);
            this.a = i3;
        }

        public C0024a(int i) {
            this(-2, -1, i);
        }

        public C0024a(C0024a c0024a) {
            super((ViewGroup.MarginLayoutParams) c0024a);
            this.a = 0;
            this.a = c0024a.a;
        }

        public C0024a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }
    }
}
