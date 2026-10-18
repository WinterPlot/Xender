package androidx.constraintlayout.core.motion.utils;

import com.userlabs.xshare.core.create.XCreateApException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class ArcCurveFit extends androidx.constraintlayout.core.motion.utils.a {
    public static final int ARC_ABOVE = 5;
    public static final int ARC_BELOW = 4;
    public static final int ARC_START_FLIP = 3;
    public static final int ARC_START_HORIZONTAL = 2;
    public static final int ARC_START_LINEAR = 0;
    public static final int ARC_START_VERTICAL = 1;
    private static final int DOWN_ARC = 4;
    private static final int START_HORIZONTAL = 2;
    private static final int START_LINEAR = 3;
    private static final int START_VERTICAL = 1;
    private static final int UP_ARC = 5;
    a[] mArcs;
    private boolean mExtrapolate = true;
    private final double[] mTime;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a {
        private static double[] s = new double[91];
        double[] a;
        double b;
        double c;
        double d;
        double e;
        double f;
        double g;
        double h;
        double i;
        double j;
        double k;
        double l;
        double m;
        double n;
        double o;
        double p;
        boolean q;
        boolean r;

        public a(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            boolean z = false;
            this.r = false;
            double d7 = d5 - d3;
            double d8 = d6 - d4;
            if (i == 1) {
                this.q = true;
            } else if (i == 4) {
                this.q = d8 > 0.0d;
            } else if (i != 5) {
                this.q = false;
            } else {
                this.q = d8 < 0.0d;
            }
            this.c = d;
            this.d = d2;
            this.i = 1.0d / (d2 - d);
            if (3 == i) {
                this.r = true;
                z = true;
            }
            if (!z && Math.abs(d7) >= 0.001d && Math.abs(d8) >= 0.001d) {
                this.a = new double[XCreateApException.CODE_CLOSE_AP];
                boolean z2 = this.q;
                this.j = d7 * ((double) (z2 ? -1 : 1));
                this.k = d8 * ((double) (z2 ? 1 : -1));
                this.l = z2 ? d5 : d3;
                this.m = z2 ? d4 : d6;
                buildTable(d3, d4, d5, d6);
                this.n = this.b * this.i;
                return;
            }
            this.r = true;
            this.e = d3;
            this.f = d5;
            this.g = d4;
            this.h = d6;
            double dHypot = Math.hypot(d8, d7);
            this.b = dHypot;
            this.n = dHypot * this.i;
            double d9 = this.d;
            double d10 = this.c;
            this.l = d7 / (d9 - d10);
            this.m = d8 / (d9 - d10);
        }

        private void buildTable(double d, double d2, double d3, double d4) {
            double d5 = d3 - d;
            double d6 = d2 - d4;
            int i = 0;
            double dHypot = 0.0d;
            double d7 = 0.0d;
            double d8 = 0.0d;
            while (true) {
                double[] dArr = s;
                if (i >= dArr.length) {
                    break;
                }
                int i2 = i;
                double radians = Math.toRadians((((double) i) * 90.0d) / ((double) (dArr.length - 1)));
                double dSin = Math.sin(radians) * d5;
                double dCos = Math.cos(radians) * d6;
                if (i2 > 0) {
                    dHypot += Math.hypot(dSin - d7, dCos - d8);
                    s[i2] = dHypot;
                }
                i = i2 + 1;
                d7 = dSin;
                d8 = dCos;
            }
            this.b = dHypot;
            int i3 = 0;
            while (true) {
                double[] dArr2 = s;
                if (i3 >= dArr2.length) {
                    break;
                }
                dArr2[i3] = dArr2[i3] / dHypot;
                i3++;
            }
            int i4 = 0;
            while (true) {
                double[] dArr3 = this.a;
                if (i4 >= dArr3.length) {
                    return;
                }
                double length = ((double) i4) / ((double) (dArr3.length - 1));
                int iBinarySearch = Arrays.binarySearch(s, length);
                if (iBinarySearch >= 0) {
                    this.a[i4] = ((double) iBinarySearch) / ((double) (s.length - 1));
                } else if (iBinarySearch == -1) {
                    this.a[i4] = 0.0d;
                } else {
                    int i5 = -iBinarySearch;
                    int i6 = i5 - 2;
                    double[] dArr4 = s;
                    double d9 = dArr4[i6];
                    this.a[i4] = (((length - d9) / (dArr4[i5 - 1] - d9)) + ((double) i6)) / ((double) (dArr4.length - 1));
                }
                i4++;
            }
        }

        public double getDX() {
            double d = this.j * this.p;
            double dHypot = this.n / Math.hypot(d, (-this.k) * this.o);
            return this.q ? (-d) * dHypot : d * dHypot;
        }

        public double getDY() {
            double d = this.j * this.p;
            double d2 = (-this.k) * this.o;
            double dHypot = this.n / Math.hypot(d, d2);
            return this.q ? (-d2) * dHypot : d2 * dHypot;
        }

        public double getLinearDX(double d) {
            return this.l;
        }

        public double getLinearDY(double d) {
            return this.m;
        }

        public double getLinearX(double d) {
            double d2 = (d - this.c) * this.i;
            double d3 = this.e;
            return ((this.f - d3) * d2) + d3;
        }

        public double getLinearY(double d) {
            double d2 = (d - this.c) * this.i;
            double d3 = this.g;
            return ((this.h - d3) * d2) + d3;
        }

        public double getX() {
            return (this.j * this.o) + this.l;
        }

        public double getY() {
            return (this.k * this.p) + this.m;
        }

        public double lookup(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.a;
            double length = d * ((double) (dArr.length - 1));
            int i = (int) length;
            double d2 = length - ((double) i);
            double d3 = dArr[i];
            return ((dArr[i + 1] - d3) * d2) + d3;
        }

        public void setPoint(double d) {
            double dLookup = lookup((this.q ? this.d - d : d - this.c) * this.i) * 1.5707963267948966d;
            this.o = Math.sin(dLookup);
            this.p = Math.cos(dLookup);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    public ArcCurveFit(int[] iArr, double[] dArr, double[][] dArr2) {
        this.mTime = dArr;
        this.mArcs = new a[dArr.length - 1];
        int i = 1;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            a[] aVarArr = this.mArcs;
            if (i3 >= aVarArr.length) {
                return;
            }
            int i4 = iArr[i3];
            int i5 = 3;
            if (i4 != 0) {
                if (i4 == 1) {
                    i = 1;
                    i5 = i;
                } else {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            i5 = 4;
                            if (i4 != 4) {
                                i5 = 5;
                                if (i4 != 5) {
                                    i5 = i2;
                                }
                            }
                        } else {
                            if (i != 1) {
                                i = 1;
                            }
                            i5 = i;
                        }
                    }
                    i = 2;
                    i5 = i;
                }
            }
            double d = dArr[i3];
            int i6 = i3 + 1;
            double d2 = dArr[i6];
            double[] dArr3 = dArr2[i3];
            double d3 = dArr3[0];
            double d4 = dArr3[1];
            double[] dArr4 = dArr2[i6];
            aVarArr[i3] = new a(i5, d, d2, d3, d4, dArr4[0], dArr4[1]);
            i3 = i6;
            i2 = i5;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.a
    public void getPos(double d, double[] dArr) {
        boolean z = this.mExtrapolate;
        a[] aVarArr = this.mArcs;
        if (z) {
            a aVar = aVarArr[0];
            double d2 = aVar.c;
            if (d < d2) {
                double d3 = d - d2;
                if (aVar.r) {
                    dArr[0] = (this.mArcs[0].getLinearDX(d2) * d3) + aVar.getLinearX(d2);
                    dArr[1] = (d3 * this.mArcs[0].getLinearDY(d2)) + this.mArcs[0].getLinearY(d2);
                    return;
                }
                aVar.setPoint(d2);
                dArr[0] = (this.mArcs[0].getDX() * d3) + this.mArcs[0].getX();
                dArr[1] = (d3 * this.mArcs[0].getDY()) + this.mArcs[0].getY();
                return;
            }
            if (d > aVarArr[aVarArr.length - 1].d) {
                double d4 = aVarArr[aVarArr.length - 1].d;
                double d5 = d - d4;
                int length = aVarArr.length - 1;
                a aVar2 = aVarArr[length];
                if (aVar2.r) {
                    dArr[0] = (this.mArcs[length].getLinearDX(d4) * d5) + aVar2.getLinearX(d4);
                    dArr[1] = (d5 * this.mArcs[length].getLinearDY(d4)) + this.mArcs[length].getLinearY(d4);
                    return;
                }
                aVar2.setPoint(d);
                dArr[0] = (this.mArcs[length].getDX() * d5) + this.mArcs[length].getX();
                dArr[1] = (d5 * this.mArcs[length].getDY()) + this.mArcs[length].getY();
                return;
            }
        } else {
            double d6 = aVarArr[0].c;
            if (d < d6) {
                d = d6;
            }
            if (d > aVarArr[aVarArr.length - 1].d) {
                d = aVarArr[aVarArr.length - 1].d;
            }
        }
        int i = 0;
        while (true) {
            a[] aVarArr2 = this.mArcs;
            if (i >= aVarArr2.length) {
                return;
            }
            a aVar3 = aVarArr2[i];
            if (d <= aVar3.d) {
                if (aVar3.r) {
                    dArr[0] = aVar3.getLinearX(d);
                    dArr[1] = this.mArcs[i].getLinearY(d);
                    return;
                } else {
                    aVar3.setPoint(d);
                    dArr[0] = this.mArcs[i].getX();
                    dArr[1] = this.mArcs[i].getY();
                    return;
                }
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.a
    public void getSlope(double d, double[] dArr) {
        a[] aVarArr = this.mArcs;
        double d2 = aVarArr[0].c;
        if (d < d2) {
            d = d2;
        } else if (d > aVarArr[aVarArr.length - 1].d) {
            d = aVarArr[aVarArr.length - 1].d;
        }
        int i = 0;
        while (true) {
            a[] aVarArr2 = this.mArcs;
            if (i >= aVarArr2.length) {
                return;
            }
            a aVar = aVarArr2[i];
            if (d <= aVar.d) {
                if (aVar.r) {
                    dArr[0] = aVar.getLinearDX(d);
                    dArr[1] = this.mArcs[i].getLinearDY(d);
                    return;
                } else {
                    aVar.setPoint(d);
                    dArr[0] = this.mArcs[i].getDX();
                    dArr[1] = this.mArcs[i].getDY();
                    return;
                }
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.a
    public double[] getTimePoints() {
        return this.mTime;
    }

    @Override // androidx.constraintlayout.core.motion.utils.a
    public double getSlope(double d, int i) {
        a[] aVarArr = this.mArcs;
        int i2 = 0;
        double d2 = aVarArr[0].c;
        if (d < d2) {
            d = d2;
        }
        if (d > aVarArr[aVarArr.length - 1].d) {
            d = aVarArr[aVarArr.length - 1].d;
        }
        while (true) {
            a[] aVarArr2 = this.mArcs;
            if (i2 >= aVarArr2.length) {
                return Double.NaN;
            }
            a aVar = aVarArr2[i2];
            if (d <= aVar.d) {
                if (aVar.r) {
                    if (i == 0) {
                        return aVar.getLinearDX(d);
                    }
                    return aVar.getLinearDY(d);
                }
                aVar.setPoint(d);
                a[] aVarArr3 = this.mArcs;
                if (i == 0) {
                    return aVarArr3[i2].getDX();
                }
                return aVarArr3[i2].getDY();
            }
            i2++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.a
    public void getPos(double d, float[] fArr) {
        boolean z = this.mExtrapolate;
        a[] aVarArr = this.mArcs;
        if (z) {
            a aVar = aVarArr[0];
            double d2 = aVar.c;
            if (d < d2) {
                double d3 = d - d2;
                if (aVar.r) {
                    fArr[0] = (float) ((this.mArcs[0].getLinearDX(d2) * d3) + aVar.getLinearX(d2));
                    fArr[1] = (float) ((d3 * this.mArcs[0].getLinearDY(d2)) + this.mArcs[0].getLinearY(d2));
                    return;
                }
                aVar.setPoint(d2);
                fArr[0] = (float) ((this.mArcs[0].getDX() * d3) + this.mArcs[0].getX());
                fArr[1] = (float) ((d3 * this.mArcs[0].getDY()) + this.mArcs[0].getY());
                return;
            }
            if (d > aVarArr[aVarArr.length - 1].d) {
                double d4 = aVarArr[aVarArr.length - 1].d;
                double d5 = d - d4;
                int length = aVarArr.length - 1;
                a aVar2 = aVarArr[length];
                if (aVar2.r) {
                    fArr[0] = (float) ((this.mArcs[length].getLinearDX(d4) * d5) + aVar2.getLinearX(d4));
                    fArr[1] = (float) ((d5 * this.mArcs[length].getLinearDY(d4)) + this.mArcs[length].getLinearY(d4));
                    return;
                }
                aVar2.setPoint(d);
                fArr[0] = (float) this.mArcs[length].getX();
                fArr[1] = (float) this.mArcs[length].getY();
                return;
            }
        } else {
            double d6 = aVarArr[0].c;
            if (d < d6) {
                d = d6;
            } else if (d > aVarArr[aVarArr.length - 1].d) {
                d = aVarArr[aVarArr.length - 1].d;
            }
        }
        int i = 0;
        while (true) {
            a[] aVarArr2 = this.mArcs;
            if (i >= aVarArr2.length) {
                return;
            }
            a aVar3 = aVarArr2[i];
            if (d <= aVar3.d) {
                if (aVar3.r) {
                    fArr[0] = (float) aVar3.getLinearX(d);
                    fArr[1] = (float) this.mArcs[i].getLinearY(d);
                    return;
                } else {
                    aVar3.setPoint(d);
                    fArr[0] = (float) this.mArcs[i].getX();
                    fArr[1] = (float) this.mArcs[i].getY();
                    return;
                }
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.a
    public double getPos(double d, int i) {
        boolean z = this.mExtrapolate;
        a[] aVarArr = this.mArcs;
        int i2 = 0;
        if (z) {
            a aVar = aVarArr[0];
            double d2 = aVar.c;
            if (d < d2) {
                double d3 = d - d2;
                if (aVar.r) {
                    if (i == 0) {
                        return (d3 * this.mArcs[0].getLinearDX(d2)) + aVar.getLinearX(d2);
                    }
                    return (d3 * this.mArcs[0].getLinearDY(d2)) + aVar.getLinearY(d2);
                }
                aVar.setPoint(d2);
                a[] aVarArr2 = this.mArcs;
                if (i == 0) {
                    return (d3 * this.mArcs[0].getDX()) + aVarArr2[0].getX();
                }
                return (d3 * this.mArcs[0].getDY()) + aVarArr2[0].getY();
            }
            if (d > aVarArr[aVarArr.length - 1].d) {
                double d4 = aVarArr[aVarArr.length - 1].d;
                double d5 = d - d4;
                int length = aVarArr.length - 1;
                if (i == 0) {
                    return (d5 * this.mArcs[length].getLinearDX(d4)) + aVarArr[length].getLinearX(d4);
                }
                return (d5 * this.mArcs[length].getLinearDY(d4)) + aVarArr[length].getLinearY(d4);
            }
        } else {
            double d6 = aVarArr[0].c;
            if (d < d6) {
                d = d6;
            } else if (d > aVarArr[aVarArr.length - 1].d) {
                d = aVarArr[aVarArr.length - 1].d;
            }
        }
        while (true) {
            a[] aVarArr3 = this.mArcs;
            if (i2 >= aVarArr3.length) {
                return Double.NaN;
            }
            a aVar2 = aVarArr3[i2];
            if (d <= aVar2.d) {
                if (aVar2.r) {
                    if (i == 0) {
                        return aVar2.getLinearX(d);
                    }
                    return aVar2.getLinearY(d);
                }
                aVar2.setPoint(d);
                a[] aVarArr4 = this.mArcs;
                if (i == 0) {
                    return aVarArr4[i2].getX();
                }
                return aVarArr4[i2].getY();
            }
            i2++;
        }
    }
}
