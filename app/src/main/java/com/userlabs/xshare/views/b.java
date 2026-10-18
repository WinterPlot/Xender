package com.userlabs.xshare.views;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ConnectLayout.lambda$connectFailed$0((ConnectLayout.c) obj, view);
                break;
            case 1:
                ((NewFloatingActionButton) obj).lambda$setOnClickListener$0(view);
                break;
            case 2:
                g.lambda$init$0((Context) obj, view);
                break;
            case 3:
                ((g) obj).lambda$init$1(view);
                break;
            default:
                ((SimpleMediaController) obj).lambda$new$0(view);
                break;
        }
    }
}
