package androidx.camera.video.internal.encoder;

import android.media.MediaCodecInfo;
import android.util.Range;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a0 implements b {
    private final MediaCodecInfo.AudioCapabilities c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(MediaCodecInfo mediaCodecInfo, String str) throws InvalidConfigException {
        super(mediaCodecInfo, str);
        mediaCodecInfo.getClass();
        str.getClass();
        MediaCodecInfo.AudioCapabilities audioCapabilities = getCodecCapabilities().getAudioCapabilities();
        audioCapabilities.getClass();
        this.c = audioCapabilities;
    }

    @Override // androidx.camera.video.internal.encoder.b
    public Range<Integer> getBitrateRange() {
        Range<Integer> bitrateRange = this.c.getBitrateRange();
        bitrateRange.getClass();
        return bitrateRange;
    }
}
