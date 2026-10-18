package com.userlabs.xshare.core.loadicon;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class LoadIconCate implements Serializable {
    public static final String LOAD_CATE_APK = "apk";
    public static final String LOAD_CATE_APP_BUNDLE = "app_bundle";
    public static final String LOAD_CATE_AUDIO = "audio";
    public static final String LOAD_CATE_AUDIO_PLAYLIST = "playlist";
    public static final String LOAD_CATE_DOC = "word";
    public static final String LOAD_CATE_FOLDER = "folder";
    public static final String LOAD_CATE_FRIEND_AUDIO_ALBUM = "friend_audio";
    public static final String LOAD_CATE_FRIEND_PHOTO = "avatar";
    public static final String LOAD_CATE_HISTORY_PC_PHOTO = "history_pc_photo";
    public static final String LOAD_CATE_IMAGE = "image";
    public static final String LOAD_CATE_OTHER = "other";
    public static final String LOAD_CATE_PDF = "pdf";
    public static final String LOAD_CATE_PPT = "ppt";
    public static final String LOAD_CATE_SCAN_PHOTO = "scan_photo";
    public static final String LOAD_CATE_TXT = "txt";
    public static final String LOAD_CATE_VCARD = "vcf";
    public static final String LOAD_CATE_VIDEO = "video";
    public static final String LOAD_CATE_XLS = "xls";
    public static final String LOAD_CATE_ZIP = "zip";
    private String loadCate;
    private boolean needLoadAlbum;
    private Size size;
    private Object tag;
    private String uri;
    private boolean useDiskCacheContent;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class Size {
        int height;
        int width;
    }

    public LoadIconCate(String str, String str2, boolean z) {
        this.uri = str;
        this.loadCate = str2;
        this.useDiskCacheContent = z;
        this.needLoadAlbum = a.needAlbumCate(str2);
    }

    public static LoadIconCate create(String str) {
        return new LoadIconCate(str);
    }

    public int getHeight() {
        Size size = this.size;
        if (size != null) {
            return size.height;
        }
        return 0;
    }

    public String getLoadCate() {
        return this.loadCate;
    }

    public Object getTag() {
        return this.tag;
    }

    public String getUri() {
        return this.uri;
    }

    public int getWidth() {
        Size size = this.size;
        if (size != null) {
            return size.width;
        }
        return 0;
    }

    public boolean hasPrivateSize() {
        return this.size != null;
    }

    public boolean isNeedLoadAlbum() {
        return this.needLoadAlbum;
    }

    public boolean isUseDiskCacheContent() {
        return this.useDiskCacheContent;
    }

    public void setLoadCate(String str) {
        this.loadCate = str;
    }

    public void setNeedLoadAlbum(boolean z) {
        this.needLoadAlbum = z;
    }

    public LoadIconCate setSize(int i, int i2) {
        Size size = new Size();
        this.size = size;
        size.width = i;
        size.height = i2;
        return this;
    }

    public LoadIconCate setTag(Object obj) {
        this.tag = obj;
        return this;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUseDiskCacheContent(boolean z) {
        this.useDiskCacheContent = z;
    }

    public static LoadIconCate create(String str, String str2) {
        return new LoadIconCate(str, str2);
    }

    public static LoadIconCate create(String str, String str2, boolean z) {
        return new LoadIconCate(str, str2, z);
    }

    public LoadIconCate(String str) {
        this(str, a.getLoadCateByFileName(str));
    }

    public LoadIconCate(String str, String str2) {
        this(str, str2, true);
    }

    public LoadIconCate() {
        this.useDiskCacheContent = true;
    }
}
