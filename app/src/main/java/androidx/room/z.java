package androidx.room;

import androidx.navigation.m0;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class z {
    private final String a;
    private final kotlin.jvm.functions.l<androidx.sqlite.d, kotlin.y> b;

    public z(String str, kotlin.jvm.functions.l<? super androidx.sqlite.d, kotlin.y> lVar) {
        str.getClass();
        lVar.getClass();
        this.a = str;
        this.b = new y(0, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.y _init_$lambda$0(androidx.sqlite.d dVar) {
        dVar.getClass();
        return kotlin.y.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.y bindingFunction$lambda$1(kotlin.jvm.functions.l lVar, androidx.sqlite.d dVar) {
        dVar.getClass();
        lVar.invoke(new c(dVar));
        return kotlin.y.a;
    }

    public final kotlin.jvm.functions.l<androidx.sqlite.d, kotlin.y> getBindingFunction() {
        return this.b;
    }

    public final String getSql() {
        return this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        str.getClass();
    }

    public /* synthetic */ z(String str, kotlin.jvm.functions.l lVar, int i, r rVar) {
        this(str, (i & 2) != 0 ? new m0(21) : lVar);
    }
}
