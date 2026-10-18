package com.userlabs.xshare.worker.data;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class GrayInfoMessage {
    private ResultBean result;
    private RequestResultStatusMessage status;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class ResultBean {
        private List<GrayItemMessage> rules;

        public List<GrayItemMessage> getRules() {
            return this.rules;
        }

        public void setRules(List<GrayItemMessage> list) {
            this.rules = list;
        }
    }

    public ResultBean getResult() {
        return this.result;
    }

    public RequestResultStatusMessage getStatus() {
        return this.status;
    }

    public void setResult(ResultBean resultBean) {
        this.result = resultBean;
    }

    public void setStatus(RequestResultStatusMessage requestResultStatusMessage) {
        this.status = requestResultStatusMessage;
    }
}
