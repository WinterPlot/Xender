package kotlin.io.path;

import java.nio.file.Path;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o implements kotlin.jvm.functions.q {
    public final /* synthetic */ int a;

    public /* synthetic */ o(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Path path = (Path) obj;
        Path path2 = (Path) obj2;
        Exception exc = (Exception) obj3;
        switch (this.a) {
            case 0:
                return PathsKt__PathRecursiveFunctionsKt.copyToRecursively$lambda$2$PathsKt__PathRecursiveFunctionsKt(path, path2, exc);
            default:
                return PathsKt__PathRecursiveFunctionsKt.copyToRecursively$lambda$0$PathsKt__PathRecursiveFunctionsKt(path, path2, exc);
        }
    }
}
