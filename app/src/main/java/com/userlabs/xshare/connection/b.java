package com.userlabs.xshare.connection;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class b {
    private ConnectionConstant.DIALOG_STATE a;
    private ConnectionConstant.DIALOG_STATE b;

    public b() {
        ConnectionConstant.DIALOG_STATE dialog_state = ConnectionConstant.DIALOG_STATE.NORMAL;
        this.a = dialog_state;
        this.b = dialog_state;
    }

    public ConnectionConstant.DIALOG_STATE getNewState() {
        return this.b;
    }

    public ConnectionConstant.DIALOG_STATE getOldState() {
        return this.a;
    }

    public boolean set2NewState(ConnectionConstant.DIALOG_STATE dialog_state) {
        if (!o.matchState(this.b, dialog_state)) {
            return false;
        }
        this.a = this.b;
        this.b = dialog_state;
        return true;
    }

    public b(b bVar) {
        ConnectionConstant.DIALOG_STATE dialog_state = bVar.b;
        this.a = dialog_state;
        this.b = dialog_state;
    }
}
