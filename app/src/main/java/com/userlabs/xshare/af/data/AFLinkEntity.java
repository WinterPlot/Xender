package com.userlabs.xshare.af.data;

import android.text.TextUtils;
import androidx.camera.camera2.pipe.w;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class AFLinkEntity {
    private long _id;
    private String ad_media;
    private boolean af_client_enabled;
    private long expires_date;
    private String offer_pn;
    private String offer_url;
    private Map<String, Boolean> scenelist;

    public boolean canPostEvent(String str) {
        Map<String, Boolean> map = this.scenelist;
        return map != null && Boolean.TRUE.equals(map.get(str));
    }

    public boolean canUseAfUrl(String str) {
        Map<String, Boolean> map;
        return this.af_client_enabled && !TextUtils.isEmpty(this.offer_url) && (map = this.scenelist) != null && Boolean.TRUE.equals(map.get(str)) && this.expires_date > System.currentTimeMillis();
    }

    public String getAd_media() {
        return this.ad_media;
    }

    public long getExpires_date() {
        return this.expires_date;
    }

    public String getOffer_pn() {
        return this.offer_pn;
    }

    public String getOffer_url() {
        return this.offer_url;
    }

    public Map<String, Boolean> getScenelist() {
        return this.scenelist;
    }

    public long get_id() {
        return this._id;
    }

    public boolean isAf_client_enabled() {
        return this.af_client_enabled;
    }

    public void setAd_media(String str) {
        this.ad_media = str;
    }

    public void setAf_client_enabled(boolean z) {
        this.af_client_enabled = z;
    }

    public void setExpires_date(long j) {
        this.expires_date = j;
    }

    public void setOffer_pn(String str) {
        this.offer_pn = str;
    }

    public void setOffer_url(String str) {
        this.offer_url = str;
    }

    public void setScenelist(Map<String, Boolean> map) {
        this.scenelist = map;
    }

    public void set_id(long j) {
        this._id = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AFLinkEntity{expires_date=");
        sb.append(this.expires_date);
        sb.append(", af_client_enabled=");
        sb.append(this.af_client_enabled);
        sb.append(", offer_url='");
        sb.append(this.offer_url);
        sb.append("', offer_pn='");
        return w.t(sb, this.offer_pn, "'}");
    }
}
