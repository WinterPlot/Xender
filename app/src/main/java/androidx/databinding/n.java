package androidx.databinding;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class n extends c<i.a, i, Void> {
    private static final c.a<i.a, i, Void> f = new a();

    public n() {
        super(f);
    }

    public void notifyChange(i iVar, int i) {
        notifyCallbacks(iVar, i, null);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a extends c.a<i.a, i, Void> {
        @Override // androidx.databinding.c.a
        public void onNotifyCallback(i.a aVar, i iVar, int i, Void r4) {
            aVar.onPropertyChanged(iVar, i);
        }
    }
}
