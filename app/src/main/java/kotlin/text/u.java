package kotlin.text;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public class u {
    public static final <T extends Appendable> T append(T t, CharSequence... charSequenceArr) throws IOException {
        t.getClass();
        charSequenceArr.getClass();
        for (CharSequence charSequence : charSequenceArr) {
            t.append(charSequence);
        }
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void appendElement(Appendable appendable, T t, kotlin.jvm.functions.l<? super T, ? extends CharSequence> lVar) throws IOException {
        appendable.getClass();
        if (lVar != null) {
            appendable.append(lVar.invoke(t));
            return;
        }
        if (t == 0 ? true : t instanceof CharSequence) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(t.toString());
        }
    }

    private static final Appendable appendLine(Appendable appendable, CharSequence charSequence) {
        appendable.getClass();
        return appendable.append(charSequence).append('\n');
    }

    public static final <T extends Appendable> T appendRange(T t, CharSequence charSequence, int i, int i2) {
        t.getClass();
        charSequence.getClass();
        T t2 = (T) t.append(charSequence, i, i2);
        t2.getClass();
        return t2;
    }

    private static final Appendable appendLine(Appendable appendable) {
        appendable.getClass();
        return appendable.append('\n');
    }

    private static final Appendable appendLine(Appendable appendable, char c) {
        appendable.getClass();
        return appendable.append(c).append('\n');
    }
}
