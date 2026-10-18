package androidx.datastore.preferences.core;

import java.util.Map;
import kotlin.collections.t0;
import kotlin.jvm.internal.y;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a<T> {
        private final String a;

        public a(String str) {
            str.getClass();
            this.a = str;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return y.areEqual(this.a, ((a) obj).a);
            }
            return false;
        }

        public final String getName() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public final b<T> to(T t) {
            return new b<>(this, t);
        }

        public String toString() {
            return this.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b<T> {
        private final a<T> a;
        private final T b;

        public b(a<T> aVar, T t) {
            aVar.getClass();
            this.a = aVar;
            this.b = t;
        }

        public final a<T> getKey$datastore_preferences_core_release() {
            return this.a;
        }

        public final T getValue$datastore_preferences_core_release() {
            return this.b;
        }
    }

    public abstract Map<a<?>, Object> asMap();

    public abstract <T> boolean contains(a<T> aVar);

    public abstract <T> T get(a<T> aVar);

    public final MutablePreferences toMutablePreferences() {
        return new MutablePreferences(t0.toMutableMap(asMap()), false);
    }

    public final c toPreferences() {
        return new MutablePreferences(t0.toMutableMap(asMap()), true);
    }
}
