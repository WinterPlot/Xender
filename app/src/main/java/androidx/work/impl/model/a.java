package androidx.work.impl.model;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private final String a;
    private final String b;

    public a(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final String getPrerequisiteId() {
        return this.b;
    }

    public final String getWorkSpecId() {
        return this.a;
    }
}
