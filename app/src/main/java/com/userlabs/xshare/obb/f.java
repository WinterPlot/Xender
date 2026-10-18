package com.userlabs.xshare.obb;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements FileFilter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ f(int i, String str, int i2) {
        this.a = i2;
        this.b = i;
        this.c = str;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        switch (this.a) {
            case 0:
                return g.lambda$hasObb$2(this.b, this.c, file);
            default:
                return g.lambda$getImportObb$1(this.b, this.c, file);
        }
    }
}
