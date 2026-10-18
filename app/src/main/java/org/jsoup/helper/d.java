package org.jsoup.helper;

import com.google.re2j.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
final class d extends e {
    private static final Pattern d = Pattern.compile("");
    private final com.google.re2j.Pattern c;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a implements e.b {
        private final Matcher a;

        public a(Matcher matcher) {
            this.a = matcher;
        }

        @Override // org.jsoup.helper.e.b
        public boolean find() {
            try {
                return this.a.find();
            } catch (OutOfMemoryError | StackOverflowError unused) {
                throw new ValidationException("Pattern complexity error");
            }
        }
    }

    private d(com.google.re2j.Pattern pattern) {
        super(d);
        this.c = pattern;
    }

    public static e compile(String str) {
        try {
            return new d(com.google.re2j.Pattern.compile(str));
        } catch (OutOfMemoryError | StackOverflowError unused) {
            throw new ValidationException("Pattern complexity error");
        } catch (RuntimeException e) {
            throw new ValidationException("Pattern syntax error: " + e.getMessage());
        }
    }

    @Override // org.jsoup.helper.e
    public e.b matcher(CharSequence charSequence) {
        return new a(this.c.matcher(charSequence));
    }

    @Override // org.jsoup.helper.e
    public String toString() {
        return this.c.toString();
    }
}
