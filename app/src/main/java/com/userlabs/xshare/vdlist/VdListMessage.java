package com.userlabs.xshare.vdlist;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class VdListMessage {
    private List<Item> list;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class Item {
        private int duration;
        private long endtime;
        private String icon_url;
        private int id;
        private String md5;
        private long size;
        private int sort_no;
        private String title;
        private String url;

        public int getDuration() {
            return this.duration;
        }

        public long getEndtime() {
            return this.endtime;
        }

        public String getIcon_url() {
            return this.icon_url;
        }

        public int getId() {
            return this.id;
        }

        public String getMd5() {
            return this.md5;
        }

        public long getSize() {
            return this.size;
        }

        public int getSort_no() {
            return this.sort_no;
        }

        public String getTitle() {
            return this.title;
        }

        public String getUrl() {
            return this.url;
        }

        public void setDuration(int i) {
            this.duration = i;
        }

        public void setEndtime(long j) {
            this.endtime = j;
        }

        public void setIcon_url(String str) {
            this.icon_url = str;
        }

        public void setId(int i) {
            this.id = i;
        }

        public void setMd5(String str) {
            this.md5 = str;
        }

        public void setSize(long j) {
            this.size = j;
        }

        public void setSort_no(int i) {
            this.sort_no = i;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }
    }

    public List<Item> getList() {
        return this.list;
    }

    public void setList(List<Item> list) {
        this.list = list;
    }
}
