package com.google.common.base;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
abstract class d {
    public static d compile(String str) {
        return l.compilePattern(str);
    }

    public static boolean isPcreLike() {
        return l.patternCompilerIsPcreLike();
    }

    public abstract int flags();

    public abstract c matcher(CharSequence charSequence);

    public abstract String pattern();

    public abstract String toString();
}
