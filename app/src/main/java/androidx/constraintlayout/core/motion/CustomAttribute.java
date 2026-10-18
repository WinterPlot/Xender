package androidx.constraintlayout.core.motion;

import com.userlabs.xshare.p;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class CustomAttribute {
    private boolean a;
    String b;
    private AttributeType c;
    private int d;
    private float e;
    private String f;
    boolean g;
    private int h;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public CustomAttribute(CustomAttribute customAttribute, Object obj) {
        this.a = false;
        this.b = customAttribute.b;
        this.c = customAttribute.c;
        setValue(obj);
    }

    private static int clamp(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
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

    public boolean diff(CustomAttribute customAttribute) {
        AttributeType attributeType;
        if (customAttribute != null && (attributeType = this.c) == customAttribute.c) {
            switch (attributeType) {
                case INT_TYPE:
                case REFERENCE_TYPE:
                    if (this.d == customAttribute.d) {
                        return true;
                    }
                    break;
                case FLOAT_TYPE:
                    return this.e == customAttribute.e;
                case COLOR_TYPE:
                case COLOR_DRAWABLE_TYPE:
                    return this.h == customAttribute.h;
                case STRING_TYPE:
                    return this.d == customAttribute.d;
                case BOOLEAN_TYPE:
                    return this.g == customAttribute.g;
                case DIMENSION_TYPE:
                    return this.e == customAttribute.e;
                default:
                    return false;
            }
        }
        return false;
    }

    public AttributeType getType() {
        return this.c;
    }

    public float getValueToInterpolate() {
        switch (this.c) {
            case INT_TYPE:
                return this.d;
            case FLOAT_TYPE:
                return this.e;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                p.a("Color does not have a single color to interpolate");
                return 0.0f;
            case STRING_TYPE:
                p.a("Cannot interpolate String");
                return 0.0f;
            case BOOLEAN_TYPE:
                return this.g ? 1.0f : 0.0f;
            case DIMENSION_TYPE:
                return this.e;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (this.c) {
            case INT_TYPE:
                fArr[0] = this.d;
                break;
            case FLOAT_TYPE:
                fArr[0] = this.e;
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int i = this.h;
                int i2 = (i >> 24) & 255;
                float fPow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i2 / 255.0f;
                break;
            case STRING_TYPE:
                p.a("Color does not have a single color to interpolate");
                break;
            case BOOLEAN_TYPE:
                fArr[0] = this.g ? 1.0f : 0.0f;
                break;
            case DIMENSION_TYPE:
                fArr[0] = this.e;
                break;
        }
    }

    public boolean isContinuous() {
        int iOrdinal = this.c.ordinal();
        return (iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 7) ? false : true;
    }

    public int numberOfInterpolatedValues() {
        int iOrdinal = this.c.ordinal();
        return (iOrdinal == 2 || iOrdinal == 3) ? 4 : 1;
    }

    public void setColorValue(int i) {
        this.h = i;
    }

    public void setFloatValue(float f) {
        this.e = f;
    }

    public void setIntValue(int i) {
        this.d = i;
    }

    public void setStringValue(String str) {
        this.f = str;
    }

    public void setValue(float[] fArr) {
        switch (this.c) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.d = (int) fArr[0];
                break;
            case FLOAT_TYPE:
                this.e = fArr[0];
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int iHsvToRgb = hsvToRgb(fArr[0], fArr[1], fArr[2]);
                this.h = iHsvToRgb;
                this.h = (clamp((int) (fArr[3] * 255.0f)) << 24) | (iHsvToRgb & 16777215);
                break;
            case STRING_TYPE:
                p.a("Color does not have a single color to interpolate");
                break;
            case BOOLEAN_TYPE:
                this.g = ((double) fArr[0]) > 0.5d;
                break;
            case DIMENSION_TYPE:
                this.e = fArr[0];
                break;
        }
    }

    public CustomAttribute(String str, AttributeType attributeType, Object obj, boolean z) {
        this.b = str;
        this.c = attributeType;
        this.a = z;
        setValue(obj);
    }

    public CustomAttribute(String str, AttributeType attributeType) {
        this.a = false;
        this.b = str;
        this.c = attributeType;
    }

    public void setValue(Object obj) {
        switch (this.c) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.d = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.e = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.h = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.f = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.g = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.e = ((Float) obj).floatValue();
                break;
        }
    }
}
