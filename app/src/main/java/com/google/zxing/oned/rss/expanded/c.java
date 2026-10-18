package com.google.zxing.oned.rss.expanded;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class c {
    private final List<b> a;
    private final int b;

    public c(List<b> list, int i) {
        this.a = new ArrayList(list);
        this.b = i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.a.equals(((c) obj).a);
        }
        return false;
    }

    public List<b> getPairs() {
        return this.a;
    }

    public int getRowNumber() {
        return this.b;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean isEquivalent(List<b> list) {
        return this.a.equals(list);
    }

    public String toString() {
        return "{ " + this.a + " }";
    }
}
