package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class o extends p {
    private final int b;
    private final int c;

    public o(int i, int i2, int i3) throws FormatException {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw FormatException.getFormatInstance();
        }
        this.b = i2;
        this.c = i3;
    }

    public int getFirstDigit() {
        return this.b;
    }

    public int getSecondDigit() {
        return this.c;
    }

    public int getValue() {
        return (this.b * 10) + this.c;
    }

    public boolean isFirstDigitFNC1() {
        return this.b == 10;
    }

    public boolean isSecondDigitFNC1() {
        return this.c == 10;
    }
}
