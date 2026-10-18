package j$.util.stream;

import j$.util.Spliterator;
import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes2.dex */
public final class e7 {
    public static final e7 DISTINCT;
    public static final e7 ORDERED;
    public static final e7 SHORT_CIRCUIT;
    public static final e7 SIZED;
    public static final e7 SORTED;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final /* synthetic */ e7[] v;
    public final Map a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    static {
        d7 d7Var = d7.SPLITERATOR;
        j$.util.q qVarM = m(d7Var);
        d7 d7Var2 = d7.STREAM;
        qVarM.a(d7Var2);
        d7 d7Var3 = d7.OP;
        ((EnumMap) ((Map) qVarM.b)).put(d7Var3, 3);
        e7 e7Var = new e7("DISTINCT", 0, 0, qVarM);
        DISTINCT = e7Var;
        j$.util.q qVarM2 = m(d7Var);
        qVarM2.a(d7Var2);
        ((EnumMap) ((Map) qVarM2.b)).put(d7Var3, 3);
        e7 e7Var2 = new e7("SORTED", 1, 1, qVarM2);
        SORTED = e7Var2;
        j$.util.q qVarM3 = m(d7Var);
        qVarM3.a(d7Var2);
        ((EnumMap) ((Map) qVarM3.b)).put(d7Var3, 3);
        d7 d7Var4 = d7.TERMINAL_OP;
        ((EnumMap) ((Map) qVarM3.b)).put(d7Var4, 2);
        d7 d7Var5 = d7.UPSTREAM_TERMINAL_OP;
        ((EnumMap) ((Map) qVarM3.b)).put(d7Var5, 2);
        e7 e7Var3 = new e7("ORDERED", 2, 2, qVarM3);
        ORDERED = e7Var3;
        j$.util.q qVarM4 = m(d7Var);
        qVarM4.a(d7Var2);
        ((EnumMap) ((Map) qVarM4.b)).put(d7Var3, 2);
        e7 e7Var4 = new e7("SIZED", 3, 3, qVarM4);
        SIZED = e7Var4;
        j$.util.q qVarM5 = m(d7Var3);
        qVarM5.a(d7Var4);
        int i2 = 0;
        e7 e7Var5 = new e7("SHORT_CIRCUIT", 4, 12, qVarM5);
        SHORT_CIRCUIT = e7Var5;
        v = new e7[]{e7Var, e7Var2, e7Var3, e7Var4, e7Var5};
        f = g(d7Var);
        g = g(d7Var2);
        h = g(d7Var3);
        g(d7Var4);
        g(d7Var5);
        for (e7 e7Var6 : values()) {
            i2 |= e7Var6.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        e7 e7Var7 = DISTINCT;
        m = e7Var7.c;
        n = e7Var7.d;
        e7 e7Var8 = SORTED;
        o = e7Var8.c;
        p = e7Var8.d;
        e7 e7Var9 = ORDERED;
        q = e7Var9.c;
        r = e7Var9.d;
        e7 e7Var10 = SIZED;
        s = e7Var10.c;
        t = e7Var10.d;
        u = SHORT_CIRCUIT.c;
    }

    public e7(String str, int i2, int i3, j$.util.q qVar) {
        super(str, i2);
        for (d7 d7Var : d7.values()) {
            j$.util.Map.EL.a((Map) qVar.b, d7Var, 0);
        }
        this.a = (Map) qVar.b;
        int i4 = i3 * 2;
        this.b = i4;
        this.c = 1 << i4;
        this.d = 2 << i4;
        this.e = 3 << i4;
    }

    public static int f(int i2, int i3) {
        return i2 | (i3 & (i2 == 0 ? i : ~(((j & i2) << 1) | i2 | ((k & i2) >> 1))));
    }

    public static int g(d7 d7Var) {
        int iIntValue = 0;
        for (e7 e7Var : values()) {
            iIntValue |= ((Integer) ((EnumMap) e7Var.a).get(d7Var)).intValue() << e7Var.b;
        }
        return iIntValue;
    }

    public static int h(Spliterator spliterator) {
        int iCharacteristics = spliterator.characteristics();
        int i2 = iCharacteristics & 4;
        int i3 = f;
        return (i2 == 0 || spliterator.getComparator() == null) ? iCharacteristics & i3 : iCharacteristics & i3 & (-5);
    }

    public static j$.util.q m(d7 d7Var) {
        j$.util.q qVar = new j$.util.q(11, new EnumMap(d7.class));
        qVar.a(d7Var);
        return qVar;
    }

    public static e7 valueOf(String str) {
        return (e7) Enum.valueOf(e7.class, str);
    }

    public static e7[] values() {
        return (e7[]) v.clone();
    }

    public final boolean i(int i2) {
        return (i2 & this.e) == this.c;
    }
}
