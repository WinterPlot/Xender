package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public class a {
    private final String a;
    private final int b;
    private final int c;
    private final int d;
    private final Integer e;
    private final int f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final PendingIntent k;
    private final PendingIntent l;
    private final PendingIntent m;
    private final PendingIntent n;
    private final Map o;
    private boolean p = false;

    private a(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = num;
        this.f = i4;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = j4;
        this.k = pendingIntent;
        this.l = pendingIntent2;
        this.m = pendingIntent3;
        this.n = pendingIntent4;
        this.o = map;
    }

    public static a zzb(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        return new a(str, i, i2, i3, num, i4, j, j2, j3, j4, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map);
    }

    private static Set zze(Set set) {
        return set == null ? new HashSet() : set;
    }

    private final boolean zzf(d dVar) {
        return dVar.allowAssetPackDeletion() && this.i <= this.j;
    }

    public int availableVersionCode() {
        return this.b;
    }

    public long bytesDownloaded() {
        return this.g;
    }

    public Integer clientVersionStalenessDays() {
        return this.e;
    }

    public Set<Integer> getFailedUpdatePreconditions(d dVar) {
        if (dVar.allowAssetPackDeletion()) {
            int iAppUpdateType = dVar.appUpdateType();
            Map map = this.o;
            return iAppUpdateType == 0 ? zze((Set) map.get("nonblocking.destructive.intent")) : zze((Set) map.get("blocking.destructive.intent"));
        }
        int iAppUpdateType2 = dVar.appUpdateType();
        Map map2 = this.o;
        return iAppUpdateType2 == 0 ? zze((Set) map2.get("nonblocking.intent")) : zze((Set) map2.get("blocking.intent"));
    }

    public int installStatus() {
        return this.d;
    }

    public boolean isUpdateTypeAllowed(int i) {
        return zza(d.defaultOptions(i)) != null;
    }

    public String packageName() {
        return this.a;
    }

    public long totalBytesToDownload() {
        return this.h;
    }

    public int updateAvailability() {
        return this.c;
    }

    public int updatePriority() {
        return this.f;
    }

    public final PendingIntent zza(d dVar) {
        if (dVar.appUpdateType() == 0) {
            PendingIntent pendingIntent = this.l;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (zzf(dVar)) {
                return this.n;
            }
            return null;
        }
        if (dVar.appUpdateType() == 1) {
            PendingIntent pendingIntent2 = this.k;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (zzf(dVar)) {
                return this.m;
            }
        }
        return null;
    }

    public final void zzc() {
        this.p = true;
    }

    public final boolean zzd() {
        return this.p;
    }

    public boolean isUpdateTypeAllowed(d dVar) {
        return zza(dVar) != null;
    }
}
