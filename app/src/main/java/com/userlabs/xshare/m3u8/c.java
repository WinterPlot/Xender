package com.userlabs.xshare.m3u8;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class c {
    private volatile boolean a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        com.userlabs.xshare.m3u8.b a;
        MediaExtractor b;
        final List<C0342c> c = new ArrayList();

        private a() {
        }

        public static a open(List<File> list) throws Throwable {
            a aVar = new a();
            try {
                aVar.a = new com.userlabs.xshare.m3u8.b(list);
                MediaExtractor mediaExtractor = new MediaExtractor();
                aVar.b = mediaExtractor;
                mediaExtractor.setDataSource(aVar.a);
                int trackCount = aVar.b.getTrackCount();
                for (int i = 0; i < trackCount; i++) {
                    MediaFormat trackFormat = aVar.b.getTrackFormat(i);
                    String string = trackFormat.getString("mime");
                    if (string != null && (string.startsWith("video/") || string.startsWith("audio/"))) {
                        aVar.b.selectTrack(i);
                        aVar.c.add(new C0342c(i, trackFormat));
                    }
                }
                if (aVar.c.isEmpty()) {
                    throw new IOException("no audio/video track found in segments");
                }
                return aVar;
            } catch (IOException e) {
                e = e;
                aVar.release();
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                aVar.release();
                throw e;
            }
        }

        public void release() {
            MediaExtractor mediaExtractor = this.b;
            if (mediaExtractor != null) {
                mediaExtractor.release();
                this.b = null;
            }
            com.userlabs.xshare.m3u8.b bVar = this.a;
            if (bVar != null) {
                try {
                    bVar.close();
                } catch (Throwable unused) {
                }
                this.a = null;
            }
        }

        public C0342c trackFor(int i) {
            for (C0342c c0342c : this.c) {
                if (c0342c.a == i) {
                    return c0342c;
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface b {
        void a(float f);
    }

    /* JADX INFO: renamed from: com.userlabs.xshare.m3u8.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class C0342c {
        final int a;
        final MediaFormat b;
        int c = -1;

        public C0342c(int i, MediaFormat mediaFormat) {
            this.a = i;
            this.b = mediaFormat;
        }
    }

    private static int pickBufferSize(List<a> list) {
        Iterator<a> it = list.iterator();
        int iMax = 1048576;
        while (it.hasNext()) {
            for (C0342c c0342c : it.next().c) {
                if (c0342c.b.containsKey("max-input-size")) {
                    iMax = Math.max(iMax, c0342c.b.getInteger("max-input-size"));
                }
            }
        }
        return Math.min(iMax, 16777216);
    }

    public void cancel() {
        this.a = true;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0264 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x0279 A[LOOP:1: B:138:0x0277->B:139:0x0279, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x0287  */
    /* JADX WARN: Code duplicated, block: B:164:0x0266 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:? A[SYNTHETIC] */
    public void merge(List<File> list, List<File> list2, File file, b bVar) throws IOException {
        int i;
        int i2;
        MediaMuxer mediaMuxer;
        Throwable th;
        int size;
        int i3;
        long j;
        int i4;
        int i5;
        this = this;
        int i6 = 0;
        this.a = false;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    arrayList.add(a.open(list));
                }
            } catch (Throwable th2) {
                th = th2;
                i2 = 0;
                i = 0;
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            arrayList.add(a.open(list2));
        }
        try {
            if (arrayList.isEmpty()) {
                i = 0;
                try {
                    throw new IOException("no input segments");
                } catch (Throwable th3) {
                    th = th3;
                    i6 = 0;
                }
            } else {
                int size2 = arrayList.size();
                int i7 = 0;
                long jMin = Long.MAX_VALUE;
                while (true) {
                    j = 0;
                    if (i7 >= size2) {
                        break;
                    }
                    Object obj = arrayList.get(i7);
                    i7++;
                    long sampleTime = ((a) obj).b.getSampleTime();
                    if (sampleTime >= 0) {
                        jMin = Math.min(jMin, sampleTime);
                    }
                }
                if (jMin == Long.MAX_VALUE) {
                    jMin = 0;
                }
                mediaMuxer = new MediaMuxer(file.getAbsolutePath(), 0);
                try {
                    int size3 = arrayList.size();
                    int i8 = 0;
                    while (i8 < size3) {
                        try {
                            Object obj2 = arrayList.get(i8);
                            i8++;
                            for (C0342c c0342c : ((a) obj2).c) {
                                long j2 = j;
                                c0342c.c = mediaMuxer.addTrack(c0342c.b);
                                if (c0342c.b.containsKey("rotation-degrees")) {
                                    mediaMuxer.setOrientationHint(c0342c.b.getInteger("rotation-degrees"));
                                }
                                j = j2;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            i2 = 0;
                            i = 0;
                        }
                    }
                    long j3 = j;
                    mediaMuxer.start();
                    try {
                        int size4 = arrayList.size();
                        long size5 = j3;
                        int i9 = 0;
                        while (i9 < size4) {
                            try {
                                Object obj3 = arrayList.get(i9);
                                i9++;
                                size5 += ((a) obj3).a.getSize();
                            } catch (Throwable th5) {
                                th = th5;
                                i = 0;
                                i2 = 1;
                            }
                        }
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(pickBufferSize(arrayList));
                        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                        int size6 = arrayList.size();
                        long j4 = j3;
                        int i10 = 0;
                        while (i10 < size6) {
                            try {
                                Object obj4 = arrayList.get(i10);
                                i10++;
                                a aVar = (a) obj4;
                                long j5 = j4;
                                ByteBuffer byteBufferAllocate2 = byteBufferAllocate;
                                while (true) {
                                    if (this.a) {
                                        throw new IOException("cancelled");
                                    }
                                    try {
                                        i5 = size6;
                                        try {
                                            int sampleData = aVar.b.readSampleData(byteBufferAllocate2, 0);
                                            if (sampleData < 0) {
                                                break;
                                            }
                                            int sampleTrackIndex = aVar.b.getSampleTrackIndex();
                                            C0342c c0342cTrackFor = aVar.trackFor(sampleTrackIndex);
                                            if (c0342cTrackFor == null) {
                                                try {
                                                    Log.w("SegmentMerger", "sample from unselected track " + sampleTrackIndex + ", skipped");
                                                    aVar.b.advance();
                                                    this = this;
                                                    size6 = i5;
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    i2 = 1;
                                                    i6 = 0;
                                                    i = 0;
                                                }
                                            } else {
                                                long sampleTime2 = aVar.b.getSampleTime() - jMin;
                                                if (sampleTime2 < j3) {
                                                    sampleTime2 = j3;
                                                }
                                                ByteBuffer byteBuffer = byteBufferAllocate2;
                                                i4 = i5;
                                                long j6 = sampleTime2;
                                                i = 0;
                                                try {
                                                    bufferInfo.set(0, sampleData, j6, (aVar.b.getSampleFlags() & 1) != 0 ? 1 : 0);
                                                    mediaMuxer.writeSampleData(c0342cTrackFor.c, byteBuffer, bufferInfo);
                                                    long j7 = j5 + ((long) sampleData);
                                                    if (bVar != null && size5 > j3) {
                                                        bVar.a(Math.min(1.0f, j7 / size5));
                                                    }
                                                    aVar.b.advance();
                                                    j5 = j7;
                                                    byteBufferAllocate2 = byteBuffer;
                                                    size6 = i4;
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                }
                                            }
                                        } catch (IllegalArgumentException e) {
                                            e = e;
                                            i4 = i5;
                                            int iCapacity = byteBufferAllocate2.capacity() * 2;
                                            if (iCapacity > 16777216) {
                                                throw new IOException("sample too large, buffer limit exceeded", e);
                                            }
                                            Log.w("SegmentMerger", "grow buffer to " + iCapacity);
                                            byteBufferAllocate2 = ByteBuffer.allocate(iCapacity);
                                        } catch (Throwable th8) {
                                            th = th8;
                                            i = 0;
                                        }
                                    } catch (IllegalArgumentException e2) {
                                        e = e2;
                                        i4 = size6;
                                    }
                                    th = th;
                                    i2 = 1;
                                    i6 = i;
                                    if (mediaMuxer != null) {
                                        if (i2 != 0) {
                                            try {
                                                mediaMuxer.stop();
                                            } catch (IllegalStateException e3) {
                                                Log.w("SegmentMerger", "muxer.stop failed", e3);
                                            }
                                        }
                                        mediaMuxer.release();
                                    }
                                    size = arrayList.size();
                                    i3 = i;
                                    while (i3 < size) {
                                        Object obj5 = arrayList.get(i3);
                                        i3++;
                                        ((a) obj5).release();
                                    }
                                    if (i6 != 0) {
                                        throw th;
                                    }
                                    file.delete();
                                    throw th;
                                }
                                byteBufferAllocate = byteBufferAllocate2;
                                size6 = i5;
                                j4 = j5;
                            } catch (Throwable th9) {
                                th = th9;
                                i = 0;
                            }
                        }
                        i = 0;
                        if (bVar != null) {
                            try {
                                bVar.a(1.0f);
                            } catch (Throwable th10) {
                                th = th10;
                                i6 = 1;
                                i2 = i6;
                                if (mediaMuxer != null) {
                                    if (i2 != 0) {
                                        mediaMuxer.stop();
                                    }
                                    mediaMuxer.release();
                                }
                                size = arrayList.size();
                                i3 = i;
                                while (i3 < size) {
                                    Object obj6 = arrayList.get(i3);
                                    i3++;
                                    ((a) obj6).release();
                                }
                                if (i6 != 0) {
                                    throw th;
                                }
                                file.delete();
                                throw th;
                            }
                        }
                        try {
                            mediaMuxer.stop();
                        } catch (IllegalStateException e4) {
                            Log.w("SegmentMerger", "muxer.stop failed", e4);
                        }
                        mediaMuxer.release();
                        int size7 = arrayList.size();
                        int i11 = 0;
                        while (i11 < size7) {
                            Object obj7 = arrayList.get(i11);
                            i11++;
                            ((a) obj7).release();
                        }
                        return;
                    } catch (Throwable th11) {
                        i = 0;
                        th = th11;
                        i2 = 1;
                    }
                } catch (Throwable th12) {
                    i = 0;
                    th = th12;
                }
            }
        } catch (Throwable th13) {
            i = 0;
            th = th13;
        }
        i2 = i6;
        mediaMuxer = null;
        if (mediaMuxer != null) {
            if (i2 != 0) {
                mediaMuxer.stop();
            }
            mediaMuxer.release();
        }
        size = arrayList.size();
        i3 = i;
        while (i3 < size) {
            Object obj8 = arrayList.get(i3);
            i3++;
            ((a) obj8).release();
        }
        if (i6 != 0) {
            throw th;
        }
        file.delete();
        throw th;
    }
}
