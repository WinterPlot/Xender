package com.userlabs.xshare.utils;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class g0 {
    public static String decrypt16Bit(String str, int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = i & 65535;
        int i3 = 0;
        while (i3 < str.length()) {
            int i4 = i3 + 4;
            sb.append((char) (Integer.parseInt(str.substring(i3, i4), 16) ^ i2));
            i3 = i4;
        }
        return sb.toString();
    }

    public static String encrypt16Bit(String str, int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = i & 65535;
        for (char c : str.toCharArray()) {
            sb.append(String.format("%04x", Integer.valueOf((c ^ i2) & 65535)));
        }
        return sb.toString();
    }
}
