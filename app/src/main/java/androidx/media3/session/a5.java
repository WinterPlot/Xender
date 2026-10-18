package androidx.media3.session;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class a5 {
    static final ImmutableList<Integer> d = ImmutableList.of(40010);
    static final ImmutableList<Integer> e = ImmutableList.of(50000, 50001, 50002, 50003, 50004, 50005, 50006);
    private static final String f = androidx.media3.common.util.n0.intToStringMaxRadix(0);
    private static final String g = androidx.media3.common.util.n0.intToStringMaxRadix(1);
    private static final String h = androidx.media3.common.util.n0.intToStringMaxRadix(2);
    public final int a;
    public final String b;
    public final Bundle c;

    public a5(String str, Bundle bundle) {
        this.a = 0;
        this.b = (String) com.google.common.base.m.checkNotNull(str);
        this.c = new Bundle((Bundle) com.google.common.base.m.checkNotNull(bundle));
    }

    public static a5 fromBundle(Bundle bundle) {
        int i = bundle.getInt(f, 0);
        if (i != 0) {
            return new a5(i);
        }
        String str = (String) com.google.common.base.m.checkNotNull(bundle.getString(g));
        Bundle bundleConvertToNullIfInvalid = androidx.media3.common.util.n0.convertToNullIfInvalid(bundle.getBundle(h));
        if (bundleConvertToNullIfInvalid == null) {
            bundleConvertToNullIfInvalid = Bundle.EMPTY;
        }
        return new a5(str, bundleConvertToNullIfInvalid);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a5)) {
            return false;
        }
        a5 a5Var = (a5) obj;
        return this.a == a5Var.a && TextUtils.equals(this.b, a5Var.b);
    }

    public int hashCode() {
        return Objects.hash(this.b, Integer.valueOf(this.a));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f, this.a);
        bundle.putString(g, this.b);
        bundle.putBundle(h, this.c);
        return bundle;
    }

    public a5(int i) {
        com.google.common.base.m.checkArgument(i != 0, "commandCode shouldn't be COMMAND_CODE_CUSTOM");
        this.a = i;
        this.b = "";
        this.c = Bundle.EMPTY;
    }
}
