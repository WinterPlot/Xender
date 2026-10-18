package androidx.camera.video.internal.audio;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;
import okhttp3.b0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final List<Integer> a = DesugarCollections.unmodifiableList(Arrays.asList(192000, 48000, 44100, 24000, 22050, 16000, 12000, 11025, 8000, 4800));

    /* JADX INFO: renamed from: androidx.camera.video.internal.audio.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class AbstractC0092a {
        public abstract a autoBuild();

        public final a build() {
            a aVarAutoBuild = autoBuild();
            String strConcat = aVarAutoBuild.getAudioSource() == -1 ? " audioSource" : "";
            if (aVarAutoBuild.getCaptureSampleRate() <= 0) {
                strConcat = strConcat.concat(" captureSampleRate");
            }
            if (aVarAutoBuild.getEncodeSampleRate() <= 0) {
                strConcat = strConcat.concat(" encodeSampleRate");
            }
            if (aVarAutoBuild.getChannelCount() <= 0) {
                strConcat = strConcat.concat(" channelCount");
            }
            if (aVarAutoBuild.getAudioFormat() == -1) {
                strConcat = strConcat.concat(" audioFormat");
            }
            if (strConcat.isEmpty()) {
                return aVarAutoBuild;
            }
            b0.i("Required settings missing or non-positive:".concat(strConcat));
            return null;
        }

        public abstract AbstractC0092a setAudioFormat(int i);

        public abstract AbstractC0092a setAudioSource(int i);

        public abstract AbstractC0092a setCaptureSampleRate(int i);

        public abstract AbstractC0092a setChannelCount(int i);

        public abstract AbstractC0092a setEncodeSampleRate(int i);
    }

    public static AbstractC0092a builder() {
        return new j.b().setAudioSource(-1).setCaptureSampleRate(-1).setEncodeSampleRate(-1).setChannelCount(-1).setAudioFormat(-1);
    }

    public abstract int getAudioFormat();

    public abstract int getAudioSource();

    public int getBytesPerFrame() {
        return i.getBytesPerFrame(getAudioFormat(), getChannelCount());
    }

    public abstract int getCaptureSampleRate();

    public abstract int getChannelCount();

    public abstract int getEncodeSampleRate();

    public abstract AbstractC0092a toBuilder();
}
