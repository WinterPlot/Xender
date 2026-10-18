package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final class q4 extends s4 {
    public q4(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.s4
    public final void zza(Object obj, long j, byte b) {
        if (t4.g) {
            t4.zzC(obj, j, b);
        } else {
            t4.zzD(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.measurement.s4
    public final boolean zzb(Object obj, long j) {
        return t4.g ? t4.zzt(obj, j) : t4.zzu(obj, j);
    }

    @Override // com.google.android.gms.internal.measurement.s4
    public final void zzc(Object obj, long j, boolean z) {
        if (t4.g) {
            t4.zzC(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            t4.zzD(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.s4
    public final float zzd(Object obj, long j) {
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.s4
    public final void zze(Object obj, long j, float f) {
        this.a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.measurement.s4
    public final double zzf(Object obj, long j) {
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.s4
    public final void zzg(Object obj, long j, double d) {
        this.a.putLong(obj, j, Double.doubleToLongBits(d));
    }
}
