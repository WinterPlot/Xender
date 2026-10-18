package androidx.camera.core.processing;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class m<T> implements androidx.core.util.b<T> {
    private androidx.core.util.b<T> a;

    @Override // androidx.core.util.b
    public void accept(T t) {
        this.a.getClass();
        this.a.accept(t);
    }

    public void setListener(androidx.core.util.b<T> bVar) {
        this.a = bVar;
    }
}
