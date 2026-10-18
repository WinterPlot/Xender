package com.userlabs.xshare.audioplayer.exo.ui;

import android.widget.CompoundButton;
import com.userlabs.xshare.connection.CreateFragment;
import com.userlabs.xshare.ui.fragment.settings.NotificationToolbarSettingsFragment;
import com.google.android.material.chip.Chip;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((XMpEqualizerFragment) obj).lambda$initToolbar$1(compoundButton, z);
                break;
            case 1:
                ((CreateFragment) obj).lambda$addHighSpeedLayoutIfSupport$29(compoundButton, z);
                break;
            case 2:
                ((NotificationToolbarSettingsFragment) obj).lambda$onViewCreated$1(compoundButton, z);
                break;
            default:
                ((Chip) obj).lambda$new$0(compoundButton, z);
                break;
        }
    }
}
