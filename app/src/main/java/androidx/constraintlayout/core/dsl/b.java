package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class b {
    private String a;
    private float b;
    private float c;
    private float d;

    public b(String str) {
        this.b = Float.NaN;
        this.c = Float.NaN;
        this.d = Float.NaN;
        this.a = str;
    }

    public static void addStringToReferences(String str, ArrayList<b> arrayList) {
        Object obj;
        if (str == null || str.length() == 0) {
            return;
        }
        Object[] objArr = new Object[4];
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != ' ' && cCharAt != '\'') {
                if (cCharAt == ',') {
                    if (i < 3) {
                        objArr[i] = sb.toString();
                        sb.setLength(0);
                        i++;
                    }
                    if (i2 == 1 && (obj = objArr[0]) != null) {
                        arrayList.add(new b(obj.toString()));
                        objArr[0] = null;
                        i = 0;
                    }
                } else if (cCharAt == '[') {
                    i2++;
                } else if (cCharAt != ']') {
                    sb.append(cCharAt);
                } else if (i2 > 0) {
                    i2--;
                    objArr[i] = sb.toString();
                    sb.setLength(0);
                    Object obj2 = objArr[0];
                    if (obj2 != null) {
                        arrayList.add(new b(obj2.toString(), parseFloat(objArr[1]), parseFloat(objArr[2]), parseFloat(objArr[3])));
                        Arrays.fill(objArr, (Object) null);
                        i = 0;
                    }
                }
            }
        }
    }

    public static float parseFloat(Object obj) {
        try {
            return Float.parseFloat(obj.toString());
        } catch (Exception unused) {
            return Float.NaN;
        }
    }

    public static b parseStringToRef(String str) {
        String[] strArrSplit = str.replaceAll("[\\[\\]\\']", "").split(",");
        if (strArrSplit.length == 0) {
            return null;
        }
        Object[] objArr = new Object[4];
        for (int i = 0; i < strArrSplit.length && i < 4; i++) {
            objArr[i] = strArrSplit[i];
        }
        return new b(objArr[0].toString().replace("'", ""), parseFloat(objArr[1]), parseFloat(objArr[2]), parseFloat(objArr[3]));
    }

    public String getId() {
        return this.a;
    }

    public float getPostMargin() {
        return this.d;
    }

    public float getPreMargin() {
        return this.c;
    }

    public float getWeight() {
        return this.b;
    }

    public void setId(String str) {
        this.a = str;
    }

    public void setPostMargin(float f) {
        this.d = f;
    }

    public void setPreMargin(float f) {
        this.c = f;
    }

    public void setWeight(float f) {
        this.b = f;
    }

    public String toString() {
        String str = this.a;
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = (Float.isNaN(this.b) && Float.isNaN(this.c) && Float.isNaN(this.d)) ? false : true;
        if (z) {
            sb.append("[");
        }
        sb.append("'");
        sb.append(this.a);
        sb.append("'");
        if (!Float.isNaN(this.d)) {
            sb.append(",");
            sb.append(!Float.isNaN(this.b) ? this.b : 0.0f);
            sb.append(",");
            sb.append(Float.isNaN(this.c) ? 0.0f : this.c);
            sb.append(",");
            sb.append(this.d);
        } else if (!Float.isNaN(this.c)) {
            sb.append(",");
            sb.append(Float.isNaN(this.b) ? 0.0f : this.b);
            sb.append(",");
            sb.append(this.c);
        } else if (!Float.isNaN(this.b)) {
            sb.append(",");
            sb.append(this.b);
        }
        if (z) {
            sb.append("]");
        }
        sb.append(",");
        return sb.toString();
    }

    public b(String str, float f) {
        this.c = Float.NaN;
        this.d = Float.NaN;
        this.a = str;
        this.b = f;
    }

    public b(String str, float f, float f2) {
        this.d = Float.NaN;
        this.a = str;
        this.b = f;
        this.c = f2;
    }

    public b(String str, float f, float f2, float f3) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }
}
