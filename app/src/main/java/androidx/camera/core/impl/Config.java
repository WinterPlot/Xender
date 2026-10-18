package androidx.camera.core.impl;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface Config {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum OptionPriority {
        ALWAYS_OVERRIDE,
        HIGH_PRIORITY_REQUIRED,
        REQUIRED,
        OPTIONAL
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface b {
        boolean onOptionMatched(a<?> aVar);
    }

    boolean containsOption(a<?> aVar);

    void findOptions(String str, b bVar);

    OptionPriority getOptionPriority(a<?> aVar);

    Set<OptionPriority> getPriorities(a<?> aVar);

    Set<a<?>> listOptions();

    <ValueT> ValueT retrieveOption(a<ValueT> aVar);

    <ValueT> ValueT retrieveOption(a<ValueT> aVar, ValueT valuet);

    <ValueT> ValueT retrieveOptionWithPriority(a<ValueT> aVar, OptionPriority optionPriority);

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a<T> {
        public static <T> a<T> create(String str, Class<?> cls) {
            return create(str, cls, null);
        }

        public abstract String getId();

        public abstract Object getToken();

        public abstract Class<T> getValueClass();

        public static <T> a<T> create(String str, Class<?> cls, Object obj) {
            return new i(str, cls, obj);
        }
    }
}
