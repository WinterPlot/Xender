package kotlin.io.path;

import java.nio.file.Path;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p implements kotlin.jvm.functions.q {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ p(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        a aVar = (a) obj;
        Path path = (Path) obj2;
        Path path2 = (Path) obj3;
        boolean z = this.b;
        switch (i) {
            case 0:
                return PathsKt__PathRecursiveFunctionsKt.copyToRecursively$lambda$3$PathsKt__PathRecursiveFunctionsKt(z, aVar, path, path2);
            default:
                return PathsKt__PathRecursiveFunctionsKt.copyToRecursively$lambda$1$PathsKt__PathRecursiveFunctionsKt(z, aVar, path, path2);
        }
    }
}
