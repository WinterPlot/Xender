package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.media3.common.PlaybackException;
import java.util.Locale;
import kotlin.jvm.internal.y;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static final a a = new a();
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;

    /* JADX INFO: renamed from: androidx.core.os.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class C0122a {
        public static final C0122a a = new C0122a();

        private C0122a() {
        }

        public final int getExtensionVersion(int i) {
            return SdkExtensions.getExtensionVersion(i);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        b = i >= 30 ? C0122a.a.getExtensionVersion(30) : 0;
        c = i >= 30 ? C0122a.a.getExtensionVersion(31) : 0;
        d = i >= 30 ? C0122a.a.getExtensionVersion(33) : 0;
        e = i >= 30 ? C0122a.a.getExtensionVersion(PlaybackException.CUSTOM_ERROR_CODE_BASE) : 0;
    }

    private a() {
    }

    public static final boolean isAtLeastB() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            return true;
        }
        if (i < 35) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        str.getClass();
        return isAtLeastPreReleaseCodename("Baklava", str);
    }

    public static final boolean isAtLeastB_1() {
        return Build.VERSION.SDK_INT >= 36 && androidx.activity.b.a() >= 3600001;
    }

    public static final boolean isAtLeastN() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static final boolean isAtLeastNMR1() {
        return Build.VERSION.SDK_INT >= 25;
    }

    public static final boolean isAtLeastO() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static final boolean isAtLeastOMR1() {
        return Build.VERSION.SDK_INT >= 27;
    }

    public static final boolean isAtLeastP() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static final boolean isAtLeastPreReleaseCodename(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (y.areEqual("REL", str2)) {
            return false;
        }
        Integer numIsAtLeastPreReleaseCodename$codenameToInt = isAtLeastPreReleaseCodename$codenameToInt(str2);
        Integer numIsAtLeastPreReleaseCodename$codenameToInt2 = isAtLeastPreReleaseCodename$codenameToInt(str);
        if (numIsAtLeastPreReleaseCodename$codenameToInt != null && numIsAtLeastPreReleaseCodename$codenameToInt2 != null) {
            return numIsAtLeastPreReleaseCodename$codenameToInt.intValue() >= numIsAtLeastPreReleaseCodename$codenameToInt2.intValue();
        }
        if (numIsAtLeastPreReleaseCodename$codenameToInt != null || numIsAtLeastPreReleaseCodename$codenameToInt2 != null) {
            return numIsAtLeastPreReleaseCodename$codenameToInt != null;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str2.toUpperCase(locale);
        upperCase.getClass();
        String upperCase2 = str.toUpperCase(locale);
        upperCase2.getClass();
        return upperCase.compareTo(upperCase2) >= 0;
    }

    private static final Integer isAtLeastPreReleaseCodename$codenameToInt(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return y.areEqual(upperCase, "BAKLAVA") ? 0 : null;
    }

    public static final boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static final boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static final boolean isAtLeastS() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return true;
        }
        if (i < 30) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        str.getClass();
        return isAtLeastPreReleaseCodename("S", str);
    }

    public static final boolean isAtLeastSv2() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 32) {
            return true;
        }
        if (i < 31) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        str.getClass();
        return isAtLeastPreReleaseCodename("Sv2", str);
    }

    public static final boolean isAtLeastT() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return true;
        }
        if (i < 32) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        str.getClass();
        return isAtLeastPreReleaseCodename("Tiramisu", str);
    }

    public static final boolean isAtLeastU() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            return true;
        }
        if (i < 33) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        str.getClass();
        return isAtLeastPreReleaseCodename("UpsideDownCake", str);
    }

    public static final boolean isAtLeastV() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            return true;
        }
        if (i < 34) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        str.getClass();
        return isAtLeastPreReleaseCodename("VanillaIceCream", str);
    }
}
