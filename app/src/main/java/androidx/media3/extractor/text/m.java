package androidx.media3.extractor.text;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends androidx.media3.decoder.e implements i {
    private i e;
    private long f;

    @Override // androidx.media3.decoder.e, androidx.media3.decoder.a
    public void clear() {
        super.clear();
        this.e = null;
    }

    @Override // androidx.media3.extractor.text.i
    public List<androidx.media3.common.text.a> getCues(long j) {
        return ((i) com.google.common.base.m.checkNotNull(this.e)).getCues(j - this.f);
    }

    @Override // androidx.media3.extractor.text.i
    public long getEventTime(int i) {
        return ((i) com.google.common.base.m.checkNotNull(this.e)).getEventTime(i) + this.f;
    }

    @Override // androidx.media3.extractor.text.i
    public int getEventTimeCount() {
        return ((i) com.google.common.base.m.checkNotNull(this.e)).getEventTimeCount();
    }

    @Override // androidx.media3.extractor.text.i
    public int getNextEventTimeIndex(long j) {
        return ((i) com.google.common.base.m.checkNotNull(this.e)).getNextEventTimeIndex(j - this.f);
    }

    public void setContent(long j, i iVar, long j2) {
        this.b = j;
        this.e = iVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f = j;
    }
}
