package com.userlabs.xshare.core.progress;

import com.userlabs.xshare.arch.db.entity.l;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    private boolean a;
    private boolean b;
    private boolean c;
    private l d;
    private boolean e;
    private boolean f;
    private List<l> g;
    private int h;

    public a(l lVar, boolean z, boolean z2) {
        this.c = false;
        this.f = false;
        this.d = lVar;
        this.e = z;
        this.h = lVar.getStatus();
        this.b = lVar.isPause();
        this.a = lVar.getC_direction() == 0;
        this.c = z2;
    }

    public l getInformation() {
        return this.d;
    }

    public List<l> getInformationsNeedCancelAll() {
        return this.g;
    }

    public int getStatus() {
        return this.h;
    }

    public boolean isCancelAll() {
        return this.f;
    }

    public boolean isCanceled() {
        return this.c;
    }

    public boolean isFailureTypeNoSpace() {
        l lVar = this.d;
        return lVar != null && lVar.getFailure_type() == -201;
    }

    public boolean isPause() {
        return this.b;
    }

    public boolean isReceiveFile() {
        return this.a;
    }

    public boolean isReceiving() {
        return this.h == 1;
    }

    public boolean isSending() {
        return this.h == 4;
    }

    public boolean isStatChanged() {
        return this.e;
    }

    public boolean isTransferFailed() {
        return this.h == 3;
    }

    public boolean isTransferring() {
        int i = this.h;
        return i == 1 || i == 4;
    }

    public void setCancelAll(boolean z) {
        this.f = z;
    }

    public void setInformationsNeedCancelAll(List<l> list) {
        this.g = list;
    }

    public a(l lVar, boolean z) {
        this(lVar, z, false);
    }
}
