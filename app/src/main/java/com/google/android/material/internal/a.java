package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public class a<T extends k<T>> {
    private final Map<Integer, T> a = new HashMap();
    private final Set<Integer> b = new HashSet();
    private b c;
    private boolean d;
    private boolean e;

    /* JADX INFO: renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class C0575a implements k.a<T> {
        public C0575a() {
        }

        @Override // com.google.android.material.internal.k.a
        public void onCheckedChanged(T t, boolean z) {
            a aVar = a.this;
            if (z) {
                if (!aVar.checkInternal(t)) {
                    return;
                }
            } else if (!aVar.uncheckInternal(t, aVar.e)) {
                return;
            }
            a.this.onCheckedStateChanged();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface b {
        void onCheckedStateChanged(Set<Integer> set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkInternal(k<T> kVar) {
        int id = kVar.getId();
        if (this.b.contains(Integer.valueOf(id))) {
            return false;
        }
        T t = this.a.get(Integer.valueOf(getSingleCheckedId()));
        if (t != null) {
            uncheckInternal(t, false);
        }
        boolean zAdd = this.b.add(Integer.valueOf(id));
        if (!kVar.isChecked()) {
            kVar.setChecked(true);
        }
        return zAdd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCheckedStateChanged() {
        b bVar = this.c;
        if (bVar != null) {
            bVar.onCheckedStateChanged(getCheckedIds());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uncheckInternal(k<T> kVar, boolean z) {
        int id = kVar.getId();
        if (!this.b.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z && this.b.size() == 1 && this.b.contains(Integer.valueOf(id))) {
            kVar.setChecked(true);
            return false;
        }
        boolean zRemove = this.b.remove(Integer.valueOf(id));
        if (kVar.isChecked()) {
            kVar.setChecked(false);
        }
        return zRemove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addCheckable(T t) {
        this.a.put(Integer.valueOf(t.getId()), t);
        if (t.isChecked()) {
            checkInternal(t);
        }
        t.setInternalOnCheckedChangeListener(new C0575a());
    }

    public void check(int i) {
        T t = this.a.get(Integer.valueOf(i));
        if (t != null && checkInternal(t)) {
            onCheckedStateChanged();
        }
    }

    public void clearCheck() {
        boolean zIsEmpty = this.b.isEmpty();
        Iterator<T> it = this.a.values().iterator();
        while (it.hasNext()) {
            uncheckInternal(it.next(), false);
        }
        if (zIsEmpty) {
            return;
        }
        onCheckedStateChanged();
    }

    public Set<Integer> getCheckedIds() {
        return new HashSet(this.b);
    }

    public List<Integer> getCheckedIdsSortedByChildOrder(ViewGroup viewGroup) {
        Set<Integer> checkedIds = getCheckedIds();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof k) && checkedIds.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int getSingleCheckedId() {
        if (!this.d || this.b.isEmpty()) {
            return -1;
        }
        return this.b.iterator().next().intValue();
    }

    public boolean isSelectionRequired() {
        return this.e;
    }

    public boolean isSingleSelection() {
        return this.d;
    }

    public void removeCheckable(T t) {
        t.setInternalOnCheckedChangeListener(null);
        this.a.remove(Integer.valueOf(t.getId()));
        this.b.remove(Integer.valueOf(t.getId()));
    }

    public void setOnCheckedStateChangeListener(b bVar) {
        this.c = bVar;
    }

    public void setSelectionRequired(boolean z) {
        this.e = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.d != z) {
            this.d = z;
            clearCheck();
        }
    }

    public void uncheck(int i) {
        T t = this.a.get(Integer.valueOf(i));
        if (t != null && uncheckInternal(t, this.e)) {
            onCheckedStateChanged();
        }
    }
}
