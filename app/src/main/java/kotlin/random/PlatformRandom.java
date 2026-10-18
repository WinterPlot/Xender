package kotlin.random;

import java.io.Serializable;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
final class PlatformRandom extends kotlin.random.a implements Serializable {
    private static final a b = new a(null);
    private static final long serialVersionUID = 0;
    private final java.util.Random impl;

    public PlatformRandom(java.util.Random random) {
        random.getClass();
        this.impl = random;
    }

    @Override // kotlin.random.a
    public java.util.Random getImpl() {
        return this.impl;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public /* synthetic */ a(r rVar) {
            this();
        }

        private a() {
        }
    }
}
