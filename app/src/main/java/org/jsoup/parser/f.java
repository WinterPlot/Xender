package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public class f {
    private final int a;
    private final String b;
    private final String c;

    public f(c cVar, String str, Object... objArr) {
        this.a = cVar.pos();
        this.b = cVar.posLineCol();
        this.c = String.format(str, objArr);
    }

    public String getCursorPos() {
        return this.b;
    }

    public String getErrorMessage() {
        return this.c;
    }

    public int getPosition() {
        return this.a;
    }

    public String toString() {
        return "<" + this.b + ">: " + this.c;
    }

    public f(c cVar, String str) {
        this.a = cVar.pos();
        this.b = cVar.posLineCol();
        this.c = str;
    }

    public f(int i, String str) {
        this.a = i;
        this.b = String.valueOf(i);
        this.c = str;
    }

    public f(int i, String str, Object... objArr) {
        this.a = i;
        this.b = String.valueOf(i);
        this.c = String.format(str, objArr);
    }
}
