package com.userlabs.xshare.b62;

import java.nio.CharBuffer;
import java.nio.LongBuffer;
import okhttp3.b0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
final class b {
    private final CharBuffer a;

    public b(CharSequence charSequence) {
        if (charSequence.length() % 11 == 0) {
            this.a = CharBuffer.wrap(charSequence);
        } else {
            b0.i("input length must be a multiple of 11");
            throw null;
        }
    }

    private long decodeLong() {
        boolean z;
        int digitIndex = c.getDigitIndex(this.a.get());
        if (digitIndex >= 31) {
            digitIndex -= 31;
            z = true;
        } else {
            z = false;
        }
        long digitIndex2 = digitIndex;
        for (int i = 1; i < 11; i++) {
            digitIndex2 = (digitIndex2 * 62) + ((long) c.getDigitIndex(this.a.get()));
        }
        return z ? -digitIndex2 : digitIndex2;
    }

    public void decode(LongBuffer longBuffer) {
        while (this.a.hasRemaining()) {
            longBuffer.put(decodeLong());
        }
    }

    public long[] toArray() {
        int iRemaining = this.a.remaining() / 11;
        long[] jArr = new long[iRemaining];
        for (int i = 0; i < iRemaining; i++) {
            jArr[i] = decodeLong();
        }
        return jArr;
    }
}
