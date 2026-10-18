package androidx.camera.video.internal.encoder;

import android.util.Range;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements k0 {
    private final k0 a;

    public f0(k0 k0Var) {
        k0Var.getClass();
        this.a = k0Var;
        if (k0Var.canSwapWidthHeight()) {
            return;
        }
        okhttp3.b0.i("Failed requirement.");
        throw null;
    }

    @Override // androidx.camera.video.internal.encoder.k0
    public boolean canSwapWidthHeight() {
        return this.a.canSwapWidthHeight();
    }

    @Override // androidx.camera.video.internal.encoder.k0
    public int getHeightAlignment() {
        return this.a.getWidthAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.k0, androidx.camera.video.internal.encoder.z
    public String getName() {
        return this.a.getName();
    }

    @Override // androidx.camera.video.internal.encoder.k0
    public Range<Integer> getSupportedBitrateRange() {
        return this.a.getSupportedBitrateRange();
    }

    @Override // androidx.camera.video.internal.encoder.k0
    public Range<Integer> getSupportedHeights() {
        return this.a.getSupportedWidths();
    }

    @Override // androidx.camera.video.internal.encoder.k0
    public Range<Integer> getSupportedHeightsFor(int i) {
        return this.a.getSupportedWidthsFor(i);
    }

    @Override // androidx.camera.video.internal.encoder.k0
    public Range<Integer> getSupportedWidths() {
        return this.a.getSupportedHeights();
    }

    @Override // androidx.camera.video.internal.encoder.k0
    public Range<Integer> getSupportedWidthsFor(int i) {
        return this.a.getSupportedHeightsFor(i);
    }

    @Override // androidx.camera.video.internal.encoder.k0
    public int getWidthAlignment() {
        return this.a.getHeightAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.k0
    public boolean isSizeSupported(int i, int i2) {
        return this.a.isSizeSupported(i2, i);
    }

    @Override // androidx.camera.video.internal.encoder.k0
    public boolean isSizeSupportedAllowSwapping(int i, int i2) {
        return this.a.isSizeSupportedAllowSwapping(i2, i);
    }
}
