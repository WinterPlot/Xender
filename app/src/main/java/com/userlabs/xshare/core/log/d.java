package com.userlabs.xshare.core.log;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements FileFilter {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i) {
        this.a = i;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        switch (this.a) {
            case 0:
                return g.lambda$getLogFiles$1(file);
            default:
                return com.userlabs.xshare.worker.task.b.lambda$clearDirTempFileByDirPath$0(file);
        }
    }
}
