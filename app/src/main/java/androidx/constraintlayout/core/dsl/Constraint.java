package androidx.constraintlayout.core.dsl;

import androidx.camera.camera2.pipe.w;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class Constraint {
    public static final Constraint J = new Constraint("parent");
    static int K = Integer.MIN_VALUE;
    static Map<ChainMode, String> L;
    private int A;
    private int B;
    private int C;
    private int D;
    private float E;
    private float F;
    private String[] G;
    private boolean H;
    private boolean I;
    private final String a;
    String b = null;
    String c = null;
    private HAnchor d = new HAnchor(HSide.LEFT);
    private HAnchor e = new HAnchor(HSide.RIGHT);
    private VAnchor f = new VAnchor(VSide.TOP);
    private VAnchor g = new VAnchor(VSide.BOTTOM);
    private HAnchor h = new HAnchor(HSide.START);
    private HAnchor i = new HAnchor(HSide.END);
    private VAnchor j = new VAnchor(VSide.BASELINE);
    private int k;
    private int l;
    private float m;
    private float n;
    private String o;
    private String p;
    private int q;
    private float r;
    private int s;
    private int t;
    private float u;
    private float v;
    private ChainMode w;
    private ChainMode x;
    private Behaviour y;
    private Behaviour z;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum Behaviour {
        SPREAD,
        WRAP,
        PERCENT,
        RATIO,
        RESOLVED
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum ChainMode {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class HAnchor extends a {
        public HAnchor(HSide hSide) {
            super(Side.valueOf(hSide.name()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum HSide {
        LEFT,
        RIGHT,
        START,
        END
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum Side {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        START,
        END,
        BASELINE
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class VAnchor extends a {
        public VAnchor(VSide vSide) {
            super(Side.valueOf(vSide.name()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum VSide {
        TOP,
        BOTTOM,
        BASELINE
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a {
        a mConnection = null;
        int mGoneMargin = Integer.MIN_VALUE;
        int mMargin;
        final Side mSide;

        public a(Side side) {
            this.mSide = side;
        }

        public void build(StringBuilder sb) {
            if (this.mConnection != null) {
                sb.append(this.mSide.toString().toLowerCase());
                sb.append(":");
                sb.append(this);
                sb.append(",\n");
            }
        }

        public String getId() {
            return Constraint.this.a;
        }

        public Constraint getParent() {
            return Constraint.this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            if (this.mConnection != null) {
                sb.append("'");
                sb.append(this.mConnection.getId());
                sb.append("','");
                sb.append(this.mConnection.mSide.toString().toLowerCase());
                sb.append("'");
            }
            if (this.mMargin != 0) {
                sb.append(",");
                sb.append(this.mMargin);
            }
            if (this.mGoneMargin != Integer.MIN_VALUE) {
                if (this.mMargin == 0) {
                    sb.append(",0,");
                    sb.append(this.mGoneMargin);
                } else {
                    sb.append(",");
                    sb.append(this.mGoneMargin);
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    static {
        HashMap map = new HashMap();
        L = map;
        map.put(ChainMode.SPREAD, "spread");
        L.put(ChainMode.SPREAD_INSIDE, "spread_inside");
        L.put(ChainMode.PACKED, "packed");
    }

    public Constraint(String str) {
        int i = K;
        this.k = i;
        this.l = i;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = null;
        this.p = null;
        this.q = Integer.MIN_VALUE;
        this.r = Float.NaN;
        this.s = Integer.MIN_VALUE;
        this.t = Integer.MIN_VALUE;
        this.u = Float.NaN;
        this.v = Float.NaN;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = i;
        this.B = i;
        this.C = i;
        this.D = i;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = null;
        this.H = false;
        this.I = false;
        this.a = str;
    }

    public void append(StringBuilder sb, String str, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        sb.append(str);
        sb.append(":");
        sb.append(f);
        sb.append(",\n");
    }

    public String convertStringArrayToString(String[] strArr) {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (i < strArr.length) {
            sb.append(i == 0 ? "'" : ",'");
            sb.append(strArr[i]);
            sb.append("'");
            i++;
        }
        sb.append("]");
        return sb.toString();
    }

    public VAnchor getBaseline() {
        return this.j;
    }

    public VAnchor getBottom() {
        return this.g;
    }

    public float getCircleAngle() {
        return this.r;
    }

    public String getCircleConstraint() {
        return this.p;
    }

    public int getCircleRadius() {
        return this.q;
    }

    public String getDimensionRatio() {
        return this.o;
    }

    public int getEditorAbsoluteX() {
        return this.s;
    }

    public int getEditorAbsoluteY() {
        return this.t;
    }

    public HAnchor getEnd() {
        return this.i;
    }

    public int getHeight() {
        return this.l;
    }

    public Behaviour getHeightDefault() {
        return this.z;
    }

    public int getHeightMax() {
        return this.B;
    }

    public int getHeightMin() {
        return this.D;
    }

    public float getHeightPercent() {
        return this.F;
    }

    public float getHorizontalBias() {
        return this.m;
    }

    public ChainMode getHorizontalChainStyle() {
        return this.w;
    }

    public float getHorizontalWeight() {
        return this.v;
    }

    public HAnchor getLeft() {
        return this.d;
    }

    public String[] getReferenceIds() {
        return this.G;
    }

    public HAnchor getRight() {
        return this.e;
    }

    public HAnchor getStart() {
        return this.h;
    }

    public VAnchor getTop() {
        return this.f;
    }

    public float getVerticalBias() {
        return this.n;
    }

    public ChainMode getVerticalChainStyle() {
        return this.x;
    }

    public float getVerticalWeight() {
        return this.u;
    }

    public int getWidth() {
        return this.k;
    }

    public Behaviour getWidthDefault() {
        return this.y;
    }

    public int getWidthMax() {
        return this.A;
    }

    public int getWidthMin() {
        return this.C;
    }

    public float getWidthPercent() {
        return this.E;
    }

    public boolean isConstrainedHeight() {
        return this.I;
    }

    public boolean isConstrainedWidth() {
        return this.H;
    }

    public void linkToBaseline(VAnchor vAnchor, int i, int i2) {
        VAnchor vAnchor2 = this.j;
        vAnchor2.mConnection = vAnchor;
        vAnchor2.mMargin = i;
        vAnchor2.mGoneMargin = i2;
    }

    public void linkToBottom(VAnchor vAnchor, int i, int i2) {
        VAnchor vAnchor2 = this.g;
        vAnchor2.mConnection = vAnchor;
        vAnchor2.mMargin = i;
        vAnchor2.mGoneMargin = i2;
    }

    public void linkToEnd(HAnchor hAnchor, int i, int i2) {
        HAnchor hAnchor2 = this.i;
        hAnchor2.mConnection = hAnchor;
        hAnchor2.mMargin = i;
        hAnchor2.mGoneMargin = i2;
    }

    public void linkToLeft(HAnchor hAnchor, int i, int i2) {
        HAnchor hAnchor2 = this.d;
        hAnchor2.mConnection = hAnchor;
        hAnchor2.mMargin = i;
        hAnchor2.mGoneMargin = i2;
    }

    public void linkToRight(HAnchor hAnchor, int i, int i2) {
        HAnchor hAnchor2 = this.e;
        hAnchor2.mConnection = hAnchor;
        hAnchor2.mMargin = i;
        hAnchor2.mGoneMargin = i2;
    }

    public void linkToStart(HAnchor hAnchor, int i, int i2) {
        HAnchor hAnchor2 = this.h;
        hAnchor2.mConnection = hAnchor;
        hAnchor2.mMargin = i;
        hAnchor2.mGoneMargin = i2;
    }

    public void linkToTop(VAnchor vAnchor, int i, int i2) {
        VAnchor vAnchor2 = this.f;
        vAnchor2.mConnection = vAnchor;
        vAnchor2.mMargin = i;
        vAnchor2.mGoneMargin = i2;
    }

    public void setCircleAngle(float f) {
        this.r = f;
    }

    public void setCircleConstraint(String str) {
        this.p = str;
    }

    public void setCircleRadius(int i) {
        this.q = i;
    }

    public void setConstrainedHeight(boolean z) {
        this.I = z;
    }

    public void setConstrainedWidth(boolean z) {
        this.H = z;
    }

    public void setDimensionRatio(String str) {
        this.o = str;
    }

    public void setEditorAbsoluteX(int i) {
        this.s = i;
    }

    public void setEditorAbsoluteY(int i) {
        this.t = i;
    }

    public void setHeight(int i) {
        this.l = i;
    }

    public void setHeightDefault(Behaviour behaviour) {
        this.z = behaviour;
    }

    public void setHeightMax(int i) {
        this.B = i;
    }

    public void setHeightMin(int i) {
        this.D = i;
    }

    public void setHeightPercent(float f) {
        this.F = f;
    }

    public void setHorizontalBias(float f) {
        this.m = f;
    }

    public void setHorizontalChainStyle(ChainMode chainMode) {
        this.w = chainMode;
    }

    public void setHorizontalWeight(float f) {
        this.v = f;
    }

    public void setReferenceIds(String[] strArr) {
        this.G = strArr;
    }

    public void setVerticalBias(float f) {
        this.n = f;
    }

    public void setVerticalChainStyle(ChainMode chainMode) {
        this.x = chainMode;
    }

    public void setVerticalWeight(float f) {
        this.u = f;
    }

    public void setWidth(int i) {
        this.k = i;
    }

    public void setWidthDefault(Behaviour behaviour) {
        this.y = behaviour;
    }

    public void setWidthMax(int i) {
        this.A = i;
    }

    public void setWidthMin(int i) {
        this.C = i;
    }

    public void setWidthPercent(float f) {
        this.E = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(w.t(new StringBuilder(), this.a, ":{\n"));
        this.d.build(sb);
        this.e.build(sb);
        this.f.build(sb);
        this.g.build(sb);
        this.h.build(sb);
        this.i.build(sb);
        this.j.build(sb);
        if (this.k != K) {
            sb.append("width:");
            sb.append(this.k);
            sb.append(",\n");
        }
        if (this.l != K) {
            sb.append("height:");
            sb.append(this.l);
            sb.append(",\n");
        }
        append(sb, "horizontalBias", this.m);
        append(sb, "verticalBias", this.n);
        if (this.o != null) {
            sb.append("dimensionRatio:'");
            sb.append(this.o);
            sb.append("',\n");
        }
        if (this.p != null && (!Float.isNaN(this.r) || this.q != Integer.MIN_VALUE)) {
            sb.append("circular:['");
            sb.append(this.p);
            sb.append("'");
            if (!Float.isNaN(this.r)) {
                sb.append(",");
                sb.append(this.r);
            }
            if (this.q != Integer.MIN_VALUE) {
                if (Float.isNaN(this.r)) {
                    sb.append(",0,");
                    sb.append(this.q);
                } else {
                    sb.append(",");
                    sb.append(this.q);
                }
            }
            sb.append("],\n");
        }
        append(sb, "verticalWeight", this.u);
        append(sb, "horizontalWeight", this.v);
        if (this.w != null) {
            sb.append("horizontalChainStyle:'");
            sb.append(L.get(this.w));
            sb.append("',\n");
        }
        if (this.x != null) {
            sb.append("verticalChainStyle:'");
            sb.append(L.get(this.x));
            sb.append("',\n");
        }
        if (this.y != null) {
            int i = this.A;
            int i2 = K;
            if (i == i2 && this.C == i2) {
                sb.append("width:'");
                sb.append(this.y.toString().toLowerCase());
                sb.append("',\n");
            } else {
                sb.append("width:{value:'");
                sb.append(this.y.toString().toLowerCase());
                sb.append("'");
                if (this.A != K) {
                    sb.append(",max:");
                    sb.append(this.A);
                }
                if (this.C != K) {
                    sb.append(",min:");
                    sb.append(this.C);
                }
                sb.append("},\n");
            }
        }
        if (this.z != null) {
            int i3 = this.B;
            int i4 = K;
            if (i3 == i4 && this.D == i4) {
                sb.append("height:'");
                sb.append(this.z.toString().toLowerCase());
                sb.append("',\n");
            } else {
                sb.append("height:{value:'");
                sb.append(this.z.toString().toLowerCase());
                sb.append("'");
                if (this.B != K) {
                    sb.append(",max:");
                    sb.append(this.B);
                }
                if (this.D != K) {
                    sb.append(",min:");
                    sb.append(this.D);
                }
                sb.append("},\n");
            }
        }
        if (!Double.isNaN(this.E)) {
            sb.append("width:'");
            sb.append((int) this.E);
            sb.append("%',\n");
        }
        if (!Double.isNaN(this.F)) {
            sb.append("height:'");
            sb.append((int) this.F);
            sb.append("%',\n");
        }
        if (this.G != null) {
            sb.append("referenceIds:");
            sb.append(convertStringArrayToString(this.G));
            sb.append(",\n");
        }
        if (this.H) {
            sb.append("constrainedWidth:");
            sb.append(this.H);
            sb.append(",\n");
        }
        if (this.I) {
            sb.append("constrainedHeight:");
            sb.append(this.I);
            sb.append(",\n");
        }
        sb.append("},\n");
        return sb.toString();
    }

    public void linkToBaseline(VAnchor vAnchor, int i) {
        linkToBaseline(vAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToBottom(VAnchor vAnchor, int i) {
        linkToBottom(vAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToEnd(HAnchor hAnchor, int i) {
        linkToEnd(hAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToLeft(HAnchor hAnchor, int i) {
        linkToLeft(hAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToRight(HAnchor hAnchor, int i) {
        linkToRight(hAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToStart(HAnchor hAnchor, int i) {
        linkToStart(hAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToTop(VAnchor vAnchor, int i) {
        linkToTop(vAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToBaseline(VAnchor vAnchor) {
        linkToBaseline(vAnchor, 0);
    }

    public void linkToBottom(VAnchor vAnchor) {
        linkToBottom(vAnchor, 0);
    }

    public void linkToEnd(HAnchor hAnchor) {
        linkToEnd(hAnchor, 0);
    }

    public void linkToLeft(HAnchor hAnchor) {
        linkToLeft(hAnchor, 0);
    }

    public void linkToRight(HAnchor hAnchor) {
        linkToRight(hAnchor, 0);
    }

    public void linkToStart(HAnchor hAnchor) {
        linkToStart(hAnchor, 0);
    }

    public void linkToTop(VAnchor vAnchor) {
        linkToTop(vAnchor, 0);
    }
}
