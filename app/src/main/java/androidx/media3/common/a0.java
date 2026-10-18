package androidx.media3.common;

import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Longs;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    private final a[] a;
    public final long b;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a {
        byte[] getWrappedMetadataBytes();

        t getWrappedMetadataFormat();

        void populateMediaMetadata(z.b bVar);
    }

    public a0(List<? extends a> list) {
        this((a[]) list.toArray(new a[0]));
    }

    private <T extends a> T entryIfMatches(a aVar, Class<T> cls, com.google.common.base.n<T> nVar) {
        if (!cls.isAssignableFrom(aVar.getClass())) {
            return null;
        }
        T tCast = cls.cast(aVar);
        if (nVar.apply(tCast)) {
            return tCast;
        }
        return null;
    }

    public a0 copyWithAppendedEntries(a... aVarArr) {
        return aVarArr.length == 0 ? this : new a0(this.b, (a[]) androidx.media3.common.util.n0.nullSafeArrayConcatenation(this.a, aVarArr));
    }

    public a0 copyWithAppendedEntriesFrom(a0 a0Var) {
        return a0Var == null ? this : copyWithAppendedEntries(a0Var.a);
    }

    public a0 copyWithPresentationTimeUs(long j) {
        return this.b == j ? this : new a0(j, this.a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0.class == obj.getClass()) {
            a0 a0Var = (a0) obj;
            if (Arrays.equals(this.a, a0Var.a) && this.b == a0Var.b) {
                return true;
            }
        }
        return false;
    }

    public a get(int i) {
        return this.a[i];
    }

    public <T extends a> ImmutableList<T> getEntriesOfType(Class<T> cls) {
        ImmutableList.a aVarBuilder = ImmutableList.builder();
        for (a aVar : this.a) {
            if (cls.isAssignableFrom(aVar.getClass())) {
                aVarBuilder.add(cls.cast(aVar));
            }
        }
        return aVarBuilder.build();
    }

    public <T extends a> T getFirstEntryOfType(Class<T> cls) {
        return (T) getFirstMatchingEntry(cls, Predicates.alwaysTrue());
    }

    public <T extends a> T getFirstMatchingEntry(Class<T> cls, com.google.common.base.n<T> nVar) {
        for (a aVar : this.a) {
            T t = (T) entryIfMatches(aVar, cls, nVar);
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    public <T extends a> ImmutableList<T> getMatchingEntries(Class<T> cls, com.google.common.base.n<T> nVar) {
        ImmutableList.a aVarBuilder = ImmutableList.builder();
        for (a aVar : this.a) {
            a aVarEntryIfMatches = entryIfMatches(aVar, cls, nVar);
            if (aVarEntryIfMatches != null) {
                aVarBuilder.add(aVarEntryIfMatches);
            }
        }
        return aVarBuilder.build();
    }

    public int hashCode() {
        return Longs.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public int length() {
        return this.a.length;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        if (this.b == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.b;
        }
        sb.append(str);
        return sb.toString();
    }

    public a0(long j, a... aVarArr) {
        this.b = j;
        this.a = aVarArr;
    }

    public a0(a... aVarArr) {
        this(-9223372036854775807L, aVarArr);
    }

    public a0(long j, List<? extends a> list) {
        this(j, (a[]) list.toArray(new a[0]));
    }
}
