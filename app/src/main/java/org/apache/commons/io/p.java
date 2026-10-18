package org.apache.commons.io;

import j$.util.function.Predicate$CC;
import java.nio.file.spi.FileSystemProvider;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ p(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ Predicate negate() {
        int i = this.a;
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                return str.equals((String) obj);
            case 1:
                return IOCase.lambda$forName$0(str, (IOCase) obj);
            default:
                return org.apache.commons.io.file.spi.a.lambda$getFileSystemProvider$0(str, (FileSystemProvider) obj);
        }
    }
}
