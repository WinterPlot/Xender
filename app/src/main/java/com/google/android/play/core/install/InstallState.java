package com.google.android.play.core.install;

import android.content.Intent;
import com.google.android.play.core.appupdate.internal.s;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class InstallState {
    public static InstallState zza(int i, long j, long j2, int i2, String str) {
        return new b(i, j, j2, i2, str);
    }

    public static InstallState zzb(Intent intent, s sVar) {
        sVar.zza("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        sVar.zza("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
        sVar.zza("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
        return new b(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
    }

    public abstract long bytesDownloaded();

    public abstract int installErrorCode();

    public abstract int installStatus();

    public abstract String packageName();

    public abstract long totalBytesToDownload();
}
