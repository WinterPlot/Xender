package androidx.core.text;

import java.nio.CharBuffer;
import java.util.Locale;
import okio.j0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final androidx.core.text.d a = new C0127e(null, false);
    public static final androidx.core.text.d b = new C0127e(null, true);
    public static final androidx.core.text.d c;
    public static final androidx.core.text.d d;
    public static final androidx.core.text.d e;
    public static final androidx.core.text.d f;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a implements c {
        static final a b = new a(true);
        private final boolean a;

        private a(boolean z) {
            this.a = z;
        }

        @Override // androidx.core.text.e.c
        public int checkRtl(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int iIsRtlText = e.isRtlText(Character.getDirectionality(charSequence.charAt(i)));
                if (iIsRtlText != 0) {
                    if (iIsRtlText != 1) {
                        continue;
                    } else if (!this.a) {
                        return 1;
                    }
                    i++;
                    z = z;
                } else if (this.a) {
                    return 0;
                }
                z = true;
                i++;
                z = z;
            }
            if (z) {
                return this.a ? 1 : 0;
            }
            return 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class b implements c {
        static final b a = new b();

        private b() {
        }

        @Override // androidx.core.text.e.c
        public int checkRtl(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int iIsRtlTextOrFormat = 2;
            while (i < i3 && iIsRtlTextOrFormat == 2) {
                iIsRtlTextOrFormat = e.isRtlTextOrFormat(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return iIsRtlTextOrFormat;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface c {
        int checkRtl(CharSequence charSequence, int i, int i2);
    }

    /* JADX INFO: renamed from: androidx.core.text.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class C0127e extends d {
        private final boolean b;

        public C0127e(c cVar, boolean z) {
            super(cVar);
            this.b = z;
        }

        @Override // androidx.core.text.e.d
        public boolean defaultIsRtl() {
            return this.b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class f extends d {
        static final f b = new f();

        public f() {
            super(null);
        }

        @Override // androidx.core.text.e.d
        public boolean defaultIsRtl() {
            return androidx.core.text.f.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.a;
        c = new C0127e(bVar, false);
        d = new C0127e(bVar, true);
        e = new C0127e(a.b, false);
        f = f.b;
    }

    private e() {
    }

    public static int isRtlText(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int isRtlTextOrFormat(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class d implements androidx.core.text.d {
        private final c a;

        public d(c cVar) {
            this.a = cVar;
        }

        private boolean doCheck(CharSequence charSequence, int i, int i2) {
            int iCheckRtl = this.a.checkRtl(charSequence, i, i2);
            if (iCheckRtl == 0) {
                return true;
            }
            if (iCheckRtl != 1) {
                return defaultIsRtl();
            }
            return false;
        }

        public abstract boolean defaultIsRtl();

        @Override // androidx.core.text.d
        public boolean isRtl(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                return this.a == null ? defaultIsRtl() : doCheck(charSequence, i, i2);
            }
            j0.d();
            return false;
        }

        @Override // androidx.core.text.d
        public boolean isRtl(char[] cArr, int i, int i2) {
            return isRtl(CharBuffer.wrap(cArr), i, i2);
        }
    }
}
