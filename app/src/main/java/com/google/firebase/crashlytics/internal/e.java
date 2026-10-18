package com.google.firebase.crashlytics.internal;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class e {
    private final Context a;
    private b b = null;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class b {
        private final String a;
        private final String b;

        private b() {
            int resourcesIdentifier = CommonUtils.getResourcesIdentifier(e.this.a, "com.google.firebase.crashlytics.unity_version", "string");
            if (resourcesIdentifier != 0) {
                this.a = "Unity";
                String string = e.this.a.getResources().getString(resourcesIdentifier);
                this.b = string;
                f.getLogger().v("Unity Editor version is: " + string);
                return;
            }
            if (!e.this.assetFileExists("flutter_assets/NOTICES.Z")) {
                this.a = null;
                this.b = null;
            } else {
                this.a = "Flutter";
                this.b = null;
                f.getLogger().v("Development platform is: Flutter");
            }
        }
    }

    public e(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean assetFileExists(String str) {
        if (this.a.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.a.getAssets().open(str);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private b initDevelopmentPlatform() {
        b bVar = this.b;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.b = bVar2;
        return bVar2;
    }

    public static boolean isUnity(Context context) {
        return CommonUtils.getResourcesIdentifier(context, "com.google.firebase.crashlytics.unity_version", "string") != 0;
    }

    public String getDevelopmentPlatform() {
        return initDevelopmentPlatform().a;
    }

    public String getDevelopmentPlatformVersion() {
        return initDevelopmentPlatform().b;
    }
}
