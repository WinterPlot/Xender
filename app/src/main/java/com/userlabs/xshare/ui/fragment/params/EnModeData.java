package com.userlabs.xshare.ui.fragment.params;

import com.userlabs.xshare.af.data.AFLinkEntity;
import com.userlabs.xshare.nlist.VIPEntity;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class EnModeData {
    private String code;
    private Data data;
    private String msg;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class Data {
        private List<AFLinkEntity> af;
        private List<AFLinkEntity> af_s2s;
        private List<String> black;
        private List<String> gray;
        private List<String> hot;
        private List<VIPEntity> vip;

        public List<AFLinkEntity> getAf() {
            return this.af;
        }

        public List<AFLinkEntity> getAf_s2s() {
            return this.af_s2s;
        }

        public List<String> getBlack() {
            return this.black;
        }

        public List<String> getGray() {
            return this.gray;
        }

        public List<String> getHot() {
            return this.hot;
        }

        public List<VIPEntity> getVip() {
            return this.vip;
        }

        public void setAf(List<AFLinkEntity> list) {
            this.af = list;
        }

        public void setAf_s2s(List<AFLinkEntity> list) {
            this.af_s2s = list;
        }

        public void setBlack(List<String> list) {
            this.black = list;
        }

        public void setGray(List<String> list) {
            this.gray = list;
        }

        public void setHot(List<String> list) {
            this.hot = list;
        }

        public void setVip(List<VIPEntity> list) {
            this.vip = list;
        }
    }

    public String getCode() {
        return this.code;
    }

    public Data getData() {
        return this.data;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setMsg(String str) {
        this.msg = str;
    }
}
