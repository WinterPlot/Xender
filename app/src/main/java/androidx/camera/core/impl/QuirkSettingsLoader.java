package androidx.camera.core.impl;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class QuirkSettingsLoader implements androidx.arch.core.util.a<Context, j2> {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class MetadataHolderService extends Service {
        private MetadataHolderService() {
        }

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            throw new UnsupportedOperationException();
        }
    }

    private static j2 buildQuirkSettings(Context context, Bundle bundle) {
        boolean z = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrLoadQuirks = loadQuirks(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
        String[] strArrLoadQuirks2 = loadQuirks(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
        androidx.camera.core.n1.d("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        androidx.camera.core.n1.d("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z);
        androidx.camera.core.n1.d("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(strArrLoadQuirks));
        androidx.camera.core.n1.d("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(strArrLoadQuirks2));
        return new j2.b().setEnabledWhenDeviceHasQuirk(z).forceEnableQuirks(resolveQuirkNames(strArrLoadQuirks)).forceDisableQuirks(resolveQuirkNames(strArrLoadQuirks2)).build();
    }

    private static String[] loadQuirks(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            androidx.camera.core.n1.w("QuirkSettingsLoader", "Resource ID not found for key: " + str);
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i);
        } catch (Resources.NotFoundException e) {
            androidx.camera.core.n1.w("QuirkSettingsLoader", "Quirk class names resource not found: " + i, e);
            return new String[0];
        }
    }

    private static Class<? extends i2> resolveQuirkName(String str) {
        try {
            Class cls = Class.forName(str);
            if (i2.class.isAssignableFrom(cls)) {
                return cls;
            }
            androidx.camera.core.n1.w("QuirkSettingsLoader", str + " does not implement the Quirk interface.");
            return null;
        } catch (ClassNotFoundException e) {
            androidx.camera.core.n1.w("QuirkSettingsLoader", "Class not found: " + str, e);
            return null;
        }
    }

    private static Set<Class<? extends i2>> resolveQuirkNames(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            Class<? extends i2> clsResolveQuirkName = resolveQuirkName(str);
            if (clsResolveQuirkName != null) {
                hashSet.add(clsResolveQuirkName);
            }
        }
        return hashSet;
    }

    @Override // androidx.arch.core.util.a
    public j2 apply(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) MetadataHolderService.class), 640).metaData;
            if (bundle != null) {
                return buildQuirkSettings(context, bundle);
            }
            androidx.camera.core.n1.w("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            androidx.camera.core.n1.d("QuirkSettingsLoader", "QuirkSettings$MetadataHolderService is not found.");
            return null;
        }
    }
}
