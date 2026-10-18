package androidx.media3.decoder;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    private int a;

    public final void addFlag(int i) {
        this.a = i | this.a;
    }

    public void clear() {
        this.a = 0;
    }

    public final void clearFlag(int i) {
        this.a = (~i) & this.a;
    }

    public final boolean getFlag(int i) {
        return (this.a & i) == i;
    }

    public final boolean hasSupplementalData() {
        return getFlag(268435456);
    }

    public final boolean isEndOfStream() {
        return getFlag(4);
    }

    public final boolean isFirstSample() {
        return getFlag(134217728);
    }

    public final boolean isKeyFrame() {
        return getFlag(1);
    }

    public final boolean isLastSample() {
        return getFlag(536870912);
    }

    public final boolean notDependedOn() {
        return getFlag(67108864);
    }

    public final void setFlags(int i) {
        this.a = i;
    }
}
