package com.userlabs.xshare.cropimage;

import android.graphics.Bitmap;
import com.userlabs.xshare.ui.activity.viewmodel.ShareToWAViewModel;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bitmap b;

    public /* synthetic */ b(Bitmap bitmap, int i) {
        this.a = i;
        this.b = bitmap;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        Bitmap bitmap = this.b;
        switch (i) {
            case 0:
                return CropImageViewModel.lambda$saveBitmapToDisk$1(bitmap);
            default:
                return ShareToWAViewModel.lambda$saveBitmapToDisk$0(bitmap);
        }
    }
}
