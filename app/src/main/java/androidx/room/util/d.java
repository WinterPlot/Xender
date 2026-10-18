package androidx.room.util;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
final class d implements Comparable<d> {
    private final int a;
    private final int b;
    private final String c;
    private final String d;

    public d(int i, int i2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public int compareTo(d dVar) {
        dVar.getClass();
        int i = this.a - dVar.a;
        return i == 0 ? this.b - dVar.b : i;
    }

    public final String getFrom() {
        return this.c;
    }

    public final int getId() {
        return this.a;
    }

    public final int getSequence() {
        return this.b;
    }

    public final String getTo() {
        return this.d;
    }
}
