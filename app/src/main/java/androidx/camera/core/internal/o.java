package androidx.camera.core.internal;

import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.m2;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface o<T> extends m2 {
    public static final Config.a<String> O = Config.a.create("camerax.core.target.name", String.class);
    public static final Config.a<Class<?>> P = Config.a.create("camerax.core.target.class", Class.class);

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a<T, B> {
        B setTargetClass(Class<T> cls);

        B setTargetName(String str);
    }

    @Override // androidx.camera.core.impl.m2, androidx.camera.core.impl.Config
    /* bridge */ /* synthetic */ boolean containsOption(Config.a aVar);

    @Override // androidx.camera.core.impl.m2, androidx.camera.core.impl.Config
    /* bridge */ /* synthetic */ void findOptions(String str, Config.b bVar);

    @Override // androidx.camera.core.impl.m2, androidx.camera.core.impl.p1
    /* synthetic */ Config getConfig();

    @Override // androidx.camera.core.impl.m2, androidx.camera.core.impl.Config
    /* bridge */ /* synthetic */ Config.OptionPriority getOptionPriority(Config.a aVar);

    @Override // androidx.camera.core.impl.m2, androidx.camera.core.impl.Config
    /* bridge */ /* synthetic */ Set getPriorities(Config.a aVar);

    Class<T> getTargetClass();

    Class<T> getTargetClass(Class<T> cls);

    String getTargetName();

    String getTargetName(String str);

    @Override // androidx.camera.core.impl.m2, androidx.camera.core.impl.Config
    /* bridge */ /* synthetic */ Set listOptions();

    @Override // androidx.camera.core.impl.m2, androidx.camera.core.impl.Config
    /* bridge */ /* synthetic */ Object retrieveOption(Config.a aVar);

    @Override // androidx.camera.core.impl.m2, androidx.camera.core.impl.Config
    /* bridge */ /* synthetic */ Object retrieveOption(Config.a aVar, Object obj);

    @Override // androidx.camera.core.impl.m2, androidx.camera.core.impl.Config
    /* bridge */ /* synthetic */ Object retrieveOptionWithPriority(Config.a aVar, Config.OptionPriority optionPriority);
}
