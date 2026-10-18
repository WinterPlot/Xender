package androidx.profileinstaller;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class k {
    static final byte[] a = {48, 49, 53, 0};
    static final byte[] b = {48, 49, 48, 0};
    static final byte[] c = {48, 48, 57, 0};
    static final byte[] d = {48, 48, 53, 0};
    static final byte[] e = {48, 48, 49, 0};
    static final byte[] f = {48, 48, 49, 0};
    static final byte[] g = {48, 48, 50, 0};

    private k() {
    }

    public static String dexKeySeparator(byte[] bArr) {
        return (Arrays.equals(bArr, e) || Arrays.equals(bArr, d)) ? ":" : "!";
    }
}
