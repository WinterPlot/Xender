package androidx.camera.core.impl.utils;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
class k {
    public final int a;
    public final String b;
    public final int c;
    public final int d;

    public k(String str, int i, int i2) {
        this.b = str;
        this.a = i;
        this.c = i2;
        this.d = -1;
    }

    public boolean isFormatCompatible(int i) {
        int i2;
        int i3 = this.c;
        if (i3 == 7 || i == 7 || i3 == i || (i2 = this.d) == i) {
            return true;
        }
        if ((i3 == 4 || i2 == 4) && i == 3) {
            return true;
        }
        if ((i3 == 9 || i2 == 9) && i == 8) {
            return true;
        }
        return (i3 == 12 || i2 == 12) && i == 11;
    }

    public k(String str, int i, int i2, int i3) {
        this.b = str;
        this.a = i;
        this.c = i2;
        this.d = i3;
    }
}
