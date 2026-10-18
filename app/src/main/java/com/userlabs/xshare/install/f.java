package com.userlabs.xshare.install;

import android.text.TextUtils;
import com.userlabs.xshare.arch.db.entity.l;
import com.userlabs.xshare.core.loadicon.LoadIconCate;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class f {
    private String a;
    private String b;
    private String c;
    private String d;
    private final g e;

    private f(g gVar) {
        this.e = gVar;
    }

    public static f instanceBundleNormal(String str, String str2, String str3, g gVar) {
        f fVar = new f(gVar);
        fVar.setCate(LoadIconCate.LOAD_CATE_APP_BUNDLE);
        fVar.setPath(str);
        fVar.setAabPath(str2);
        fVar.setPackageName(str3);
        return fVar;
    }

    public static f instanceSingleNormal(String str, g gVar) {
        f fVar = new f(gVar);
        fVar.setCate("app");
        fVar.setPath(str);
        fVar.setPackageName("");
        return fVar;
    }

    public static f instanceSystemInstallerWithApkEntity(com.userlabs.xshare.arch.db.entity.b bVar, g gVar) {
        return TextUtils.equals(bVar.getCategory(), LoadIconCate.LOAD_CATE_APP_BUNDLE) ? instanceBundleNormal(bVar.getPath(), bVar.getApkBundleBaseRelativePath(), bVar.getPkg_name(), gVar) : instanceSingleNormal(bVar.getPath(), bVar.getPkg_name(), gVar);
    }

    public static f instanceSystemInstallerWithHistoryEntity(l lVar, g gVar) {
        return TextUtils.equals(lVar.getF_category(), LoadIconCate.LOAD_CATE_APP_BUNDLE) ? instanceBundleNormal(lVar.getF_path(), lVar.getAab_base_path(), lVar.getF_pkg_name(), gVar) : instanceSingleNormal(lVar.getF_path(), lVar.getF_pkg_name(), gVar);
    }

    public boolean checkParams() {
        if (TextUtils.isEmpty(this.a)) {
            return false;
        }
        return (TextUtils.isEmpty(getAabPath()) && isCateBundle()) ? false : true;
    }

    public String generateApkPath() {
        if (!isCateBundle()) {
            return getPath();
        }
        return getPath() + getAabPath();
    }

    public String getAabPath() {
        return this.b;
    }

    public String getCate() {
        return this.c;
    }

    public String getPackageName() {
        return this.d;
    }

    public String getPath() {
        return this.a;
    }

    public g getScene() {
        return this.e;
    }

    public String getSceneString() {
        return this.e.toString();
    }

    public boolean isABISupport() {
        if ("app".equals(this.c)) {
            return com.userlabs.xshare.utils.b.isApkABISupport(this.a);
        }
        if (LoadIconCate.LOAD_CATE_APP_BUNDLE.equals(this.c)) {
            return com.userlabs.xshare.utils.b.isBundleApkABISupport(this.a);
        }
        return true;
    }

    public boolean isCateBundle() {
        return TextUtils.equals(LoadIconCate.LOAD_CATE_APP_BUNDLE, this.c);
    }

    public boolean isMinSdkVersionSupport() {
        if ("app".equals(this.c)) {
            return com.userlabs.xshare.utils.b.apkMinSdkVersionSupport(this.a);
        }
        if (!LoadIconCate.LOAD_CATE_APP_BUNDLE.equals(this.c)) {
            return true;
        }
        return com.userlabs.xshare.utils.b.apkMinSdkVersionSupport(this.a + this.b);
    }

    public void setAabPath(String str) {
        this.b = str;
    }

    public void setCate(String str) {
        this.c = str;
    }

    public void setPackageName(String str) {
        this.d = str;
    }

    public void setPath(String str) {
        this.a = str;
    }

    public static f instanceSingleNormal(String str, String str2, g gVar) {
        f fVar = new f(gVar);
        fVar.setCate("app");
        fVar.setPath(str);
        fVar.setPackageName(str2);
        return fVar;
    }
}
