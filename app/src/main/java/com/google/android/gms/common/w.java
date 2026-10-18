package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
abstract class w extends t {
    private static final WeakReference c = new WeakReference(null);
    private WeakReference b;

    public w(byte[] bArr) {
        super(bArr);
        this.b = c;
    }

    public abstract byte[] zzb();

    @Override // com.google.android.gms.common.t
    public final byte[] zzc() {
        byte[] bArrZzb;
        synchronized (this) {
            try {
                bArrZzb = (byte[]) this.b.get();
                if (bArrZzb == null) {
                    bArrZzb = zzb();
                    this.b = new WeakReference(bArrZzb);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrZzb;
    }
}
