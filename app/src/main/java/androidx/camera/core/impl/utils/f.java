package androidx.camera.core.impl.utils;

import android.util.Size;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparator<Size> {
    private boolean a;

    public f(boolean z) {
        this.a = z;
    }

    @Override // java.util.Comparator
    public int compare(Size size, Size size2) {
        int iSignum = Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        return this.a ? iSignum * (-1) : iSignum;
    }

    public f() {
        this(false);
    }
}
