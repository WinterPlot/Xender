package com.google.common.base;

import j$.util.Objects;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import okhttp3.b0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class g {
    private final String a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a extends g {
        final /* synthetic */ String b;
        final /* synthetic */ g c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, g gVar2, String str) {
            super(gVar2, null);
            this.b = str;
            this.c = gVar;
        }

        @Override // com.google.common.base.g
        public g skipNulls() {
            throw new UnsupportedOperationException("already specified useForNull");
        }

        @Override // com.google.common.base.g
        public CharSequence toString(Object obj) {
            return obj == null ? this.b : this.c.toString(obj);
        }

        @Override // com.google.common.base.g
        public g useForNull(String str) {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class b extends g {
        public b(g gVar) {
            super(gVar, null);
        }

        @Override // com.google.common.base.g
        public <A extends Appendable> A appendTo(A a, Iterator<?> it) throws IOException {
            m.checkNotNull(a, "appendable");
            m.checkNotNull(it, "parts");
            while (it.hasNext()) {
                Object next = it.next();
                if (next != null) {
                    a.append(g.this.toString(next));
                    break;
                }
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                if (next2 != null) {
                    a.append(g.this.a);
                    a.append(g.this.toString(next2));
                }
            }
            return a;
        }

        @Override // com.google.common.base.g
        public String join(Iterable<?> iterable) {
            return join(iterable.iterator());
        }

        @Override // com.google.common.base.g
        public g useForNull(String str) {
            throw new UnsupportedOperationException("already specified skipNulls");
        }

        @Override // com.google.common.base.g
        public d withKeyValueSeparator(String str) {
            throw new UnsupportedOperationException("can't use .skipNulls() with maps");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class c extends AbstractList<Object> {
        final /* synthetic */ Object[] a;
        final /* synthetic */ Object b;
        final /* synthetic */ Object c;

        public c(Object[] objArr, Object obj, Object obj2) {
            this.a = objArr;
            this.b = obj;
            this.c = obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i) {
            if (i != 0) {
                return i != 1 ? this.a[i - 2] : this.c;
            }
            return this.b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.a.length + 2;
        }
    }

    private g(String str) {
        this.a = (String) m.checkNotNull(str);
    }

    private static int expandedCapacity(int i, int i2) {
        if (i2 < 0) {
            b0.i("cannot store more than Integer.MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    private static Iterable<Object> iterable(Object obj, Object obj2, Object[] objArr) {
        m.checkNotNull(objArr);
        return new c(objArr, obj, obj2);
    }

    public static g on(char c2) {
        return new g(String.valueOf(c2));
    }

    public <A extends Appendable> A appendTo(A a2, Iterator<?> it) throws IOException {
        m.checkNotNull(a2);
        if (it.hasNext()) {
            a2.append(toString(it.next()));
            while (it.hasNext()) {
                a2.append(this.a);
                a2.append(toString(it.next()));
            }
        }
        return a2;
    }

    public final String join(Iterator<?> it) {
        return appendTo(new StringBuilder(), it).toString();
    }

    public g skipNulls() {
        return new b(this);
    }

    public CharSequence toString(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public g useForNull(String str) {
        m.checkNotNull(str);
        return new a(this, this, str);
    }

    public d withKeyValueSeparator(char c2) {
        return withKeyValueSeparator(String.valueOf(c2));
    }

    public d withKeyValueSeparator(String str) {
        return new d(this, str, null);
    }

    public static g on(String str) {
        return new g(str);
    }

    public /* synthetic */ g(g gVar, a aVar) {
        this(gVar);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class d {
        private final g a;
        private final String b;

        private d(g gVar, String str) {
            this.a = gVar;
            this.b = (String) m.checkNotNull(str);
        }

        public <A extends Appendable> A appendTo(A a, Iterator<? extends Map.Entry<?, ?>> it) throws IOException {
            m.checkNotNull(a);
            if (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                a.append(this.a.toString(next.getKey()));
                a.append(this.b);
                a.append(this.a.toString(next.getValue()));
                while (it.hasNext()) {
                    a.append(this.a.a);
                    Map.Entry<?, ?> next2 = it.next();
                    a.append(this.a.toString(next2.getKey()));
                    a.append(this.b);
                    a.append(this.a.toString(next2.getValue()));
                }
            }
            return a;
        }

        public String join(Iterator<? extends Map.Entry<?, ?>> it) {
            return appendTo(new StringBuilder(), it).toString();
        }

        public d useForNull(String str) {
            return new d(this.a.useForNull(str), this.b);
        }

        public /* synthetic */ d(g gVar, String str, a aVar) {
            this(gVar, str);
        }

        public String join(Iterable<? extends Map.Entry<?, ?>> iterable) {
            return join(iterable.iterator());
        }

        public String join(Map<?, ?> map) {
            return join(map.entrySet());
        }

        public StringBuilder appendTo(StringBuilder sb, Map<?, ?> map) {
            return appendTo(sb, (Iterable<? extends Map.Entry<?, ?>>) map.entrySet());
        }

        public <A extends Appendable> A appendTo(A a, Iterable<? extends Map.Entry<?, ?>> iterable) throws IOException {
            return (A) appendTo(a, iterable.iterator());
        }

        public <A extends Appendable> A appendTo(A a, Map<?, ?> map) throws IOException {
            return (A) appendTo(a, map.entrySet());
        }

        public StringBuilder appendTo(StringBuilder sb, Iterable<? extends Map.Entry<?, ?>> iterable) {
            return appendTo(sb, iterable.iterator());
        }

        public StringBuilder appendTo(StringBuilder sb, Iterator<? extends Map.Entry<?, ?>> it) {
            try {
                appendTo(sb, it);
                return sb;
            } catch (IOException e) {
                b0.o(e);
                return null;
            }
        }
    }

    private g(g gVar) {
        this.a = gVar.a;
    }

    public String join(Iterable<?> iterable) {
        return join(iterable.iterator());
    }

    public final String join(Object[] objArr) {
        return join(Arrays.asList(objArr));
    }

    public final String join(Object obj, Object obj2, Object... objArr) {
        return join(iterable(obj, obj2, objArr));
    }

    public <A extends Appendable> A appendTo(A a2, Iterable<?> iterable) throws IOException {
        return (A) appendTo(a2, iterable.iterator());
    }

    public final <A extends Appendable> A appendTo(A a2, Object[] objArr) throws IOException {
        return (A) appendTo(a2, Arrays.asList(objArr));
    }

    public final <A extends Appendable> A appendTo(A a2, Object obj, Object obj2, Object... objArr) throws IOException {
        return (A) appendTo(a2, iterable(obj, obj2, objArr));
    }

    public final StringBuilder appendTo(StringBuilder sb, Iterable<?> iterable) {
        return appendTo(sb, iterable.iterator());
    }

    public final StringBuilder appendTo(StringBuilder sb, Iterator<?> it) {
        try {
            appendTo(sb, it);
            return sb;
        } catch (IOException e) {
            b0.o(e);
            return null;
        }
    }

    public final StringBuilder appendTo(StringBuilder sb, Object[] objArr) {
        return appendTo(sb, (Iterable<?>) Arrays.asList(objArr));
    }

    public final StringBuilder appendTo(StringBuilder sb, Object obj, Object obj2, Object... objArr) {
        return appendTo(sb, iterable(obj, obj2, objArr));
    }
}
