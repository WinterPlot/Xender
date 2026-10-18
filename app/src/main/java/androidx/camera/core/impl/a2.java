package androidx.camera.core.impl;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface a2 extends Config {
    @Override // androidx.camera.core.impl.Config
    /* synthetic */ boolean containsOption(Config.a aVar);

    @Override // androidx.camera.core.impl.Config
    /* synthetic */ void findOptions(String str, Config.b bVar);

    @Override // androidx.camera.core.impl.Config
    /* synthetic */ Config.OptionPriority getOptionPriority(Config.a aVar);

    @Override // androidx.camera.core.impl.Config
    /* synthetic */ Set getPriorities(Config.a aVar);

    <ValueT> void insertOption(Config.a<ValueT> aVar, Config.OptionPriority optionPriority, ValueT valuet);

    <ValueT> void insertOption(Config.a<ValueT> aVar, ValueT valuet);

    @Override // androidx.camera.core.impl.Config
    /* synthetic */ Set listOptions();

    <ValueT> ValueT removeOption(Config.a<ValueT> aVar);

    @Override // androidx.camera.core.impl.Config
    /* synthetic */ Object retrieveOption(Config.a aVar);

    @Override // androidx.camera.core.impl.Config
    /* synthetic */ Object retrieveOption(Config.a aVar, Object obj);

    @Override // androidx.camera.core.impl.Config
    /* synthetic */ Object retrieveOptionWithPriority(Config.a aVar, Config.OptionPriority optionPriority);
}
