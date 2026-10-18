package com.userlabs.xshare.firebase;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class TopicMessage {
    private Result result;
    private Status status;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class Result {
        private Topics topics;

        public Topics getTopics() {
            return this.topics;
        }

        public void setTopics(Topics topics) {
            this.topics = topics;
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

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class Topics {
        private List<String> subscribe;
        private List<String> unsubscribe;

        public List<String> getSubscribe() {
            return this.subscribe;
        }

        public List<String> getUnsubscribe() {
            return this.unsubscribe;
        }

        public void setSubscribe(List<String> list) {
            this.subscribe = list;
        }

        public void setUnsubscribe(List<String> list) {
            this.unsubscribe = list;
        }
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
