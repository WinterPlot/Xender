package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes2.dex */
public final class f7 {
    public static final f7 DOUBLE_VALUE;
    public static final f7 INT_VALUE;
    public static final f7 LONG_VALUE;
    public static final f7 REFERENCE;
    public static final /* synthetic */ f7[] a;

    static {
        f7 f7Var = new f7("REFERENCE", 0);
        REFERENCE = f7Var;
        f7 f7Var2 = new f7("INT_VALUE", 1);
        INT_VALUE = f7Var2;
        f7 f7Var3 = new f7("LONG_VALUE", 2);
        LONG_VALUE = f7Var3;
        f7 f7Var4 = new f7("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = f7Var4;
        a = new f7[]{f7Var, f7Var2, f7Var3, f7Var4};
    }

    public static f7 valueOf(String str) {
        return (f7) Enum.valueOf(f7.class, str);
    }

    public static f7[] values() {
        return (f7[]) a.clone();
    }
}
