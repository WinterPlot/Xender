package com.userlabs.xshare.videoplayer.util;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class h {
    private h() {
    }

    public static CharSequence changeTextColor(CharSequence charSequence, int i, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (String str : strArr) {
            int iIndexOf = charSequence.toString().indexOf(str);
            int length = str.length();
            if (iIndexOf >= 0) {
                setColorStyle(spannableStringBuilder, i, iIndexOf, length + iIndexOf);
            }
        }
        return spannableStringBuilder;
    }

    public static CharSequence changeTextColorAndBigger(CharSequence charSequence, int i, int i2, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (String str : strArr) {
            int iIndexOf = charSequence.toString().indexOf(str);
            int length = str.length();
            if (iIndexOf >= 0) {
                int i3 = length + iIndexOf;
                setColorStyle(spannableStringBuilder, i, iIndexOf, i3);
                setTextBigger(spannableStringBuilder, iIndexOf, i3, i2);
            }
        }
        return spannableStringBuilder;
    }

    private static void setColorStyle(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), i2, i3, 33);
    }

    private static void setTextBigger(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(i3, true), i, i2, 33);
    }
}
