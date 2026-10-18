package com.userlabs.xshare.precondition;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.userlabs.xshare.core.utils.o;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class g {
    public static void jump2CloseHotspot(Context context) {
        try {
            try {
                if (!o.isHuawei(Build.BRAND.toLowerCase(Locale.getDefault()))) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.TetherSettings"));
                    context.startActivity(intent);
                } else {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.addFlags(268435456);
                    intent2.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$WirelessSettingsActivity"));
                    context.startActivity(intent2);
                }
            } catch (Exception unused) {
                Intent intent3 = new Intent("android.settings.WIRELESS_SETTINGS");
                intent3.addFlags(268435456);
                context.startActivity(intent3);
            }
        } catch (Exception unused2) {
        }
    }

    public static void jump2CloseVpn(Context context) {
        try {
            Intent intent = Build.VERSION.SDK_INT >= 24 ? new Intent("android.settings.VPN_SETTINGS") : new Intent("android.net.vpn.SETTINGS");
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }
}
