package kotlin.text;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class f {
    public static final f a = new f();
    public static final Charset b;
    public static final Charset c;
    public static final Charset d;
    public static final Charset e;
    public static final Charset f;
    public static final Charset g;
    private static volatile Charset h;
    private static volatile Charset i;
    private static volatile Charset j;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        b = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        charsetForName2.getClass();
        c = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        charsetForName3.getClass();
        d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        charsetForName4.getClass();
        e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        charsetForName5.getClass();
        f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        charsetForName6.getClass();
        g = charsetForName6;
    }

    private f() {
    }

    public final Charset UTF32() {
        Charset charset = h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32");
        charsetForName.getClass();
        h = charsetForName;
        return charsetForName;
    }

    public final Charset UTF32_BE() {
        Charset charset = j;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        charsetForName.getClass();
        j = charsetForName;
        return charsetForName;
    }

    public final Charset UTF32_LE() {
        Charset charset = i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        charsetForName.getClass();
        i = charsetForName;
        return charsetForName;
    }
}
