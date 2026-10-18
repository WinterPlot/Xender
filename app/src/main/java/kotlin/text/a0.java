package kotlin.text;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
class a0 extends z {
    private static final StringBuilder append(StringBuilder sb, byte b) {
        sb.getClass();
        sb.append((int) b);
        return sb;
    }

    private static final StringBuilder appendLine(StringBuilder sb, StringBuffer stringBuffer) {
        sb.getClass();
        sb.append(stringBuffer);
        sb.append('\n');
        return sb;
    }

    private static final StringBuilder appendRange(StringBuilder sb, char[] cArr, int i, int i2) {
        sb.getClass();
        cArr.getClass();
        sb.append(cArr, i, i2 - i);
        return sb;
    }

    private static final Appendable appendln(Appendable appendable, CharSequence charSequence) throws IOException {
        appendable.getClass();
        Appendable appendableAppend = appendable.append(charSequence);
        appendableAppend.getClass();
        return appendln(appendableAppend);
    }

    public static final StringBuilder clear(StringBuilder sb) {
        sb.getClass();
        sb.setLength(0);
        return sb;
    }

    private static final StringBuilder deleteAt(StringBuilder sb, int i) {
        sb.getClass();
        StringBuilder sbDeleteCharAt = sb.deleteCharAt(i);
        sbDeleteCharAt.getClass();
        return sbDeleteCharAt;
    }

    private static final StringBuilder deleteRange(StringBuilder sb, int i, int i2) {
        sb.getClass();
        StringBuilder sbDelete = sb.delete(i, i2);
        sbDelete.getClass();
        return sbDelete;
    }

    private static final StringBuilder insert(StringBuilder sb, int i, byte b) {
        sb.getClass();
        StringBuilder sbInsert = sb.insert(i, (int) b);
        sbInsert.getClass();
        return sbInsert;
    }

    private static final StringBuilder insertRange(StringBuilder sb, int i, char[] cArr, int i2, int i3) {
        sb.getClass();
        cArr.getClass();
        StringBuilder sbInsert = sb.insert(i, cArr, i2, i3 - i2);
        sbInsert.getClass();
        return sbInsert;
    }

    private static final void set(StringBuilder sb, int i, char c) {
        sb.getClass();
        sb.setCharAt(i, c);
    }

    private static final StringBuilder setRange(StringBuilder sb, int i, int i2, String str) {
        sb.getClass();
        str.getClass();
        StringBuilder sbReplace = sb.replace(i, i2, str);
        sbReplace.getClass();
        return sbReplace;
    }

    private static final void toCharArray(StringBuilder sb, char[] cArr, int i, int i2, int i3) {
        sb.getClass();
        cArr.getClass();
        sb.getChars(i2, i3, cArr, i);
    }

