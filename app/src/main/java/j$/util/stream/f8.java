package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes2.dex */
public final class f8 {
    public static final f8 MAYBE_MORE;
    public static final f8 NO_MORE;
    public static final f8 UNLIMITED;
    public static final /* synthetic */ f8[] a;

    static {
        f8 f8Var = new f8("NO_MORE", 0);
        NO_MORE = f8Var;
        f8 f8Var2 = new f8("MAYBE_MORE", 1);
        MAYBE_MORE = f8Var2;
        f8 f8Var3 = new f8("UNLIMITED", 2);
        UNLIMITED = f8Var3;
        a = new f8[]{f8Var, f8Var2, f8Var3};
    }

    public static f8 valueOf(String str) {
        return (f8) Enum.valueOf(f8.class, str);
    }

    public static f8[] values() {
        return (f8[]) a.clone();
    }
}
