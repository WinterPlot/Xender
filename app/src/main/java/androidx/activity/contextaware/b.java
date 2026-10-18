package androidx.activity.contextaware;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private final Set<c> a = new CopyOnWriteArraySet();
    private volatile Context b;

    public final void addOnContextAvailableListener(c cVar) {
        cVar.getClass();
        Context context = this.b;
        if (context != null) {
            cVar.onContextAvailable(context);
        }
        this.a.add(cVar);
    }

    public final void clearAvailableContext() {
        this.b = null;
    }

    public final void dispatchOnContextAvailable(Context context) {
        context.getClass();
        this.b = context;
        Iterator<c> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().onContextAvailable(context);
        }
    }

    public final Context peekAvailableContext() {
        return this.b;
    }

    public final void removeOnContextAvailableListener(c cVar) {
        cVar.getClass();
        this.a.remove(cVar);
    }
}
