package com.google.android.material.search;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ h(SearchView searchView, int i) {
        this.a = i;
        this.b = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        SearchView searchView = this.b;
        switch (i) {
            case 0:
                searchView.lambda$setUpBackButton$2(view);
                break;
            case 1:
                searchView.lambda$setUpClearButton$3(view);
                break;
            default:
                searchView.lambda$setupWithSearchBar$8(view);
                break;
        }
    }
}
