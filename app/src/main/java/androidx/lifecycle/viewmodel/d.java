package androidx.lifecycle.viewmodel;

import java.util.Map;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a {
    public d(Map<a.c<?>, ? extends Object> map) {
        map.getClass();
        getExtras$lifecycle_viewmodel().putAll(map);
    }

    @Override // androidx.lifecycle.viewmodel.a
    public <T> T get(a.c<T> cVar) {
        cVar.getClass();
        return (T) getExtras$lifecycle_viewmodel().get(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void set(a.c<T> cVar, T t) {
        cVar.getClass();
        getExtras$lifecycle_viewmodel().put(cVar, t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(a aVar) {
        this((Map<a.c<?>, ? extends Object>) aVar.getExtras$lifecycle_viewmodel());
        aVar.getClass();
    }

    public /* synthetic */ d(a aVar, int i, r rVar) {
        this((i & 1) != 0 ? a.b.c : aVar);
    }
}
