package okhttp3;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b0 {
    public static /* synthetic */ void c() {
        throw new AssertionError();
    }

    public static /* synthetic */ void d(int i, long j) throws IOException {
        throw new IOException("Content-Length (" + j + ((Object) ") and stream length (") + i + ((Object) ") disagree"));
    }

    public static /* synthetic */ void e(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void f(long j, Object obj) throws EOFException {
        throw new EOFException("\\n not found: limit=" + j + ((Object) " content=") + obj + (char) 8230);
    }

    public static /* synthetic */ void g(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void h(Object obj, Object obj2) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IOException(sb.toString());
    }

    public static /* synthetic */ void i(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void j(String str, Object obj) {
        throw new NumberFormatException(str + obj);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3) throws IOException {
        throw new IOException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m() throws EOFException {
        throw new EOFException();
    }

    public static /* synthetic */ void n(int i, String str) throws IOException {
        throw new IOException(str + i);
    }

    public static /* synthetic */ void o(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void p(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void q(String str, Object obj) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void s(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void t(String str) throws IOException {
        throw new IOException(str);
    }

    public static /* synthetic */ void u(String str, Object obj) {
        throw new IllegalArgumentException((str + obj).toString());
    }
}
