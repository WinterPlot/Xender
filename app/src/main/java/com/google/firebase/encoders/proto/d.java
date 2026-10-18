package com.google.firebase.encoders.proto;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements com.google.firebase.encoders.d {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i) {
        this.a = i;
    }

    @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
    public final void encode(Object obj, com.google.firebase.encoders.e eVar) throws IOException {
        switch (this.a) {
            case 0:
                e.lambda$static$0((Map.Entry) obj, eVar);
                break;
            default:
                f.a.lambda$static$0(obj, eVar);
                break;
        }
    }
}
