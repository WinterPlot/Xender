package kotlinx.serialization.json.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public class l {
    public final t a;
    private boolean b;

    public l(t tVar) {
        tVar.getClass();
        this.a = tVar;
        this.b = true;
    }

    public final boolean getWritingFirst() {
        return this.b;
    }

    public void indent() {
        this.b = true;
    }

    public void nextItem() {
        this.b = false;
    }

    public void nextItemIfNotFirst() {
        this.b = false;
    }

    public void print(float f) {
        this.a.write(String.valueOf(f));
    }

    public void printQuoted(String str) {
        str.getClass();
        this.a.writeQuoted(str);
    }

    public final void setWritingFirst(boolean z) {
        this.b = z;
    }

    public final void print(String str) {
        str.getClass();
        this.a.write(str);
    }

    public final void print(char c) {
        this.a.writeChar(c);
    }

    public void print(double d) {
        this.a.write(String.valueOf(d));
    }

    public void print(byte b) {
        this.a.writeLong(b);
    }

    public void print(short s) {
        this.a.writeLong(s);
    }

    public void print(int i) {
        this.a.writeLong(i);
    }

    public void print(long j) {
        this.a.writeLong(j);
    }

    public void print(boolean z) {
        this.a.write(String.valueOf(z));
    }

    public void space() {
    }

    public void unIndent() {
    }
}
