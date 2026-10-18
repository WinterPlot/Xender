package androidx.constraintlayout.core.motion;

import com.userlabs.xshare.p;
import com.userlabs.xshare.vdlist.j;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class a {
    String a;
    private int b;
    private int c;
    private float d;
    private String e;
    boolean f;

    public a(a aVar) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.e = null;
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
    }

    private static int clamp(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static String colorString(int i) {
        String str = "00000000" + Integer.toHexString(i);
        return "#".concat(str.substring(str.length() - 8));
    }

    public static int hsvToRgb(float f, float f2, float f3) {
        float f4 = f * 6.0f;
        int i = (int) f4;
        float f5 = f4 - i;
        float f6 = f3 * 255.0f;
        int iC = (int) defpackage.a.c(1.0f, f2, f6, 0.5f);
        int i2 = (int) (((1.0f - (f5 * f2)) * f6) + 0.5f);
        int i3 = (int) (((1.0f - ((1.0f - f5) * f2)) * f6) + 0.5f);
        int i4 = (int) (f6 + 0.5f);
        if (i == 0) {
            return ((i4 << 16) + (i3 << 8) + iC) | (-16777216);
        }
        if (i == 1) {
            return ((i2 << 16) + (i4 << 8) + iC) | (-16777216);
        }
        if (i == 2) {
            return ((iC << 16) + (i4 << 8) + i3) | (-16777216);
        }
        if (i == 3) {
            return ((iC << 16) + (i2 << 8) + i4) | (-16777216);
        }
        if (i == 4) {
            return ((i3 << 16) + (iC << 8) + i4) | (-16777216);
        }
        if (i != 5) {
            return 0;
        }
        return ((i4 << 16) + (iC << 8) + i2) | (-16777216);
    }

    public static int rgbaTocColor(float f, float f2, float f3, float f4) {
        int iClamp = clamp((int) (f * 255.0f));
        int iClamp2 = clamp((int) (f2 * 255.0f));
        return (iClamp << 16) | (clamp((int) (f4 * 255.0f)) << 24) | (iClamp2 << 8) | clamp((int) (f3 * 255.0f));
    }

    public void applyToWidget(MotionWidget motionWidget) {
        int i = this.b;
        switch (i) {
            case 900:
            case 902:
            case 906:
                motionWidget.setCustomAttribute(this.a, i, this.c);
                break;
            case 901:
            case 905:
                motionWidget.setCustomAttribute(this.a, i, this.d);
                break;
            case 903:
                motionWidget.setCustomAttribute(this.a, i, this.e);
                break;
            case 904:
                motionWidget.setCustomAttribute(this.a, i, this.f);
                break;
        }
    }

    public a copy() {
        return new a(this);
    }

    public boolean diff(a aVar) {
        int i;
        if (aVar != null && (i = this.b) == aVar.b) {
            switch (i) {
                case 900:
                case 906:
                    if (this.c == aVar.c) {
                        return true;
                    }
                    break;
                case 901:
                    return this.d == aVar.d;
                case 902:
                    return this.c == aVar.c;
                case 903:
                    return this.c == aVar.c;
                case 904:
                    return this.f == aVar.f;
                case 905:
                    return this.d == aVar.d;
                default:
                    return false;
            }
        }
        return false;
    }

    public boolean getBooleanValue() {
        return this.f;
    }

    public int getColorValue() {
        return this.c;
    }

    public float getFloatValue() {
        return this.d;
    }

    public int getIntegerValue() {
        return this.c;
    }

    public int getInterpolatedColor(float[] fArr) {
        return (clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public String getName() {
        return this.a;
    }

    public String getStringValue() {
        return this.e;
    }

    public int getType() {
        return this.b;
    }

    public float getValueToInterpolate() {
        switch (this.b) {
            case 900:
                return this.c;
            case 901:
                return this.d;
            case 902:
                p.a("Color does not have a single color to interpolate");
                return 0.0f;
            case 903:
                p.a("Cannot interpolate String");
                return 0.0f;
            case 904:
                return this.f ? 1.0f : 0.0f;
            case 905:
                return this.d;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (this.b) {
            case 900:
                fArr[0] = this.c;
                break;
            case 901:
                fArr[0] = this.d;
                break;
            case 902:
                int i = this.c;
                int i2 = (i >> 24) & 255;
                float fPow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i2 / 255.0f;
                break;
            case 903:
                p.a("Cannot interpolate String");
                break;
            case 904:
                fArr[0] = this.f ? 1.0f : 0.0f;
                break;
            case 905:
                fArr[0] = this.d;
                break;
        }
    }

    public boolean isContinuous() {
        int i = this.b;
        return (i == 903 || i == 904 || i == 906) ? false : true;
    }

    public int numberOfInterpolatedValues() {
        return this.b != 902 ? 1 : 4;
    }

    public void setBooleanValue(boolean z) {
        this.f = z;
    }

    public void setFloatValue(float f) {
        this.d = f;
    }

    public void setIntValue(int i) {
        this.c = i;
    }

    public void setInterpolatedValue(MotionWidget motionWidget, float[] fArr) {
        int i = this.b;
        switch (i) {
            case 900:
                motionWidget.setCustomAttribute(this.a, i, (int) fArr[0]);
                break;
            case 901:
            case 905:
                motionWidget.setCustomAttribute(this.a, i, fArr[0]);
                break;
            case 902:
                motionWidget.setCustomAttribute(this.a, this.b, (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                break;
            case 903:
            case 906:
                j.g("unable to interpolate ", this.a);
                break;
            case 904:
                motionWidget.setCustomAttribute(this.a, i, fArr[0] > 0.5f);
                break;
        }
    }

    public void setStringValue(String str) {
        this.e = str;
    }

    public void setValue(float[] fArr) {
        switch (this.b) {
            case 900:
            case 906:
                this.c = (int) fArr[0];
                break;
            case 901:
            case 905:
                this.d = fArr[0];
                break;
            case 902:
                this.c = ((Math.round(fArr[3] * 255.0f) & 255) << 24) | ((Math.round(((float) Math.pow(fArr[0], 0.5d)) * 255.0f) & 255) << 16) | ((Math.round(((float) Math.pow(fArr[1], 0.5d)) * 255.0f) & 255) << 8) | (Math.round(((float) Math.pow(fArr[2], 0.5d)) * 255.0f) & 255);
                break;
            case 903:
                p.a("Cannot interpolate String");
                break;
            case 904:
                this.f = ((double) fArr[0]) > 0.5d;
                break;
        }
    }

    public String toString() {
        String strR = defpackage.a.r(new StringBuilder(), this.a, ':');
        switch (this.b) {
            case 900:
                return strR + this.c;
            case 901:
                return strR + this.d;
            case 902:
                return strR + colorString(this.c);
            case 903:
                return strR + this.e;
            case 904:
                return strR + Boolean.valueOf(this.f);
            case 905:
                return strR + this.d;
            default:
                return strR.concat("????");
        }
    }

    public a(String str, int i, String str2) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.a = str;
        this.b = i;
        this.e = str2;
    }

    public a(String str, int i, int i2) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.e = null;
        this.a = str;
        this.b = i;
        if (i == 901) {
            this.d = i2;
        } else {
            this.c = i2;
        }
    }

    public a(String str, int i, float f) {
        this.c = Integer.MIN_VALUE;
        this.e = null;
        this.a = str;
        this.b = i;
        this.d = f;
    }

    public a(String str, int i, boolean z) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.e = null;
        this.a = str;
        this.b = i;
        this.f = z;
    }

    public a(String str, int i) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.e = null;
        this.a = str;
        this.b = i;
    }

    public a(String str, int i, Object obj) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.e = null;
        this.a = str;
        this.b = i;
        setValue(obj);
    }

    public a(a aVar, Object obj) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.e = null;
        this.a = aVar.a;
        this.b = aVar.b;
        setValue(obj);
    }

    public void setValue(Object obj) {
        switch (this.b) {
            case 900:
            case 906:
                this.c = ((Integer) obj).intValue();
                break;
            case 901:
                this.d = ((Float) obj).floatValue();
                break;
            case 902:
                this.c = ((Integer) obj).intValue();
                break;
            case 903:
                this.e = (String) obj;
                break;
            case 904:
                this.f = ((Boolean) obj).booleanValue();
                break;
            case 905:
                this.d = ((Float) obj).floatValue();
                break;
        }
    }
}
