package androidx.media;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
class e implements c {
    private String a;
    private int b;
    private int c;

    public e(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.b < 0 || eVar.b < 0) {
            return TextUtils.equals(this.a, eVar.a) && this.c == eVar.c;
        }
        return TextUtils.equals(this.a, eVar.a) && this.b == eVar.b && this.c == eVar.c;
    }

    @Override // androidx.media.c
    public String getPackageName() {
        return this.a;
    }

    @Override // androidx.media.c
    public int getPid() {
        return this.b;
    }

    @Override // androidx.media.c
    public int getUid() {
        return this.c;
    }

    public int hashCode() {
        return androidx.core.util.d.hash(this.a, Integer.valueOf(this.c));
    }
}
