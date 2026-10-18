package com.google.firebase.components;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements com.google.firebase.inject.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComponentRegistrar b;

    public /* synthetic */ h(ComponentRegistrar componentRegistrar, int i) {
        this.a = i;
        this.b = componentRegistrar;
    }

    @Override // com.google.firebase.inject.b
    public final Object get() {
        int i = this.a;
        ComponentRegistrar componentRegistrar = this.b;
        switch (i) {
            case 0:
                return k.lambda$toProviders$1(componentRegistrar);
            default:
                return k.b.lambda$addComponentRegistrar$0(componentRegistrar);
        }
    }
}
