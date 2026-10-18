package kotlin.io;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ i(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        ArrayList arrayList = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                return j.readLines$lambda$0$FilesKt__FileReadWriteKt(arrayList, str);
            default:
                return q.readLines$lambda$0(arrayList, str);
        }
    }
}
