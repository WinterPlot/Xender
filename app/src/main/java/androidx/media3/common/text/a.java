package androidx.media3.common.text;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.media3.common.util.n0;
import com.google.common.base.m;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    public final float q;
    public final int r;

    @Deprecated
    public static final a s = new b().setText("").build();
    private static final String t = n0.intToStringMaxRadix(0);
    private static final String u = n0.intToStringMaxRadix(17);
    private static final String v = n0.intToStringMaxRadix(1);
    private static final String w = n0.intToStringMaxRadix(2);
    private static final String x = n0.intToStringMaxRadix(3);
    private static final String y = n0.intToStringMaxRadix(18);
    private static final String z = n0.intToStringMaxRadix(4);
    private static final String A = n0.intToStringMaxRadix(5);
    private static final String B = n0.intToStringMaxRadix(6);
    private static final String C = n0.intToStringMaxRadix(7);
    private static final String D = n0.intToStringMaxRadix(8);
    private static final String E = n0.intToStringMaxRadix(9);
    private static final String F = n0.intToStringMaxRadix(10);
    private static final String G = n0.intToStringMaxRadix(11);
    private static final String H = n0.intToStringMaxRadix(12);
    private static final String I = n0.intToStringMaxRadix(13);
    private static final String J = n0.intToStringMaxRadix(14);
    private static final String K = n0.intToStringMaxRadix(15);
    private static final String L = n0.intToStringMaxRadix(16);
    private static final String M = n0.intToStringMaxRadix(19);

    private a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z2, int i5, int i6, float f6, int i7) {
        if (charSequence == null) {
            m.checkNotNull(bitmap);
        } else {
            m.checkArgument(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.a = charSequence.toString();
        } else {
            this.a = null;
        }
        this.b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = f2;
        this.i = i3;
        this.j = f4;
        this.k = f5;
        this.l = z2;
        this.m = i5;
        this.n = i4;
        this.o = f3;
        this.p = i6;
        this.q = f6;
        this.r = i7;
    }

    public static a fromBundle(Bundle bundle) {
        b bVar = new b();
        CharSequence charSequence = bundle.getCharSequence(t);
        if (charSequence != null) {
            bVar.setText(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(u);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                int size = parcelableArrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = parcelableArrayList.get(i);
                    i++;
                    c.unbundleAndApplyCustomSpan((Bundle) obj, spannableStringValueOf);
                }
                bVar.setText(spannableStringValueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(v);
        if (alignment != null) {
            bVar.setTextAlignment(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(w);
        if (alignment2 != null) {
            bVar.setMultiRowAlignment(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(x);
        if (bitmap != null) {
            bVar.setBitmap(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(y);
            if (byteArray != null) {
                bVar.setBitmap(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = z;
        if (bundle.containsKey(str)) {
            String str2 = A;
            if (bundle.containsKey(str2)) {
                bVar.setLine(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = B;
        if (bundle.containsKey(str3)) {
            bVar.setLineAnchor(bundle.getInt(str3));
        }
        String str4 = C;
        if (bundle.containsKey(str4)) {
            bVar.setPosition(bundle.getFloat(str4));
        }
        String str5 = D;
        if (bundle.containsKey(str5)) {
            bVar.setPositionAnchor(bundle.getInt(str5));
        }
        String str6 = F;
        if (bundle.containsKey(str6)) {
            String str7 = E;
            if (bundle.containsKey(str7)) {
                bVar.setTextSize(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = G;
        if (bundle.containsKey(str8)) {
            bVar.setSize(bundle.getFloat(str8));
        }
        String str9 = H;
        if (bundle.containsKey(str9)) {
            bVar.setBitmapHeight(bundle.getFloat(str9));
        }
        String str10 = I;
        if (bundle.containsKey(str10)) {
            bVar.setWindowColor(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(J, false)) {
            bVar.clearWindowColor();
        }
        String str11 = K;
        if (bundle.containsKey(str11)) {
            bVar.setVerticalType(bundle.getInt(str11));
        }
        String str12 = L;
        if (bundle.containsKey(str12)) {
            bVar.setShearDegrees(bundle.getFloat(str12));
        }
        String str13 = M;
        if (bundle.containsKey(str13)) {
            bVar.setZIndex(bundle.getInt(str13));
        }
        return bVar.build();
    }

    private Bundle toBundleWithoutBitmap() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(t, charSequence);
            CharSequence charSequence2 = this.a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<Bundle> arrayListBundleCustomSpans = c.bundleCustomSpans((Spanned) charSequence2);
                if (!arrayListBundleCustomSpans.isEmpty()) {
                    bundle.putParcelableArrayList(u, arrayListBundleCustomSpans);
                }
            }
        }
        bundle.putSerializable(v, this.b);
        bundle.putSerializable(w, this.c);
        bundle.putFloat(z, this.e);
        bundle.putInt(A, this.f);
        bundle.putInt(B, this.g);
        bundle.putFloat(C, this.h);
        bundle.putInt(D, this.i);
        bundle.putInt(E, this.n);
        bundle.putFloat(F, this.o);
        bundle.putFloat(G, this.j);
        bundle.putFloat(H, this.k);
        bundle.putBoolean(J, this.l);
        bundle.putInt(I, this.m);
        bundle.putInt(K, this.p);
        bundle.putFloat(L, this.q);
        bundle.putInt(M, this.r);
        return bundle;
    }

    public b buildUpon() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (TextUtils.equals(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c) {
                Bitmap bitmap = this.d;
                Bitmap bitmap2 = aVar.d;
                if (bitmap != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) {
                    if (this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && this.j == aVar.j && this.k == aVar.k && this.l == aVar.l && this.m == aVar.m && this.n == aVar.n && this.o == aVar.o && this.p == aVar.p && this.q == aVar.q && this.r == aVar.r) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h), Integer.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.k), Boolean.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Float.valueOf(this.o), Integer.valueOf(this.p), Float.valueOf(this.q), Integer.valueOf(this.r));
    }

    public Bundle toBinderBasedBundle() {
        Bundle bundleWithoutBitmap = toBundleWithoutBitmap();
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            bundleWithoutBitmap.putParcelable(x, bitmap);
        }
        return bundleWithoutBitmap;
    }

    @Deprecated
    public Bundle toBundle() {
        return toBinderBasedBundle();
    }

    public Bundle toSerializableBundle() {
        Bundle bundleWithoutBitmap = toBundleWithoutBitmap();
        if (this.d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            m.checkState(this.d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundleWithoutBitmap.putByteArray(y, byteArrayOutputStream.toByteArray());
        }
        return bundleWithoutBitmap;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b {
        private CharSequence a;
        private Bitmap b;
        private Layout.Alignment c;
        private Layout.Alignment d;
        private float e;
        private int f;
        private int g;
        private float h;
        private int i;
        private int j;
        private float k;
        private float l;
        private float m;
        private boolean n;
        private int o;
        private int p;
        private float q;
        private int r;

        private b(a aVar) {
            this.a = aVar.a;
            this.b = aVar.d;
            this.c = aVar.b;
            this.d = aVar.c;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
            this.h = aVar.h;
            this.i = aVar.i;
            this.j = aVar.n;
            this.k = aVar.o;
            this.l = aVar.j;
            this.m = aVar.k;
            this.n = aVar.l;
            this.o = aVar.m;
            this.p = aVar.p;
            this.q = aVar.q;
            this.r = aVar.r;
        }

        public a build() {
            return new a(this.a, this.c, this.d, this.b, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
        }

        public b clearWindowColor() {
            this.n = false;
            return this;
        }

        @Pure
        public Bitmap getBitmap() {
            return this.b;
        }

        @Pure
        public float getBitmapHeight() {
            return this.m;
        }

        @Pure
        public float getLine() {
            return this.e;
        }

        @Pure
        public int getLineAnchor() {
            return this.g;
        }

        @Pure
        public int getLineType() {
            return this.f;
        }

        @Pure
        public float getPosition() {
            return this.h;
        }

        @Pure
        public int getPositionAnchor() {
            return this.i;
        }

        @Pure
        public float getSize() {
            return this.l;
        }

        @Pure
        public CharSequence getText() {
            return this.a;
        }

        @Pure
        public Layout.Alignment getTextAlignment() {
            return this.c;
        }

        @Pure
        public float getTextSize() {
            return this.k;
        }

        @Pure
        public int getTextSizeType() {
            return this.j;
        }

        @Pure
        public int getVerticalType() {
            return this.p;
        }

        @Pure
        public int getWindowColor() {
            return this.o;
        }

        @Pure
        public int getZIndex() {
            return this.r;
        }

        public boolean isWindowColorSet() {
            return this.n;
        }

        public b setBitmap(Bitmap bitmap) {
            this.b = bitmap;
            this.a = null;
            return this;
        }

        public b setBitmapHeight(float f) {
            this.m = f;
            return this;
        }

        public b setLine(float f, int i) {
            this.e = f;
            this.f = i;
            return this;
        }

        public b setLineAnchor(int i) {
            this.g = i;
            return this;
        }

        public b setMultiRowAlignment(Layout.Alignment alignment) {
            this.d = alignment;
            return this;
        }

        public b setPosition(float f) {
            this.h = f;
            return this;
        }

        public b setPositionAnchor(int i) {
            this.i = i;
            return this;
        }

        public b setShearDegrees(float f) {
            this.q = f;
            return this;
        }

        public b setSize(float f) {
            this.l = f;
            return this;
        }

        public b setText(CharSequence charSequence) {
            this.a = charSequence;
            this.b = null;
            return this;
        }

        public b setTextAlignment(Layout.Alignment alignment) {
            this.c = alignment;
            return this;
        }

        public b setTextSize(float f, int i) {
            this.k = f;
            this.j = i;
            return this;
        }

        public b setVerticalType(int i) {
            this.p = i;
            return this;
        }

        public b setWindowColor(int i) {
            this.o = i;
            this.n = true;
            return this;
        }

        public b setZIndex(int i) {
            this.r = i;
            return this;
        }

        public b() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = -3.4028235E38f;
            this.f = Integer.MIN_VALUE;
            this.g = Integer.MIN_VALUE;
            this.h = -3.4028235E38f;
            this.i = Integer.MIN_VALUE;
            this.j = Integer.MIN_VALUE;
            this.k = -3.4028235E38f;
            this.l = -3.4028235E38f;
            this.m = -3.4028235E38f;
            this.n = false;
            this.o = -16777216;
            this.p = Integer.MIN_VALUE;
        }
    }
}
