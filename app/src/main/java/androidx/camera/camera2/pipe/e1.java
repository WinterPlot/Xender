package androidx.camera.camera2.pipe;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface e1 {
    <T> T get(a<T> aVar);

    <T> T getOrDefault(a<T> aVar, T t);

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a<T> {
        public static final C0061a c = new C0061a(null);
        private static final Map<String, a<?>> d = new HashMap();
        private final String a;
        private final kotlin.reflect.c<?> b;

        private a(String str, kotlin.reflect.c<?> cVar) {
            this.a = str;
            this.b = cVar;
        }

        public String toString() {
            return defpackage.a.r(new StringBuilder("Metadata.Key("), this.a, ')');
        }

        /* JADX INFO: renamed from: androidx.camera.camera2.pipe.e1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public static final class C0061a {
            public /* synthetic */ C0061a(r rVar) {
                this();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final <T> a<T> create(String str, kotlin.reflect.c<T> cVar) {
                a<T> aVar;
                str.getClass();
                cVar.getClass();
                synchronized (getKeys$camera_camera2_pipe()) {
                    try {
                        Map<String, a<?>> keys$camera_camera2_pipe = a.c.getKeys$camera_camera2_pipe();
                        Object aVar2 = keys$camera_camera2_pipe.get(str);
                        if (aVar2 == null) {
                            aVar2 = new a(str, cVar, null);
                            keys$camera_camera2_pipe.put(str, aVar2);
                        }
                        aVar = (a) aVar2;
                        if (!kotlin.jvm.internal.y.areEqual(((a) aVar).b, cVar)) {
                            throw new IllegalStateException("Check failed.");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return aVar;
            }

            public final Map<String, a<?>> getKeys$camera_camera2_pipe() {
                return a.d;
            }

            private C0061a() {
            }

            public static /* synthetic */ void getKeys$camera_camera2_pipe$annotations() {
            }

            public final /* synthetic */ <T> a<T> create(String str) {
                str.getClass();
                kotlin.jvm.internal.y.reifiedOperationMarker(4, "T");
                return create(str, kotlin.jvm.internal.f0.getOrCreateKotlinClass(Object.class));
            }
        }

        public /* synthetic */ a(String str, kotlin.reflect.c cVar, r rVar) {
            this(str, cVar);
        }
    }
}
