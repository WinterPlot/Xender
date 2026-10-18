package com.google.firebase.crashlytics.internal.settings;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class d {
    public final b a;
    public final a b;
    public final long c;
    public final int d;
    public final int e;
    public final double f;
    public final double g;
    public final int h;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public a(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class b {
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public d(long j, b bVar, a aVar, int i, int i2, double d, double d2, int i3) {
        this.c = j;
        this.a = bVar;
        this.b = aVar;
        this.d = i;
        this.e = i2;
        this.f = d;
        this.g = d2;
        this.h = i3;
    }

    public boolean isExpired(long j) {
        return this.c < j;
    }
}
