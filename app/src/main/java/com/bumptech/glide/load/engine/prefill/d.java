package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import com.bumptech.glide.util.k;
import okhttp3.b0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    static final Bitmap.Config e = Bitmap.Config.RGB_565;
    private final int a;
    private final int b;
    private final Bitmap.Config c;
    private final int d;

    public d(int i, int i2, Bitmap.Config config, int i3) {
        this.c = (Bitmap.Config) k.checkNotNull(config, "Config must not be null");
        this.a = i;
        this.b = i2;
        this.d = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.b == dVar.b && this.a == dVar.a && this.d == dVar.d && this.c == dVar.c) {
                return true;
            }
        }
        return false;
    }

    public Bitmap.Config getConfig() {
        return this.c;
    }

    public int getHeight() {
        return this.b;
    }

    public int getWeight() {
        return this.d;
    }

    public int getWidth() {
        return this.a;
    }

    public int hashCode() {
        return ((this.c.hashCode() + (((this.a * 31) + this.b) * 31)) * 31) + this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PreFillSize{width=");
        sb.append(this.a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", config=");
        sb.append(this.c);
        sb.append(", weight=");
        return defpackage.a.q(sb, this.d, '}');
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a {
        private final int a;
        private final int b;
        private Bitmap.Config c;
        private int d;

        public a(int i, int i2) {
            this.d = 1;
            if (i <= 0) {
                b0.i("Width must be > 0");
                throw null;
            }
            if (i2 <= 0) {
                b0.i("Height must be > 0");
                throw null;
            }
            this.a = i;
            this.b = i2;
        }

        public d build() {
            return new d(this.a, this.b, this.c, this.d);
        }

        public Bitmap.Config getConfig() {
            return this.c;
        }

        public a setConfig(Bitmap.Config config) {
            this.c = config;
            return this;
        }

        public a setWeight(int i) {
            if (i > 0) {
                this.d = i;
                return this;
            }
            b0.i("Weight must be > 0");
            return null;
        }

        public a(int i) {
            this(i, i);
        }
    }
}
