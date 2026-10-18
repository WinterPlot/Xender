package com.userlabs.xshare.contacts;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements FileFilter {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ e(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        switch (this.a) {
            case 0:
                return f.lambda$clearReceiverExpired$2(this.b, file);
            default:
                return f.lambda$clearSenderExpired$1(this.b, file);
        }
    }
}
