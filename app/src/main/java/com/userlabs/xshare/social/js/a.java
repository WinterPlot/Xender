package com.userlabs.xshare.social.js;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements FilenameFilter {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ a(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        int i = this.a;
        String str2 = this.b;
        switch (i) {
            case 0:
                return b.lambda$getServerJsPathByCateSync$0(str2, file, str);
            default:
                return com.google.firebase.crashlytics.internal.persistence.b.lambda$cleanupFileSystemDirs$0(str2, file, str);
        }
    }
}
