package com.userlabs.xshare.nlist;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class VIPEntity {
    private Map<String, Boolean> act_ctl;
    private String alias;
    private String exp_rel;
    private int ge_vc;
    private long id;
    private Map<String, Boolean> inst_ctl;
    private boolean isvip;
    private List<String> kword;
    private String kword_lo;
    private List<String> md5list;
    private String name;
    private String pn;
    private String popm;

    public Map<String, Boolean> getAct_ctl() {
        return this.act_ctl;
    }

    public String getAlias() {
        return this.alias;
    }

    public String getExp_rel() {
        return this.exp_rel;
    }

    public int getGe_vc() {
        return this.ge_vc;
    }

    public long getId() {
        return this.id;
    }

    public Map<String, Boolean> getInst_ctl() {
        return this.inst_ctl;
    }

    public List<String> getKword() {
        return this.kword;
    }

    public String getKword_lo() {
        return this.kword_lo;
    }

    public List<String> getMd5list() {
        return this.md5list;
    }

    public String getName() {
        return this.name;
    }

    public String getPn() {
        return this.pn;
    }

    public String getPopm() {
        return this.popm;
    }

    public boolean isIsvip() {
        return this.isvip;
    }

    public void setAct_ctl(Map<String, Boolean> map) {
        this.act_ctl = map;
    }

    public void setAlias(String str) {
        this.alias = str;
    }

    public void setExp_rel(String str) {
        this.exp_rel = str;
    }

    public void setGe_vc(int i) {
        this.ge_vc = i;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setInst_ctl(Map<String, Boolean> map) {
        this.inst_ctl = map;
    }

    public void setIsvip(boolean z) {
        this.isvip = z;
    }

    public void setKword(List<String> list) {
        this.kword = list;
    }

    public void setKword_lo(String str) {
        this.kword_lo = str;
    }

    public void setMd5list(List<String> list) {
        this.md5list = list;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPn(String str) {
        this.pn = str;
    }

    public void setPopm(String str) {
        this.popm = str;
    }
}
