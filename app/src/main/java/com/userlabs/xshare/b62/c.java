package com.userlabs.xshare.b62;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
final class c {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private static final int[] b;

    static {
        int[] iArr = new int[123];
        b = iArr;
        Arrays.fill(iArr, -1);
        int i = 0;
        while (true) {
            char[] cArr = a;
            if (i >= cArr.length) {
                return;
            }
            b[cArr[i]] = i;
            i++;
        }
    }

    private c() {
    }

    public static char getDigit(int i) {
        return a[i];
    }

    public static int getDigitIndex(char c) {
        int[] iArr = b;
        int i = c < iArr.length ? iArr[c] : -1;
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException("Not a valid Base62 character: '" + c + "'");
    }
}
