package androidx.work.impl;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public interface y {
    public static final a a = a.a;

    boolean contains(androidx.work.impl.model.q qVar);

    w remove(androidx.work.impl.model.q qVar);

    w remove(androidx.work.impl.model.y yVar);

    List<w> remove(String str);

    w tokenFor(androidx.work.impl.model.q qVar);

    w tokenFor(androidx.work.impl.model.y yVar);

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public static /* synthetic */ y create$default(a aVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            return aVar.create(z);
        }

        public final y create(boolean z) {
            z zVar = new z();
            return z ? new a0(zVar) : zVar;
        }

        public final y create() {
            return create$default(this, false, 1, null);
        }
    }
}
