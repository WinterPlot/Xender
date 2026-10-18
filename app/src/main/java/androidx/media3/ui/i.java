package androidx.media3.ui;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((PlayerControlView.b) obj).lambda$onBindViewHolderAtZeroPosition$0(view);
                break;
            case 1:
                ((PlayerControlView.g) obj).lambda$new$0(view);
                break;
            case 2:
                ((PlayerControlView.j) obj).lambda$onBindViewHolderAtZeroPosition$0(view);
                break;
            case 3:
                ((o) obj).onOverflowButtonClick(view);
                break;
            default:
                ((PlayerControlView) obj).onFullscreenButtonClicked(view);
                break;
        }
    }
}
