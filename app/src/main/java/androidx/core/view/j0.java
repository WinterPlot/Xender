package androidx.core.view;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class j0 {
    private final c a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a implements c {
        private final ScrollFeedbackProvider a;

        public a(View view) {
            this.a = ScrollFeedbackProvider.createProvider(view);
        }

        @Override // androidx.core.view.j0.c
        public void onScrollLimit(int i, int i2, int i3, boolean z) {
            this.a.onScrollLimit(i, i2, i3, z);
        }

        @Override // androidx.core.view.j0.c
        public void onScrollProgress(int i, int i2, int i3, int i4) {
            this.a.onScrollProgress(i, i2, i3, i4);
        }

        @Override // androidx.core.view.j0.c
        public void onSnapToItem(int i, int i2, int i3) {
            this.a.onSnapToItem(i, i2, i3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface c {
        void onScrollLimit(int i, int i2, int i3, boolean z);

        void onScrollProgress(int i, int i2, int i3, int i4);

        void onSnapToItem(int i, int i2, int i3);
    }

    private j0(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new a(view);
        } else {
            this.a = new b(0);
        }
    }

    public static j0 createProvider(View view) {
        return new j0(view);
    }

    public void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.a.onScrollLimit(i, i2, i3, z);
    }

    public void onScrollProgress(int i, int i2, int i3, int i4) {
        this.a.onScrollProgress(i, i2, i3, i4);
    }

    public void onSnapToItem(int i, int i2, int i3) {
        this.a.onSnapToItem(i, i2, i3);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class b implements c {
        public /* synthetic */ b(int i) {
            this();
        }

        private b() {
        }

        @Override // androidx.core.view.j0.c
        public void onSnapToItem(int i, int i2, int i3) {
        }

        @Override // androidx.core.view.j0.c
        public void onScrollLimit(int i, int i2, int i3, boolean z) {
        }

        @Override // androidx.core.view.j0.c
        public void onScrollProgress(int i, int i2, int i3, int i4) {
        }
    }
}
