package com.bumptech.glide.load.data;

import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements e<InputStream> {
    private final RecyclableBufferedInputStream a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a implements e.a<InputStream> {
        private final com.bumptech.glide.load.engine.bitmap_recycle.b a;

        public a(com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public e<InputStream> build(InputStream inputStream) {
            return new k(inputStream, this.a);
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class<InputStream> getDataClass() {
            return InputStream.class;
        }
    }

    public k(InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, bVar);
        this.a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public void cleanup() {
        this.a.release();
    }

    public void fixMarkLimits() {
        this.a.fixMarkLimit();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.load.data.e
    public InputStream rewindAndGet() throws IOException {
        this.a.reset();
        return this.a;
    }
}
