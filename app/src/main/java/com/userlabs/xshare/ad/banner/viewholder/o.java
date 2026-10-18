package com.userlabs.xshare.ad.banner.viewholder;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.webkit.WebView;
import com.userlabs.xshare.audioplayer.exo.ui.XMPlayerFragment;
import com.userlabs.xshare.connection.JoinFragment;
import com.userlabs.xshare.importdata.NewPhoneReduplicateFragment;
import com.userlabs.xshare.mppcconnection.ui.MPCConnectingFragment;
import com.userlabs.xshare.social.fragment.XSocialMainFragment;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((p) obj).lambda$setupDialog$0(dialogInterface);
                break;
            case 1:
                ((r) obj).lambda$setupDialog$0(dialogInterface);
                break;
            case 2:
                ((XMPlayerFragment) obj).lambda$showPlayerSettingsDialog$14(dialogInterface);
                break;
            case 3:
                ((JoinFragment) obj).lambda$showStopJoiningDlg$1(dialogInterface);
                break;
            case 4:
                ((NewPhoneReduplicateFragment) obj).lambda$showWaitingDialog$4(dialogInterface);
                break;
            case 5:
                ((MPCConnectingFragment) obj).lambda$childNeedHandBack$7(dialogInterface);
                break;
            case 6:
                ((com.userlabs.xshare.notification.e) obj).lambda$checkNotificationNeedShow$7(dialogInterface);
                break;
            case 7:
                ((ObjectAnimator) obj).cancel();
                break;
            case 8:
                ((com.userlabs.xshare.social.fragment.f) obj).lambda$showErrorDialog$5(dialogInterface);
                break;
            case 9:
                ((XSocialMainFragment) obj).lambda$showNoSpaceLeftDialog$14(dialogInterface);
                break;
            case 10:
                ((com.userlabs.xshare.storage.d) obj).lambda$showStorageDialog$4(dialogInterface);
                break;
            case 11:
                com.userlabs.xshare.ui.activity.webview.d.lambda$createPopupDialog$2((WebView) obj, dialogInterface);
                break;
            case 12:
                com.userlabs.xshare.upgrade.f.lambda$showFriendsUpdateDlg$5((AtomicBoolean) obj, dialogInterface);
                break;
            default:
                ((com.userlabs.xshare.utils.q) obj).lambda$showInstallDialog$0(dialogInterface);
                break;
        }
    }
}
