package androidx.media3.common;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface c0 {
    public static final Pair<Float, Float> a = Pair.create(Float.valueOf(0.0f), Float.valueOf(0.0f));
    public static final Pair<Float, Float> b = Pair.create(Float.valueOf(0.0f), Float.valueOf(0.0f));
    public static final Pair<Float, Float> c = Pair.create(Float.valueOf(1.0f), Float.valueOf(1.0f));

    float getAlphaScale();

    Pair<Float, Float> getBackgroundFrameAnchor();

    float getHdrLuminanceMultiplier();

    Pair<Float, Float> getOverlayFrameAnchor();

    float getRotationDegrees();

    Pair<Float, Float> getScale();
}
