package androidx.media3.extractor;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class y implements p {
    private final p a;

    public y(p pVar) {
        this.a = pVar;
    }

    @Override // androidx.media3.extractor.p
    public boolean advancePeekPosition(int i, boolean z) throws IOException {
        return this.a.advancePeekPosition(i, z);
    }

    @Override // androidx.media3.extractor.p
    public long getLength() {
        return this.a.getLength();
    }

    @Override // androidx.media3.extractor.p
    public long getPeekPosition() {
        return this.a.getPeekPosition();
    }

    @Override // androidx.media3.extractor.p
    public long getPosition() {
        return this.a.getPosition();
    }

    @Override // androidx.media3.extractor.p
    public int peek(byte[] bArr, int i, int i2) throws IOException {
        return this.a.peek(bArr, i, i2);
    }

    @Override // androidx.media3.extractor.p
    public boolean peekFully(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.a.peekFully(bArr, i, i2, z);
    }

    @Override // androidx.media3.extractor.p, androidx.media3.common.k
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.a.read(bArr, i, i2);
    }

    @Override // androidx.media3.extractor.p
    public boolean readFully(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.a.readFully(bArr, i, i2, z);
    }

    @Override // androidx.media3.extractor.p
    public void resetPeekPosition() {
        this.a.resetPeekPosition();
    }

    @Override // androidx.media3.extractor.p
    public <E extends Throwable> void setRetryPosition(long j, E e) throws Throwable {
        this.a.setRetryPosition(j, e);
    }

    @Override // androidx.media3.extractor.p
    public int skip(int i) throws IOException {
        return this.a.skip(i);
    }

    @Override // androidx.media3.extractor.p
    public boolean skipFully(int i, boolean z) throws IOException {
        return this.a.skipFully(i, z);
    }

    @Override // androidx.media3.extractor.p
    public void advancePeekPosition(int i) throws IOException {
        this.a.advancePeekPosition(i);
    }

    @Override // androidx.media3.extractor.p
    public void peekFully(byte[] bArr, int i, int i2) throws IOException {
        this.a.peekFully(bArr, i, i2);
    }

    @Override // androidx.media3.extractor.p
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.a.readFully(bArr, i, i2);
    }

    @Override // androidx.media3.extractor.p
    public void skipFully(int i) throws IOException {
        this.a.skipFully(i);
    }
}
