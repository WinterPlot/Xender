package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    static final d d;
    private static final String e;
    private static final String f;
    static final a g;
    static final a h;
    private final boolean a;
    private final int b;
    private final d c;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class b {
        private static final byte[] f = new byte[1792];
        private final CharSequence a;
        private final boolean b;
        private final int c;
        private int d;
        private char e;

        static {
            for (int i = 0; i < 1792; i++) {
                f[i] = Character.getDirectionality(i);
            }
        }

        public b(CharSequence charSequence, boolean z) {
            this.a = charSequence;
            this.b = z;
            this.c = charSequence.length();
        }

        private static byte getCachedDirectionality(char c) {
            return c < 1792 ? f[c] : Character.getDirectionality(c);
        }

        private byte skipEntityBackward() {
            char cCharAt;
            int i = this.d;
            do {
                int i2 = this.d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.a;
                int i3 = i2 - 1;
                this.d = i3;
                cCharAt = charSequence.charAt(i3);
                this.e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.d = i;
            this.e = ';';
            return (byte) 13;
        }

        private byte skipEntityForward() {
            char cCharAt;
            do {
                int i = this.d;
                if (i >= this.c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.a;
                this.d = i + 1;
                cCharAt = charSequence.charAt(i);
                this.e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte skipTagBackward() {
            char cCharAt;
            int i = this.d;
            while (true) {
                int i2 = this.d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.a;
                int i3 = i2 - 1;
                this.d = i3;
                char cCharAt2 = charSequence.charAt(i3);
                this.e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i4 = this.d;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.a;
                        int i5 = i4 - 1;
                        this.d = i5;
                        cCharAt = charSequence2.charAt(i5);
                        this.e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
            this.d = i;
            this.e = '>';
            return (byte) 13;
        }

        private byte skipTagForward() {
            char cCharAt;
            int i = this.d;
            while (true) {
                int i2 = this.d;
                if (i2 >= this.c) {
                    this.d = i;
                    this.e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.a;
                this.d = i2 + 1;
                char cCharAt2 = charSequence.charAt(i2);
                this.e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i3 = this.d;
                        if (i3 >= this.c) {
                            break;
                        }
                        CharSequence charSequence2 = this.a;
                        this.d = i3 + 1;
                        cCharAt = charSequence2.charAt(i3);
                        this.e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        public byte dirTypeBackward() {
            char cCharAt = this.a.charAt(this.d - 1);
            this.e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.a, this.d);
                this.d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.d--;
            byte cachedDirectionality = getCachedDirectionality(this.e);
            if (this.b) {
                char c = this.e;
                if (c == '>') {
                    return skipTagBackward();
                }
                if (c == ';') {
                    return skipEntityBackward();
                }
            }
            return cachedDirectionality;
        }

        public byte dirTypeForward() {
            char cCharAt = this.a.charAt(this.d);
            this.e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.a, this.d);
                this.d = Character.charCount(iCodePointAt) + this.d;
                return Character.getDirectionality(iCodePointAt);
            }
            this.d++;
            byte cachedDirectionality = getCachedDirectionality(this.e);
            if (this.b) {
                char c = this.e;
                if (c == '<') {
                    return skipTagForward();
                }
                if (c == '&') {
                    return skipEntityForward();
                }
            }
            return cachedDirectionality;
        }

        public int getEntryDir() {
            this.d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.d < this.c && i == 0) {
                byte bDirTypeForward = dirTypeForward();
                if (bDirTypeForward != 0) {
                    if (bDirTypeForward == 1 || bDirTypeForward == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (bDirTypeForward != 9) {
                        switch (bDirTypeForward) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.d > 0) {
                switch (dirTypeBackward()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                    default:
                        continue;
                }
                i3--;
            }
            return 0;
        }

        public int getExitDir() {
            this.d = this.c;
            int i = 0;
            while (true) {
                int i2 = i;
                while (this.d > 0) {
                    byte bDirTypeBackward = dirTypeBackward();
                    if (bDirTypeBackward == 0) {
                        if (i == 0) {
                            return -1;
                        }
                        if (i2 == 0) {
                        }
                    } else if (bDirTypeBackward == 1 || bDirTypeBackward == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 == 0) {
                        }
                    } else if (bDirTypeBackward != 9) {
                        switch (bDirTypeBackward) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }
    }

    static {
        d dVar = e.c;
        d = dVar;
        e = Character.toString((char) 8206);
        f = Character.toString((char) 8207);
        g = new a(false, 2, dVar);
        h = new a(true, 2, dVar);
    }

    public a(boolean z, int i, d dVar) {
        this.a = z;
        this.b = i;
        this.c = dVar;
    }

    private static int getEntryDir(CharSequence charSequence) {
        return new b(charSequence, false).getEntryDir();
    }

    private static int getExitDir(CharSequence charSequence) {
        return new b(charSequence, false).getExitDir();
    }

    public static a getInstance() {
        return new C0125a().build();
    }

    public static boolean isRtlLocale(Locale locale) {
        return f.getLayoutDirectionFromLocale(locale) == 1;
    }

    private String markAfter(CharSequence charSequence, d dVar) {
        boolean zIsRtl = dVar.isRtl(charSequence, 0, charSequence.length());
        if (!this.a && (zIsRtl || getExitDir(charSequence) == 1)) {
            return e;
        }
        if (this.a) {
            return (!zIsRtl || getExitDir(charSequence) == -1) ? f : "";
        }
        return "";
    }

    private String markBefore(CharSequence charSequence, d dVar) {
        boolean zIsRtl = dVar.isRtl(charSequence, 0, charSequence.length());
        if (!this.a && (zIsRtl || getEntryDir(charSequence) == 1)) {
            return e;
        }
        if (this.a) {
            return (!zIsRtl || getEntryDir(charSequence) == -1) ? f : "";
        }
        return "";
    }

    public boolean getStereoReset() {
        return (this.b & 2) != 0;
    }

    public boolean isRtl(CharSequence charSequence) {
        return this.c.isRtl(charSequence, 0, charSequence.length());
    }

    public boolean isRtlContext() {
        return this.a;
    }

    public CharSequence unicodeWrap(CharSequence charSequence, d dVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = dVar.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (getStereoReset() && z) {
            spannableStringBuilder.append((CharSequence) markBefore(charSequence, zIsRtl ? e.b : e.a));
        }
        if (zIsRtl != this.a) {
            spannableStringBuilder.append(zIsRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) markAfter(charSequence, zIsRtl ? e.b : e.a));
        }
        return spannableStringBuilder;
    }

    public static a getInstance(boolean z) {
        return new C0125a(z).build();
    }

    public static a getInstance(Locale locale) {
        return new C0125a(locale).build();
    }

    public boolean isRtl(String str) {
        return isRtl((CharSequence) str);
    }

    /* JADX INFO: renamed from: androidx.core.text.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class C0125a {
        private boolean a;
        private int b;
        private d c;

        public C0125a() {
            initialize(a.isRtlLocale(Locale.getDefault()));
        }

        private static a getDefaultInstanceFromContext(boolean z) {
            return z ? a.h : a.g;
        }

        private void initialize(boolean z) {
            this.a = z;
            this.c = a.d;
            this.b = 2;
        }

        public a build() {
            return (this.b == 2 && this.c == a.d) ? getDefaultInstanceFromContext(this.a) : new a(this.a, this.b, this.c);
        }

        public C0125a setTextDirectionHeuristic(d dVar) {
            this.c = dVar;
            return this;
        }

        public C0125a stereoReset(boolean z) {
            int i = this.b;
            if (z) {
                this.b = i | 2;
                return this;
            }
            this.b = i & (-3);
            return this;
        }

        public C0125a(boolean z) {
            initialize(z);
        }

        public C0125a(Locale locale) {
            initialize(a.isRtlLocale(locale));
        }
    }

    public String unicodeWrap(String str, d dVar, boolean z) {
        if (str == null) {
            return null;
        }
        return unicodeWrap((CharSequence) str, dVar, z).toString();
    }

    public String unicodeWrap(String str, d dVar) {
        return unicodeWrap(str, dVar, true);
    }

    public CharSequence unicodeWrap(CharSequence charSequence, d dVar) {
        return unicodeWrap(charSequence, dVar, true);
    }

    public String unicodeWrap(String str, boolean z) {
        return unicodeWrap(str, this.c, z);
    }

    public CharSequence unicodeWrap(CharSequence charSequence, boolean z) {
        return unicodeWrap(charSequence, this.c, z);
    }

    public String unicodeWrap(String str) {
        return unicodeWrap(str, this.c, true);
    }

    public CharSequence unicodeWrap(CharSequence charSequence) {
        return unicodeWrap(charSequence, this.c, true);
    }
}
