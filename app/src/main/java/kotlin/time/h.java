package kotlin.time;

import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class h {
    public static final h a = new h();

    private h() {
    }

    private final int parseDigits(String str, int i, int i2, kotlin.jvm.functions.l<? super Integer, y> lVar) {
        int iMin = Math.min(i + i2, str.length());
        int i3 = i;
        int i4 = 0;
        while (i3 < iMin) {
            char cCharAt = str.charAt(i3);
            if ('0' > cCharAt || cCharAt >= ':') {
                break;
            }
            i4 = (cCharAt - '0') + (i4 << 3) + (i4 << 1);
            i3++;
        }
        for (int i5 = 0; i5 < i2 - (i3 - i); i5++) {
            i4 = (i4 << 3) + (i4 << 1);
        }
        lVar.invoke(Integer.valueOf(i3));
        return i4;
    }

    public final long parse(String str, int i, kotlin.jvm.functions.l<? super Integer, y> lVar) {
        char cCharAt;
        char cCharAt2;
        str.getClass();
        lVar.getClass();
        int iMin = Math.min(i + 6, str.length());
        int i2 = i;
        int i3 = 0;
        while (i2 < iMin && '0' <= (cCharAt2 = str.charAt(i2)) && cCharAt2 < ':') {
            i3 = (cCharAt2 - '0') + (i3 << 3) + (i3 << 1);
            i2++;
        }
        int i4 = 6 - (i2 - i);
        for (int i5 = 0; i5 < i4; i5++) {
            i3 = (i3 << 1) + (i3 << 3);
        }
        int iMin2 = Math.min(i2 + 9, str.length());
        int i6 = 0;
        int i7 = i2;
        while (i7 < iMin2) {
            char cCharAt3 = str.charAt(i7);
            if ('0' > cCharAt3 || cCharAt3 >= ':') {
                break;
            }
            i6 = (cCharAt3 - '0') + (i6 << 3) + (i6 << 1);
            i7++;
        }
        for (int i8 = 0; i8 < 9 - (i7 - i2); i8++) {
            i6 = (i6 << 1) + (i6 << 3);
        }
        while (i7 < str.length() && '0' <= (cCharAt = str.charAt(i7)) && cCharAt < ':') {
            i7++;
        }
        lVar.invoke(Integer.valueOf(i7));
        return (((long) i3) * 1000000000) + ((long) i6);
    }
}
