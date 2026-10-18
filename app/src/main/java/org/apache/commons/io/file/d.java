package org.apache.commons.io.file;

import j$.util.Objects;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class b implements j {
        private final e a;
        private final e b;
        private final e c;

        public b(e eVar, e eVar2, e eVar3) {
            this.a = eVar;
            this.b = eVar2;
            this.c = eVar3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Objects.equals(this.a, bVar.a) && Objects.equals(this.b, bVar.b) && Objects.equals(this.c, bVar.c);
        }

        @Override // org.apache.commons.io.file.d.j
        public e getByteCounter() {
            return this.a;
        }

        @Override // org.apache.commons.io.file.d.j
        public e getDirectoryCounter() {
            return this.b;
        }

        @Override // org.apache.commons.io.file.d.j
        public e getFileCounter() {
            return this.c;
        }

        public int hashCode() {
            return Objects.hash(this.a, this.b, this.c);
        }

        @Override // org.apache.commons.io.file.d.j
        public void reset() {
            this.a.reset();
            this.b.reset();
            this.c.reset();
        }

        public String toString() {
            return String.format("%,d files, %,d directories, %,d bytes", Long.valueOf(this.c.get()), Long.valueOf(this.b.get()), Long.valueOf(this.a.get()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class c implements e {
        private BigInteger a;

        private c() {
            this.a = BigInteger.ZERO;
        }

        @Override // org.apache.commons.io.file.d.e
        public void add(long j) {
            this.a = this.a.add(BigInteger.valueOf(j));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                return Objects.equals(this.a, ((e) obj).getBigInteger());
            }
            return false;
        }

        @Override // org.apache.commons.io.file.d.e
        public long get() {
            return this.a.longValueExact();
        }

        @Override // org.apache.commons.io.file.d.e
        public BigInteger getBigInteger() {
            return this.a;
        }

        @Override // org.apache.commons.io.file.d.e
        public Long getLong() {
            return Long.valueOf(this.a.longValueExact());
        }

        public int hashCode() {
            return Objects.hash(this.a);
        }

        @Override // org.apache.commons.io.file.d.e
        public void increment() {
            this.a = this.a.add(BigInteger.ONE);
        }

        @Override // org.apache.commons.io.file.d.e
        public void reset() {
            this.a = BigInteger.ZERO;
        }

        public String toString() {
            return this.a.toString();
        }
    }

    /* JADX INFO: renamed from: org.apache.commons.io.file.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class C0724d extends b {
        public C0724d() {
            super(d.bigIntegerCounter(), d.bigIntegerCounter(), d.bigIntegerCounter());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface e {
        void add(long j);

        long get();

        BigInteger getBigInteger();

        Long getLong();

        void increment();

        void reset();
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class f implements e {
        private long a;

        private f() {
        }

        @Override // org.apache.commons.io.file.d.e
        public void add(long j) {
            this.a += j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).get();
        }

        @Override // org.apache.commons.io.file.d.e
        public long get() {
            return this.a;
        }

        @Override // org.apache.commons.io.file.d.e
        public BigInteger getBigInteger() {
            return BigInteger.valueOf(this.a);
        }

        @Override // org.apache.commons.io.file.d.e
        public Long getLong() {
            return Long.valueOf(this.a);
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.a));
        }

        @Override // org.apache.commons.io.file.d.e
        public void increment() {
            this.a++;
        }

        @Override // org.apache.commons.io.file.d.e
        public void reset() {
            this.a = 0L;
        }

        public String toString() {
            return Long.toString(this.a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class g extends b {
        public g() {
            super(d.longCounter(), d.longCounter(), d.longCounter());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class i extends b {
        static final i d = new i();

        private i() {
            super(d.noopCounter(), d.noopCounter(), d.noopCounter());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface j {
        e getByteCounter();

        e getDirectoryCounter();

        e getFileCounter();

        void reset();
    }

    @Deprecated
    public d() {
    }

    public static e bigIntegerCounter() {
        return new c();
    }

    public static j bigIntegerPathCounters() {
        return new C0724d();
    }

    public static e longCounter() {
        return new f();
    }

    public static j longPathCounters() {
        return new g();
    }

    public static e noopCounter() {
        return h.a;
    }

    public static j noopPathCounters() {
        return i.d;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class h implements e {
        static final h a = new h();

        private h() {
        }

        @Override // org.apache.commons.io.file.d.e
        public long get() {
            return 0L;
        }

        @Override // org.apache.commons.io.file.d.e
        public BigInteger getBigInteger() {
            return BigInteger.ZERO;
        }

        @Override // org.apache.commons.io.file.d.e
        public Long getLong() {
            return 0L;
        }

        public String toString() {
            return "0";
        }

        @Override // org.apache.commons.io.file.d.e
        public void increment() {
        }

        @Override // org.apache.commons.io.file.d.e
        public void reset() {
        }

        @Override // org.apache.commons.io.file.d.e
        public void add(long j) {
        }
    }
}
