package com.userlabs.xshare.data;

import com.userlabs.xshare.uploadlog.data.UploadDataBase;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class ApkData implements UploadDataBase {
    private long event_t;
    private String firstInstallTime;
    private String folder;
    private long insertTs;
    private long installTs;
    private boolean isInstalled;
    private String lastUpdateTime;
    private String md5;
    private String metaData;
    private String name;
    private String p_net_first;
    private String pn;
    private String s_fname;
    private long saveTs;
    private String source;
    private String sux;
    private int vc;
    private String vn;

    public long getEvent_t() {
        return this.event_t;
    }

    public String getFirstInstallTime() {
        return this.firstInstallTime;
    }

    public String getFolder() {
        return this.folder;
    }

    public long getInsertTs() {
        return this.insertTs;
    }

    public long getInstallTs() {
        return this.installTs;
    }

    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getMetaData() {
        return this.metaData;
    }

    public String getName() {
        return this.name;
    }

    public String getP_net_first() {
        return this.p_net_first;
    }

    public String getPn() {
        return this.pn;
    }

    public String getS_fname() {
        return this.s_fname;
    }

    public long getSaveTs() {
        return this.saveTs;
    }

    public String getSource() {
        return this.source;
    }

    public String getSux() {
        return this.sux;
    }

    public int getVc() {
        return this.vc;
    }

    public String getVn() {
        return this.vn;
    }

    public boolean isInstalled() {
        return this.isInstalled;
    }

    public void setEvent_t(long j) {
        this.event_t = j;
    }

    public void setFirstInstallTime(String str) {
        this.firstInstallTime = str;
    }

    public void setFolder(String str) {
        this.folder = str;
    }

    public void setInsertTs(long j) {
        this.insertTs = j;
    }

    public void setInstallTs(long j) {
        this.installTs = j;
    }

    public void setInstalled(boolean z) {
        this.isInstalled = z;
    }

    public void setLastUpdateTime(String str) {
        this.lastUpdateTime = str;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setMetaData(String str) {
        this.metaData = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setP_net_first(String str) {
        this.p_net_first = str;
    }

    public void setPn(String str) {
        this.pn = str;
    }

    public void setS_fname(String str) {
        this.s_fname = str;
    }

    public void setSaveTs(long j) {
        this.saveTs = j;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setSux(String str) {
        this.sux = str;
    }

    public void setVc(int i) {
        this.vc = i;
    }

    public void setVn(String str) {
        this.vn = str;
    }
}
