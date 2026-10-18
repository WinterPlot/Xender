package kotlin.time;

import kotlin.jvm.functions.q;
import kotlin.jvm.internal.r;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class l {
    public static final a e = new a(null);
    private static final l f = new l(4611686018427387903L, true);
    private static final l g = new l(Long.MAX_VALUE, false);
    private final long a;
    private final boolean b;
    private final long c;
    private final long d;

    private l(long j, boolean z) {
        this.a = j;
        this.b = z;
        this.c = j / 10;
        this.d = j % 10;
    }

    public final long parse(String str, int i, q<? super Integer, ? super Integer, ? super Boolean, y> qVar) {
        int i2;
        char cCharAt;
        char cCharAt2;
        str.getClass();
        qVar.getClass();
        if (this.b) {
            char cCharAt3 = str.charAt(i);
            if (cCharAt3 == '+') {
                i++;
            } else if (cCharAt3 == '-') {
                i++;
                i2 = -1;
            }
            i2 = 1;
        } else {
            i2 = 1;
        }
        while (i < str.length() && str.charAt(i) == '0') {
            i++;
        }
        long j = 0;
        while (i < str.length() && '0' <= (cCharAt = str.charAt(i)) && cCharAt < ':') {
            int i3 = cCharAt - '0';
            if (j > this.c || (j == this.c && i3 > this.d)) {
                while (i < str.length() && '0' <= (cCharAt2 = str.charAt(i)) && cCharAt2 < ':') {
                    i++;
                }
                qVar.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.TRUE);
                return this.a;
            }
            j = ((long) i3) + (j << 3) + (j << 1);
            i++;
        }
        qVar.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.FALSE);
        return j;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public /* synthetic */ a(r rVar) {
            this();
        }

        public final l getDefault() {
            return l.g;
        }

        public final l getIso() {
            return l.f;
        }

        private a() {
        }
    }
}
