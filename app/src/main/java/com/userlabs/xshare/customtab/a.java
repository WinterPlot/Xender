package com.userlabs.xshare.customtab;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.userlabs.xshare.core.log.h;
import okhttp3.b0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    private static String a;

    public static void checkHasSupportCustomTabsPackage() {
        if (TextUtils.isEmpty(getTargetSupportCustomTabsPackage())) {
            b0.i("not found support custom tabs app");
        }
    }

    private static String findFromGivenPackages(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent();
            intent.setAction("android.support.customtabs.action.CustomTabsService");
            String[] strArr = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev", "com.google.android.apps.chrome"};
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                intent.setPackage(str);
                if (packageManager.resolveService(intent, 0) != null) {
                    return str;
                }
            }
            throw new Exception("not found from given packages");
        } catch (Throwable th) {
            if (!h.a) {
                return null;
            }
            h.e("CustomTabsInitializer", "findFromGivenPackages e=", th);
            return null;
        }
    }

    private static String findSupportCustomTabsAppPackageNameCompat(Context context) {
        String strFindFromGivenPackages = findFromGivenPackages(context);
        return TextUtils.isEmpty(strFindFromGivenPackages) ? findSupportCustomTabsPackageNameByTest(context) : strFindFromGivenPackages;
    }

    private static String findSupportCustomTabsPackageNameByTest(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com")), 0)) {
                Intent intent = new Intent();
                intent.setAction("android.support.customtabs.action.CustomTabsService");
                intent.setPackage(resolveInfo.activityInfo.packageName);
                if (h.a) {
                    h.d("CustomTabsInitializer", "getCustomTabsPackages browser packageName=" + resolveInfo.activityInfo.packageName + ",name=" + resolveInfo.activityInfo.name);
                }
                if (packageManager.resolveService(intent, 0) != null) {
                    return resolveInfo.activityInfo.packageName;
                }
            }
            throw new Exception("not found support custom tabs package name");
        } catch (Throwable th) {
            if (!h.a) {
                return null;
            }
            h.e("CustomTabsInitializer", "getCustomTabsPackages e=", th);
            return null;
        }
    }

    public static String getTargetSupportCustomTabsPackage() {
        return a;
    }

    public static void init(Context context) {
        a = findSupportCustomTabsAppPackageNameCompat(context);
    }
}
