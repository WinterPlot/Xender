package com.userlabs.xshare;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static void goToByIntentWithFadeInOutAnimIfNeed(Activity activity, Intent intent) {
        try {
            if (Build.VERSION.SDK_INT >= 29 && com.userlabs.xshare.core.utils.n.canUseAnim()) {
                activity.startActivity(intent, androidx.core.app.d.makeCustomAnimation(activity, R.anim.x_fade_in, R.anim.x_fade_out).toBundle());
                activity.finish();
                return;
            }
            activity.startActivity(intent);
            activity.finish();
            if (com.userlabs.xshare.core.utils.n.canUseAnim()) {
                activity.overridePendingTransition(0, R.anim.x_fade_out);
            }
        } catch (Exception unused) {
        }
    }
}