    public static /* synthetic */ void toCharArray$default(StringBuilder sb, char[] cArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = sb.length();
        }
        sb.getClass();
        cArr.getClass();
        sb.getChars(i2, i3, cArr, i);
    }

    private static final StringBuilder append(StringBuilder sb, short s) {
        sb.getClass();
        sb.append((int) s);
        return sb;
    }

    private static final StringBuilder appendRange(StringBuilder sb, CharSequence charSequence, int i, int i2) {
        sb.getClass();
        charSequence.getClass();
        sb.append(charSequence, i, i2);
        return sb;
    }

    private static final StringBuilder insert(StringBuilder sb, int i, short s) {
        sb.getClass();
        StringBuilder sbInsert = sb.insert(i, (int) s);
        sbInsert.getClass();
        return sbInsert;
    }

    private static final StringBuilder appendLine(StringBuilder sb, StringBuilder sb2) {
        sb.getClass();
        sb.append((CharSequence) sb2);
        sb.append('\n');
        return sb;
    }

    private static final StringBuilder appendLine(StringBuilder sb, int i) {
        sb.getClass();
        sb.append(i);
        sb.append('\n');
        return sb;
    }

    private static final StringBuilder appendLine(StringBuilder sb, short s) {
        sb.getClass();
        sb.append((int) s);
        sb.append('\n');
        return sb;
    }

    private static final StringBuilder appendLine(StringBuilder sb, byte b) {
        sb.getClass();
        sb.append((int) b);
        sb.append('\n');
        return sb;
    }

    public static final Appendable appendln(Appendable appendable) throws IOException {
        appendable.getClass();
        Appendable appendableAppend = appendable.append(m0.b);
        appendableAppend.getClass();
        return appendableAppend;
    }

    private static final StringBuilder insertRange(StringBuilder sb, int i, CharSequence charSequence, int i2, int i3) {
        sb.getClass();
        charSequence.getClass();
        StringBuilder sbInsert = sb.insert(i, charSequence, i2, i3);
        sbInsert.getClass();
        return sbInsert;
    }

    private static final StringBuilder appendLine(StringBuilder sb, long j) {
        sb.getClass();
        sb.append(j);
        sb.append('\n');
        return sb;
    }

    private static final Appendable appendln(Appendable appendable, char c) throws IOException {
        appendable.getClass();
        Appendable appendableAppend = appendable.append(c);
        appendableAppend.getClass();
        return appendln(appendableAppend);
    }

    private static final StringBuilder appendLine(StringBuilder sb, float f) {
        sb.getClass();
        sb.append(f);
        sb.append('\n');
        return sb;
    }

    public static final StringBuilder appendln(StringBuilder sb) {
        sb.getClass();
        sb.append(m0.b);
        return sb;
    }

    private static final StringBuilder appendLine(StringBuilder sb, double d) {
        sb.getClass();
        sb.append(d);
        sb.append('\n');
        return sb;
    }

    private static final StringBuilder appendln(StringBuilder sb, StringBuffer stringBuffer) {
        sb.getClass();
        sb.append(stringBuffer);
        return appendln(sb);
    }

    private static final StringBuilder appendln(StringBuilder sb, CharSequence charSequence) {
        sb.getClass();
        sb.append(charSequence);
        return appendln(sb);
    }

    private static final StringBuilder appendln(StringBuilder sb, String str) {
        sb.getClass();
        sb.append(str);
        return appendln(sb);
    }

    private static final StringBuilder appendln(StringBuilder sb, Object obj) {
        sb.getClass();
        sb.append(obj);
        return appendln(sb);
    }

    private static final StringBuilder appendln(StringBuilder sb, StringBuilder sb2) {
        sb.getClass();
        sb.append((CharSequence) sb2);
        return appendln(sb);
    }

    private static final StringBuilder appendln(StringBuilder sb, char[] cArr) {
        sb.getClass();
        cArr.getClass();
        sb.append(cArr);
        return appendln(sb);
    }

    private static final StringBuilder appendln(StringBuilder sb, char c) {
        sb.getClass();
        sb.append(c);
        return appendln(sb);
    }

    private static final StringBuilder appendln(StringBuilder sb, boolean z) {
        sb.getClass();
        sb.append(z);
        return appendln(sb);
    }

    private static final StringBuilder appendln(StringBuilder sb, int i) {
        sb.getClass();
        sb.append(i);
        return appendln(sb);
    }

    private static final StringBuilder appendln(StringBuilder sb, short s) {
        sb.getClass();
        sb.append((int) s);
        return appendln(sb);
    }

    private static final StringBuilder appendln(StringBuilder sb, byte b) {
        sb.getClass();
        sb.append((int) b);
        return appendln(sb);
    }

    private static final StringBuilder appendln(StringBuilder sb, long j) {
        sb.getClass();
        sb.append(j);
        return appendln(sb);
    }

    private static final StringBuilder appendln(StringBuilder sb, float f) {
        sb.getClass();
        sb.append(f);
        return appendln(sb);
    }

    private static final StringBuilder appendln(StringBuilder sb, double d) {
        sb.getClass();
        sb.append(d);
        return appendln(sb);
    }
}
