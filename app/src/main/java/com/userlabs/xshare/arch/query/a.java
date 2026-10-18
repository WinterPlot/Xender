package com.userlabs.xshare.arch.query;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    private Map<String, Boolean> a;
    private SortConfig b;

    public a(Map<String, Boolean> map, SortConfig sortConfig) {
        this.a = map;
        this.b = sortConfig;
    }

    public Map<String, Boolean> getFilter() {
        return this.a;
    }

    public SortConfig getSortConfig() {
        return this.b;
    }

    public void setFilter(Map<String, Boolean> map) {
        this.a = map;
    }

    public void setSortConfig(SortConfig sortConfig) {
        this.b = sortConfig;
    }
}
