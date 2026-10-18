package com.userlabs.xshare.core.utils;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import okhttp3.b0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class x {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a {
        private String a;
        private int b;
        private String[] c;
        private int d;
        private String[] e;
        private int f;
        private String[] g;
        private String[] h;
        private ClickableSpan i;
        private String[] j;

        public CharSequence build() {
            if (this.a == null) {
                b0.i("parent str cannot be null");
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.a);
            String[] strArr = this.c;
            if (strArr != null) {
                for (String str : strArr) {
                    int iIndexOf = this.a.indexOf(str);
                    int length = str.length();
                    if (iIndexOf >= 0) {
                        x.setColorStyle(spannableStringBuilder, this.b, iIndexOf, length + iIndexOf);
                    }
                }
            }
            String[] strArr2 = this.e;
            if (strArr2 != null) {
                for (String str2 : strArr2) {
                    int iIndexOf2 = this.a.indexOf(str2);
                    int length2 = str2.length();
                    if (iIndexOf2 >= 0) {
                        x.setColorStyle(spannableStringBuilder, this.d, iIndexOf2, length2 + iIndexOf2);
                    }
                }
            }
            String[] strArr3 = this.j;
            if (strArr3 != null) {
                for (String str3 : strArr3) {
                    int iIndexOf3 = this.a.indexOf(str3);
                    int length3 = str3.length();
                    if (iIndexOf3 >= 0) {
                        x.setClickUnderLine(this.i, spannableStringBuilder, iIndexOf3, length3 + iIndexOf3);
                    }
                }
            }
            String[] strArr4 = this.g;
            if (strArr4 != null) {
                for (String str4 : strArr4) {
                    int iIndexOf4 = this.a.indexOf(str4);
                    int length4 = str4.length();
                    if (iIndexOf4 >= 0) {
                        x.setTextBigger(spannableStringBuilder, iIndexOf4, length4 + iIndexOf4, this.f);
                    }
                }
            }
            String[] strArr5 = this.h;
            if (strArr5 != null) {
                for (String str5 : strArr5) {
                    int iIndexOf5 = this.a.indexOf(str5);
                    int length5 = str5.length();
                    if (iIndexOf5 >= 0) {
                        x.setBoldStyle(spannableStringBuilder, iIndexOf5, length5 + iIndexOf5);
                    }
                }
            }
            return spannableStringBuilder;
        }

        public a setBoldStr(String... strArr) {
            this.h = strArr;
            return this;
        }

        public a setColorStr(int i, String... strArr) {
            this.b = i;
            this.c = strArr;
            return this;
        }

        public a setColorStr2(int i, String... strArr) {
            this.d = i;
            this.e = strArr;
            return this;
        }

        public a setParentStr(String str) {
            this.a = str;
            return this;
        }

        public a setSizeStr(int i, String... strArr) {
            this.f = i;
            this.g = strArr;
            return this;
        }

        public a setUnderLine(ClickableSpan clickableSpan, String... strArr) {
            this.i = clickableSpan;
            this.j = strArr;
            return this;
        }
    }

    private x() {
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

    public static CharSequence changeTextColorAndClickUnderline(ClickableSpan clickableSpan, String str, int i, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (String str2 : strArr) {
            int iIndexOf = str.indexOf(str2);
            int length = str2.length();
            if (iIndexOf >= 0) {
                int i2 = length + iIndexOf;
                setColorStyle(spannableStringBuilder, i, iIndexOf, i2);
                setClickUnderLine(clickableSpan, spannableStringBuilder, iIndexOf, i2);
            }
        }
        return spannableStringBuilder;
    }

    public static CharSequence changeTextColorAndUnderline(String str, int i, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (String str2 : strArr) {
            int iIndexOf = str.indexOf(str2);
            int length = str2.length();
            if (iIndexOf >= 0) {
                int i2 = length + iIndexOf;
                setColorStyle(spannableStringBuilder, i, iIndexOf, i2);
                setUnderLine(spannableStringBuilder, iIndexOf, i2);
            }
        }
        return spannableStringBuilder;
    }

    public static CharSequence getTextColorAndBoldStyle(int i, String str, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (String str2 : strArr) {
            int iIndexOf = str.indexOf(str2);
            int length = str2.length();
            if (iIndexOf >= 0) {
                int i2 = length + iIndexOf;
                setColorStyle(spannableStringBuilder, i, iIndexOf, i2);
                setBoldStyle(spannableStringBuilder, iIndexOf, i2);
            }
        }
        return spannableStringBuilder;
    }

    public static CharSequence getTextViewColorStyle(int i, CharSequence charSequence, String... strArr) {
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

    public static CharSequence getUnderLineText(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        setUnderLine(spannableStringBuilder, 0, str.length());
        return spannableStringBuilder;
    }

    public static void setBoldStyle(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new StyleSpan(1), i, i2, 33);
    }

    public static void setClickUnderLine(ClickableSpan clickableSpan, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(clickableSpan, i, i2, 33);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setColorStyle(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), i2, i3, 33);
    }

    public static void setTextBigger(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(i3, true), i, i2, 33);
    }

    public static void setUnderLine(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
    }
}
