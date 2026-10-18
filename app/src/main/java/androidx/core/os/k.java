package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class k implements j {
    private final LocaleList a;

    public k(Object obj) {
        this.a = androidx.core.content.pm.b.a(obj);
    }

    public boolean equals(Object obj) {
        return this.a.equals(((j) obj).getLocaleList());
    }

    @Override // androidx.core.os.j
    public Locale get(int i) {
        return this.a.get(i);
    }

    @Override // androidx.core.os.j
    public Locale getFirstMatch(String[] strArr) {
        return this.a.getFirstMatch(strArr);
    }

    @Override // androidx.core.os.j
    public Object getLocaleList() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // androidx.core.os.j
    public int indexOf(Locale locale) {
        return this.a.indexOf(locale);
    }

    @Override // androidx.core.os.j
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // androidx.core.os.j
    public int size() {
        return this.a.size();
    }

    @Override // androidx.core.os.j
    public String toLanguageTags() {
        return this.a.toLanguageTags();
    }

    public String toString() {
        return this.a.toString();
    }
}
