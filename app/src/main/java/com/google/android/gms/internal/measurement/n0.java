package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class n0 {
    private final h a;
    private int b = 0;
    private int c = -1;

    public n0(h hVar) {
        r0.zza(hVar, "context");
        this.a = hVar;
    }

    public abstract void zzb(int i, int i2, i0 i0Var);

    public abstract Object zzg();

    public final o0 zzh() {
        return this.a.zza();
    }

    public final String zzi() {
        return this.a.zzb();
    }

    public final int zzj() {
        return this.c + 1;
    }

    public final void zzk(int i, int i2, i0 i0Var) {
        if (i0Var.zzc() < 32) {
            this.b |= 1 << i0Var.zzc();
        }
        this.c = Math.max(this.c, i0Var.zzc());
        zzb(i, i2, i0Var);
    }

    public final Object zzl() {
        h hVar = this.a;
        hVar.zza().zzc(this);
        int i = this.b;
        if (((i + 1) & i) != 0 || (this.c > 31 && i != -1)) {
            throw zzabo.zzd(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i))), hVar.zzb());
        }
        return zzg();
    }
}
