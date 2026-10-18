package androidx.window.core;

import kotlin.jvm.functions.l;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class SpecificationComputer<T> {
    public static final a a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum VerificationMode {
        STRICT,
        LOG,
        QUIET
    }

    public abstract T compute();

    public final String createMessage(Object obj, String str) {
        obj.getClass();
        str.getClass();
        return str + " value: " + obj;
    }

    public abstract SpecificationComputer<T> require(String str, l<? super T, Boolean> lVar);

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public /* synthetic */ a(r rVar) {
            this();
        }

        public static /* synthetic */ SpecificationComputer startSpecification$default(a aVar, Object obj, String str, VerificationMode verificationMode, e eVar, int i, Object obj2) {
            if ((i & 2) != 0) {
                verificationMode = c.a.getVerificationMode();
            }
            if ((i & 4) != 0) {
                eVar = androidx.window.core.a.a;
            }
            return aVar.startSpecification(obj, str, verificationMode, eVar);
        }

        public final <T> SpecificationComputer<T> startSpecification(T t, String str, VerificationMode verificationMode, e eVar) {
            t.getClass();
            str.getClass();
            verificationMode.getClass();
            eVar.getClass();
            return new f(t, str, verificationMode, eVar);
        }

        private a() {
        }
    }
}
