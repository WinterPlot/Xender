package okhttp3.internal.idn;

import java.io.IOException;
import kotlin.jvm.internal.y;
import okhttp3.b0;
import okio.f;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private final String a;
    private final String b;
    private final String c;

    public a(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    private final int findRangesOffset(int i, int i2, int i3) {
        int i4;
        int i5 = i & 127;
        int i6 = i3 - 1;
        while (i2 <= i6) {
            i4 = (i2 + i6) / 2;
            int iCompare = y.compare(i5, (int) this.b.charAt(i4 * 4));
            if (iCompare < 0) {
                i6 = i4 - 1;
            } else {
                if (iCompare <= 0) {
                    return i4 >= 0 ? i4 * 4 : ((-i4) - 2) * 4;
                }
                i2 = i4 + 1;
            }
        }
        i4 = (-i2) - 1;
        if (i4 >= 0) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    private final int findSectionsIndex(int i) {
        int i2;
        int i3 = (i & 2097024) >> 7;
        int length = (this.a.length() / 4) - 1;
        int i4 = 0;
        while (i4 <= length) {
            i2 = (i4 + length) / 2;
            int iCompare = y.compare(i3, c.read14BitInt(this.a, i2 * 4));
            if (iCompare < 0) {
                length = i2 - 1;
            } else {
                if (iCompare <= 0) {
                    return i2 >= 0 ? i2 * 4 : ((-i2) - 2) * 4;
                }
                i4 = i2 + 1;
            }
        }
        i2 = (-i4) - 1;
        if (i2 >= 0) {
        }
    }

    public final String getMappings() {
        return this.c;
    }

    public final String getRanges() {
        return this.b;
    }

    public final String getSections() {
        return this.a;
    }

    public final boolean map(int i, f fVar) throws IOException {
        fVar.getClass();
        int iFindSectionsIndex = findSectionsIndex(i);
        int iFindRangesOffset = findRangesOffset(i, c.read14BitInt(this.a, iFindSectionsIndex + 2), iFindSectionsIndex + 4 < this.a.length() ? c.read14BitInt(this.a, iFindSectionsIndex + 6) : this.b.length() / 4);
        char cCharAt = this.b.charAt(iFindRangesOffset + 1);
        if (cCharAt >= 0 && cCharAt < '@') {
            int i2 = c.read14BitInt(this.b, iFindRangesOffset + 2);
            fVar.writeUtf8(this.c, i2, cCharAt + i2);
            return true;
        }
        if ('@' <= cCharAt && cCharAt < 'P') {
            fVar.writeUtf8CodePoint(i - (this.b.charAt(iFindRangesOffset + 3) | (((cCharAt & 15) << 14) | (this.b.charAt(iFindRangesOffset + 2) << 7))));
            return true;
        }
        if ('P' <= cCharAt && cCharAt < '`') {
            fVar.writeUtf8CodePoint(i + (this.b.charAt(iFindRangesOffset + 3) | ((cCharAt & 15) << 14) | (this.b.charAt(iFindRangesOffset + 2) << 7)));
            return true;
        }
        if (cCharAt == 'w') {
            kotlin.y yVar = kotlin.y.a;
            return true;
        }
        if (cCharAt == 'x') {
            fVar.writeUtf8CodePoint(i);
            return true;
        }
        if (cCharAt == 'y') {
            fVar.writeUtf8CodePoint(i);
            return false;
        }
        if (cCharAt == 'z') {
            fVar.writeByte(this.b.charAt(iFindRangesOffset + 2));
            return true;
        }
        if (cCharAt == '{') {
            fVar.writeByte(this.b.charAt(iFindRangesOffset + 2) | 128);
            return true;
        }
        if (cCharAt == '|') {
            fVar.writeByte(this.b.charAt(iFindRangesOffset + 2));
            fVar.writeByte(this.b.charAt(iFindRangesOffset + 3));
            return true;
        }
        if (cCharAt == '}') {
            fVar.writeByte(this.b.charAt(iFindRangesOffset + 2) | 128);
            fVar.writeByte(this.b.charAt(iFindRangesOffset + 3));
            return true;
        }
        if (cCharAt == '~') {
            fVar.writeByte(this.b.charAt(iFindRangesOffset + 2));
            fVar.writeByte(this.b.charAt(iFindRangesOffset + 3) | 128);
            return true;
        }
        if (cCharAt != 127) {
            b0.s(i, "unexpected rangesIndex for ");
            return false;
        }
        fVar.writeByte(this.b.charAt(iFindRangesOffset + 2) | 128);
        fVar.writeByte(this.b.charAt(iFindRangesOffset + 3) | 128);
        return true;
    }
}
