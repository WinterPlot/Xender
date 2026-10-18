package org.jsoup.internal;

import java.io.IOException;
import org.jsoup.SerializationException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class e {
    public static e wrap(Appendable appendable) {
        return appendable instanceof StringBuilder ? new c((StringBuilder) appendable) : new b(appendable);
    }

    public abstract e append(char c2);

    public abstract e append(CharSequence charSequence);

    public abstract e append(char[] cArr, int i, int i2);

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class c extends e {
        private final StringBuilder a;

        private c(StringBuilder sb) {
            this.a = sb;
        }

        @Override // org.jsoup.internal.e
        public c append(CharSequence charSequence) {
            this.a.append(charSequence);
            return this;
        }

        public String toString() {
            return this.a.toString();
        }

        @Override // org.jsoup.internal.e
        public c append(char c) {
            this.a.append(c);
            return this;
        }

        @Override // org.jsoup.internal.e
        public e append(char[] cArr, int i, int i2) {
            this.a.append(cArr, i, i2);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b extends e {
        private final Appendable a;

        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        @FunctionalInterface
        public interface a {
            void append() throws IOException;
        }

        private b(Appendable appendable) {
            this.a = appendable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$append$0(CharSequence charSequence) throws IOException {
            this.a.append(charSequence);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$append$1(char c) throws IOException {
            this.a.append(c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$append$2(char[] cArr, int i, int i2) throws IOException {
            this.a.append(new String(cArr, i, i2));
        }

        private b quiet(a aVar) {
            try {
                aVar.append();
                return this;
            } catch (IOException e) {
                throw new SerializationException(e);
            }
        }

        @Override // org.jsoup.internal.e
        public b append(final CharSequence charSequence) {
            return quiet(new a() { // from class: org.jsoup.internal.h
                @Override // org.jsoup.internal.e.b.a
                public final void append() throws IOException {
                    this.a.lambda$append$0(charSequence);
                }
            });
        }

        @Override // org.jsoup.internal.e
        public b append(final char c) {
            return quiet(new a() { // from class: org.jsoup.internal.f
                @Override // org.jsoup.internal.e.b.a
                public final void append() throws IOException {
                    this.a.lambda$append$1(c);
                }
            });
        }

        @Override // org.jsoup.internal.e
        public e append(final char[] cArr, final int i, final int i2) {
            return quiet(new a() { // from class: org.jsoup.internal.g
                @Override // org.jsoup.internal.e.b.a
                public final void append() throws IOException {
                    this.a.lambda$append$2(cArr, i, i2);
                }
            });
        }
    }
}
