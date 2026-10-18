package com.userlabs.xshare.dbwriter.app;

import android.content.pm.PackageInfo;
import com.userlabs.xshare.arch.repository.y;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements f.b, y {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(f fVar, boolean z) {
        this.b = fVar;
        this.a = z;
    }

    @Override // com.userlabs.xshare.dbwriter.app.f.b
    public boolean accept(PackageInfo packageInfo) {
        return f.lambda$doWork$0(this.a, (List) this.b, packageInfo);
    }

    @Override // com.userlabs.xshare.arch.repository.y
    public void onResult(boolean z) {
        ((f) this.b).lambda$doWork$1(this.a, z);
    }

    public /* synthetic */ d(boolean z, List list) {
        this.a = z;
        this.b = list;
    }
}
