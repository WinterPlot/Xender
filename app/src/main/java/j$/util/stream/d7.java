package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes2.dex */
public final class d7 {
    public static final d7 OP;
    public static final d7 SPLITERATOR;
    public static final d7 STREAM;
    public static final d7 TERMINAL_OP;
    public static final d7 UPSTREAM_TERMINAL_OP;
    public static final /* synthetic */ d7[] a;

    static {
        d7 d7Var = new d7("SPLITERATOR", 0);
        SPLITERATOR = d7Var;
        d7 d7Var2 = new d7("STREAM", 1);
        STREAM = d7Var2;
        d7 d7Var3 = new d7("OP", 2);
        OP = d7Var3;
        d7 d7Var4 = new d7("TERMINAL_OP", 3);
        TERMINAL_OP = d7Var4;
        d7 d7Var5 = new d7("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = d7Var5;
        a = new d7[]{d7Var, d7Var2, d7Var3, d7Var4, d7Var5};
    }

    public static d7 valueOf(String str) {
        return (d7) Enum.valueOf(d7.class, str);
    }

    public static d7[] values() {
        return (d7[]) a.clone();
    }
}
