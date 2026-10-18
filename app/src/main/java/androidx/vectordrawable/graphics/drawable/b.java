package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public interface b extends Animatable {
    void clearAnimationCallbacks();

    void registerAnimationCallback(a aVar);

    boolean unregisterAnimationCallback(a aVar);

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a {
        Animatable2.AnimationCallback a;

        /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public class C0284a extends Animatable2.AnimationCallback {
            public C0284a() {
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                a.this.onAnimationEnd(drawable);
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationStart(Drawable drawable) {
                a.this.onAnimationStart(drawable);
            }
        }

        public Animatable2.AnimationCallback getPlatformCallback() {
            Animatable2.AnimationCallback animationCallback = this.a;
            if (animationCallback != null) {
                return animationCallback;
            }
            C0284a c0284a = new C0284a();
            this.a = c0284a;
            return c0284a;
        }

        public void onAnimationEnd(Drawable drawable) {
        }

        public void onAnimationStart(Drawable drawable) {
        }
    }
}
