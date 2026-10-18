package androidx.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a2 implements com.google.common.base.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;

    public /* synthetic */ a2(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = i;
    }

    @Override // com.google.common.base.e
    public final Object apply(Object obj) {
        int i = this.a;
        int i2 = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((e2) obj2).lambda$increaseVolume$6(i2, (e2.c) obj);
            case 1:
                return ((e2) obj2).lambda$decreaseVolume$8(i2, (e2.c) obj);
            case 2:
                return ((e2) obj2).lambda$setStreamType$2(i2, (e2.c) obj);
            default:
                return ((l0) obj2).lambda$setAudioSessionId$14(i2, (Integer) obj);
        }
    }
}
