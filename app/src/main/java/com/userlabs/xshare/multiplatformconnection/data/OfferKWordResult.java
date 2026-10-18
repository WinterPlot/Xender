package com.userlabs.xshare.multiplatformconnection.data;

import com.userlabs.xshare.recommend.kword.KWordMatchedResult;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class OfferKWordResult extends MPCEmptyResult {
    private Map<String, KWordMatchedResult> offerkwords;

    public Map<String, KWordMatchedResult> getOfferkwords() {
        return this.offerkwords;
    }

    public void setOfferkwords(Map<String, KWordMatchedResult> map) {
        this.offerkwords = map;
    }
}
