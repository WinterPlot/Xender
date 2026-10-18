package androidx.collection;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {
    private static final long[] a = new long[0];

    public static final long clearVisitedBit(long j) {
        return j & 4611686018427387903L;
    }

    public static final long createDstMapping(long j, int i) {
        return (j & (-4294967296L)) | ((long) i);
    }

    public static final long createLinkToNext(int i) {
        return (((long) i) & 2147483647L) | 4611686016279904256L;
    }

    public static final long createLinks(long j, int i, int i2, long[] jArr) {
        jArr.getClass();
        return (((j & (-4611686018427387904L)) | ((long) (i == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr[i] & 4294967295L)))) << 31) | ((long) (i2 != Integer.MAX_VALUE ? (int) (jArr[i2] & 4294967295L) : Integer.MAX_VALUE));
    }

    public static final long createMapping(int i, int i2) {
        return ((long) i2) | (((long) i) << 32);
    }

    public static final long createSrcMapping(long j, int i) {
        return (j & 4294967295L) | (((long) i) << 32);
    }

    public static final long eraseSrcMapping(long j) {
        return (j & 4294967295L) | (-4294967296L);
    }

    public static final int getDst(long j) {
        return (int) (j & 4294967295L);
    }

    public static final long[] getEmptyNodes() {
        return a;
    }

    public static final int getNextNode(long j) {
        return (int) (j & 2147483647L);
    }

    public static final int getPreviousNode(long j) {
        return (int) ((j >> 31) & 2147483647L);
    }

    public static final int getSrc(long j) {
        return (int) ((j >> 32) & 4294967295L);
    }

    public static final int getVisited(long j) {
        return (int) ((j >> 62) & 1);
    }

    public static final long setLinkToNext(long j, int i) {
        return (j & (-2147483648L)) | (((long) i) & 2147483647L);
    }

    public static final long setLinkToPrevious(long j, int i) {
        return (j & (-4611686016279904257L)) | ((((long) i) & 2147483647L) << 31);
    }

    public static /* synthetic */ void getNodeInvalidLink$annotations() {
    }

    public static /* synthetic */ void getNodeLinkMask$annotations() {
    }

    public static /* synthetic */ void getNextNode$annotations(long j) {
    }

    public static /* synthetic */ void getPreviousNode$annotations(long j) {
    }

    public static final long createLinks(long j, int i, int i2, int[] iArr) {
        iArr.getClass();
        return (((j & (-4611686018427387904L)) | ((long) (i == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i]))) << 31) | ((long) (i2 != Integer.MAX_VALUE ? iArr[i2] : Integer.MAX_VALUE));
    }
}
