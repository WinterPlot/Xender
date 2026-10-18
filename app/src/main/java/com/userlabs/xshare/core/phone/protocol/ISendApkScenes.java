package com.userlabs.xshare.core.phone.protocol;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public enum ISendApkScenes {
    SCENE_DYNAMIC_RCMD_DOWNLOAD("d_rcmd_download"),
    SCENE_DYNAMIC_RCMD_APP("d_rcmd_app"),
    SCENE_DYNAMIC_RCMD_PHOTO("d_rcmd_photo"),
    SCENE_DYNAMIC_RCMD_AUDIO("d_rcmd_audio"),
    SCENE_DYNAMIC_RCMD_VIDEO("d_rcmd_video"),
    SCENE_DYNAMIC_RCMD_FILE("d_rcmd_file"),
    SCENE_VIDEO_RCMD("video_rcmd"),
    SCENE_USER_SELECT("user_select"),
    SCENE_OUT_SIDE_SHARE("out_side_share");

    private String des;

    ISendApkScenes(String str) {
        this.des = str;
    }

    public String getDes() {
        return this.des;
    }
}
