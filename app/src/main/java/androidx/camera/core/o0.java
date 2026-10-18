package androidx.camera.core;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {
    private final List<q1> a;
    private final List<q1> b;
    private final List<q1> c;
    private final long d;

    public o0(a aVar) {
        this.a = DesugarCollections.unmodifiableList(aVar.a);
        this.b = DesugarCollections.unmodifiableList(aVar.b);
        this.c = DesugarCollections.unmodifiableList(aVar.c);
        this.d = aVar.d;
    }

    public long getAutoCancelDurationInMillis() {
        return this.d;
    }

    public List<q1> getMeteringPointsAe() {
        return this.b;
    }

    public List<q1> getMeteringPointsAf() {
        return this.a;
    }

    public List<q1> getMeteringPointsAwb() {
        return this.c;
    }

    public boolean isAutoCancelEnabled() {
        return this.d > 0;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a {
        final List<q1> a;
        final List<q1> b;
        final List<q1> c;
        long d;

        public a(o0 o0Var) {
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.b = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this.c = arrayList3;
            this.d = 5000L;
            arrayList.addAll(o0Var.getMeteringPointsAf());
            arrayList2.addAll(o0Var.getMeteringPointsAe());
            arrayList3.addAll(o0Var.getMeteringPointsAwb());
            this.d = o0Var.getAutoCancelDurationInMillis();
        }

        public a addPoint(q1 q1Var, int i) {
            boolean z = false;
            androidx.core.util.i.checkArgument(q1Var != null, "Point cannot be null.");
            if (i >= 1 && i <= 7) {
                z = true;
            }
            androidx.core.util.i.checkArgument(z, "Invalid metering mode " + i);
            if ((i & 1) != 0) {
                this.a.add(q1Var);
            }
            if ((i & 2) != 0) {
                this.b.add(q1Var);
            }
            if ((i & 4) != 0) {
                this.c.add(q1Var);
            }
            return this;
        }

        public o0 build() {
            return new o0(this);
        }

        public a disableAutoCancel() {
            this.d = 0L;
            return this;
        }

        public a removePoints(int i) {
            if ((i & 1) != 0) {
                this.a.clear();
            }
            if ((i & 2) != 0) {
                this.b.clear();
            }
            if ((i & 4) != 0) {
                this.c.clear();
            }
            return this;
        }

        public a setAutoCancelDuration(long j, TimeUnit timeUnit) {
            androidx.core.util.i.checkArgument(j >= 1, "autoCancelDuration must be at least 1");
            this.d = timeUnit.toMillis(j);
            return this;
        }

        public a(q1 q1Var, int i) {
            this.a = new ArrayList();
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = 5000L;
            addPoint(q1Var, i);
        }

        public a(q1 q1Var) {
            this(q1Var, 7);
        }

        public a addPoint(q1 q1Var) {
            return addPoint(q1Var, 7);
        }
    }
}
