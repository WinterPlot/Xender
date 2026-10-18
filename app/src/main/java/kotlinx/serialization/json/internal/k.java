package kotlinx.serialization.json.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class k {
    public static final k a;
    public static final char[] b;
    public static final byte[] c;

    static {
        k kVar = new k();
        a = kVar;
        b = new char[117];
        c = new byte[126];
        kVar.initEscape();
        kVar.initCharToToken();
    }

    private k() {
    }

    private final void initC2ESC(int i, char c2) {
        if (c2 != 'u') {
            b[c2] = (char) i;
        }
    }

    private final void initC2TC(int i, byte b2) {
        c[i] = b2;
    }

    private final void initCharToToken() {
        for (int i = 0; i < 33; i++) {
            initC2TC(i, (byte) 127);
        }
        initC2TC(9, (byte) 3);
        initC2TC(10, (byte) 3);
        initC2TC(13, (byte) 3);
        initC2TC(32, (byte) 3);
        initC2TC(',', (byte) 4);
        initC2TC(':', (byte) 5);
        initC2TC('{', (byte) 6);
        initC2TC('}', (byte) 7);
        initC2TC('[', (byte) 8);
        initC2TC(']', (byte) 9);
        initC2TC('\"', (byte) 1);
        initC2TC('\\', (byte) 2);
    }

    private final void initEscape() {
        for (int i = 0; i < 32; i++) {
            initC2ESC(i, 'u');
        }
        initC2ESC(8, 'b');
        initC2ESC(9, 't');
        initC2ESC(10, 'n');
        initC2ESC(12, 'f');
        initC2ESC(13, 'r');
        initC2ESC('/', '/');
        initC2ESC('\"', '\"');
        initC2ESC('\\', '\\');
    }

    private final void initC2TC(char c2, byte b2) {
        initC2TC((int) c2, b2);
    }

    private final void initC2ESC(char c2, char c3) {
        initC2ESC((int) c2, c3);
    }
}
