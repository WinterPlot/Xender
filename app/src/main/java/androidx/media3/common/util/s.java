package androidx.media3.common.util;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    private static int b = 0;
    private static boolean c = true;
    private static final Object a = new Object();
    private static a d = a.a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a {
        public static final a a = new C0173a();

        /* JADX INFO: renamed from: androidx.media3.common.util.s$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public class C0173a implements a {
            @Override // androidx.media3.common.util.s.a
            public void d(String str, String str2, Throwable th) {
                Log.d(str, s.appendThrowableString(str2, th));
            }

            @Override // androidx.media3.common.util.s.a
            public void e(String str, String str2, Throwable th) {
                Log.e(str, s.appendThrowableString(str2, th));
            }

            @Override // androidx.media3.common.util.s.a
            public void i(String str, String str2, Throwable th) {
                Log.i(str, s.appendThrowableString(str2, th));
            }

            @Override // androidx.media3.common.util.s.a
            public void w(String str, String str2, Throwable th) {
                Log.w(str, s.appendThrowableString(str2, th));
            }
        }

        void d(String str, String str2, Throwable th);

        void e(String str, String str2, Throwable th);

        void i(String str, String str2, Throwable th);

        void w(String str, String str2, Throwable th);
    }

    private s() {
    }

    @Pure
    public static String appendThrowableString(String str, Throwable th) {
        String throwableString = getThrowableString(th);
        if (TextUtils.isEmpty(throwableString)) {
            return str;
        }
        StringBuilder sbW = defpackage.a.w(str, "\n  ");
        sbW.append(throwableString.replace("\n", "\n  "));
        sbW.append('\n');
        return sbW.toString();
    }

    @Pure
    public static void d(String str, String str2) {
        synchronized (a) {
            try {
                if (b == 0) {
                    d.d(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Pure
    public static void e(String str, String str2) {
        synchronized (a) {
            try {
                if (b <= 3) {
                    d.e(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Pure
    public static int getLogLevel() {
        int i;
        synchronized (a) {
            i = b;
        }
        return i;
    }

    @Pure
    public static String getThrowableString(Throwable th) {
        if (th == null) {
            return null;
        }
        synchronized (a) {
            try {
                if (isCausedByUnknownHostException(th)) {
                    return "UnknownHostException (no network)";
                }
                if (c) {
                    return Log.getStackTraceString(th).trim().replace("\t", "    ");
                }
                return th.getMessage();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    public static void i(String str, String str2) {
        synchronized (a) {
            try {
                if (b <= 1) {
                    d.i(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Pure
    private static boolean isCausedByUnknownHostException(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void setLogLevel(int i) {
        synchronized (a) {
            b = i;
        }
    }

    public static void setLogStackTraces(boolean z) {
        synchronized (a) {
            c = z;
        }
    }

    public static void setLogger(a aVar) {
        synchronized (a) {
            d = aVar;
        }
    }

    @Pure
    public static void w(String str, String str2) {
        synchronized (a) {
            try {
                if (b <= 2) {
                    d.w(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Pure
    public static void d(String str, String str2, Throwable th) {
        synchronized (a) {
            try {
                if (b == 0) {
                    d.d(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    public static void e(String str, String str2, Throwable th) {
        synchronized (a) {
            try {
                if (b <= 3) {
                    d.e(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    public static void i(String str, String str2, Throwable th) {
        synchronized (a) {
            try {
                if (b <= 1) {
                    d.i(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Pure
    public static void w(String str, String str2, Throwable th) {
        synchronized (a) {
            try {
                if (b <= 2) {
                    d.w(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
