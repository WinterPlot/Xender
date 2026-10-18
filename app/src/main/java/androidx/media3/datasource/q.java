package androidx.media3.datasource;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements e {
    public static final q a = new q();
    public static final e.a b = new p();

    private q() {
    }

    public static /* synthetic */ q a() {
        return new q();
    }

    @Override // androidx.media3.datasource.e
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override // androidx.media3.datasource.e
    public Uri getUri() {
        return null;
    }

    @Override // androidx.media3.datasource.e
    public long open(k kVar) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // androidx.media3.datasource.e, androidx.media3.common.k
    public int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.e
    public void close() {
    }

    @Override // androidx.media3.datasource.e
    public void addTransferListener(v vVar) {
    }
}
