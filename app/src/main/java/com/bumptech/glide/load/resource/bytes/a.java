package com.bumptech.glide.load.resource.bytes;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class a implements e<ByteBuffer> {
    private final ByteBuffer a;

    public a(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    public ByteBuffer rewindAndGet() {
        this.a.position(0);
        return this.a;
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bytes.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class C0407a implements e.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.e.a
        public Class<ByteBuffer> getDataClass() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public e<ByteBuffer> build(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public void cleanup() {
    }
}
