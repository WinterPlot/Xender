package androidx.media3.extractor.mp3;

import androidx.media3.extractor.j0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
interface g extends j0 {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a extends j0.b implements g {
        public a() {
            super(-9223372036854775807L);
        }

        @Override // androidx.media3.extractor.mp3.g
        public int getAverageBitrate() {
            return -2147483647;
        }

        @Override // androidx.media3.extractor.mp3.g
        public long getDataEndPosition() {
            return -1L;
        }

        @Override // androidx.media3.extractor.mp3.g
        public long getDataStartPosition() {
            return 0L;
        }

        @Override // androidx.media3.extractor.mp3.g
        public long getTimeUs(long j) {
            return 0L;
        }

        @Override // androidx.media3.extractor.j0.b, androidx.media3.extractor.j0
        public boolean isEstimated() {
            return false;
        }
    }

    int getAverageBitrate();

    long getDataEndPosition();

    long getDataStartPosition();

    @Override // androidx.media3.extractor.j0
    /* synthetic */ long getDurationUs();

    @Override // androidx.media3.extractor.j0
    /* synthetic */ j0.a getSeekPoints(long j);

    long getTimeUs(long j);

    @Override // androidx.media3.extractor.j0
    /* bridge */ /* synthetic */ boolean isEstimated();

    @Override // androidx.media3.extractor.j0
    /* synthetic */ boolean isSeekable();
}
