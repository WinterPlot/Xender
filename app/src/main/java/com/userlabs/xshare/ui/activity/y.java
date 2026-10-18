package com.userlabs.xshare.ui.activity;

import androidx.lifecycle.i0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y implements i0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.lifecycle.i0
    public final void onChanged(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                SettingsActivity.lambda$onCreate$1((SettingsActivity.b) obj2, (String) obj);
                break;
            case 1:
                ((FeedBackActivity) obj2).lambda$onCreate$3((com.userlabs.xshare.event.a) obj);
                break;
            case 2:
                ((LanguageActivity) obj2).lambda$onCreate$0((List) obj);
                break;
            case 3:
                ((MessageActivity) obj2).lambda$subscribeViewModel$1((com.userlabs.xshare.arch.vo.a) obj);
                break;
            case 4:
                ((SettingsActivity) obj2).lambda$onCreate$3((com.userlabs.xshare.arch.entry.b) obj);
                break;
            default:
                ((ShareToWhatsappActivity) obj2).lambda$onCreate$1((com.userlabs.xshare.arch.entry.b) obj);
                break;
        }
    }
}
