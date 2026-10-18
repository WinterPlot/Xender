package androidx.camera.core;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.internal.utils.ImageUtil;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 implements i1 {
    protected final i1 b;
    private final Object a = new Object();
    private final Set<a> c = new HashSet();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a {
        void onImageClose(i1 i1Var);
    }

    public q0(i1 i1Var) {
        this.b = i1Var;
    }

    public void addOnImageCloseListener(a aVar) {
        synchronized (this.a) {
            this.c.add(aVar);
        }
    }

    @Override // androidx.camera.core.i1, java.lang.AutoCloseable
    public void close() {
        this.b.close();
        notifyOnImageCloseListeners();
    }

    @Override // androidx.camera.core.i1
    public Rect getCropRect() {
        return this.b.getCropRect();
    }

    @Override // androidx.camera.core.i1
    public int getFormat() {
        return this.b.getFormat();
    }

    @Override // androidx.camera.core.i1
    public int getHeight() {
        return this.b.getHeight();
    }

    @Override // androidx.camera.core.i1
    public Image getImage() {
        return this.b.getImage();
    }

    @Override // androidx.camera.core.i1
    public f1 getImageInfo() {
        return this.b.getImageInfo();
    }

    @Override // androidx.camera.core.i1
    public i1.a[] getPlanes() {
        return this.b.getPlanes();
    }

    @Override // androidx.camera.core.i1
    public int getWidth() {
        return this.b.getWidth();
    }

    public void notifyOnImageCloseListeners() {
        HashSet hashSet;
        synchronized (this.a) {
            hashSet = new HashSet(this.c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).onImageClose(this);
        }
    }

    @Override // androidx.camera.core.i1
    public void setCropRect(Rect rect) {
        this.b.setCropRect(rect);
    }

    @Override // androidx.camera.core.i1
    public Bitmap toBitmap() {
        return ImageUtil.createBitmapFromImageProxy(this);
    }
}
