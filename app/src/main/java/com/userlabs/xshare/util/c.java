package com.userlabs.xshare.util;

import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.io.File;
import java.util.function.Predicate;
import org.apache.commons.io.file.StandardDeleteOption;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
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
        switch (this.a) {
            case 0:
                return Objects.nonNull(obj);
            case 1:
                return ((File) obj).exists();
            case 2:
                return org.apache.commons.io.file.n.lambda$overrideReadOnly$3((org.apache.commons.io.file.f) obj);
            default:
                return StandardDeleteOption.lambda$overrideReadOnly$0((org.apache.commons.io.file.f) obj);
        }
    }
}
