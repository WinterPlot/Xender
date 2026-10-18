package androidx.camera.core.impl;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface p1 extends m2 {
    public static final Config.a<Integer> j = Config.a.create("camerax.core.imageInput.inputFormat", Integer.TYPE);
    public static final Config.a<Integer> k = Config.a.create("camerax.core.imageInput.secondaryInputFormat", Integer.TYPE);
    public static final Config.a<androidx.camera.core.l0> l = Config.a.create("camerax.core.imageInput.inputDynamicRange", androidx.camera.core.l0.class);

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a<B> {
        B setDynamicRange(androidx.camera.core.l0 l0Var);
    }

    @Override // androidx.camera.core.impl.m2, androidx.camera.core.impl.Config
    /* bridge */ /* synthetic */ boolean containsOption(Config.a aVar);

    @Override // androidx.camera.core.impl.m2, androidx.camera.core.impl.Config
    /* bridge */ /* synthetic */ void findOptions(String str, Config.b bVar);

    /* synthetic */ Config getConfig();

    androidx.camera.core.l0 getDynamicRange();

    int getInputFormat();

    @Override // androidx.camera.core.impl.m2, androidx.camera.core.impl.Config
    /* bridge */ /* synthetic */ Config.OptionPriority getOptionPriority(Config.a aVar);

    @Override // androidx.camera.core.impl.m2, androidx.camera.core.impl.Config
    /* bridge */ /* synthetic */ Set getPriorities(Config.a aVar);

    int getSecondaryInputFormat();

    boolean hasDynamicRange();

    @Override // androidx.camera.core.impl.m2, androidx.camera.core.impl.Config
    /* bridge */ /* synthetic */ Set listOptions();

    @Override // androidx.camera.core.impl.m2, androidx.camera.core.impl.Config
    /* bridge */ /* synthetic */ Object retrieveOption(Config.a aVar);

    @Override // androidx.camera.core.impl.m2, androidx.camera.core.impl.Config
    /* bridge */ /* synthetic */ Object retrieveOption(Config.a aVar, Object obj);

    @Override // androidx.camera.core.impl.m2, androidx.camera.core.impl.Config
    /* bridge */ /* synthetic */ Object retrieveOptionWithPriority(Config.a aVar, Config.OptionPriority optionPriority);
}
