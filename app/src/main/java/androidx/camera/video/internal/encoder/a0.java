package androidx.camera.video.internal.encoder;

import android.media.MediaCodecInfo;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 implements z {
    private final MediaCodecInfo a;
    private final MediaCodecInfo.CodecCapabilities b;

    public a0(MediaCodecInfo mediaCodecInfo, String str) throws InvalidConfigException {
        mediaCodecInfo.getClass();
        str.getClass();
        this.a = mediaCodecInfo;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            capabilitiesForType.getClass();
            this.b = capabilitiesForType;
        } catch (RuntimeException e) {
            throw new InvalidConfigException(defpackage.a.o("Unable to get CodecCapabilities for mime: ", str), e);
        }
    }

    public final MediaCodecInfo.CodecCapabilities getCodecCapabilities() {
        return this.b;
    }

    @Override // androidx.camera.video.internal.encoder.z
    public String getName() {
        String name = this.a.getName();
        name.getClass();
        return name;
    }
}
