package com.bumptech.glide.load.resource.bytes;

import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.util.k;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class b implements s<byte[]> {
    private final byte[] a;

    public b(byte[] bArr) {
        this.a = (byte[]) k.checkNotNull(bArr);
    }

    @Override // com.bumptech.glide.load.engine.s
    public Class<byte[]> getResourceClass() {
        return byte[].class;
    }

    @Override // com.bumptech.glide.load.engine.s
    public int getSize() {
        return this.a.length;
    }

    @Override // com.bumptech.glide.load.engine.s
    public byte[] get() {
        return this.a;
    }

    @Override // com.bumptech.glide.load.engine.s
    public void recycle() {
    }
}
