package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class d {
    private SparseIntArray a = new SparseIntArray();
    private HashMap<Integer, HashSet<WeakReference<a>>> b = new HashMap<>();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a {
        void onNewValue(int i, int i2, int i3);
    }

    public void addListener(int i, a aVar) {
        HashSet<WeakReference<a>> hashSet = this.b.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.b.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference<>(aVar));
    }

    public void clearListeners() {
        this.b.clear();
    }

    public void fireNewValue(int i, int i2) {
        int i3 = this.a.get(i, -1);
        if (i3 == i2) {
            return;
        }
        this.a.put(i, i2);
        HashSet<WeakReference<a>> hashSet = this.b.get(Integer.valueOf(i));
        if (hashSet == null) {
            return;
        }
        Iterator<WeakReference<a>> it = hashSet.iterator();
        boolean z = false;
        while (it.hasNext()) {
            a aVar = it.next().get();
            if (aVar != null) {
                aVar.onNewValue(i, i2, i3);
            } else {
                z = true;
            }
        }
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (WeakReference<a> weakReference : hashSet) {
                if (weakReference.get() == null) {
                    arrayList.add(weakReference);
                }
            }
            hashSet.removeAll(arrayList);
        }
    }

    public int getValue(int i) {
        return this.a.get(i, -1);
    }

    public void removeListener(int i, a aVar) {
        HashSet<WeakReference<a>> hashSet = this.b.get(Integer.valueOf(i));
        if (hashSet == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (WeakReference<a> weakReference : hashSet) {
            a aVar2 = weakReference.get();
            if (aVar2 == null || aVar2 == aVar) {
                arrayList.add(weakReference);
            }
        }
        hashSet.removeAll(arrayList);
    }

    public void removeListener(a aVar) {
        Iterator<Integer> it = this.b.keySet().iterator();
        while (it.hasNext()) {
            removeListener(it.next().intValue(), aVar);
        }
    }
}
