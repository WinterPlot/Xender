package androidx.core.view;

import android.view.ViewStructure;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class h1 {
    private final ViewStructure a;

    private h1(ViewStructure viewStructure) {
        this.a = viewStructure;
    }

    public static h1 toViewStructureCompat(ViewStructure viewStructure) {
        return new h1(viewStructure);
    }

    public void setClassName(String str) {
        this.a.setClassName(str);
    }

    public void setContentDescription(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public void setDimens(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a.setDimens(i, i2, i3, i4, i5, i6);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public ViewStructure toViewStructure() {
        return this.a;
    }
}
