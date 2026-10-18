package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class Schlick extends c {
    private static final boolean DEBUG = false;
    double mEps;
    double mS;
    double mT;

    public Schlick(String str) {
        this.mStr = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.mS = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i = iIndexOf2 + 1;
        this.mT = Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    private double dfunc(double d) {
        double d2 = this.mT;
        double d3 = this.mS;
        if (d < d2) {
            return ((d3 * d2) * d2) / ((((d2 - d) * d3) + d) * (((d2 - d) * d3) + d));
        }
        double d4 = d2 - d;
        return ((d2 - 1.0d) * ((d2 - 1.0d) * d3)) / (((((d2 - d) * (-d3)) - d) + 1.0d) * (((d4 * (-d3)) - d) + 1.0d));
    }

    private double func(double d) {
        double d2 = this.mT;
        double d3 = this.mS;
        if (d < d2) {
            return (d2 * d) / (((d2 - d) * d3) + d);
        }
        return ((d - 1.0d) * (1.0d - d2)) / ((1.0d - d) - ((d2 - d) * d3));
    }

    @Override // androidx.constraintlayout.core.motion.utils.c
    public double get(double d) {
        return func(d);
    }

    @Override // androidx.constraintlayout.core.motion.utils.c
    public double getDiff(double d) {
        return dfunc(d);
    }
}
