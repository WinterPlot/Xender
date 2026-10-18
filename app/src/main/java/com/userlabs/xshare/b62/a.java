package com.userlabs.xshare.b62;

import java.nio.LongBuffer;
import okhttp3.b0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    private a() {
    }

    public static void decode(CharSequence charSequence, LongBuffer longBuffer) {
        new b(charSequence).decode(longBuffer);
    }

    public static long[] decodeArray(CharSequence charSequence) {
        return new b(charSequence).toArray();
    }

    public static long decodeSingle(CharSequence charSequence) {
        if (11 - charSequence.length() < 0) {
            b0.i("accept input length must less than 11");
            return 0L;
        }
        int length = 11 - charSequence.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(0);
        }
        sb.append(charSequence);
        return new b(sb.toString()).toArray()[0];
    }

    public static String encode(LongBuffer longBuffer) {
        d dVar = new d();
        while (longBuffer.hasRemaining()) {
            dVar.accept(longBuffer.get());
        }
        return dVar.toString();
    }

    public static String encode(long... jArr) {
        d dVar = new d();
        for (long j : jArr) {
            dVar.accept(j);
        }
        return dVar.toString();
    }
}
