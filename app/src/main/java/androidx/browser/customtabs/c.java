package androidx.browser.customtabs;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        private Integer a;
        private Integer b;
        private Integer c;
        private Integer d;

        public c build() {
            return new c(this.a, this.b, this.c, this.d);
        }

        public a setNavigationBarColor(int i) {
            this.c = Integer.valueOf(i | (-16777216));
            return this;
        }

        public a setNavigationBarDividerColor(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        public a setSecondaryToolbarColor(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public a setToolbarColor(int i) {
            this.a = Integer.valueOf(i | (-16777216));
            return this;
        }
    }

    public c(Integer num, Integer num2, Integer num3, Integer num4) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
    }

    public static c fromBundle(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle(0);
        }
        return new c((Integer) bundle.get("android.support.customtabs.extra.TOOLBAR_COLOR"), (Integer) bundle.get("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR"), (Integer) bundle.get("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR"), (Integer) bundle.get("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR"));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        Integer num = this.a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }

    public c withDefaults(c cVar) {
        Integer num = this.a;
        if (num == null) {
            num = cVar.a;
        }
        Integer num2 = this.b;
        if (num2 == null) {
            num2 = cVar.b;
        }
        Integer num3 = this.c;
        if (num3 == null) {
            num3 = cVar.c;
        }
        Integer num4 = this.d;
        if (num4 == null) {
            num4 = cVar.d;
        }
        return new c(num, num2, num3, num4);
    }
}
