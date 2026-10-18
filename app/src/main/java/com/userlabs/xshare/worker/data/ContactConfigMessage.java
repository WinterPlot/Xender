package com.userlabs.xshare.worker.data;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class ContactConfigMessage {
    private FbContact fb;
    private String gmail;
    private String policy;
    private String twitter;
    private List<String> wa;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class FbContact {
        String app_in;
        String app_other;
        String http_in;
        String http_other;

        public String getApp_in() {
            return this.app_in;
        }

        public String getApp_other() {
            return this.app_other;
        }

        public String getHttp_in() {
            return this.http_in;
        }

        public String getHttp_other() {
            return this.http_other;
        }

        public void setApp_in(String str) {
            this.app_in = str;
        }

        public void setApp_other(String str) {
            this.app_other = str;
        }

        public void setHttp_in(String str) {
            this.http_in = str;
        }

        public void setHttp_other(String str) {
            this.http_other = str;
        }
    }

    public FbContact getFb() {
        return this.fb;
    }

    public String getGmail() {
        return this.gmail;
    }

    public String getPolicy() {
        return this.policy;
    }

    public String getTwitter() {
        return this.twitter;
    }

    public List<String> getWa() {
        return this.wa;
    }

    public void setFb(FbContact fbContact) {
        this.fb = fbContact;
    }

    public void setGmail(String str) {
        this.gmail = str;
    }

    public void setPolicy(String str) {
        this.policy = str;
    }

    public void setTwitter(String str) {
        this.twitter = str;
    }

    public void setWa(List<String> list) {
        this.wa = list;
    }
}
