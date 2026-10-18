package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class j {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a extends j {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b extends j {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ j(r rVar) {
        this();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        String simpleName = f0.getOrCreateKotlinClass(getClass()).getSimpleName();
        simpleName.getClass();
        return simpleName;
    }

    private j() {
    }
}
