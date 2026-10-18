package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public class r {

    @Deprecated
    public float a;

    @Deprecated
    public float b;

    @Deprecated
    public float c;

    @Deprecated
    public float d;

    @Deprecated
    public float e;

    @Deprecated
    public float f;
    private final List<h> g = new ArrayList();
    private final List<j> h = new ArrayList();
    private boolean i;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a extends j {
        final /* synthetic */ List c;
        final /* synthetic */ Matrix d;

        public a(List list, Matrix matrix) {
            this.c = list;
            this.d = matrix;
        }

        @Override // com.google.android.material.shape.r.j
        public void draw(Matrix matrix, com.google.android.material.shadow.a aVar, int i, Canvas canvas) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((j) it.next()).draw(this.d, aVar, i, canvas);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class b extends j {
        private final e c;

        public b(e eVar) {
            this.c = eVar;
        }

        @Override // com.google.android.material.shape.r.j
        public void draw(Matrix matrix, com.google.android.material.shadow.a aVar, int i, Canvas canvas) {
            aVar.drawCornerShadow(canvas, matrix, new RectF(this.c.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom()), i, this.c.getStartAngle(), this.c.getSweepAngle());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class c extends j {
        private final g c;
        private final g d;
        private final float e;
        private final float f;

        public c(g gVar, g gVar2, float f, float f2) {
            this.c = gVar;
            this.d = gVar2;
            this.e = f;
            this.f = f2;
        }

        @Override // com.google.android.material.shape.r.j
        public void draw(Matrix matrix, com.google.android.material.shadow.a aVar, int i, Canvas canvas) {
            int i2;
            float sweepAngle = getSweepAngle();
            if (sweepAngle > 0.0f) {
                return;
            }
            double dHypot = Math.hypot(this.c.b - this.e, this.c.c - this.f);
            double dHypot2 = Math.hypot(this.d.b - this.c.b, this.d.c - this.c.c);
            float fMin = (float) Math.min(i, Math.min(dHypot, dHypot2));
            double d = fMin;
            double dTan = Math.tan(Math.toRadians((-sweepAngle) / 2.0f)) * d;
            if (dHypot > dTan) {
                RectF rectF = new RectF(0.0f, 0.0f, (float) (dHypot - dTan), 0.0f);
                this.a.set(matrix);
                this.a.preTranslate(this.e, this.f);
                this.a.preRotate(getStartAngle());
                i2 = i;
                aVar.drawEdgeShadow(canvas, this.a, rectF, i2);
            } else {
                i2 = i;
            }
            float f = fMin * 2.0f;
            RectF rectF2 = new RectF(0.0f, 0.0f, f, f);
            this.a.set(matrix);
            this.a.preTranslate(this.c.b, this.c.c);
            this.a.preRotate(getStartAngle());
            this.a.preTranslate((float) ((-dTan) - d), (-2.0f) * fMin);
            aVar.drawInnerCornerShadow(canvas, this.a, rectF2, (int) fMin, 450.0f, sweepAngle, new float[]{(float) (d + dTan), f});
            if (dHypot2 > dTan) {
                RectF rectF3 = new RectF(0.0f, 0.0f, (float) (dHypot2 - dTan), 0.0f);
                this.a.set(matrix);
                this.a.preTranslate(this.c.b, this.c.c);
                this.a.preRotate(getEndAngle());
                this.a.preTranslate((float) dTan, 0.0f);
                aVar.drawEdgeShadow(canvas, this.a, rectF3, i2);
            }
        }

        public float getEndAngle() {
            return (float) Math.toDegrees(Math.atan((this.d.c - this.c.c) / (this.d.b - this.c.b)));
        }

        public float getStartAngle() {
            return (float) Math.toDegrees(Math.atan((this.c.c - this.f) / (this.c.b - this.e)));
        }

        public float getSweepAngle() {
            float endAngle = ((getEndAngle() - getStartAngle()) + 360.0f) % 360.0f;
            return endAngle <= 180.0f ? endAngle : endAngle - 360.0f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class d extends j {
        private final g c;
        private final float d;
        private final float e;

        public d(g gVar, float f, float f2) {
            this.c = gVar;
            this.d = f;
            this.e = f2;
        }

        @Override // com.google.android.material.shape.r.j
        public void draw(Matrix matrix, com.google.android.material.shadow.a aVar, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.c.c - this.e, this.c.b - this.d), 0.0f);
            this.a.set(matrix);
            this.a.preTranslate(this.d, this.e);
            this.a.preRotate(getAngle());
            aVar.drawEdgeShadow(canvas, this.a, rectF, i);
        }

        public float getAngle() {
            return (float) Math.toDegrees(Math.atan((this.c.c - this.e) / (this.c.b - this.d)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class e extends h {
        private static final RectF h = new RectF();

        @Deprecated
        public float b;

        @Deprecated
        public float c;

        @Deprecated
        public float d;

        @Deprecated
        public float e;

        @Deprecated
        public float f;

        @Deprecated
        public float g;

        public e(float f, float f2, float f3, float f4) {
            setLeft(f);
            setTop(f2);
            setRight(f3);
            setBottom(f4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getBottom() {
            return this.e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getLeft() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getRight() {
            return this.d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getStartAngle() {
            return this.f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getSweepAngle() {
            return this.g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getTop() {
            return this.c;
        }

        private void setBottom(float f) {
            this.e = f;
        }

        private void setLeft(float f) {
            this.b = f;
        }

        private void setRight(float f) {
            this.d = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartAngle(float f) {
            this.f = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSweepAngle(float f) {
            this.g = f;
        }

        private void setTop(float f) {
            this.c = f;
        }

        @Override // com.google.android.material.shape.r.h
        public void applyToPath(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = h;
            rectF.set(getLeft(), getTop(), getRight(), getBottom());
            path.arcTo(rectF, getStartAngle(), getSweepAngle(), false);
            path.transform(matrix);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class f extends h {
        private float b;
        private float c;
        private float d;
        private float e;
        private float f;
        private float g;

        public f(float f, float f2, float f3, float f4, float f5, float f6) {
            setControlX1(f);
            setControlY1(f2);
            setControlX2(f3);
            setControlY2(f4);
            setEndX(f5);
            setEndY(f6);
        }

        private float getControlX1() {
            return this.b;
        }

        private float getControlX2() {
            return this.d;
        }

        private float getControlY1() {
            return this.c;
        }

        private float getControlY2() {
            return this.c;
        }

        private float getEndX() {
            return this.f;
        }

        private float getEndY() {
            return this.g;
        }

        private void setControlX1(float f) {
            this.b = f;
        }

        private void setControlX2(float f) {
            this.d = f;
        }

        private void setControlY1(float f) {
            this.c = f;
        }

        private void setControlY2(float f) {
            this.e = f;
        }

        private void setEndX(float f) {
            this.f = f;
        }

        private void setEndY(float f) {
            this.g = f;
        }

        @Override // com.google.android.material.shape.r.h
        public void applyToPath(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.b, this.c, this.d, this.e, this.f, this.g);
            path.transform(matrix);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class g extends h {
        private float b;
        private float c;

        @Override // com.google.android.material.shape.r.h
        public void applyToPath(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.c);
            path.transform(matrix);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class h {
        protected final Matrix a = new Matrix();

        public abstract void applyToPath(Matrix matrix, Path path);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class i extends h {

        @Deprecated
        public float b;

        @Deprecated
        public float c;

        @Deprecated
        public float d;

        @Deprecated
        public float e;

        private float getControlX() {
            return this.b;
        }

        private float getControlY() {
            return this.c;
        }

        private float getEndX() {
            return this.d;
        }

        private float getEndY() {
            return this.e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setControlX(float f) {
            this.b = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setControlY(float f) {
            this.c = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndX(float f) {
            this.d = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndY(float f) {
            this.e = f;
        }

        @Override // com.google.android.material.shape.r.h
        public void applyToPath(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(getControlX(), getControlY(), getEndX(), getEndY());
            path.transform(matrix);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class j {
        static final Matrix b = new Matrix();
        final Matrix a = new Matrix();

        public abstract void draw(Matrix matrix, com.google.android.material.shadow.a aVar, int i, Canvas canvas);

        public final void draw(com.google.android.material.shadow.a aVar, int i, Canvas canvas) {
            draw(b, aVar, i, canvas);
        }
    }

    public r() {
        reset(0.0f, 0.0f);
    }

    private void addConnectingShadowIfNecessary(float f2) {
        if (getCurrentShadowAngle() == f2) {
            return;
        }
        float currentShadowAngle = ((f2 - getCurrentShadowAngle()) + 360.0f) % 360.0f;
        if (currentShadowAngle > 180.0f) {
            return;
        }
        e eVar = new e(getEndX(), getEndY(), getEndX(), getEndY());
        eVar.setStartAngle(getCurrentShadowAngle());
        eVar.setSweepAngle(currentShadowAngle);
        this.h.add(new b(eVar));
        setCurrentShadowAngle(f2);
    }

    private void addShadowCompatOperation(j jVar, float f2, float f3) {
        addConnectingShadowIfNecessary(f2);
        this.h.add(jVar);
        setCurrentShadowAngle(f3);
    }

    private float getCurrentShadowAngle() {
        return this.e;
    }

    private float getEndShadowAngle() {
        return this.f;
    }

    private void setCurrentShadowAngle(float f2) {
        this.e = f2;
    }

    private void setEndShadowAngle(float f2) {
        this.f = f2;
    }

    private void setEndX(float f2) {
        this.c = f2;
    }

    private void setEndY(float f2) {
        this.d = f2;
    }

    private void setStartX(float f2) {
        this.a = f2;
    }

    private void setStartY(float f2) {
        this.b = f2;
    }

    public void addArc(float f2, float f3, float f4, float f5, float f6, float f7) {
        e eVar = new e(f2, f3, f4, f5);
        eVar.setStartAngle(f6);
        eVar.setSweepAngle(f7);
        this.g.add(eVar);
        b bVar = new b(eVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        addShadowCompatOperation(bVar, f6, z ? (180.0f + f8) % 360.0f : f8);
        double d2 = f8;
        setEndX((((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))) + ((f2 + f4) * 0.5f));
        setEndY((((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))) + ((f3 + f5) * 0.5f));
    }

    public void applyToPath(Matrix matrix, Path path) {
        int size = this.g.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.g.get(i2).applyToPath(matrix, path);
        }
    }

    public boolean containsIncompatibleShadowOp() {
        return this.i;
    }

    public j createShadowCompatOperation(Matrix matrix) {
        addConnectingShadowIfNecessary(getEndShadowAngle());
        return new a(new ArrayList(this.h), new Matrix(matrix));
    }

    public void cubicToPoint(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.g.add(new f(f2, f3, f4, f5, f6, f7));
        this.i = true;
        setEndX(f6);
        setEndY(f7);
    }

    public float getEndX() {
        return this.c;
    }

    public float getEndY() {
        return this.d;
    }

    public float getStartX() {
        return this.a;
    }

    public float getStartY() {
        return this.b;
    }

    public void lineTo(float f2, float f3, float f4, float f5) {
        if ((Math.abs(f2 - getEndX()) < 0.001f && Math.abs(f3 - getEndY()) < 0.001f) || (Math.abs(f2 - f4) < 0.001f && Math.abs(f3 - f5) < 0.001f)) {
            lineTo(f4, f5);
            return;
        }
        g gVar = new g();
        gVar.b = f2;
        gVar.c = f3;
        this.g.add(gVar);
        g gVar2 = new g();
        gVar2.b = f4;
        gVar2.c = f5;
        this.g.add(gVar2);
        c cVar = new c(gVar, gVar2, getEndX(), getEndY());
        if (cVar.getSweepAngle() > 0.0f) {
            lineTo(f2, f3);
            lineTo(f4, f5);
        } else {
            addShadowCompatOperation(cVar, cVar.getStartAngle() + 270.0f, cVar.getEndAngle() + 270.0f);
            setEndX(f4);
            setEndY(f5);
        }
    }

    public void quadToPoint(float f2, float f3, float f4, float f5) {
        i iVar = new i();
        iVar.setControlX(f2);
        iVar.setControlY(f3);
        iVar.setEndX(f4);
        iVar.setEndY(f5);
        this.g.add(iVar);
        this.i = true;
        setEndX(f4);
        setEndY(f5);
    }

    public void reset(float f2, float f3, float f4, float f5) {
        setStartX(f2);
        setStartY(f3);
        setEndX(f2);
        setEndY(f3);
        setCurrentShadowAngle(f4);
        setEndShadowAngle((f4 + f5) % 360.0f);
        this.g.clear();
        this.h.clear();
        this.i = false;
    }

    public r(float f2, float f3) {
        reset(f2, f3);
    }

    public void reset(float f2, float f3) {
        reset(f2, f3, 270.0f, 0.0f);
    }

    public void lineTo(float f2, float f3) {
        g gVar = new g();
        gVar.b = f2;
        gVar.c = f3;
        this.g.add(gVar);
        d dVar = new d(gVar, getEndX(), getEndY());
        addShadowCompatOperation(dVar, dVar.getAngle() + 270.0f, dVar.getAngle() + 270.0f);
        setEndX(f2);
        setEndY(f3);
    }
}
