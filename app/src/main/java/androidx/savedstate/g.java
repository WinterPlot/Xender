package androidx.savedstate;

import android.os.Bundle;
import okio.j0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {
    private final androidx.savedstate.internal.a a;
    private androidx.savedstate.b.C0271b b;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a {
        void onRecreated(i iVar);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface b {
        Bundle saveState();
    }

    public g(androidx.savedstate.internal.a aVar) {
        aVar.getClass();
        this.a = aVar;
    }

    public final Bundle consumeRestoredStateForKey(String str) {
        str.getClass();
        return this.a.consumeRestoredStateForKey(str);
    }

    public final b getSavedStateProvider(String str) {
        str.getClass();
        return this.a.getSavedStateProvider(str);
    }

    public final boolean isRestored() {
        return this.a.isRestored();
    }

    public final void registerSavedStateProvider(String str, b bVar) {
        str.getClass();
        bVar.getClass();
        this.a.registerSavedStateProvider(str, bVar);
    }

    public final void runOnNextRecreation(Class<? extends a> cls) {
        cls.getClass();
        if (!this.a.isAllowingSavingState$savedstate()) {
            j0.g("Can not perform this action after onSaveInstanceState");
            return;
        }
        androidx.savedstate.b.C0271b c0271b = this.b;
        if (c0271b == null) {
            c0271b = new androidx.savedstate.b.C0271b(this);
        }
        this.b = c0271b;
        try {
            cls.getDeclaredConstructor(null);
            androidx.savedstate.b.C0271b c0271b2 = this.b;
            if (c0271b2 != null) {
                c0271b2.add(cls.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public final void unregisterSavedStateProvider(String str) {
        str.getClass();
        this.a.unregisterSavedStateProvider(str);
    }
}
