package com.userlabs.xshare.ui.fragment.params;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends com.userlabs.xshare.beans.a {
    private String a;
    private List<String> b;

    public a(String str, List<String> list) {
        this.a = str;
        this.b = list;
    }

    public String getName() {
        return this.a;
    }

    public List<String> getPnList() {
        return this.b;
    }

    public void setName(String str) {
        this.a = str;
    }

    public void setPnList(List<String> list) {
        this.b = list;
    }
}
