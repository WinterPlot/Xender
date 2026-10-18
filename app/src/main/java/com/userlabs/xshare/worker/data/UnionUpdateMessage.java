package com.userlabs.xshare.worker.data;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class UnionUpdateMessage {
    private Result result;
    private Status status;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class AppInfo {
        private String appid;
        private int appver;
        private boolean can_ignore_version;
        private String channel;
        private String city;
        private String downloadurl;
        private int interval_mins;
        private String md5str;
        private String platform;
        private int srctype;
        private String storelinkurl;
        private String umsg;
        private int updatectrl;
        private int updatetype;
        private boolean use_gp_upgrade_sdk;

        public String getAppid() {
            return this.appid;
        }

        public int getAppver() {
            return this.appver;
        }

        public String getChannel() {
            return this.channel;
        }

        public String getCity() {
            return this.city;
        }

        public String getDownloadurl() {
            return this.downloadurl;
        }

        public int getInterval_mins() {
            return this.interval_mins;
        }

        public String getMd5str() {
            return this.md5str;
        }

        public String getPlatform() {
            return this.platform;
        }

        public int getSrctype() {
            return this.srctype;
        }

        public String getStorelinkurl() {
            return this.storelinkurl;
        }

        public String getUmsg() {
            return this.umsg;
        }

        public int getUpdatectrl() {
            return this.updatectrl;
        }

        public int getUpdatetype() {
            return this.updatetype;
        }

        public boolean isCan_ignore_version() {
            return this.can_ignore_version;
        }

        public boolean isUse_gp_upgrade_sdk() {
            return this.use_gp_upgrade_sdk;
        }

        public void setAppid(String str) {
            this.appid = str;
        }

        public void setAppver(int i) {
            this.appver = i;
        }

        public void setCan_ignore_version(boolean z) {
            this.can_ignore_version = z;
        }

        public void setChannel(String str) {
            this.channel = str;
        }

        public void setCity(String str) {
            this.city = str;
        }

        public void setDownloadurl(String str) {
            this.downloadurl = str;
        }

        public void setInterval_mins(int i) {
            this.interval_mins = i;
        }

        public void setMd5str(String str) {
            this.md5str = str;
        }

        public void setPlatform(String str) {
            this.platform = str;
        }

        public void setSrctype(int i) {
            this.srctype = i;
        }

        public void setStorelinkurl(String str) {
            this.storelinkurl = str;
        }

        public void setUmsg(String str) {
            this.umsg = str;
        }

        public void setUpdatectrl(int i) {
            this.updatectrl = i;
        }

        public void setUpdatetype(int i) {
            this.updatetype = i;
        }

        public void setUse_gp_upgrade_sdk(boolean z) {
            this.use_gp_upgrade_sdk = z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class Result {
        private AppInfo appinfo;

        public AppInfo getAppinfo() {
            return this.appinfo;
        }

        public void setAppinfo(AppInfo appInfo) {
            this.appinfo = appInfo;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class Status {
        private int code;
        private String reason;

        public int getCode() {
            return this.code;
        }

        public String getReason() {
            return this.reason;
        }

        public void setCode(int i) {
            this.code = i;
        }

        public void setReason(String str) {
            this.reason = str;
        }
    }

    public static boolean checkStatus(UnionUpdateMessage unionUpdateMessage) {
        return (unionUpdateMessage == null || unionUpdateMessage.getStatus() == null || unionUpdateMessage.getStatus().getCode() != 0) ? false : true;
    }

    public Result getResult() {
        return this.result;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
