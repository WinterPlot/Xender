package com.google.android.gms.internal.gcm;

/* JADX INFO: loaded from: classes5.dex */
final class p extends m {
    private final n b = new n();

    @Override // com.google.android.gms.internal.gcm.m
    public final void zzd(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        if (th2 != null) {
            this.b.zzd(th, true).add(th2);
        } else {
            com.google.gson.internal.a.j("The suppressed exception cannot be null.");
        }
    }
}
