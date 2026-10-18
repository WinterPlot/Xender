package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements com.bumptech.glide.gifdecoder.a.InterfaceC0389a {
    private final com.bumptech.glide.load.engine.bitmap_recycle.d a;
    private final com.bumptech.glide.load.engine.bitmap_recycle.b b;

    public b(com.bumptech.glide.load.engine.bitmap_recycle.d dVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.a = dVar;
        this.b = bVar;
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0389a
    public Bitmap obtain(int i, int i2, Bitmap.Config config) {
        return this.a.getDirty(i, i2, config);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0389a
    public byte[] obtainByteArray(int i) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.b;
        return bVar == null ? new byte[i] : (byte[]) bVar.get(i, byte[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0389a
    public int[] obtainIntArray(int i) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.b;
        return bVar == null ? new int[i] : (int[]) bVar.get(i, int[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0389a
    public void release(byte[] bArr) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.put(bArr);
    }

    public b(com.bumptech.glide.load.engine.bitmap_recycle.d dVar) {
        this(dVar, null);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0389a
    public void release(Bitmap bitmap) {
        this.a.put(bitmap);
    }

    @Override // com.bumptech.glide.gifdecoder.a.InterfaceC0389a
    public void release(int[] iArr) {
        com.bumptech.glide.load.engine.bitmap_recycle.b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.put(iArr);
    }
}
