package androidx.camera.core.resolutionselector;

import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d c = new d();
    private Size a;
    private int b;

    private d() {
        this.a = null;
        this.b = 0;
    }

    public Size getBoundSize() {
        return this.a;
    }

    public int getFallbackRule() {
        return this.b;
    }

    public d(Size size, int i) {
        this.a = size;
        this.b = i;
    }
}
