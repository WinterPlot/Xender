package androidx.camera.video.internal.encoder;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {
    public static final j0 a = create(0, 0, 0);
    public static final j0 b = create(1, 3, 2);
    public static final j0 c = create(1, 3, 1);
    public static final j0 d = create(6, 7, 1);
    public static final j0 e = create(6, 6, 1);

    public static j0 create(int i, int i2, int i3) {
        return new f(i, i2, i3);
    }

    public abstract int getRange();

    public abstract int getStandard();

    public abstract int getTransfer();
}
