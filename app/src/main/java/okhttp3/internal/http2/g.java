package okhttp3.internal.http2;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g implements kotlin.jvm.functions.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ErrorCode d;

    public /* synthetic */ g(i iVar, int i, ErrorCode errorCode, int i2) {
        this.a = i2;
        this.b = iVar;
        this.c = i;
        this.d = errorCode;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        int i = this.a;
        ErrorCode errorCode = this.d;
        int i2 = this.c;
        i iVar = this.b;
        switch (i) {
            case 0:
                return i.writeSynResetLater$lambda$0(iVar, i2, errorCode);
            default:
                return i.pushResetLater$lambda$0(iVar, i2, errorCode);
        }
    }
}
