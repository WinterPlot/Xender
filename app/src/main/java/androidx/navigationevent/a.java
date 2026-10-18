package androidx.navigationevent;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends h {
    public final void backCancelled() {
        dispatchOnBackCancelled();
    }

    public final void backCompleted() {
        dispatchOnBackCompleted();
    }

    public final void backProgressed(b bVar) {
        bVar.getClass();
        dispatchOnBackProgressed(bVar);
    }

    public final void backStarted(b bVar) {
        bVar.getClass();
        dispatchOnBackStarted(bVar);
    }

    public final void forwardCancelled() {
        dispatchOnForwardCancelled();
    }

    public final void forwardCompleted() {
        dispatchOnForwardCompleted();
    }

    public final void forwardProgressed(b bVar) {
        bVar.getClass();
        dispatchOnForwardProgressed(bVar);
    }

    public final void forwardStarted(b bVar) {
        bVar.getClass();
        dispatchOnForwardStarted(bVar);
    }
}
