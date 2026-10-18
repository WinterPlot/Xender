package com.userlabs.xshare.utils;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements FilenameFilter {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.a) {
            case 0:
                return b.lambda$getBundleSupport32Api$1(file, str);
            case 1:
                return com.userlabs.xshare.worker.task.b.lambda$clearBluetoothShareFile$1(file, str);
            case 2:
                return com.google.firebase.crashlytics.internal.persistence.a.lambda$static$1(file, str);
            default:
                return com.google.firebase.crashlytics.internal.persistence.a.isNormalPriorityEventFile(file, str);
        }
    }
}
