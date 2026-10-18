package kotlin.text;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public class e extends d {
    public static final char digitToChar(int i, int i2) {
        if (2 > i2 || i2 >= 37) {
            okhttp3.b0.i(defpackage.a.k(i2, "Invalid radix: ", ". Valid radix values are in range 2..36"));
            return (char) 0;
        }
        if (i >= 0 && i < i2) {
            return i < 10 ? (char) (i + 48) : (char) (((char) (i + 65)) - '\n');
        }
        okhttp3.b0.i(androidx.constraintlayout.core.motion.utils.m.s(i, i2, "Digit ", " does not represent a valid digit in radix "));
        return (char) 0;
    }

    public static final int digitToInt(char c, int i) {
        Integer numDigitToIntOrNull = digitToIntOrNull(c, i);
        if (numDigitToIntOrNull != null) {
            return numDigitToIntOrNull.intValue();
        }
        throw new IllegalArgumentException("Char " + c + " is not a digit in the given radix=" + i);
    }

    public static final Integer digitToIntOrNull(char c, int i) {
        d.checkRadix(i);
        Integer numValueOf = Integer.valueOf(d.digitOf(c, i));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    public static final boolean equals(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static /* synthetic */ boolean equals$default(char c, char c2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return equals(c, c2, z);
    }

    public static boolean isSurrogate(char c) {
        return 55296 <= c && c < 57344;
    }

    private static final String plus(char c, String str) {
        str.getClass();
        return c + str;
    }

    public static String titlecase(char c) {
        return o0.titlecaseImpl(c);
    }

    public static final Integer digitToIntOrNull(char c) {
        Integer numValueOf = Integer.valueOf(d.digitOf(c, 10));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    public static final int digitToInt(char c) {
        int iDigitOf = d.digitOf(c, 10);
        if (iDigitOf >= 0) {
            return iDigitOf;
        }
        throw new IllegalArgumentException("Char " + c + " is not a decimal digit");
    }

    public static final char digitToChar(int i) {
        if (i >= 0 && i < 10) {
            return (char) (i + 48);
        }
        okhttp3.b0.i(defpackage.a.k(i, "Int ", " is not a decimal digit"));
        return (char) 0;
    }
}
