package androidx.camera.video;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    private static final Set<Integer> a = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(2, 3, 4)));

    public static b of(int i, Throwable th, double d, long j) {
        return new c(i, d, j, th);
    }

    public double getAudioAmplitude() {
        if (getAudioState() == 1) {
            return 0.0d;
        }
        return getAudioAmplitudeInternal();
    }

    public abstract double getAudioAmplitudeInternal();

    public abstract long getAudioBytesRecorded();

    public abstract int getAudioState();

    public abstract Throwable getErrorCause();

    public boolean hasAudio() {
        return getAudioState() == 0;
    }

    public boolean hasError() {
        return a.contains(Integer.valueOf(getAudioState()));
    }
}
