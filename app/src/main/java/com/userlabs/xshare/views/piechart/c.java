package com.userlabs.xshare.views.piechart;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class c {
    private static DisplayMetrics a;

    public static int calcTextHeight(Paint paint, String str) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static float convertDpToPixel(float f) {
        DisplayMetrics displayMetrics = a;
        return displayMetrics == null ? f : (displayMetrics.densityDpi / 160.0f) * f;
    }

    public static int getBucketMark(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return (int) (murmurhash3_x86_32(bytes, 0, bytes.length) % 100);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static void init(Resources resources) {
        a = resources.getDisplayMetrics();
    }

    private static long murmurhash3_x86_32(byte[] bArr, int i, int i2, int i3) {
        int i4 = (i2 & (-4)) + i;
        while (i < i4) {
            int i5 = ((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | (bArr[i + 3] << 24)) * (-862048943);
            int i6 = i3 ^ (((i5 << 15) | (i5 >>> 17)) * 461845907);
            i3 = (((i6 >>> 19) | (i6 << 13)) * 5) - 430675100;
            i += 4;
        }
        int i7 = i2 & 3;
        int i8 = 0;
        if (i7 == 1) {
            int i9 = ((bArr[i4] & 255) | i8) * (-862048943);
            i3 ^= ((i9 >>> 17) | (i9 << 15)) * 461845907;
        } else {
            if (i7 != 2) {
                i8 = i7 == 3 ? (bArr[i4 + 2] & 255) << 16 : 0;
            }
            i8 |= (bArr[i4 + 1] & 255) << 8;
            int i10 = ((bArr[i4] & 255) | i8) * (-862048943);
            i3 ^= ((i10 >>> 17) | (i10 << 15)) * 461845907;
        }
        int i11 = i3 ^ i2;
        int i12 = (i11 ^ (i11 >>> 16)) * (-2048144789);
        int i13 = (i12 ^ (i12 >>> 13)) * (-1028477387);
        return ((long) (i13 ^ (i13 >>> 16))) & 4294967295L;
    }

    private static long murmurhash3_x86_32(byte[] bArr, int i, int i2) {
        return murmurhash3_x86_32(bArr, i, i2, 0);
    }
}
