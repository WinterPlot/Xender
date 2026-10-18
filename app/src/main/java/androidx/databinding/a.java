package androidx.databinding;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class a implements i {
    private transient n a;

    @Override // androidx.databinding.i
    public void addOnPropertyChangedCallback(i.a aVar) {
        n nVar;
        synchronized (this) {
            try {
                nVar = this.a;
                if (nVar == null) {
                    nVar = new n();
                    this.a = nVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        nVar.add(aVar);
    }

    public void notifyChange() {
        synchronized (this) {
            try {
                n nVar = this.a;
                if (nVar == null) {
                    return;
                }
                nVar.notifyCallbacks(this, 0, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void notifyPropertyChanged(int i) {
        synchronized (this) {
            try {
                n nVar = this.a;
                if (nVar == null) {
                    return;
                }
                nVar.notifyCallbacks(this, i, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.i
    public void removeOnPropertyChangedCallback(i.a aVar) {
        synchronized (this) {
            try {
                n nVar = this.a;
                if (nVar == null) {
                    return;
                }
                nVar.remove(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
