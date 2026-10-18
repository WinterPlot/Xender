package com.userlabs.xshare.b62;

import java.nio.CharBuffer;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
final class d {
    private final StringBuilder a = new StringBuilder();
    private final CharBuffer b = CharBuffer.allocate(11);

    private void putDigit(int i, int i2) {
        this.b.put(i, c.getDigit(i2));
    }

    public void accept(long j) {
        int i = 10;
        if (j < 0) {
            while (i > 0) {
                putDigit(i, (int) (-(j % 62)));
                j /= 62;
                i--;
            }
            putDigit(0, (int) (-(j - 31)));
        } else {
            while (i > 0) {
                putDigit(i, (int) (j % 62));
                j /= 62;
                i--;
            }
            putDigit(0, (int) j);
        }
        this.a.append((CharSequence) this.b);
        this.b.clear();
    }

    public String toString() {
        return this.a.toString().replaceFirst("^0*", "");
    }
}
