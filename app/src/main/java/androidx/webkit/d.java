package androidx.webkit;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class d {
    private final int a;
    private final List<String> b;
    private final int c;

    public d(int i, List<String> list, int i2) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.a = i;
        arrayList.addAll(list);
        this.c = i2;
    }

    public List<String> getCustomIncludedCategories() {
        return this.b;
    }

    public int getPredefinedCategories() {
        return this.a;
    }

    public int getTracingMode() {
        return this.c;
    }
}
