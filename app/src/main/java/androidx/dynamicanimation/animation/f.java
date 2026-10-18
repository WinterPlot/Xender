package androidx.dynamicanimation.animation;

import android.util.FloatProperty;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f<T> {
    final String a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a extends f<T> {
        final /* synthetic */ FloatProperty b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, FloatProperty floatProperty) {
            super(str);
            this.b = floatProperty;
        }

        @Override // androidx.dynamicanimation.animation.f
        public float getValue(T t) {
            return ((Float) this.b.get(t)).floatValue();
        }

        @Override // androidx.dynamicanimation.animation.f
        public void setValue(T t, float f) {
            this.b.setValue(t, f);
        }
    }

    public f(String str) {
        this.a = str;
    }

    public static <T> f<T> createFloatPropertyCompat(FloatProperty floatProperty) {
        return new a(floatProperty.getName(), floatProperty);
    }

    public abstract float getValue(T t);

    public abstract void setValue(T t, float f);
}
