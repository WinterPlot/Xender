package androidx.core.util;

import androidx.camera.camera2.adapter.b0;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements k {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;
    public final /* synthetic */ k c;

    public /* synthetic */ j(k kVar, k kVar2, int i) {
        this.a = i;
        this.b = kVar;
        this.c = kVar2;
    }

    @Override // androidx.core.util.k
    public final k and(k kVar) {
        int i = 1;
        switch (this.a) {
            case 0:
                Objects.requireNonNull(kVar);
                break;
            default:
                Objects.requireNonNull(kVar);
                break;
        }
        return new j(this, kVar, i);
    }

    @Override // androidx.core.util.k
    public final k negate() {
        switch (this.a) {
            case 0:
                break;
        }
        return new b0(this, 5);
    }

    @Override // androidx.core.util.k
    public final k or(k kVar) {
        int i = 0;
        switch (this.a) {
            case 0:
                Objects.requireNonNull(kVar);
                break;
            default:
                Objects.requireNonNull(kVar);
                break;
        }
        return new j(this, kVar, i);
    }

    @Override // androidx.core.util.k
    public final boolean test(Object obj) {
        int i = this.a;
        k kVar = this.c;
        k kVar2 = this.b;
        switch (i) {
            case 0:
                return kVar2.test(obj) || kVar.test(obj);
            default:
                return kVar2.test(obj) && kVar.test(obj);
        }
    }
}
