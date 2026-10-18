package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.impl.CapturePipelineImpl;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements kotlin.jvm.functions.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.camera.camera2.impl.q b;

    public /* synthetic */ e(androidx.camera.camera2.impl.q qVar, int i) {
        this.a = i;
        this.b = qVar;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        boolean zIsLegacyDevice_delegate$lambda$0;
        int i = this.a;
        androidx.camera.camera2.impl.q qVar = this.b;
        switch (i) {
            case 0:
                zIsLegacyDevice_delegate$lambda$0 = CapturePipelineTorchCorrection.isLegacyDevice_delegate$lambda$0(qVar);
                break;
            default:
                zIsLegacyDevice_delegate$lambda$0 = CapturePipelineImpl.hasFlashUnit_delegate$lambda$0(qVar);
                break;
        }
        return Boolean.valueOf(zIsLegacyDevice_delegate$lambda$0);
    }
}
