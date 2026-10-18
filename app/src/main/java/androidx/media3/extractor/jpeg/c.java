package androidx.media3.extractor.jpeg;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class c {
    public final long a;
    public final List<a> b;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public final String a;
        public final String b;
        public final long c;
        public final long d;

        public a(String str, String str2, long j, long j2) {
            this.a = str;
            this.b = str2;
            this.c = j;
            this.d = j2;
        }
    }

    public c(long j, List<a> list) {
        this.a = j;
        this.b = list;
    }

    public androidx.media3.extractor.metadata.c getMotionPhotoMetadata(long j) {
        long j2;
        androidx.media3.extractor.metadata.c cVar = null;
        if (this.b.size() < 2) {
            return null;
        }
        boolean z = true;
        int size = this.b.size() - 1;
        long j3 = j;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        while (size >= 0) {
            a aVar = this.b.get(size);
            boolean z2 = (aVar.a.equals("video/mp4") || aVar.a.equals("video/quicktime")) ? z : false;
            if (size == 0) {
                j3 -= aVar.d;
                j2 = 0;
            } else {
                j2 = j3 - aVar.c;
            }
            long j8 = j3;
            j3 = j2;
            if (z2 && j3 != j8) {
                j7 = j8 - j3;
                j6 = j3;
            }
            if (size == 0) {
                j5 = j8;
                j4 = j3;
            }
            size--;
            cVar = cVar;
            z = true;
        }
        return (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) ? cVar : new androidx.media3.extractor.metadata.c(j4, j5, this.a, j6, j7);
    }
}
