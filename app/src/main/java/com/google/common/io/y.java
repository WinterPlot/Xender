package com.google.common.io;

import java.io.IOException;
import java.nio.file.attribute.FileAttribute;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y implements x.c.b {
    public final /* synthetic */ int a;

    public /* synthetic */ y(int i) {
        this.a = i;
    }

    public static /* synthetic */ void a(int i, String str) throws BaseEncoding.DecodingException {
        throw new BaseEncoding.DecodingException(str + i);
    }

    public static /* synthetic */ void b(String str, Object obj) throws IOException {
        throw new IOException(str + obj);
    }

    @Override // com.google.common.io.x.c.b
    public FileAttribute get() {
        switch (this.a) {
            case 0:
                return x.c.lambda$static$0();
            case 1:
                return x.c.lambda$static$1();
            default:
                return x.c.lambda$static$2();
        }
    }
}
