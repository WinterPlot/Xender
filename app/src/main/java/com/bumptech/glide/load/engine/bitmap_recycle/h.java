package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements a<int[]> {
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int getElementSizeInBytes() {
        return 4;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public String getTag() {
        return "IntegerArrayPool";
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int[] newArray(int i) {
        return new int[i];
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int getArrayLength(int[] iArr) {
        return iArr.length;
    }
}
