package com.userlabs.xshare.core.ap;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class b {
    private final int a;
    final j b;
    private boolean c;

    private b(int i, j jVar) {
        this.a = i;
        this.b = jVar;
    }

    public static b apEnabled25Event(j jVar) {
        return new b(4, jVar);
    }

    public static b cancelEvent(j jVar) {
        return new b(5, jVar);
    }

    public static b errorEvent(j jVar) {
        return new b(1, jVar);
    }

    public static b offEvent(j jVar) {
        return new b(2, jVar);
    }

    public static b okEvent(j jVar) {
        return new b(0, jVar);
    }

    public static b p2pErrorEvent(j jVar) {
        return new b(1, jVar);
    }

    public static b p2pOkEvent(j jVar) {
        return new b(0, jVar);
    }

    public static b save25ConfigEvent(j jVar) {
        return new b(3, jVar);
    }

    public String getApName() {
        j jVar = this.b;
        return jVar != null ? jVar.getSsid() : "";
    }

    public String getApPwd() {
        j jVar = this.b;
        return jVar != null ? jVar.getPassword() : "";
    }

    public j getConfig() {
        return this.b;
    }

    public String getGroupIp() {
        j jVar = this.b;
        return jVar != null ? jVar.getIp() : "";
    }

    public int getRequestCode() {
        j jVar = this.b;
        if (jVar != null) {
            return jVar.getRequestCode();
        }
        return -111;
    }

    public int getType() {
        return this.a;
    }

    public boolean is5GHzGroup() {
        j jVar = this.b;
        return jVar != null && jVar.isHighSpeed();
    }

    public boolean isManualClose() {
        return this.c;
    }

    public boolean isNeedChangeGroupModel() {
        j jVar = this.b;
        if (jVar != null) {
            return jVar.isNeedChangeGroupModel();
        }
        return false;
    }

    public boolean isWifiDirectModel() {
        j jVar = this.b;
        return jVar != null ? jVar.isWifiDirectModel() : j.b.isWifiDirectModel();
    }

    public b manualClose(boolean z) {
        this.c = z;
        return this;
    }

    public boolean needUseCustomServer() {
        j jVar = this.b;
        if (jVar != null) {
            return jVar.needUseCustomServer();
        }
        return true;
    }

    public String toString() {
        return defpackage.a.q(new StringBuilder("CreateApEvent{type="), this.a, '}');
    }
}
