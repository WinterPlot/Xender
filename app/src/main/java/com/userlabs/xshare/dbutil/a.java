package com.userlabs.xshare.dbutil;

import com.userlabs.xshare.core.log.h;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    private static Pattern a = Pattern.compile("[\\p{P}\\p{S}\\s+]");
    private static Pattern b = Pattern.compile("[\\p{P}\\p{S}]");
    private static Pattern c = Pattern.compile("[一-龥]+");

    public static String startTokenize(String str) {
        try {
            HashSet hashSet = new HashSet();
            for (String str2 : a.split(str)) {
                String strTrim = str2.trim();
                if (!strTrim.isEmpty()) {
                    for (int i = 1; i <= 2; i++) {
                        tokenizer(strTrim, i, hashSet);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append(" ");
            }
            return sb.toString().trim();
        } catch (Exception e) {
            if (h.a) {
                h.e("tokenize", "startTokenize has exception", e);
            }
            return str;
        }
    }

    public static String startTokenizeOneWord(String str) {
        try {
            return c.matcher(str).find() ? startTokenize(str) : b.matcher(str).replaceAll(" ");
        } catch (Exception e) {
            if (h.a) {
                h.e("tokenize", "startTokenize has exception", e);
            }
            return str;
        }
    }

    private static void tokenizer(String str, int i, Set<String> set) {
        if (i > str.length()) {
            return;
        }
        for (int i2 = 0; i2 <= str.length() - i; i2++) {
            set.add(str.substring(i2, i2 + i));
        }
    }
}
