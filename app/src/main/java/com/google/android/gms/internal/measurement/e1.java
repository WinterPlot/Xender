package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final class e1 {
    public int a;
    public long b;
    public Object c;
    public final z1 d;
    public int e;

    public e1() {
        z1 z1Var = z1.c;
        int i = d1.a;
        this.d = z1.c;
    }

    public static /* synthetic */ String zza(int i, int i2, byte b, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + b + String.valueOf(i).length());
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }

    public e1(z1 z1Var) {
        z1Var.getClass();
        this.d = z1Var;
    }
}
