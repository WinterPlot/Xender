package androidx.media3.muxer;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ o(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        u uVar = (u) obj;
        u uVar2 = (u) obj2;
        switch (this.a) {
            case 0:
                return p.lambda$addAuxiliaryTrack$1(uVar, uVar2);
            default:
                return p.lambda$addTrack$0(uVar, uVar2);
        }
    }
}
