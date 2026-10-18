package com.userlabs.xshare.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.LruCache;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BufferView extends View {
    private Canvas a;
    private long b;
    LruCache<String, Bitmap> c;

    public BufferView(Context context) {
        super(context);
    }

    private Bitmap createNewBufferBitmap() {
        if (com.userlabs.xshare.core.log.h.a) {
            com.userlabs.xshare.core.log.h.d("BufferView", "bitmap width" + getWidth() + "height " + getHeight());
        }
        return Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
    }

    private void ensureInitBufferCanvas() {
        if (this.a == null) {
            this.a = new Canvas();
        }
    }

    private void ensureInitLruCache() {
        if (this.c == null) {
            this.c = new a(15728640);
        }
    }

    private Bitmap getBufferBitmap(String str) {
        Bitmap bitmapCreateNewBufferBitmap = this.c.get(str);
        if (bitmapCreateNewBufferBitmap == null) {
            bitmapCreateNewBufferBitmap = createNewBufferBitmap();
            if (this.c.maxSize() - this.c.size() >= bitmapCreateNewBufferBitmap.getByteCount()) {
                this.c.put(str, bitmapCreateNewBufferBitmap);
                if (com.userlabs.xshare.core.log.h.a) {
                    com.userlabs.xshare.core.log.h.e("BufferView", "lruCache add bitmap success");
                    return bitmapCreateNewBufferBitmap;
                }
            } else if (com.userlabs.xshare.core.log.h.a) {
                com.userlabs.xshare.core.log.h.e("BufferView", "no space...");
            }
        }
        return bitmapCreateNewBufferBitmap;
    }

    private void recycleBitmap(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (com.userlabs.xshare.core.log.h.a) {
            com.userlabs.xshare.core.log.h.d("BufferView", "recycle....");
        }
        bitmap.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recycleLruCache(Bitmap bitmap) {
        if (com.userlabs.xshare.core.log.h.a) {
            com.userlabs.xshare.core.log.h.d("BufferView", "recycle Bitmap by key: " + bitmap.getByteCount());
        }
        recycleBitmap(bitmap);
    }

    public final void cacheBitmap(String str, Bitmap bitmap) {
        ensureInitLruCache();
        this.c.put(str, bitmap);
    }

    public final Bitmap getCacheBitmap(String str) {
        ensureInitLruCache();
        return this.c.get(str);
    }

    public abstract String getKey();

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LruCache<String, Bitmap> lruCache = this.c;
        if (lruCache != null) {
            lruCache.evictAll();
            this.c = null;
        }
        this.a = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (com.userlabs.xshare.core.log.h.a) {
            this.b = System.currentTimeMillis();
        }
        ensureInitBufferCanvas();
        ensureInitLruCache();
        Bitmap bufferBitmap = getBufferBitmap(getKey());
        this.a.setBitmap(bufferBitmap);
        drawBufferCanvas(this.a);
        if (com.userlabs.xshare.core.phone.util.a.bitmapCanDraw(bufferBitmap)) {
            canvas.drawBitmap(bufferBitmap, 0.0f, 0.0f, (Paint) null);
        }
        if (com.userlabs.xshare.core.log.h.a) {
            com.userlabs.xshare.core.log.h.d("BufferView", "draw end time : " + (System.currentTimeMillis() - this.b));
        }
    }

    public BufferView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BufferView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a extends LruCache<String, Bitmap> {
        public a(int i) {
            super(i);
        }

        @Override // android.util.LruCache
        public void entryRemoved(boolean z, String str, Bitmap bitmap, Bitmap bitmap2) {
            super.entryRemoved(z, str, bitmap, bitmap2);
            if (z) {
                if (com.userlabs.xshare.core.log.h.a) {
                    com.userlabs.xshare.core.log.h.d("BufferView", "entryRemoved key: " + str + " and old bitmap " + bitmap);
                }
                BufferView.this.recycleLruCache(bitmap);
            }
        }

        @Override // android.util.LruCache
        public int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    }

    public void drawBufferCanvas(Canvas canvas) {
    }
}
