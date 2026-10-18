package com.userlabs.xshare.obb;

import androidx.lifecycle.h0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class m {
    private final h0<n> a;

    public m(h0<n> h0Var) {
        this.a = h0Var;
        h0Var.postValue(new n("com.userlabs.xshare@null", "", 0));
    }

    public static boolean isImporting(int i) {
        return i == 1;
    }

    public static boolean isNormal(int i) {
        return i == 0;
    }

    public static boolean isSuccess(int i) {
        return i == 2;
    }

    public void importFailed(String str, String str2) {
        this.a.postValue(new n(str, str2, 0));
    }

    public void importSuccess(String str) {
        n nVar = new n(str, "", 2);
        nVar.setResCompleteCount(0);
        nVar.setResTotalCount(0);
        this.a.postValue(nVar);
    }

    public void startImport(String str) {
        this.a.postValue(new n(str, "", 1));
    }

    public void startImport(String str, String str2) {
        this.a.postValue(new n(str, str2, 1));
    }

    public void importSuccess(String str, String str2, int i, int i2) {
        n nVar = new n(str, str2, 2);
        nVar.setResCompleteCount(i2);
        nVar.setResTotalCount(i);
        this.a.postValue(nVar);
    }
}
