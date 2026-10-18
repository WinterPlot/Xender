package androidx.core.view;

import android.view.WindowInsetsAnimationController;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {
    private final b a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a extends b {
        private final WindowInsetsAnimationController a;

        public a(WindowInsetsAnimationController windowInsetsAnimationController) {
            this.a = windowInsetsAnimationController;
        }

        @Override // androidx.core.view.m1.b
        public void finish(boolean z) {
            this.a.finish(z);
        }

        @Override // androidx.core.view.m1.b
        public float getCurrentAlpha() {
            return this.a.getCurrentAlpha();
        }

        @Override // androidx.core.view.m1.b
        public float getCurrentFraction() {
            return this.a.getCurrentFraction();
        }

        @Override // androidx.core.view.m1.b
        public androidx.core.graphics.c getCurrentInsets() {
            return androidx.core.graphics.c.toCompatInsets(this.a.getCurrentInsets());
        }

        @Override // androidx.core.view.m1.b
        public androidx.core.graphics.c getHiddenStateInsets() {
            return androidx.core.graphics.c.toCompatInsets(this.a.getHiddenStateInsets());
        }

        @Override // androidx.core.view.m1.b
        public androidx.core.graphics.c getShownStateInsets() {
            return androidx.core.graphics.c.toCompatInsets(this.a.getShownStateInsets());
        }

        @Override // androidx.core.view.m1.b
        public int getTypes() {
            return this.a.getTypes();
        }

        @Override // androidx.core.view.m1.b
        public boolean isCancelled() {
            return this.a.isCancelled();
        }

        @Override // androidx.core.view.m1.b
        public boolean isFinished() {
            return this.a.isFinished();
        }

        @Override // androidx.core.view.m1.b
        public void setInsetsAndAlpha(androidx.core.graphics.c cVar, float f, float f2) {
            this.a.setInsetsAndAlpha(cVar == null ? null : cVar.toPlatformInsets(), f, f2);
        }
    }

    public m1(WindowInsetsAnimationController windowInsetsAnimationController) {
        this.a = new a(windowInsetsAnimationController);
    }

    public void finish(boolean z) {
        this.a.finish(z);
    }

    public float getCurrentAlpha() {
        return this.a.getCurrentAlpha();
    }

    public float getCurrentFraction() {
        return this.a.getCurrentFraction();
    }

    public androidx.core.graphics.c getCurrentInsets() {
        return this.a.getCurrentInsets();
    }

    public androidx.core.graphics.c getHiddenStateInsets() {
        return this.a.getHiddenStateInsets();
    }

    public androidx.core.graphics.c getShownStateInsets() {
        return this.a.getShownStateInsets();
    }

    public int getTypes() {
        return this.a.getTypes();
    }

    public boolean isCancelled() {
        return this.a.isCancelled();
    }

    public boolean isFinished() {
        return this.a.isFinished();
    }

    public boolean isReady() {
        return (isFinished() || isCancelled()) ? false : true;
    }

    public void setInsetsAndAlpha(androidx.core.graphics.c cVar, float f, float f2) {
        this.a.setInsetsAndAlpha(cVar, f, f2);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class b {
        public float getCurrentAlpha() {
            return 0.0f;
        }

        public float getCurrentFraction() {
            return 0.0f;
        }

        public androidx.core.graphics.c getCurrentInsets() {
            return androidx.core.graphics.c.e;
        }

        public androidx.core.graphics.c getHiddenStateInsets() {
            return androidx.core.graphics.c.e;
        }

        public androidx.core.graphics.c getShownStateInsets() {
            return androidx.core.graphics.c.e;
        }

        public int getTypes() {
            return 0;
        }

        public boolean isCancelled() {
            return true;
        }

        public boolean isFinished() {
            return false;
        }

        public void finish(boolean z) {
        }

        public void setInsetsAndAlpha(androidx.core.graphics.c cVar, float f, float f2) {
        }
    }
}
