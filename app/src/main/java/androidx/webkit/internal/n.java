package androidx.webkit.internal;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class n implements androidx.webkit.c {
    private final ScriptHandlerBoundaryInterface a;

    private n(ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface) {
        this.a = scriptHandlerBoundaryInterface;
    }

    public static n toScriptHandler(InvocationHandler invocationHandler) {
        return new n((ScriptHandlerBoundaryInterface) org.chromium.support_lib_boundary.util.a.castToSuppLibClass(ScriptHandlerBoundaryInterface.class, invocationHandler));
    }

    @Override // androidx.webkit.c
    public void remove() {
        this.a.remove();
    }
}
