package com.userlabs.xshare.recommend.kword;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class KWordMatchedResult {
    private int count;
    private List<Item> rs;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class Item {
        private String an;
        private String pn;

        public String getAn() {
            return this.an;
        }

        public String getPn() {
            return this.pn;
        }

        public void setAn(String str) {
            this.an = str;
        }

        public void setPn(String str) {
            this.pn = str;
        }
    }

    public int getCount() {
        return this.count;
    }

    public List<Item> getRs() {
        return this.rs;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setRs(List<Item> list) {
        this.rs = list;
    }
}
