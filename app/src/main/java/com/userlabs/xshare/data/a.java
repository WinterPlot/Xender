package com.userlabs.xshare.data;

import com.userlabs.xshare.arch.entry.b;
import com.userlabs.xshare.connection.ConnectionConstant;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    private int a;
    private ConnectionConstant.DIALOG_STATE b;
    private boolean c;
    private b<Boolean> d;

    public a(int i, ConnectionConstant.DIALOG_STATE dialog_state) {
        this.a = i;
        this.b = dialog_state;
    }

    public boolean canShow() {
        return this.a == 0 && ConnectionConstant.isNormal(this.b) && !this.c;
    }

    public ConnectionConstant.DIALOG_STATE getDialogState() {
        return this.b;
    }

    public int getSelectCount() {
        return this.a;
    }

    public boolean hasOrder() {
        b<Boolean> bVar = this.d;
        return bVar != null && Boolean.TRUE.equals(bVar.getData());
    }

    public void newOrder() {
        this.d = new b<>(Boolean.TRUE);
    }

    public void setDialogState(ConnectionConstant.DIALOG_STATE dialog_state) {
        this.b = dialog_state;
    }

    public void setNormal2BeSending(boolean z) {
        this.c = z;
    }

    public void setSelectCount(int i) {
        this.a = i;
    }
}
