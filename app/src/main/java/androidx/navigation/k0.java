package androidx.navigation;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ k0(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        boolean matchingArguments$lambda$13;
        int i = this.a;
        Bundle bundle = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                matchingArguments$lambda$13 = l0.getMatchingArguments$lambda$13(bundle, str);
                break;
            default:
                matchingArguments$lambda$13 = androidx.navigation.internal.k.hasRequiredArguments$lambda$7(bundle, str);
                break;
        }
        return Boolean.valueOf(matchingArguments$lambda$13);
    }
}
