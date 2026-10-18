package com.userlabs.xshare.obb;

import android.app.Activity;
import android.content.DialogInterface;
import com.userlabs.xshare.playlist.fragment.PLTabAllAudioEditFragment;
import com.userlabs.xshare.ui.fragment.XShareMainFragment;
import com.userlabs.xshare.ui.imageBrowser.SocialBrowserFragment;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                ((ObbImportDialogFragment) obj2).lambda$showConfirmDeleteDialog$6((ObbImportItem) obj, dialogInterface, i);
                break;
            case 1:
                ((PLTabAllAudioEditFragment) obj2).lambda$showConfirmDeleteDialog$8((List) obj, dialogInterface, i);
                break;
            case 2:
                ((com.userlabs.xshare.storage.d) obj2).lambda$showStorageDialog$3((Runnable) obj, dialogInterface, i);
                break;
            case 3:
                ((XShareMainFragment) obj2).lambda$showRangeTransferDialog$47((List) obj, dialogInterface, i);
                break;
            case 4:
                ((SocialBrowserFragment) obj2).lambda$showDeleteDialog$4((String) obj, dialogInterface, i);
                break;
            default:
                com.userlabs.xshare.upgrade.f.lambda$showFriendsUpdateDlg$3((Activity) obj2, (String) obj, dialogInterface, i);
                break;
        }
    }
}
