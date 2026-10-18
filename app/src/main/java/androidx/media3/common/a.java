package androidx.media3.common;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final View a;
    public final int b;
    public final String c;

    /* JADX INFO: renamed from: androidx.media3.common.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class C0167a {
        private final View a;
        private final int b;
        private String c;

        public C0167a(View view, int i) {
            this.a = view;
            this.b = i;
        }

        public a build() {
            return new a(this.a, this.b, this.c);
        }

        public C0167a setDetailedReason(String str) {
            this.c = str;
            return this;
        }
    }

    @Deprecated
    public a(View view, int i, String str) {
        this.a = view;
        this.b = i;
        this.c = str;
    }

    @Deprecated
    public a(View view, int i) {
        this(view, i, null);
    }
}
