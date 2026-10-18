package com.userlabs.xshare.core.loadicon;

import android.text.TextUtils;
import androidx.versionedparcelable.b;
import com.userlabs.xshare.core.R;
import com.userlabs.xshare.core.log.h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    private static final Map<String, Integer> a;
    private static final Map<String, String> b;
    private static final Set<String> c;

    static {
        HashMap map = new HashMap();
        a = map;
        HashMap map2 = new HashMap();
        b = map2;
        HashSet hashSet = new HashSet();
        c = hashSet;
        map2.put(LoadIconCate.LOAD_CATE_PDF, LoadIconCate.LOAD_CATE_PDF);
        map2.put(LoadIconCate.LOAD_CATE_PPT, LoadIconCate.LOAD_CATE_PPT);
        map2.put("pptx", LoadIconCate.LOAD_CATE_PPT);
        map2.put("doc", LoadIconCate.LOAD_CATE_DOC);
        map2.put("docx", LoadIconCate.LOAD_CATE_DOC);
        map2.put("wps", LoadIconCate.LOAD_CATE_DOC);
        map2.put(LoadIconCate.LOAD_CATE_XLS, LoadIconCate.LOAD_CATE_XLS);
        map2.put("xlsx", LoadIconCate.LOAD_CATE_XLS);
        map2.put("mp3", LoadIconCate.LOAD_CATE_AUDIO);
        map2.put("wav", LoadIconCate.LOAD_CATE_AUDIO);
        map2.put("ogg", LoadIconCate.LOAD_CATE_AUDIO);
        map2.put("mid", LoadIconCate.LOAD_CATE_AUDIO);
        map2.put("midi", LoadIconCate.LOAD_CATE_AUDIO);
        map2.put("aac", LoadIconCate.LOAD_CATE_AUDIO);
        map2.put("ra", LoadIconCate.LOAD_CATE_AUDIO);
        map2.put("amr", LoadIconCate.LOAD_CATE_AUDIO);
        map2.put("aiff", LoadIconCate.LOAD_CATE_AUDIO);
        map2.put("ogm", LoadIconCate.LOAD_CATE_AUDIO);
        map2.put("m4a", LoadIconCate.LOAD_CATE_AUDIO);
        map2.put("f4a", LoadIconCate.LOAD_CATE_AUDIO);
        map2.put("flac", LoadIconCate.LOAD_CATE_AUDIO);
        addSupportAudioSux();
        map2.put("avi", LoadIconCate.LOAD_CATE_VIDEO);
        map2.put("rm", LoadIconCate.LOAD_CATE_VIDEO);
        map2.put("mov", LoadIconCate.LOAD_CATE_VIDEO);
        map2.put("3gp", LoadIconCate.LOAD_CATE_VIDEO);
        map2.put("mp4", LoadIconCate.LOAD_CATE_VIDEO);
        map2.put("m4v", LoadIconCate.LOAD_CATE_VIDEO);
        map2.put("mkv", LoadIconCate.LOAD_CATE_VIDEO);
        map2.put("asf", LoadIconCate.LOAD_CATE_VIDEO);
        map2.put("rmvb", LoadIconCate.LOAD_CATE_VIDEO);
        map2.put("mpeg", LoadIconCate.LOAD_CATE_VIDEO);
        map2.put("divx", LoadIconCate.LOAD_CATE_VIDEO);
        map2.put("xvid", LoadIconCate.LOAD_CATE_VIDEO);
        map2.put("vob", LoadIconCate.LOAD_CATE_VIDEO);
        map2.put("f4v", LoadIconCate.LOAD_CATE_VIDEO);
        map2.put("webm", LoadIconCate.LOAD_CATE_VIDEO);
        map2.put("mpg", LoadIconCate.LOAD_CATE_VIDEO);
        addUnionSux();
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
        map2.put(LoadIconCate.LOAD_CATE_ZIP, LoadIconCate.LOAD_CATE_ZIP);
        map2.put("rar", LoadIconCate.LOAD_CATE_ZIP);
        map2.put("7z", LoadIconCate.LOAD_CATE_ZIP);
        map2.put("iso", LoadIconCate.LOAD_CATE_ZIP);
        map2.put(LoadIconCate.LOAD_CATE_TXT, LoadIconCate.LOAD_CATE_TXT);
        map2.put(LoadIconCate.LOAD_CATE_VCARD, LoadIconCate.LOAD_CATE_VCARD);
        map.put(LoadIconCate.LOAD_CATE_PDF, Integer.valueOf(R.drawable.svg_ic_type_pdf));
        map.put(LoadIconCate.LOAD_CATE_PPT, Integer.valueOf(R.drawable.svg_ic_type_ppt));
        map.put(LoadIconCate.LOAD_CATE_DOC, Integer.valueOf(R.drawable.svg_ic_type_word));
        map.put(LoadIconCate.LOAD_CATE_XLS, Integer.valueOf(R.drawable.svg_ic_type_excel));
        map.put(LoadIconCate.LOAD_CATE_AUDIO, Integer.valueOf(R.drawable.svg_ic_type_music));
        map.put(LoadIconCate.LOAD_CATE_FRIEND_AUDIO_ALBUM, Integer.valueOf(R.drawable.svg_ic_type_music));
        map.put(LoadIconCate.LOAD_CATE_AUDIO_PLAYLIST, Integer.valueOf(R.drawable.svg_ic_type_music));
        map.put(LoadIconCate.LOAD_CATE_VIDEO, Integer.valueOf(R.drawable.svg_ic_type_video_square));
        map.put(LoadIconCate.LOAD_CATE_IMAGE, Integer.valueOf(R.drawable.svg_ic_type_pic));
        map.put(LoadIconCate.LOAD_CATE_APK, Integer.valueOf(R.drawable.svg_ic_type_apk));
        map.put(LoadIconCate.LOAD_CATE_APP_BUNDLE, Integer.valueOf(R.drawable.svg_ic_type_apk));
        map.put(LoadIconCate.LOAD_CATE_FOLDER, Integer.valueOf(R.drawable.svg_ic_type_folder));
        map.put(LoadIconCate.LOAD_CATE_OTHER, Integer.valueOf(R.drawable.svg_ic_type_file_no));
        map.put(LoadIconCate.LOAD_CATE_FRIEND_PHOTO, Integer.valueOf(R.drawable.svg_person_default));
        map.put(LoadIconCate.LOAD_CATE_HISTORY_PC_PHOTO, Integer.valueOf(R.drawable.cx_svg_history_pc));
        map.put(LoadIconCate.LOAD_CATE_SCAN_PHOTO, Integer.valueOf(R.drawable.svg_person_default));
        map.put(LoadIconCate.LOAD_CATE_ZIP, Integer.valueOf(R.drawable.svg_ic_type_zip));
        map.put(LoadIconCate.LOAD_CATE_TXT, Integer.valueOf(R.drawable.svg_ic_type_txt));
        map.put(LoadIconCate.LOAD_CATE_VCARD, Integer.valueOf(R.drawable.svg_ic_type_vcard));
        hashSet.add(LoadIconCate.LOAD_CATE_VIDEO);
        hashSet.add(LoadIconCate.LOAD_CATE_IMAGE);
        hashSet.add(LoadIconCate.LOAD_CATE_APK);
        hashSet.add(LoadIconCate.LOAD_CATE_APP_BUNDLE);
        hashSet.add(LoadIconCate.LOAD_CATE_FRIEND_PHOTO);
        hashSet.add(LoadIconCate.LOAD_CATE_FRIEND_AUDIO_ALBUM);
        hashSet.add(LoadIconCate.LOAD_CATE_AUDIO);
        hashSet.add(LoadIconCate.LOAD_CATE_SCAN_PHOTO);
        hashSet.add(LoadIconCate.LOAD_CATE_AUDIO_PLAYLIST);
    }

    private static void addSupportAudioSux() {
        for (String str : com.userlabs.xshare.support.a.getSupportAudioSux()) {
            if (!TextUtils.isEmpty(str)) {
                b.put(str.replace(".", "").trim(), LoadIconCate.LOAD_CATE_AUDIO);
            }
        }
    }

    public static void addUnionSux() {
        for (String str : com.userlabs.xshare.core.unionVideo.a.createUnionVideoSuxs()) {
            if (!TextUtils.isEmpty(str)) {
                b.put(str.replace(".", "").trim(), LoadIconCate.LOAD_CATE_VIDEO);
            }
        }
    }

    private static String getExpendName(String str) {
        int iLastIndexOf;
        if (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(".")) < 0) {
            return "";
        }
        try {
            return str.substring(iLastIndexOf + 1).toLowerCase(Locale.getDefault());
        } catch (IndexOutOfBoundsException unused) {
            return "";
        }
    }

    public static int getFileDefaultIconResIdByLoadCate(LoadIconCate loadIconCate) {
        Map<String, Integer> map = a;
        return map.containsKey(loadIconCate.getLoadCate()) ? map.get(loadIconCate.getLoadCate()).intValue() : R.drawable.svg_ic_type_file_no;
    }

    public static String getFolderLoadCate() {
        return LoadIconCate.LOAD_CATE_FOLDER;
    }

    public static String getLoadCateByFileName(String str) {
        if (h.a) {
            b.u("get load cate :", str, "load_cate");
        }
        String expendName = getExpendName(str);
        if (TextUtils.isEmpty(expendName)) {
            return LoadIconCate.LOAD_CATE_OTHER;
        }
        Map<String, String> map = b;
        return map.containsKey(expendName) ? map.get(expendName) : LoadIconCate.LOAD_CATE_OTHER;
    }

    public static boolean needAlbumCate(String str) {
        return c.contains(str);
    }
}
