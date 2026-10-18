package androidx.activity;

import android.content.res.Resources;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {
    public static final a e = new a(null);
    private final int a;
    private final int b;
    private final int c;
    private final kotlin.jvm.functions.l<Resources, Boolean> d;

    /* JADX WARN: Multi-variable type inference failed */
    private m0(int i, int i2, int i3, kotlin.jvm.functions.l<? super Resources, Boolean> lVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = lVar;
    }

    public static final m0 auto(int i, int i2) {
        return e.auto(i, i2);
    }

    public static final m0 dark(int i) {
        return e.dark(i);
    }

    public static final m0 light(int i, int i2) {
        return e.light(i, i2);
    }

    public final int getDarkScrim$activity() {
        return this.b;
    }

    public final kotlin.jvm.functions.l<Resources, Boolean> getDetectDarkMode$activity() {
        return this.d;
    }

    public final int getNightMode$activity() {
        return this.c;
    }

    public final int getScrim$activity(boolean z) {
        return z ? this.b : this.a;
    }

    public final int getScrimWithEnforcedContrast$activity(boolean z) {
        if (this.c == 0) {
            return 0;
        }
        return z ? this.b : this.a;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public /* synthetic */ a(r rVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ m0 auto$default(a aVar, int i, int i2, kotlin.jvm.functions.l lVar, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                lVar = new l0(2);
            }
            return aVar.auto(i, i2, lVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean auto$lambda$0(Resources resources) {
            resources.getClass();
            return (resources.getConfiguration().uiMode & 48) == 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean dark$lambda$0(Resources resources) {
            resources.getClass();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean light$lambda$0(Resources resources) {
            resources.getClass();
            return false;
        }

        public final m0 auto(int i, int i2, kotlin.jvm.functions.l<? super Resources, Boolean> lVar) {
            lVar.getClass();
            return new m0(i, i2, 0, lVar, null);
        }

        public final m0 dark(int i) {
            return new m0(i, i, 2, new l0(1), null);
        }

        public final m0 light(int i, int i2) {
            return new m0(i, i2, 1, new l0(0), null);
        }

        private a() {
        }

        public final m0 auto(int i, int i2) {
            return auto$default(this, i, i2, null, 4, null);
        }
    }

    public static final m0 auto(int i, int i2, kotlin.jvm.functions.l<? super Resources, Boolean> lVar) {
        return e.auto(i, i2, lVar);
    }

    public /* synthetic */ m0(int i, int i2, int i3, kotlin.jvm.functions.l lVar, r rVar) {
        this(i, i2, i3, lVar);
    }
}
