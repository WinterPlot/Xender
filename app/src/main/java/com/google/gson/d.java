package com.google.gson;

import j$.util.Objects;
import okhttp3.b0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class d {
    public static final d d = new d("", "", false);
    public static final d e = new d("\n", "  ", true);
    private final String a;
    private final String b;
    private final boolean c;

    private d(String str, String str2, boolean z) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            b0.i("Only combinations of \\n and \\r are allowed in newline.");
            throw null;
        }
        if (!str2.matches("[ \t]*")) {
            b0.i("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public String getIndent() {
        return this.b;
    }

    public String getNewline() {
        return this.a;
    }

    public boolean usesSpaceAfterSeparators() {
        return this.c;
    }

    public d withIndent(String str) {
        return new d(this.a, str, this.c);
    }

    public d withNewline(String str) {
        return new d(str, this.b, this.c);
    }

    public d withSpaceAfterSeparators(boolean z) {
        return new d(this.a, this.b, z);
    }
}
