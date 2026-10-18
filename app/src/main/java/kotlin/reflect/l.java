package kotlin.reflect;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public interface l<V> extends b<V> {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a<V> extends g<V> {
    }

    @Override // kotlin.reflect.b
    /* synthetic */ Object call(Object... objArr);

    @Override // kotlin.reflect.b
    /* synthetic */ Object callBy(Map map);

    @Override // kotlin.reflect.b, kotlin.reflect.a
    /* synthetic */ List getAnnotations();

    a<V> getGetter();

    @Override // kotlin.reflect.b
    /* synthetic */ String getName();

    @Override // kotlin.reflect.b
    /* synthetic */ List getParameters();

    @Override // kotlin.reflect.b
    /* synthetic */ p getReturnType();

    @Override // kotlin.reflect.b
    /* synthetic */ List getTypeParameters();

    @Override // kotlin.reflect.b
    /* synthetic */ KVisibility getVisibility();

    @Override // kotlin.reflect.b
    /* synthetic */ boolean isAbstract();

    boolean isConst();

    @Override // kotlin.reflect.b
    /* synthetic */ boolean isFinal();

    boolean isLateinit();

    @Override // kotlin.reflect.b
    /* synthetic */ boolean isOpen();

    @Override // kotlin.reflect.b
    /* synthetic */ boolean isSuspend();
}
