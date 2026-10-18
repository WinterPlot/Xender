package androidx.camera.core.resolutionselector;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final a c = new a(0, 1);
    public static final a d = new a(1, 1);
    private final int a;
    private final int b;

    public a(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public int getFallbackRule() {
        return this.b;
    }

    public int getPreferredAspectRatio() {
        return this.a;
    }
}
