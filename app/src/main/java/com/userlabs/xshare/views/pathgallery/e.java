package com.userlabs.xshare.views.pathgallery;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PathGallery b;

    public /* synthetic */ e(PathGallery pathGallery, int i) {
        this.a = i;
        this.b = pathGallery;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        PathGallery pathGallery = this.b;
        switch (i) {
            case 0:
                pathGallery.lambda$new$0(view);
                break;
            default:
                pathGallery.lambda$addPathSegmentViews$1(view);
                break;
        }
    }
}
