package androidx.lifecycle.viewmodel;

import androidx.camera.camera2.pipe.w;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.y;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final C0162a b = new C0162a(null);
    private final Map<c<?>, Object> a = new LinkedHashMap();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b extends a {
        public static final b c = new b();

        private b() {
        }

        @Override // androidx.lifecycle.viewmodel.a
        public <T> T get(c<T> cVar) {
            cVar.getClass();
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface c<T> {
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && y.areEqual(this.a, ((a) obj).a);
    }

    public abstract <T> T get(c<T> cVar);

    public final Map<c<?>, Object> getExtras$lifecycle_viewmodel() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "CreationExtras(extras=" + this.a + ")";
    }

    /* JADX INFO: renamed from: androidx.lifecycle.viewmodel.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class C0162a {

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: androidx.lifecycle.viewmodel.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public static final class C0163a<T> implements c<T> {
            public String toString() {
                String string = Integer.toString(hashCode(), kotlin.text.b.checkRadix(16));
                string.getClass();
                y.reifiedOperationMarker(4, "T");
                return w.s("CreationExtras.Key@", string, "<", f0.getOrCreateKotlinClass(Object.class).getSimpleName(), ">");
            }
        }

        public /* synthetic */ C0162a(r rVar) {
            this();
        }

        public final /* synthetic */ <T> c<T> Key() {
            y.needClassReification();
            return new C0163a();
        }

        private C0162a() {
        }
    }
}
