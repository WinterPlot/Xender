package androidx.camera.core.impl;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface m2 extends Config {
    @Override // androidx.camera.core.impl.Config
    boolean containsOption(Config.a<?> aVar);

    @Override // androidx.camera.core.impl.Config
    void findOptions(String str, Config.b bVar);

    Config getConfig();

    @Override // androidx.camera.core.impl.Config
    Config.OptionPriority getOptionPriority(Config.a<?> aVar);

    @Override // androidx.camera.core.impl.Config
    Set<Config.OptionPriority> getPriorities(Config.a<?> aVar);

    @Override // androidx.camera.core.impl.Config
    Set<Config.a<?>> listOptions();

    @Override // androidx.camera.core.impl.Config
    <ValueT> ValueT retrieveOption(Config.a<ValueT> aVar);

    @Override // androidx.camera.core.impl.Config
    <ValueT> ValueT retrieveOption(Config.a<ValueT> aVar, ValueT valuet);

    @Override // androidx.camera.core.impl.Config
    <ValueT> ValueT retrieveOptionWithPriority(Config.a<ValueT> aVar, Config.OptionPriority optionPriority);
}
