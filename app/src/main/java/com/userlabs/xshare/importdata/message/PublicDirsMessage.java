package com.userlabs.xshare.importdata.message;

import android.os.Environment;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class PublicDirsMessage {
    private String alarms_dir;
    private String dcim_dir;
    private String documents_dir;
    private String download_dir;
    private String internal_root_dir;
    private String movies_dir;
    private String music_dir;
    private String notifications_dir;
    private String pictures_dir;
    private String podcasts_dir;
    private String ringtones_dir;
    private String sd_root_dir;

    public String getAlarms_dir() {
        return this.alarms_dir;
    }

    public String getDcim_dir() {
        return this.dcim_dir;
    }

    public String getDocuments_dir() {
        return this.documents_dir;
    }

    public String getDownload_dir() {
        return this.download_dir;
    }

    public String getFileSavePathByRemotePath(String str) {
        if (!TextUtils.isEmpty(this.sd_root_dir) && str.startsWith(this.sd_root_dir)) {
            return Environment.getExternalStorageDirectory().getAbsolutePath() + "/oldSdcard" + str.replace(this.sd_root_dir, "");
        }
        if (!str.startsWith(this.internal_root_dir)) {
            return "";
        }
        return Environment.getExternalStorageDirectory().getAbsolutePath() + str.replace(this.internal_root_dir, "");
    }

    public String getInternal_root_dir() {
        return this.internal_root_dir;
    }

    public String getMovies_dir() {
        return this.movies_dir;
    }

    public String getMusic_dir() {
        return this.music_dir;
    }

    public String getNotifications_dir() {
        return this.notifications_dir;
    }

    public String getPictures_dir() {
        return this.pictures_dir;
    }

    public String getPodcasts_dir() {
        return this.podcasts_dir;
    }

    public String getPublicPath(String str) {
        if (str.startsWith(this.dcim_dir)) {
            return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath() + str.replace(this.dcim_dir, "");
        }
        if (str.startsWith(this.movies_dir)) {
            return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getAbsolutePath() + str.replace(this.movies_dir, "");
        }
        if (str.startsWith(this.music_dir)) {
            return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getAbsolutePath() + str.replace(this.music_dir, "");
        }
        if (str.startsWith(this.download_dir)) {
            return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath() + str.replace(this.download_dir, "");
        }
        if (str.startsWith(this.alarms_dir)) {
            return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_ALARMS).getAbsolutePath() + str.replace(this.alarms_dir, "");
        }
        if (!TextUtils.isEmpty(this.documents_dir) && str.startsWith(this.documents_dir)) {
            return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS).getAbsolutePath() + str.replace(this.documents_dir, "");
        }
        if (str.startsWith(this.notifications_dir)) {
            return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_NOTIFICATIONS).getAbsolutePath() + str.replace(this.notifications_dir, "");
        }
        if (str.startsWith(this.pictures_dir)) {
            return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath() + str.replace(this.pictures_dir, "");
        }
        if (str.startsWith(this.podcasts_dir)) {
            return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PODCASTS).getAbsolutePath() + str.replace(this.podcasts_dir, "");
        }
        if (!str.startsWith(this.ringtones_dir)) {
            return "";
        }
        return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_RINGTONES).getAbsolutePath() + str.replace(this.ringtones_dir, "");
    }

    public String getRingtones_dir() {
        return this.ringtones_dir;
    }

    public String getSd_root_dir() {
        return this.sd_root_dir;
    }

    public void setAlarms_dir(String str) {
        this.alarms_dir = str;
    }

    public void setDcim_dir(String str) {
        this.dcim_dir = str;
    }

    public void setDocuments_dir(String str) {
        this.documents_dir = str;
    }

    public void setDownload_dir(String str) {
        this.download_dir = str;
    }

    public void setInternal_root_dir(String str) {
        this.internal_root_dir = str;
    }

    public void setMovies_dir(String str) {
        this.movies_dir = str;
    }

    public void setMusic_dir(String str) {
        this.music_dir = str;
    }

    public void setNotifications_dir(String str) {
        this.notifications_dir = str;
    }

    public void setPictures_dir(String str) {
        this.pictures_dir = str;
    }

    public void setPodcasts_dir(String str) {
        this.podcasts_dir = str;
    }

    public void setRingtones_dir(String str) {
        this.ringtones_dir = str;
    }

    public void setSd_root_dir(String str) {
        this.sd_root_dir = str;
    }
}
