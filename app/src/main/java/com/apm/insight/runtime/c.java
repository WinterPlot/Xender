package com.apm.insight.runtime;

import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    private final List<ICrashCallback> a = new CopyOnWriteArrayList();
    private final List<ICrashCallback> b = new CopyOnWriteArrayList();
    private final List<ICrashCallback> c = new CopyOnWriteArrayList();
    private final List<ICrashCallback> d = new CopyOnWriteArrayList();
    private final List<IOOMCallback> e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: com.apm.insight.runtime.c$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CrashType.values().length];
            a = iArr;
            try {
                iArr[CrashType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[CrashType.ANR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[CrashType.JAVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[CrashType.LAUNCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[CrashType.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public final void a(ICrashCallback iCrashCallback, CrashType crashType) {
        int i = AnonymousClass1.a[crashType.ordinal()];
        if (i == 1) {
            this.a.add(iCrashCallback);
            this.b.add(iCrashCallback);
            this.c.add(iCrashCallback);
            this.d.add(iCrashCallback);
            return;
        }
        if (i == 2) {
            this.d.add(iCrashCallback);
            return;
        }
        if (i == 3) {
            this.b.add(iCrashCallback);
        } else if (i == 4) {
            this.a.add(iCrashCallback);
        } else {
            if (i != 5) {
                return;
            }
            this.c.add(iCrashCallback);
        }
    }

    public final void b(ICrashCallback iCrashCallback, CrashType crashType) {
        int i = AnonymousClass1.a[crashType.ordinal()];
        if (i == 1) {
            this.a.remove(iCrashCallback);
            this.b.remove(iCrashCallback);
            this.c.remove(iCrashCallback);
            this.d.remove(iCrashCallback);
            return;
        }
        if (i == 2) {
            this.d.remove(iCrashCallback);
            return;
        }
        if (i == 3) {
            this.b.remove(iCrashCallback);
        } else if (i == 4) {
            this.a.remove(iCrashCallback);
        } else {
            if (i != 5) {
                return;
            }
            this.c.remove(iCrashCallback);
        }
    }

    public final List<ICrashCallback> c() {
        return this.b;
    }

    public final List<ICrashCallback> d() {
        return this.c;
    }

    public final List<ICrashCallback> e() {
        return this.d;
    }

    public final void a(IOOMCallback iOOMCallback) {
        this.e.add(iOOMCallback);
    }

    public final void b(IOOMCallback iOOMCallback) {
        this.e.remove(iOOMCallback);
    }

    public final List<IOOMCallback> a() {
        return this.e;
    }

    public final List<ICrashCallback> b() {
        return this.a;
    }
}
