package com.google.common.collect;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e0 {
    private static final e0 a = new a();
    private static final e0 b = new b(-1);
    private static final e0 c = new b(1);

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b extends e0 {
        final int d;

        public b(int i) {
            super(null);
            this.d = i;
        }

        @Override // com.google.common.collect.e0
        public int result() {
            return this.d;
        }

        @Override // com.google.common.collect.e0
        public e0 compare(float f, float f2) {
            return this;
        }

        @Override // com.google.common.collect.e0
        public e0 compare(int i, int i2) {
            return this;
        }

        @Override // com.google.common.collect.e0
        public e0 compare(long j, long j2) {
            return this;
        }

        @Override // com.google.common.collect.e0
        public e0 compare(Comparable<?> comparable, Comparable<?> comparable2) {
            return this;
        }

        @Override // com.google.common.collect.e0
        public <T> e0 compare(T t, T t2, Comparator<T> comparator) {
            return this;
        }

        @Override // com.google.common.collect.e0
        public e0 compare(double d, double d2) {
            return this;
        }

        @Override // com.google.common.collect.e0
        public e0 compareFalseFirst(boolean z, boolean z2) {
            return this;
        }

        @Override // com.google.common.collect.e0
        public e0 compareTrueFirst(boolean z, boolean z2) {
            return this;
        }
    }

    public /* synthetic */ e0(a aVar) {
        this();
    }

    public static e0 start() {
        return a;
    }

    public abstract e0 compare(double d, double d2);

    public abstract e0 compare(float f, float f2);

    public abstract e0 compare(int i, int i2);

    public abstract e0 compare(long j, long j2);

    @Deprecated
    public final e0 compare(Boolean bool, Boolean bool2) {
        return compareFalseFirst(bool.booleanValue(), bool2.booleanValue());
    }

    public abstract e0 compare(Comparable<?> comparable, Comparable<?> comparable2);

    public abstract <T> e0 compare(T t, T t2, Comparator<T> comparator);

    public abstract e0 compareFalseFirst(boolean z, boolean z2);

    public abstract e0 compareTrueFirst(boolean z, boolean z2);

    public abstract int result();

    private e0() {
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a extends e0 {
        public a() {
            super(null);
        }

        public e0 classify(int i) {
            if (i < 0) {
                return e0.b;
            }
            return i > 0 ? e0.c : e0.a;
        }

        @Override // com.google.common.collect.e0
        public e0 compare(Comparable<?> comparable, Comparable<?> comparable2) {
            return classify(comparable.compareTo(comparable2));
        }

        @Override // com.google.common.collect.e0
        public e0 compareFalseFirst(boolean z, boolean z2) {
            return classify(Boolean.compare(z, z2));
        }

        @Override // com.google.common.collect.e0
        public e0 compareTrueFirst(boolean z, boolean z2) {
            return classify(Boolean.compare(z2, z));
        }

        @Override // com.google.common.collect.e0
        public int result() {
            return 0;
        }

        @Override // com.google.common.collect.e0
        public <T> e0 compare(T t, T t2, Comparator<T> comparator) {
            return classify(comparator.compare(t, t2));
        }

        @Override // com.google.common.collect.e0
        public e0 compare(int i, int i2) {
            return classify(Integer.compare(i, i2));
        }

        @Override // com.google.common.collect.e0
        public e0 compare(long j, long j2) {
            return classify(Long.compare(j, j2));
        }

        @Override // com.google.common.collect.e0
        public e0 compare(float f, float f2) {
            return classify(Float.compare(f, f2));
        }

        @Override // com.google.common.collect.e0
        public e0 compare(double d, double d2) {
            return classify(Double.compare(d, d2));
        }
    }
}
