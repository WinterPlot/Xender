package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class l2 {
    private final List<i2> a;

    public l2(List<i2> list) {
        this.a = new ArrayList(list);
    }

    public static String toString(l2 l2Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<i2> it = l2Var.a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getClass().getSimpleName());
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            while (true) {
                sb.append((CharSequence) it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                sb.append((CharSequence) " | ");
            }
        }
        return sb.toString();
    }

    public void addQuirkForTesting(i2 i2Var) {
        this.a.add(i2Var);
    }

    public boolean contains(Class<? extends i2> cls) {
        Iterator<i2> it = this.a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next().getClass())) {
                return true;
            }
        }
        return false;
    }

    public <T extends i2> T get(Class<T> cls) {
        Iterator<i2> it = this.a.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    public <T extends i2> List<T> getAll(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (i2 i2Var : this.a) {
            if (cls.isAssignableFrom(i2Var.getClass())) {
                arrayList.add(i2Var);
            }
        }
        return arrayList;
    }
}
