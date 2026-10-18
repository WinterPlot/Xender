package com.google.android.play.core.hsdp.protocol;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public interface h extends IInterface {
    void zzc(String str, String str2, Bundle bundle, j jVar) throws RemoteException;

    void zzd(Bundle bundle, j jVar) throws RemoteException;

    void zze(String str, List list, l lVar) throws RemoteException;

    void zzf(String str, String str2, String str3, Bundle bundle, j jVar) throws RemoteException;
}
