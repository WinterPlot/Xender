package com.userlabs.xshare.dbwriter;

import com.userlabs.xshare.arch.repository.y;
import com.userlabs.xshare.core.log.h;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements Runnable {
    protected y a;

    public abstract void doWork();

    public void onTableWriteFinished(boolean z) {
        y yVar = this.a;
        if (yVar != null) {
            yVar.onResult(z);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            doWork();
        } catch (Throwable th) {
            if (h.a) {
                if ((th instanceof IllegalStateException) || (th instanceof IllegalArgumentException)) {
                    h.d("base_db_updater", "no need update", th);
                } else {
                    h.e("base_db_updater", "db update work failure", th);
                }
            }
            onTableWriteFinished(false);
        }
    }

    public void setCallback(y yVar) {
        this.a = yVar;
    }
}
