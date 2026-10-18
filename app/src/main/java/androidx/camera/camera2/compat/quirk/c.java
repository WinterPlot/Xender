package androidx.camera.camera2.compat.quirk;

import androidx.camera.core.c2;
import androidx.camera.core.impl.j2;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements androidx.core.util.b {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    @Override // androidx.core.util.b
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                d._init_$lambda$0((j2) obj);
                break;
            case 1:
                c2.featureSelectionListener$lambda$0((Set) obj);
                break;
            case 2:
                androidx.camera.core.internal.compat.quirk.a.lambda$static$0((j2) obj);
                break;
            case 3:
                androidx.camera.video.internal.compat.quirk.a.lambda$static$0((j2) obj);
                break;
            default:
                androidx.camera.view.internal.compat.quirk.a.lambda$static$0((j2) obj);
                break;
        }
    }
}
