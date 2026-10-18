package com.userlabs.xshare.playlist.dialog.viewmodel;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class PLBaseBottomViewModel extends AndroidViewModel {
    private Object c;

    public PLBaseBottomViewModel(Application application) {
        super(application);
    }

    public Object getListener() {
        return this.c;
    }

    public void setListener(Object obj) {
        this.c = obj;
    }
}
