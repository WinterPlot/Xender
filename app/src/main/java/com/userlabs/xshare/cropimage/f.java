package com.userlabs.xshare.cropimage;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class f {
    private Bitmap a;
    private int b = 0;

    public f(Bitmap bitmap) {
        this.a = bitmap;
    }

    public Bitmap getBitmap() {
        return this.a;
    }

    public int getHeight() {
        boolean zIsOrientationChanged = isOrientationChanged();
        Bitmap bitmap = this.a;
        return zIsOrientationChanged ? bitmap.getWidth() : bitmap.getHeight();
    }

    public Matrix getRotateMatrix() {
        Matrix matrix = new Matrix();
        if (this.b != 0) {
            matrix.preTranslate(-(this.a.getWidth() / 2), -(this.a.getHeight() / 2));
            matrix.postRotate(this.b);
            matrix.postTranslate(getWidth() / 2, getHeight() / 2);
        }
        return matrix;
    }

    public int getRotation() {
        return this.b;
    }

    public int getWidth() {
        boolean zIsOrientationChanged = isOrientationChanged();
        Bitmap bitmap = this.a;
        return zIsOrientationChanged ? bitmap.getHeight() : bitmap.getWidth();
    }

    public boolean isOrientationChanged() {
        return (this.b / 90) % 2 != 0;
    }

    public void setBitmap(Bitmap bitmap) {
        this.a = bitmap;
    }

    public void setRotation(int i) {
        this.b = i;
    }
}
