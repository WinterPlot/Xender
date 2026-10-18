package com.userlabs.xshare.upgrade;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class k {
    private final int a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private final boolean f;
    private boolean g;
    private com.google.android.play.core.appupdate.a h;

    public k(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3, com.google.android.play.core.appupdate.a aVar) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = aVar;
    }

    public static k fromUpgradeModel(com.userlabs.xshare.model.a aVar) {
        com.google.android.play.core.appupdate.a aVarCheckAppUpdateInfoAndReturn;
        boolean zHasNewUpgrade = false;
        int upgradeAction = aVar == null ? 0 : aVar.getUpgradeAction();
        String upgradeUrl = aVar != null ? aVar.getUpgradeUrl() : "";
        String umsg = aVar != null ? aVar.getUmsg() : "";
        String md5str = aVar != null ? aVar.getMd5str() : "";
        boolean z = aVar != null && aVar.isCan_ignore();
        boolean z2 = aVar != null && UpgradeUtil.canShowDlgAuto(aVar);
        boolean z3 = aVar != null && aVar.isUse_gp_upgrade_sdk();
        if (1 == upgradeAction && z3) {
            aVarCheckAppUpdateInfoAndReturn = b.checkAppUpdateInfoAndReturn();
            if (aVarCheckAppUpdateInfoAndReturn != null && com.userlabs.xshare.core.log.h.a) {
                com.userlabs.xshare.core.log.h.d("upgrade_s", "gp sdk app update info, updateAvailability: " + aVarCheckAppUpdateInfoAndReturn.updateAvailability() + " FLEXIBLE isAllow " + aVarCheckAppUpdateInfoAndReturn.isUpdateTypeAllowed(0) + " IMMEDIATE isAllow " + aVarCheckAppUpdateInfoAndReturn.isUpdateTypeAllowed(1) + " update version code " + aVarCheckAppUpdateInfoAndReturn.availableVersionCode() + " installStatus " + aVarCheckAppUpdateInfoAndReturn.installStatus());
            }
            zHasNewUpgrade = b.hasNewUpgrade(aVarCheckAppUpdateInfoAndReturn);
        } else {
            aVarCheckAppUpdateInfoAndReturn = null;
        }
        com.google.android.play.core.appupdate.a aVar2 = aVarCheckAppUpdateInfoAndReturn;
        boolean z4 = zHasNewUpgrade;
        if (com.userlabs.xshare.core.log.h.a) {
            com.userlabs.xshare.core.log.h.d("upgrade_d", "data action :" + upgradeAction + ",url:" + upgradeUrl);
        }
        return new k(upgradeAction, upgradeUrl, md5str, umsg, z, z2, z4, aVar2);
    }

    public int getAction() {
        return this.a;
    }

    public com.google.android.play.core.appupdate.a getAppUpdateInfo() {
        return this.h;
    }

    public String getMd5() {
        return this.c;
    }

    public String getMsg() {
        return this.d;
    }

    public String getUrl() {
        return this.b;
    }

    public boolean isCanAutoShow() {
        return this.f;
    }

    public boolean isCanIgnore() {
        return this.e;
    }

    public boolean isForciblyAction() {
        return this.a == 2;
    }

    public boolean isGpUpgradeSdkCheckedCanUpdate() {
        return this.g;
    }

    public boolean isNoForciblyAction() {
        return this.a == 1;
    }

    public void refreshSdkUpgradeInfo() {
        if (this.g) {
            this.h = b.checkAppUpdateInfoAndReturn();
            boolean z = false;
            if (com.userlabs.xshare.core.log.h.a) {
                com.userlabs.xshare.core.log.h.d("upgrade_s", "gp sdk app update info, updateAvailability: " + this.h.updateAvailability() + " FLEXIBLE isAllow " + this.h.isUpdateTypeAllowed(0) + " IMMEDIATE isAllow " + this.h.isUpdateTypeAllowed(1) + " update version code " + this.h.availableVersionCode() + " installStatus " + this.h.installStatus());
            }
            if (1 == this.a && b.hasNewUpgrade(this.h)) {
                z = true;
            }
            this.g = z;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UpgradeInfoForShowEnter{action=");
        sb.append(this.a);
        sb.append(", url='");
        sb.append(this.b);
        sb.append("', md5='");
        sb.append(this.c);
        sb.append("', msg='");
        sb.append(this.d);
        sb.append("', canIgnore=");
        sb.append(this.e);
        sb.append(", canAutoShow=");
        sb.append(this.f);
        sb.append(", gpUpgradeSdkCheckedCanUpdate=");
        return defpackage.a.u(sb, this.g, '}');
    }
}
