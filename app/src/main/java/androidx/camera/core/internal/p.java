package androidx.camera.core.internal;

import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.m2;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface p extends m2 {
    public static final Config.a<Executor> Q = Config.a.create("camerax.core.thread.backgroundExecutor", Executor.class);

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a<B> {
        B setBackgroundExecutor(Executor executor);
    }

    @Override // androidx.camera.core.impl.m2, androidx.camera.core.impl.Config
    /* bridge */ /* synthetic */ boolean containsOption(Config.a aVar);

    @Override // androidx.camera.core.impl.m2, androidx.camera.core.impl.Config
    /* bridge */ /* synthetic */ void findOptions(String str, Config.b bVar);

    Executor getBackgroundExecutor();

    Executor getBackgroundExecutor(Executor executor);

    @Override // androidx.camera.core.impl.m2, androidx.camera.core.impl.p1
    /* synthetic */ Config getConfig();

    @Override // androidx.camera.core.impl.m2, androidx.camera.core.impl.Config
    /* bridge */ /* synthetic */ Config.OptionPriority getOptionPriority(Config.a aVar);

    @Override // androidx.camera.core.impl.m2, androidx.camera.core.impl.Config
    /* bridge */ /* synthetic */ Set getPriorities(Config.a aVar);

    @Override // androidx.camera.core.impl.m2, androidx.camera.core.impl.Config
    /* bridge */ /* synthetic */ Set listOptions();

    @Override // androidx.camera.core.impl.m2, androidx.camera.core.impl.Config
    /* bridge */ /* synthetic */ Object retrieveOption(Config.a aVar);

    @Override // androidx.camera.core.impl.m2, androidx.camera.core.impl.Config
    /* bridge */ /* synthetic */ Object retrieveOption(Config.a aVar, Object obj);

    @Override // androidx.camera.core.impl.m2, androidx.camera.core.impl.Config
    /* bridge */ /* synthetic */ Object retrieveOptionWithPriority(Config.a aVar, Config.OptionPriority optionPriority);
}
