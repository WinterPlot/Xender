package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class g {
    public static final g a = new g();
    private static final a b = new a(null, null, null);
    private static a c;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public final Method a;
        public final Method b;
        public final Method c;

        public a(Method method, Method method2, Method method3) {
            this.a = method;
            this.b = method2;
            this.c = method3;
        }
    }

    private g() {
    }

    private final a buildCache(kotlin.coroutines.d<Object> dVar) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", null), dVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), dVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = b;
            c = aVar2;
            return aVar2;
        }
    }

    public final String getModuleName(kotlin.coroutines.d<Object> dVar) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        dVar.getClass();
        a aVarBuildCache = c;
        if (aVarBuildCache == null) {
            aVarBuildCache = buildCache(dVar);
        }
        if (aVarBuildCache != b && (method = aVarBuildCache.a) != null && (objInvoke = method.invoke(dVar.getClass(), null)) != null && (method2 = aVarBuildCache.b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = aVarBuildCache.c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                return (String) objInvoke3;
            }
        }
        return null;
    }
}
