package com.userlabs.xshare.cropimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class CropImageView extends d {
    float A;
    float B;
    int C;
    boolean H;
    boolean L;
    HighlightView M;
    ArrayList<HighlightView> y;
    HighlightView z;

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = new ArrayList<>();
        this.z = null;
        this.H = true;
    }

    private void centerBasedOnHighlightView(HighlightView highlightView) {
        Rect rect = highlightView.e;
        float fMax = Math.max(1.0f, Math.min((getWidth() / rect.width()) * 0.6f, (getHeight() / rect.height()) * 0.6f) * getScale());
        if (Math.abs(fMax - getScale()) / fMax > 0.1d) {
            float[] fArr = {highlightView.g.centerX(), highlightView.g.centerY()};
            getImageMatrix().mapPoints(fArr);
            zoomTo(fMax, fArr[0], fArr[1], 300.0f);
        }
        ensureVisible(highlightView);
    }

    private void ensureVisible(HighlightView highlightView) {
        Rect rect = highlightView.e;
        int iMax = Math.max(0, this.l - rect.left);
        int iMin = Math.min(0, this.m - rect.right);
        int iMax2 = Math.max(0, this.p - rect.top);
        int iMin2 = Math.min(0, this.v - rect.bottom);
        if (iMax == 0) {
            iMax = iMin;
        }
        if (iMax2 == 0) {
            iMax2 = iMin2;
        }
        if (iMax == 0 && iMax2 == 0) {
            return;
        }
        panBy(iMax, iMax2);
    }

    private void recomputeFocus(MotionEvent motionEvent) {
        for (int i = 0; i < this.y.size(); i++) {
            HighlightView highlightView = this.y.get(i);
            highlightView.setFocus(false);
            highlightView.invalidate();
        }
        for (int i2 = 0; i2 < this.y.size(); i2++) {
            HighlightView highlightView2 = this.y.get(i2);
            if (highlightView2.getHit(motionEvent.getX(), motionEvent.getY()) != 1) {
                if (!highlightView2.hasFocus()) {
                    highlightView2.setFocus(true);
                    highlightView2.invalidate();
                    break;
                }
                break;
            }
        }
        invalidate();
    }

    public void add(HighlightView highlightView) {
        this.y.add(highlightView);
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < this.y.size(); i++) {
            this.y.get(i).draw(canvas);
        }
    }

    @Override // com.userlabs.xshare.cropimage.d, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.userlabs.xshare.cropimage.d, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.h.getBitmap() != null) {
            ArrayList<HighlightView> arrayList = this.y;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                HighlightView highlightView = arrayList.get(i5);
                i5++;
                HighlightView highlightView2 = highlightView;
                highlightView2.h.set(getImageMatrix());
                highlightView2.invalidate();
                if (highlightView2.b) {
                    centerBasedOnHighlightView(highlightView2);
                }
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.H) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                if (this.L) {
                    for (int i = 0; i < this.y.size(); i++) {
                        HighlightView highlightView = this.y.get(i);
                        if (highlightView.hasFocus()) {
                            this.M = highlightView;
                            for (int i2 = 0; i2 < this.y.size(); i2++) {
                                if (i2 != i) {
                                    this.y.get(i2).setHidden(true);
                                }
                            }
                            centerBasedOnHighlightView(highlightView);
                            this.L = false;
                            return true;
                        }
                    }
                } else {
                    HighlightView highlightView2 = this.z;
                    if (highlightView2 != null) {
                        centerBasedOnHighlightView(highlightView2);
                        this.z.setMode(HighlightView.ModifyMode.None);
                    }
                }
                this.z = null;
            } else if (action == 2) {
                if (this.L) {
                    recomputeFocus(motionEvent);
                } else {
                    HighlightView highlightView3 = this.z;
                    if (highlightView3 != null) {
                        highlightView3.handleMotion(this.C, motionEvent.getX() - this.A, motionEvent.getY() - this.B);
                        this.A = motionEvent.getX();
                        this.B = motionEvent.getY();
                        ensureVisible(this.z);
                    }
                }
            }
        } else if (this.L) {
            recomputeFocus(motionEvent);
        } else {
            for (int i3 = 0; i3 < this.y.size(); i3++) {
                HighlightView highlightView4 = this.y.get(i3);
                int hit = highlightView4.getHit(motionEvent.getX(), motionEvent.getY());
                if (hit != 1) {
                    this.C = hit;
                    this.z = highlightView4;
                    this.A = motionEvent.getX();
                    this.B = motionEvent.getY();
                    this.z.setMode(hit == 32 ? HighlightView.ModifyMode.Move : HighlightView.ModifyMode.Grow);
                    break;
                }
            }
        }
        int action2 = motionEvent.getAction();
        if (action2 == 1) {
            center(true, true);
        } else if (action2 == 2 && getScale() == 1.0f) {
            center(true, true);
        }
        return true;
    }

    @Override // com.userlabs.xshare.cropimage.d
    public void postTranslate(float f, float f2) {
        super.postTranslate(f, f2);
        for (int i = 0; i < this.y.size(); i++) {
            HighlightView highlightView = this.y.get(i);
            highlightView.h.postTranslate(f, f2);
            highlightView.invalidate();
        }
    }

    @Override // com.userlabs.xshare.cropimage.d, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public /* bridge */ /* synthetic */ void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
    }

    @Override // com.userlabs.xshare.cropimage.d
    public /* bridge */ /* synthetic */ void setImageBitmapResetBase(Bitmap bitmap, boolean z) {
        super.setImageBitmapResetBase(bitmap, z);
    }

    @Override // com.userlabs.xshare.cropimage.d
    public /* bridge */ /* synthetic */ void setImageRotateBitmapResetBase(f fVar, boolean z) {
        super.setImageRotateBitmapResetBase(fVar, z);
    }

    public void updateHighlightCrop() {
        if (this.y.size() == 1) {
            HighlightView highlightView = this.y.get(0);
            this.M = highlightView;
            highlightView.setFocus(true);
        }
    }

    @Override // com.userlabs.xshare.cropimage.d
    public void zoomTo(float f, float f2, float f3) {
        super.zoomTo(f, f2, f3);
        ArrayList<HighlightView> arrayList = this.y;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            HighlightView highlightView = arrayList.get(i);
            i++;
            HighlightView highlightView2 = highlightView;
            highlightView2.h.set(getImageMatrix());
            highlightView2.invalidate();
        }
    }
}
