package androidx.datastore.core;

import kotlinx.coroutines.x0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements x0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlinx.coroutines.x0
    public final void dispose() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                MulticastFileObserver.Companion.observe$lambda$4((String) obj2, (kotlin.jvm.functions.l) obj);
                break;
            default:
                kotlinx.coroutines.android.c.invokeOnTimeout$lambda$3((kotlinx.coroutines.android.c) obj2, (Runnable) obj);
                break;
        }
    }
}
