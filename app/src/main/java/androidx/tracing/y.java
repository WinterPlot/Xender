package androidx.tracing;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends x<y> {
    public final m0[] b;
    public volatile int c;

    public y(w<y> wVar, m0[] m0VarArr, int i) {
        super(wVar);
        this.b = m0VarArr;
        this.c = i;
    }

    public final void forEach(kotlin.jvm.functions.l<? super m0, kotlin.y> lVar) {
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            lVar.invoke(this.b[i2]);
        }
    }

    @Override // androidx.tracing.x
    public void recycle() {
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            this.b[i2].reset();
        }
        this.c = 0;
        getOwner$tracing().release$tracing(this);
    }
}
