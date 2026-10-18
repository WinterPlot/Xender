package kotlinx.serialization.json.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class m extends l {
    private final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t tVar, boolean z) {
        super(tVar);
        tVar.getClass();
        this.c = z;
    }

    @Override // kotlinx.serialization.json.internal.l
    public void printQuoted(String str) {
        str.getClass();
        if (this.c) {
            super.printQuoted(str);
        } else {
            print(str);
        }
    }
}
