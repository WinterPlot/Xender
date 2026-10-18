package androidx.media3.ui;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ l(o oVar, int i) {
        this.a = i;
        this.b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        o oVar = this.b;
        switch (i) {
            case 0:
                oVar.updateLayoutForSizeChange();
                break;
            case 1:
                oVar.onLayoutWidthChanged();
                break;
            case 2:
                oVar.showAllBars();
                break;
            case 3:
                oVar.hideAllBars();
                break;
            case 4:
                oVar.hideProgressBar();
                break;
            case 5:
                oVar.hideMainBar();
                break;
            default:
                oVar.hideController();
                break;
        }
    }
}
