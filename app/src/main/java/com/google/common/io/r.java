package com.google.common.io;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
abstract class r {
    private StringBuilder a = new StringBuilder();
    private boolean b;

    private boolean finishLine(boolean z) throws IOException {
        String str;
        if (this.b) {
            str = z ? "\r\n" : "\r";
        } else {
            str = z ? "\n" : "";
        }
        handleLine(this.a.toString(), str);
        this.a = new StringBuilder();
        this.b = false;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001a  */
    public void add(char[] cArr, int i, int i2) throws IOException {
        int i3;
        if (!this.b || i2 <= 0) {
            i3 = i;
        } else {
            if (finishLine(cArr[i] == '\n')) {
                i3 = i + 1;
            } else {
                i3 = i;
            }
        }
        int i4 = i + i2;
        int i5 = i3;
        while (i3 < i4) {
            char c = cArr[i3];
            if (c != '\n') {
                if (c == '\r') {
                    this.a.append(cArr, i5, i3 - i5);
                    this.b = true;
                    int i6 = i3 + 1;
                    if (i6 < i4) {
                        if (finishLine(cArr[i6] == '\n')) {
                            i3 = i6;
                        }
                    }
                }
                i3++;
            } else {
                this.a.append(cArr, i5, i3 - i5);
                finishLine(true);
            }
            i5 = i3 + 1;
            i3++;
        }
        this.a.append(cArr, i5, i4 - i5);
    }

    public void finish() throws IOException {
        if (this.b || this.a.length() > 0) {
            finishLine(false);
        }
    }

    public abstract void handleLine(String str, String str2) throws IOException;
}
