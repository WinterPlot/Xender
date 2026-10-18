package androidx.camera.core.processing;

import androidx.camera.core.h1;
import androidx.camera.core.i1;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class n implements h1.a {
    private final i1 a;
    private final int b;

    public n(i1 i1Var, int i) {
        this.a = i1Var;
        this.b = i;
    }

    @Override // androidx.camera.core.h1.a
    public i1 getInputImage() {
        return this.a;
    }

    @Override // androidx.camera.core.h1.a
    public int getOutputFormat() {
        return this.b;
    }
}
