package com.google.android.material.search;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ i(SearchView searchView, int i) {
        this.a = i;
        this.b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        SearchView searchView = this.b;
        switch (i) {
            case 0:
                searchView.lambda$clearFocusAndHideKeyboard$11();
                break;
            case 1:
                searchView.lambda$requestFocusAndShowKeyboard$10();
                break;
            case 2:
                searchView.show();
                break;
            case 3:
                searchView.lambda$requestFocusAndShowKeyboardIfNeeded$9();
                break;
            default:
                searchView.requestFocusAndShowKeyboardIfNeeded();
                break;
        }
    }
}
