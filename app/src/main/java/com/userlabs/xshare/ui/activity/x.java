package com.userlabs.xshare.ui.activity;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsActivity b;

    public /* synthetic */ x(SettingsActivity settingsActivity, int i) {
        this.a = i;
        this.b = settingsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        SettingsActivity settingsActivity = this.b;
        switch (i) {
            case 0:
                settingsActivity.lambda$showStorageDialog$6();
                break;
            default:
                settingsActivity.handleChangeDownloadLocationIntent();
                break;
        }
    }
}
