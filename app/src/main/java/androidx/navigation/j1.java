package androidx.navigation;

import android.content.Context;
import android.view.View;
import com.userlabs.xshare.audioplayer.exo.dlg.XPitchSelectDialogFragment;
import com.userlabs.xshare.audioplayer.exo.dlg.XSleepSelectDialog;
import com.userlabs.xshare.audioplayer.exo.dlg.XSpeedSelectDialog;
import com.userlabs.xshare.audioplayer.exo.ui.XMpEqualizerFragment;
import com.userlabs.xshare.disconnect.DisconnectFragment;
import com.userlabs.xshare.importdata.ExBaseFragment;
import com.userlabs.xshare.importdata.NewPhoneImportFromFragment;
import com.userlabs.xshare.importdata.NewPhoneQrcodeForIphoneFragment;
import com.userlabs.xshare.importdata.NewPhoneQrcodeFragment;
import com.userlabs.xshare.importdata.NewPhoneReduplicateFragment;
import com.userlabs.xshare.importdata.NewPhoneWaitOldPhoneDownloadMeFragment;
import com.userlabs.xshare.miui.MiPhoneSettingActivity;
import com.userlabs.xshare.mppcconnection.ui.MPCConnectFailedFragment;
import com.userlabs.xshare.mppcconnection.ui.MPCConnectedFragment;
import com.userlabs.xshare.mppcconnection.ui.MPCMainNavFragment;
import com.userlabs.xshare.obb.ObbImportDialogFragment;
import com.userlabs.xshare.playlist.fragment.PLAddSongsFragment;
import com.userlabs.xshare.playlist.fragment.PLPlaylistSongsFragment;
import com.userlabs.xshare.playlist.search.PLAddSongsSearchFragment;
import com.userlabs.xshare.ui.activity.webview.BaseWebViewActivity;
import com.userlabs.xshare.ui.activity.webview.SocialDownloaderActivity;
import com.userlabs.xshare.ui.activity.webview.SocialHelpDialogActivity;
import com.userlabs.xshare.ui.activity.webview.SocialParseActivity;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                l1.createNavigateOnClickListener$lambda$1((u0) obj, view);
                break;
            case 1:
                ((com.userlabs.xshare.ad.banner.viewholder.a) obj).lambda$initAdLayout$0(view);
                break;
            case 2:
                ((com.userlabs.xshare.ad.banner.viewholder.b) obj).lambda$initAdLayout$0(view);
                break;
            case 3:
                ((com.userlabs.xshare.ad.banner.viewholder.u) obj).lambda$addLeftMenuItemAdLayout$0(view);
                break;
            case 4:
                ((com.userlabs.xshare.adapter.photo.c) obj).lambda$setHeaderListener$0(view);
                break;
            case 5:
                ((XPitchSelectDialogFragment) obj).lambda$onViewCreated$0(view);
                break;
            case 6:
                ((XSleepSelectDialog) obj).lambda$onViewCreated$0(view);
                break;
            case 7:
                ((XSpeedSelectDialog) obj).lambda$onViewCreated$0(view);
                break;
            case 8:
                ((XMpEqualizerFragment) obj).lambda$initToolbar$2(view);
                break;
            case 9:
                ((DisconnectFragment) obj).lambda$onViewCreated$0(view);
                break;
            case 10:
                ((ExBaseFragment) obj).lambda$onViewCreated$0(view);
                break;
            case 11:
                ((NewPhoneImportFromFragment) obj).lambda$onViewCreated$0(view);
                break;
            case 12:
                ((NewPhoneQrcodeForIphoneFragment) obj).lambda$onViewCreated$0(view);
                break;
            case 13:
                ((NewPhoneQrcodeFragment) obj).lambda$onViewCreated$0(view);
                break;
            case 14:
                ((NewPhoneReduplicateFragment) obj).lambda$showSnackBar$9(view);
                break;
            case 15:
                ((NewPhoneWaitOldPhoneDownloadMeFragment) obj).lambda$onViewCreated$0(view);
                break;
            case 16:
                ((MiPhoneSettingActivity) obj).lambda$onCreate$0(view);
                break;
            case 17:
                ((androidx.appcompat.app.c) obj).dismiss();
                break;
            case 18:
                com.userlabs.xshare.core.permission.a.gotoWifiAssistant((Context) obj);
                break;
            case 19:
                ((MPCConnectFailedFragment) obj).lambda$onViewCreated$0(view);
                break;
            case 20:
                ((MPCConnectedFragment) obj).lambda$onViewCreated$0(view);
                break;
            case 21:
                ((MPCMainNavFragment) obj).lambda$onViewCreated$1(view);
                break;
            case 22:
                ((ObbImportDialogFragment) obj).lambda$initView$0(view);
                break;
            case 23:
                ((PLAddSongsFragment) obj).lambda$addSearchLayout$2(view);
                break;
            case 24:
                ((PLPlaylistSongsFragment) obj).lambda$addAddSongsView$1(view);
                break;
            case 25:
                ((PLAddSongsSearchFragment) obj).lambda$addToolBar$2(view);
                break;
            case 26:
                ((BaseWebViewActivity) obj).lambda$initViews$1(view);
                break;
            case 27:
                ((SocialDownloaderActivity) obj).lambda$initViews$3(view);
                break;
            case 28:
                ((SocialHelpDialogActivity) obj).lambda$onCreate$0(view);
                break;
            default:
                ((SocialParseActivity) obj).lambda$onCreate$0(view);
                break;
        }
    }
}
