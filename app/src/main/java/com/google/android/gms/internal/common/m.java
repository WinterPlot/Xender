package com.google.android.gms.internal.common;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m {
    public static Object zza(Class cls, String str, l... lVarArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return zzc(cls, "isIsolated", null, false, lVarArr);
    }

    public static Object zzb(String str, String str2, ClassLoader classLoader, l... lVarArr) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return zzc(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", null, false, lVarArr);
    }

    private static Object zzc(Class cls, String str, Object obj, boolean z, l... lVarArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        int length = lVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i = 0; i < lVarArr.length; i++) {
            l lVar = lVarArr[i];
            lVar.getClass();
            clsArr[i] = lVar.zzc();
            objArr[i] = lVarArr[i].zzd();
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }
}
