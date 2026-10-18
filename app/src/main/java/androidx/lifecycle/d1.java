package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class d1 {
    private final Map<Object, a1> a = new LinkedHashMap();

    public final void clear() {
        Map map = kotlin.collections.t0.toMap(this.a);
        this.a.clear();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((a1) it.next()).clear$lifecycle_viewmodel();
        }
    }

    public final a1 get(Object obj) {
        return this.a.get(obj);
    }

    public final <T extends a1> T getOrPut(Object obj, kotlin.jvm.functions.a<? extends T> aVar) {
        aVar.getClass();
        Map<Object, a1> map = this.a;
        a1 a1VarInvoke = map.get(obj);
        if (a1VarInvoke == null) {
            a1VarInvoke = aVar.invoke();
            map.put(obj, a1VarInvoke);
        }
        a1VarInvoke.getClass();
        return (T) a1VarInvoke;
    }

    public final Set<Object> keys() {
        return kotlin.collections.v.toSet(this.a.keySet());
    }

    public final void put(Object obj, a1 a1Var) {
        a1Var.getClass();
        a1 a1VarPut = this.a.put(obj, a1Var);
        if (a1VarPut != null) {
            a1VarPut.clear$lifecycle_viewmodel();
        }
    }

    public String toString() {
        String simpleName = kotlin.jvm.internal.f0.getOrCreateKotlinClass(getClass()).getSimpleName();
        if (simpleName == null) {
            simpleName = "ViewModelStore";
        }
        String string = Integer.toString(hashCode(), kotlin.text.b.checkRadix(16));
        string.getClass();
        return simpleName + "@" + string + "(keys=" + keys() + ")";
    }
}
