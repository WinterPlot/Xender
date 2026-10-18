package androidx.activity.result;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c<I> {
    public abstract androidx.activity.result.contract.a<I, ?> getContract();

    public void launch(I i) {
        launch(i, null);
    }

    public abstract void launch(I i, androidx.core.app.d dVar);

    public abstract void unregister();
}
