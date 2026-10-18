package androidx.room.support;

import com.userlabs.xshare.arch.db.dao.f1;
import com.userlabs.xshare.arch.db.dao.n;
import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements l {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ e(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.setForeignKeyConstraintsEnabled$lambda$12(z, (androidx.sqlite.db.c) obj);
            case 1:
                return n.lambda$getOfferApk$14(z, (androidx.sqlite.b) obj);
            case 2:
                return f1.lambda$loadBigFileCount$8(z, (androidx.sqlite.b) obj);
            case 3:
                return f1.lambda$loadBigFiles$6(z, (androidx.sqlite.b) obj);
            default:
                return f1.lambda$loadTypeAndCount$7(z, (androidx.sqlite.b) obj);
        }
    }
}
