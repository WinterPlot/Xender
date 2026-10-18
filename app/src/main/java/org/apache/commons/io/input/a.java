package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends InputStream {
    private boolean a;

    public void checkOpen() throws IOException {
        g.checkOpen(!isClosed());
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.a = true;
    }

    public boolean isClosed() {
        return this.a;
    }

    public void setClosed(boolean z) {
        this.a = z;
    }
}
