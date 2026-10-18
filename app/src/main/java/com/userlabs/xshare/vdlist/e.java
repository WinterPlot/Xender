package com.userlabs.xshare.vdlist;

import com.userlabs.xshare.utils.z;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class e {
    private int a;
    private String b;
    private String c;
    private String d;
    private long e;
    private String f;
    private int g;
    private long h;
    private int i;
    private List<String> j;

    private static e fromVdItem(VdListMessage.Item item) {
        Objects.requireNonNull(item);
        e eVar = new e();
        eVar.a = item.getId();
        eVar.b = item.getMd5();
        eVar.c = item.getUrl();
        eVar.d = item.getIcon_url();
        eVar.g = item.getDuration();
        eVar.h = item.getEndtime();
        eVar.f = item.getTitle();
        eVar.e = item.getSize();
        eVar.i = item.getSort_no();
        return eVar;
    }

    public static List<e> fromVdList(List<VdListMessage.Item> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (VdListMessage.Item item : list) {
                if (z.isValidUrl(item.getUrl())) {
                    arrayList.add(fromVdItem(item));
                }
            }
        }
        return arrayList;
    }

    public int getDuration() {
        return this.g;
    }

    public long getEndtime() {
        return this.h;
    }

    public String getIconUrl() {
        return this.d;
    }

    public int getId() {
        return this.a;
    }

    public String getMd5() {
        return this.b;
    }

    public long getSize() {
        return this.e;
    }

    public int getSortNo() {
        return this.i;
    }

    public List<String> getTargetFileList() {
        return this.j;
    }

    public String getTitle() {
        return this.f;
    }

    public String getUrl() {
        return this.c;
    }

    public boolean localExist() {
        List<String> list = this.j;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public void setDuration(int i) {
        this.g = i;
    }

    public void setEndtime(long j) {
        this.h = j;
    }

    public void setIconUrl(String str) {
        this.d = str;
    }

    public void setId(int i) {
        this.a = i;
    }

    public void setMd5(String str) {
        this.b = str;
    }

    public void setSize(long j) {
        this.e = j;
    }

    public void setSortNo(int i) {
        this.i = i;
    }

    public void setTargetFileList(List<String> list) {
        this.j = list;
    }

    public void setTitle(String str) {
        this.f = str;
    }

    public void setUrl(String str) {
        this.c = str;
    }

    public String toString() {
        return "VdEntity{id=" + this.a + ", sortNo=" + this.i + ", md5='" + this.b + "', url='" + this.c + "', iconUrl='" + this.d + "', size=" + this.e + ", title='" + this.f + "', duration=" + this.g + ", endtime=" + this.h + ", targetFileList=" + this.j + '}';
    }
}
