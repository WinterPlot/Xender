package com.userlabs.xshare.core.utils;

import android.text.TextUtils;
import com.userlabs.xshare.core.loadicon.LoadIconCate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class f {
    protected static final Map<String, String> a;
    private static final List<String> b;
    private static final List<String> c;

    static {
        HashMap map = new HashMap();
        a = map;
        ArrayList arrayList = new ArrayList();
        b = arrayList;
        c = new ArrayList();
        map.put(LoadIconCate.LOAD_CATE_PDF, LoadIconCate.LOAD_CATE_PDF);
        map.put(LoadIconCate.LOAD_CATE_PPT, "p");
        map.put("pptx", "p");
        map.put("doc", "w");
        map.put("docx", "w");
        map.put("wps", "w");
        map.put(LoadIconCate.LOAD_CATE_XLS, "x");
        map.put("xlsx", "x");
        arrayList.add("m4a");
        arrayList.add("webm");
        arrayList.add("mp3");
        arrayList.add("mxx");
        arrayList.add("wav");
        arrayList.add("ogg");
        arrayList.add("midi");
        arrayList.add("mid");
        arrayList.add("aac");
        arrayList.add("ra");
        arrayList.add("amr");
        arrayList.add("aiff");
        arrayList.add("ogm");
        arrayList.add("f4a");
        arrayList.add("flac");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a.put((String) obj, LoadIconCate.LOAD_CATE_AUDIO);
        }
        List<String> list = c;
        list.add("mp4");
        list.add("avi");
        list.add("rm");
        list.add("mov");
        list.add("mvv");
        list.add("mvx");
        list.add("3gp");
        list.add("m4v");
        list.add("mkv");
        list.add("asf");
        list.add("rmvb");
        list.add("mpeg");
        list.add("divx");
        list.add("xvid");
        list.add("vob");
        list.add("f4v");
        list.add("webm");
        list.add("mpg");
        list.add("vid");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            a.put(it.next(), LoadIconCate.LOAD_CATE_VIDEO);
        }
        Map<String, String> map2 = a;
        map2.put("png", LoadIconCate.LOAD_CATE_IMAGE);
        map2.put("gif", LoadIconCate.LOAD_CATE_IMAGE);
        map2.put("jpg", LoadIconCate.LOAD_CATE_IMAGE);
        map2.put("jpeg", LoadIconCate.LOAD_CATE_IMAGE);
        map2.put("bmp", LoadIconCate.LOAD_CATE_IMAGE);
        map2.put("wbmp", LoadIconCate.LOAD_CATE_IMAGE);
        map2.put("webp", LoadIconCate.LOAD_CATE_IMAGE);
        map2.put("heic", LoadIconCate.LOAD_CATE_IMAGE);
        map2.put("dng", LoadIconCate.LOAD_CATE_IMAGE);
        map2.put("cr2", LoadIconCate.LOAD_CATE_IMAGE);
        map2.put("arw", LoadIconCate.LOAD_CATE_IMAGE);
        map2.put("raf", LoadIconCate.LOAD_CATE_IMAGE);
        map2.put("nef", LoadIconCate.LOAD_CATE_IMAGE);
        map2.put("nrw", LoadIconCate.LOAD_CATE_IMAGE);
        map2.put("rw2", LoadIconCate.LOAD_CATE_IMAGE);
        map2.put("orf", LoadIconCate.LOAD_CATE_IMAGE);
        map2.put("pef", LoadIconCate.LOAD_CATE_IMAGE);
        map2.put("srw", LoadIconCate.LOAD_CATE_IMAGE);
        map2.put(LoadIconCate.LOAD_CATE_APK, LoadIconCate.LOAD_CATE_APK);
        map2.put("akk", LoadIconCate.LOAD_CATE_APK);
        map2.put(LoadIconCate.LOAD_CATE_TXT, "ebook");
        map2.put("chm", "ebook");
        map2.put("ebk", "ebook");
        map2.put("ebk1", "ebook");
        map2.put("ebk2", "ebook");
        map2.put("epub", "ebook");
        map2.put("umd", "ebook");
        map2.put(LoadIconCate.LOAD_CATE_ZIP, LoadIconCate.LOAD_CATE_ZIP);
        map2.put("rar", LoadIconCate.LOAD_CATE_ZIP);
        map2.put("7z", LoadIconCate.LOAD_CATE_ZIP);
        map2.put("iso", LoadIconCate.LOAD_CATE_ZIP);
    }

    public static List<String> getAudioSuffixList() {
        return new ArrayList(b);
    }

    public static String getCate(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String expendName = getExpendName(str);
        return TextUtils.isEmpty(expendName) ? "" : a.get(expendName);
    }

    public static String getExpendName(String str) {
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf >= 0 && iLastIndexOf < str.length()) {
            try {
                return str.substring(iLastIndexOf + 1).toLowerCase(Locale.getDefault());
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        return "";
    }

    public static List<String> getVideoSuffixList() {
        return new ArrayList(c);
    }

    public static boolean isDoc(String str) {
        return TextUtils.equals("p", str) || TextUtils.equals("w", str) || TextUtils.equals("x", str);
    }

    public static boolean isEbk(String str) {
        return TextUtils.equals("ebook", str) || TextUtils.equals(LoadIconCate.LOAD_CATE_PDF, str);
    }

    public static boolean isMedia(String str) {
        String cate = getCate(str);
        return TextUtils.equals(LoadIconCate.LOAD_CATE_AUDIO, cate) || TextUtils.equals(LoadIconCate.LOAD_CATE_VIDEO, cate) || TextUtils.equals(LoadIconCate.LOAD_CATE_IMAGE, cate);
    }
}
