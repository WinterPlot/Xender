package com.bumptech.glide.load;

import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a implements h {
        final /* synthetic */ InputStream a;

        public a(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // com.bumptech.glide.load.b.h
        public ImageHeaderParser.ImageType getTypeAndRewind(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.getType(this.a);
            } finally {
                this.a.reset();
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class C0390b implements h {
        final /* synthetic */ ByteBuffer a;

        public C0390b(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.b.h
        public ImageHeaderParser.ImageType getTypeAndRewind(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.getType(this.a);
            } finally {
                com.bumptech.glide.util.a.rewind(this.a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class c implements h {
        final /* synthetic */ ParcelFileDescriptorRewinder a;
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b b;

        public c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.a = parcelFileDescriptorRewinder;
            this.b = bVar;
        }

        @Override // com.bumptech.glide.load.b.h
        public ImageHeaderParser.ImageType getTypeAndRewind(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.a.rewindAndGet().getFileDescriptor()), this.b);
                try {
                    ImageHeaderParser.ImageType type = imageHeaderParser.getType(recyclableBufferedInputStream2);
                    recyclableBufferedInputStream2.release();
                    this.a.rewindAndGet();
                    return type;
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        recyclableBufferedInputStream.release();
                    }
                    this.a.rewindAndGet();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class d implements g {
        final /* synthetic */ ByteBuffer a;
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b b;

        public d(ByteBuffer byteBuffer, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.a = byteBuffer;
            this.b = bVar;
        }

        @Override // com.bumptech.glide.load.b.g
        public int getOrientationAndRewind(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.getOrientation(this.a, this.b);
            } finally {
                com.bumptech.glide.util.a.rewind(this.a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class e implements g {
        final /* synthetic */ InputStream a;
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b b;

        public e(InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.a = inputStream;
            this.b = bVar;
        }

        @Override // com.bumptech.glide.load.b.g
        public int getOrientationAndRewind(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.getOrientation(this.a, this.b);
            } finally {
                this.a.reset();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class f implements g {
        final /* synthetic */ ParcelFileDescriptorRewinder a;
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b b;

        public f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.a = parcelFileDescriptorRewinder;
            this.b = bVar;
        }

        @Override // com.bumptech.glide.load.b.g
        public int getOrientationAndRewind(ImageHeaderParser imageHeaderParser) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(this.a.rewindAndGet().getFileDescriptor()), this.b);
                try {
                    int orientation = imageHeaderParser.getOrientation(recyclableBufferedInputStream2, this.b);
                    recyclableBufferedInputStream2.release();
                    this.a.rewindAndGet();
                    return orientation;
                } catch (Throwable th) {
                    th = th;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        recyclableBufferedInputStream.release();
                    }
                    this.a.rewindAndGet();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface g {
        int getOrientationAndRewind(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface h {
        ImageHeaderParser.ImageType getTypeAndRewind(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    private b() {
    }

    public static int getOrientation(List<ImageHeaderParser> list, InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return getOrientationInternal(list, new e(inputStream, bVar));
    }

    private static int getOrientationInternal(List<ImageHeaderParser> list, g gVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int orientationAndRewind = gVar.getOrientationAndRewind(list.get(i));
            if (orientationAndRewind != -1) {
                return orientationAndRewind;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType getType(List<ImageHeaderParser> list, InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return getTypeInternal(list, new a(inputStream));
    }

    private static ImageHeaderParser.ImageType getTypeInternal(List<ImageHeaderParser> list, h hVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType typeAndRewind = hVar.getTypeAndRewind(list.get(i));
            if (typeAndRewind != ImageHeaderParser.ImageType.UNKNOWN) {
                return typeAndRewind;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static int getOrientation(List<ImageHeaderParser> list, ByteBuffer byteBuffer, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        if (byteBuffer == null) {
            return -1;
        }
        return getOrientationInternal(list, new d(byteBuffer, bVar));
    }

    public static int getOrientation(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        return getOrientationInternal(list, new f(parcelFileDescriptorRewinder, bVar));
    }

    public static ImageHeaderParser.ImageType getType(List<ImageHeaderParser> list, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return getTypeInternal(list, new C0390b(byteBuffer));
    }

    public static ImageHeaderParser.ImageType getType(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        return getTypeInternal(list, new c(parcelFileDescriptorRewinder, bVar));
    }
}
