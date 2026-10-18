package org.apache.commons.fileupload;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public class g {
    private char[] a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f;

    private String getToken(boolean z) {
        while (true) {
            int i = this.d;
            if (i >= this.e || !Character.isWhitespace(this.a[i])) {
                break;
            }
            this.d++;
        }
        while (true) {
            int i2 = this.e;
            if (i2 <= this.d || !Character.isWhitespace(this.a[i2 - 1])) {
                break;
            }
            this.e--;
        }
        if (z) {
            int i3 = this.e;
            int i4 = this.d;
            if (i3 - i4 >= 2) {
                char[] cArr = this.a;
                if (cArr[i4] == '\"' && cArr[i3 - 1] == '\"') {
                    this.d = i4 + 1;
                    this.e = i3 - 1;
                }
            }
        }
        int i5 = this.e;
        int i6 = this.d;
        if (i5 > i6) {
            return new String(this.a, i6, i5 - i6);
        }
        return null;
    }

    private boolean hasChar() {
        return this.b < this.c;
    }

    private boolean isOneOf(char c, char[] cArr) {
        for (char c2 : cArr) {
            if (c == c2) {
                return true;
            }
        }
        return false;
    }

    private String parseQuotedToken(char[] cArr) {
        int i = this.b;
        this.d = i;
        this.e = i;
        boolean z = false;
        boolean z2 = false;
        while (hasChar()) {
            char c = this.a[this.b];
            if (!z && isOneOf(c, cArr)) {
                break;
            }
            if (!z2 && c == '\"') {
                z = !z;
            }
            z2 = !z2 && c == '\\';
            this.e++;
            this.b++;
        }
        return getToken(true);
    }

    private String parseToken(char[] cArr) {
        int i = this.b;
        this.d = i;
        this.e = i;
        while (hasChar() && !isOneOf(this.a[this.b], cArr)) {
            this.e++;
            this.b++;
        }
        return getToken(false);
    }

    public boolean isLowerCaseNames() {
        return this.f;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    public Map<String, String> parse(char[] cArr, int i, int i2, char c) {
        String quotedToken;
        if (cArr == null) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        this.a = (char[]) cArr.clone();
        this.b = i;
        this.c = i2;
        while (hasChar()) {
            String token = parseToken(new char[]{'=', c});
            if (hasChar()) {
                int i3 = this.b;
                if (cArr[i3] == '=') {
                    this.b = i3 + 1;
                    quotedToken = parseQuotedToken(new char[]{c});
                    if (quotedToken != null) {
                        try {
                            quotedToken = i.hasEncodedValue(token) ? i.decodeText(quotedToken) : org.apache.commons.fileupload.util.mime.a.decodeText(quotedToken);
                        } catch (UnsupportedEncodingException unused) {
                        }
                    }
                } else {
                    quotedToken = null;
                }
            } else {
                quotedToken = null;
            }
            if (hasChar()) {
                int i4 = this.b;
                if (cArr[i4] == c) {
                    this.b = i4 + 1;
                }
            }
            if (token != null && !token.isEmpty()) {
                String strStripDelimiter = i.stripDelimiter(token);
                if (this.f) {
                    strStripDelimiter = strStripDelimiter.toLowerCase(Locale.ROOT);
                }
                map.put(strStripDelimiter, quotedToken);
            }
        }
        return map;
    }

    public void setLowerCaseNames(boolean z) {
        this.f = z;
    }

    public Map<String, String> parse(char[] cArr, char c) {
        if (cArr == null) {
            return new HashMap();
        }
        return parse(cArr, 0, cArr.length, c);
    }

    public Map<String, String> parse(String str, char c) {
        if (str == null) {
            return new HashMap();
        }
        return parse(str.toCharArray(), c);
    }

    public Map<String, String> parse(String str, char[] cArr) {
        if (cArr != null && cArr.length != 0) {
            char c = cArr[0];
            if (str != null) {
                int length = str.length();
                for (char c2 : cArr) {
                    int iIndexOf = str.indexOf(c2);
                    if (iIndexOf != -1 && iIndexOf < length) {
                        c = c2;
                        length = iIndexOf;
                    }
                }
            }
            return parse(str, c);
        }
        return new HashMap();
    }
}
