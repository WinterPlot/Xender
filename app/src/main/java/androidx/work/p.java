package androidx.work;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p {
    private static final Object a = new Object();
    private static volatile p b = null;
    private static final int c = 20;

    public p(int i) {
    }

    public static p get() {
        p pVar;
        synchronized (a) {
            try {
                if (b == null) {
                    b = new a(3);
                }
                pVar = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }

    public static void setLogger(p pVar) {
        synchronized (a) {
            try {
                if (b == null) {
                    b = pVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String tagWithPrefix(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = c;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void debug(String str, String str2);

    public abstract void debug(String str, String str2, Throwable th);

    public abstract void error(String str, String str2);

    public abstract void error(String str, String str2, Throwable th);

    public abstract void info(String str, String str2);

    public abstract void info(String str, String str2, Throwable th);

    public abstract void verbose(String str, String str2);

    public abstract void verbose(String str, String str2, Throwable th);

    public abstract void warning(String str, String str2);

    public abstract void warning(String str, String str2, Throwable th);

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a extends p {
        private final int d;

        public a(int i) {
            super(i);
            this.d = i;
        }

        @Override // androidx.work.p
        public void debug(String str, String str2) {
            if (this.d <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // androidx.work.p
        public void error(String str, String str2) {
            if (this.d <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // androidx.work.p
        public void info(String str, String str2) {
            if (this.d <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // androidx.work.p
        public void verbose(String str, String str2) {
            if (this.d <= 2) {
                Log.v(str, str2);
            }
        }

        @Override // androidx.work.p
        public void warning(String str, String str2) {
            if (this.d <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // androidx.work.p
        public void debug(String str, String str2, Throwable th) {
            if (this.d <= 3) {
                Log.d(str, str2, th);
            }
        }

        @Override // androidx.work.p
        public void error(String str, String str2, Throwable th) {
            if (this.d <= 6) {
                Log.e(str, str2, th);
            }
        }

        @Override // androidx.work.p
        public void info(String str, String str2, Throwable th) {
            if (this.d <= 4) {
                Log.i(str, str2, th);
            }
        }

        @Override // androidx.work.p
        public void verbose(String str, String str2, Throwable th) {
            if (this.d <= 2) {
                Log.v(str, str2, th);
            }
        }

        @Override // androidx.work.p
        public void warning(String str, String str2, Throwable th) {
            if (this.d <= 5) {
                Log.w(str, str2, th);
            }
        }
    }
}
