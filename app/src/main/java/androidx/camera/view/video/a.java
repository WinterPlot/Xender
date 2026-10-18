package androidx.camera.view.video;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class a {
    public static final a b = new a(false);
    private final boolean a;

    public a(boolean z) {
        this.a = z;
    }

    public static a create(boolean z) {
        return new a(z);
    }

    public boolean getAudioEnabled() {
        return this.a;
    }
}
