package org.jsoup.helper;

import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public class e {
    private static final boolean b = hasRe2j();
    private final Pattern a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a implements b {
        private final Matcher a;

        public a(Matcher matcher) {
            this.a = matcher;
        }

        @Override // org.jsoup.helper.e.b
        public boolean find() {
            return this.a.find();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface b {
        boolean find();
    }

    public e(Pattern pattern) {
        this.a = pattern;
    }

    public static e compile(String str) {
        if (usingRe2j()) {
            return d.compile(str);
        }
        try {
            return new e(Pattern.compile(str));
        } catch (PatternSyntaxException e) {
            throw new ValidationException("Pattern syntax error: " + e.getMessage());
        }
    }

    public static e fromPattern(Pattern pattern) {
        return new e(pattern);
    }

    public static boolean hasRe2j() {
        try {
            try {
                Class<?> cls = Class.forName("com.google.re2j.Pattern", false, e.class.getClassLoader());
                try {
                    Class<?> cls2 = Class.forName("java.lang.Module");
                    Method method = Class.class.getMethod("getModule", null);
                    Object objInvoke = method.invoke(e.class, null);
                    Object objInvoke2 = method.invoke(cls, null);
                    if (!((Boolean) cls2.getMethod("canRead", cls2).invoke(objInvoke, objInvoke2)).booleanValue()) {
                        cls2.getMethod("addReads", cls2).invoke(objInvoke, objInvoke2);
                    }
                } catch (ClassNotFoundException unused) {
                }
                return true;
            } catch (ClassNotFoundException unused2) {
                return false;
            }
        } catch (ReflectiveOperationException e) {
            System.err.println("Warning: (bug? please report) couldn't access re2j from jsoup due to modules: " + e);
            return false;
        }
    }

    public static boolean usingRe2j() {
        return b && wantsRe2j();
    }

    public static boolean wantsRe2j() {
        return Boolean.parseBoolean(System.getProperty("jsoup.useRe2j", "true"));
    }

    public b matcher(CharSequence charSequence) {
        return new a(this.a.matcher(charSequence));
    }

    public String toString() {
        return this.a.toString();
    }

    public static void wantsRe2j(boolean z) {
        System.setProperty("jsoup.useRe2j", Boolean.toString(z));
    }
}
