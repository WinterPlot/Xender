package androidx.media3.common.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k implements AudioProcessor {
    protected AudioProcessor.a b;
    protected AudioProcessor.a c;
    private AudioProcessor.a d;
    private AudioProcessor.a e;
    private ByteBuffer f;
    private ByteBuffer g;
    private boolean h;

    public k() {
        ByteBuffer byteBuffer = AudioProcessor.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.a configure(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        this.d = aVar;
        this.e = onConfigure(aVar);
        return isActive() ? this.e : AudioProcessor.a.e;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush(AudioProcessor.b bVar) {
        this.g = AudioProcessor.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        onFlush(bVar);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.g;
        this.g = AudioProcessor.a;
        return byteBuffer;
    }

    public final boolean hasPendingOutput() {
        return this.g.hasRemaining();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return this.e != AudioProcessor.a.e;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        return this.h && this.g == AudioProcessor.a;
    }

    public AudioProcessor.a onConfigure(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        return AudioProcessor.a.e;
    }

    public void onFlush(AudioProcessor.b bVar) {
        onFlush();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        this.h = true;
        onQueueEndOfStream();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public abstract /* synthetic */ void queueInput(ByteBuffer byteBuffer);

    public final ByteBuffer replaceOutputBuffer(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        ByteBuffer byteBuffer = AudioProcessor.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
        onReset();
    }

    @Deprecated
    public void onFlush() {
    }

    public void onQueueEndOfStream() {
    }

    public void onReset() {
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    @Deprecated
    public final void flush() {
        flush(AudioProcessor.b.b);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public long getDurationAfterProcessorApplied(long j) {
        return j;
    }
}
