package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a extends d {
        private final ActivityOptions a;

        public a(ActivityOptions activityOptions) {
            this.a = activityOptions;
        }

        @Override // androidx.core.app.d
        public Rect getLaunchBounds() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            return this.a.getLaunchBounds();
        }

        @Override // androidx.core.app.d
        public int getLaunchDisplayId() {
            if (Build.VERSION.SDK_INT >= 26) {
                return this.a.getLaunchDisplayId();
            }
            return -1;
        }

        @Override // androidx.core.app.d
        public void requestUsageTimeReport(PendingIntent pendingIntent) {
            this.a.requestUsageTimeReport(pendingIntent);
        }

        @Override // androidx.core.app.d
        public d setLaunchBounds(Rect rect) {
            return Build.VERSION.SDK_INT < 24 ? this : new a(this.a.setLaunchBounds(rect));
        }

        @Override // androidx.core.app.d
        public d setLaunchDisplayId(int i) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.a.setLaunchDisplayId(i);
            }
            return this;
        }

        @Override // androidx.core.app.d
        public d setPendingIntentBackgroundActivityStartMode(int i) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 34) {
                this.a.setPendingIntentBackgroundActivityStartMode(i);
                return this;
            }
            if (i2 >= 33) {
                this.a.setPendingIntentBackgroundActivityLaunchAllowed(i != 2);
            }
            return this;
        }

        @Override // androidx.core.app.d
        public d setShareIdentityEnabled(boolean z) {
            return Build.VERSION.SDK_INT < 34 ? this : new a(this.a.setShareIdentityEnabled(z));
        }

        @Override // androidx.core.app.d
        public Bundle toBundle() {
            return this.a.toBundle();
        }

        @Override // androidx.core.app.d
        public void update(d dVar) {
            if (dVar instanceof a) {
                this.a.update(((a) dVar).a);
            }
        }
    }

    public static d makeBasic() {
        return new a(ActivityOptions.makeBasic());
    }

    public static d makeClipRevealAnimation(View view, int i, int i2, int i3, int i4) {
        return new a(ActivityOptions.makeClipRevealAnimation(view, i, i2, i3, i4));
    }

    public static d makeCustomAnimation(Context context, int i, int i2) {
        return new a(ActivityOptions.makeCustomAnimation(context, i, i2));
    }

    public static d makeScaleUpAnimation(View view, int i, int i2, int i3, int i4) {
        return new a(ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4));
    }

    public static d makeSceneTransitionAnimation(Activity activity, androidx.core.util.e<View, String>... eVarArr) {
        Pair[] pairArr;
        if (eVarArr != null) {
            pairArr = new Pair[eVarArr.length];
            for (int i = 0; i < eVarArr.length; i++) {
                androidx.core.util.e<View, String> eVar = eVarArr[i];
                pairArr[i] = Pair.create(eVar.a, eVar.b);
            }
        } else {
            pairArr = null;
        }
        return new a(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }

    public static d makeTaskLaunchBehind() {
        return new a(ActivityOptions.makeTaskLaunchBehind());
    }

    public static d makeThumbnailScaleUpAnimation(View view, Bitmap bitmap, int i, int i2) {
        return new a(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2));
    }

    public Rect getLaunchBounds() {
        return null;
    }

    public int getLaunchDisplayId() {
        return -1;
    }

    public Bundle toBundle() {
        return null;
    }

    public void requestUsageTimeReport(PendingIntent pendingIntent) {
    }

    public d setLaunchBounds(Rect rect) {
        return this;
    }

    public d setLaunchDisplayId(int i) {
        return this;
    }

    public d setPendingIntentBackgroundActivityStartMode(int i) {
        return this;
    }

    public d setShareIdentityEnabled(boolean z) {
        return this;
    }

    public void update(d dVar) {
    }

    public static d makeSceneTransitionAnimation(Activity activity, View view, String str) {
        return new a(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
    }
}
