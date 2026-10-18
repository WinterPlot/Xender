package com.userlabs.xshare.playlist.fragment.viewmodel;

import kotlin.coroutines.CombinedContext;
import kotlin.jvm.functions.p;
import kotlinx.coroutines.e0;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements p {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return PLAllAudioViewModel.lambda$insertSeparators$4((com.userlabs.xshare.arch.db.entity.h) obj, (com.userlabs.xshare.arch.db.entity.h) obj2);
            case 1:
                return CombinedContext.toString$lambda$0((String) obj, (kotlin.coroutines.g.b) obj2);
            case 2:
                return kotlin.coroutines.g.a.plus$lambda$0((kotlin.coroutines.g) obj, (kotlin.coroutines.g.b) obj2);
            case 3:
                return Boolean.valueOf(e0.hasCopyableElements$lambda$0(((Boolean) obj).booleanValue(), (kotlin.coroutines.g.b) obj2));
            case 4:
                return ((kotlin.coroutines.g) obj).plus((kotlin.coroutines.g.b) obj2);
            default:
                return Integer.valueOf(SafeCollector.collectContextSize$lambda$0(((Integer) obj).intValue(), (kotlin.coroutines.g.b) obj2));
        }
    }
}
