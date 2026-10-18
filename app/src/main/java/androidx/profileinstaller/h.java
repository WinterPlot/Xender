package androidx.profileinstaller;

import android.content.Context;
import com.userlabs.xshare.worker.OneTimeComeInWorker;
/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ h(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                ProfileInstallerInitializer.writeInBackground(context);
                break;
            case 1:
                f.writeProfile(context);
                break;
            case 2:
                com.userlabs.xshare.invite.a.lambda$shareSocial$0(context);
                break;
            case 3:
                OneTimeComeInWorker.lambda$exeRunTaskWhenConnectionChangedToConnected$0(context);
                break;
            default:
                TTIdentifierFactory.lambda$updateAdIdInfo$0(context);
                break;
        }
    }
}
