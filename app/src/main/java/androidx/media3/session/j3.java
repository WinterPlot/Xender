package androidx.media3.session;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j3 implements com.google.common.base.u {
    public final /* synthetic */ int a;

    public /* synthetic */ j3(int i) {
        this.a = i;
    }

    @Override // com.google.common.base.u
    public final Object get() {
        int mediaMetadataBitmapMaxSize;
        switch (this.a) {
            case 0:
                mediaMetadataBitmapMaxSize = k3.getMediaMetadataBitmapMaxSize();
                break;
            default:
                mediaMetadataBitmapMaxSize = o.getMaxNotificationIconSize();
                break;
        }
        return Integer.valueOf(mediaMetadataBitmapMaxSize);
    }
}
