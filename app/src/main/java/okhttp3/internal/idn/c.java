package okhttp3.internal.idn;

import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {
    public static final int binarySearch(int i, int i2, l<? super Integer, Integer> lVar) {
        lVar.getClass();
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) / 2;
            int iIntValue = lVar.invoke(Integer.valueOf(i4)).intValue();
            if (iIntValue < 0) {
                i3 = i4 - 1;
            } else {
                if (iIntValue <= 0) {
                    return i4;
                }
                i = i4 + 1;
            }
        }
        return (-i) - 1;
    }

    public static final int read14BitInt(String str, int i) {
        str.getClass();
        char cCharAt = str.charAt(i);
        return (cCharAt << 7) + str.charAt(i + 1);
    }
}
