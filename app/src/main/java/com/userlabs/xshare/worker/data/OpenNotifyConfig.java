package com.userlabs.xshare.worker.data;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class OpenNotifyConfig {
    private int interval_days;
    private boolean notify_enabled;
    private boolean sys_notifi_up_enabled;

    public int getInterval_days() {
        return this.interval_days;
    }

    public boolean isNotify_enabled() {
        return this.notify_enabled;
    }

    public boolean isSys_notifi_up_enabled() {
        return this.sys_notifi_up_enabled;
    }

    public void setInterval_days(int i) {
        this.interval_days = i;
    }

    public void setNotify_enabled(boolean z) {
        this.notify_enabled = z;
    }

    public void setSys_notifi_up_enabled(boolean z) {
        this.sys_notifi_up_enabled = z;
    }
}
