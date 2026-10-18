package com.userlabs.xshare.core.pc;

import com.userlabs.xshare.core.log.h;
import com.userlabs.xshare.core.utils.p;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static void connectSuccessAnalytics() {
        p.firebaseAnalytics("xd_pc_connect_success");
        if (h.a) {
            h.d("PcStatistics", "xd_pc_connect_success");
        }
    }

    public static void transferAnalytics() {
        p.firebaseAnalytics("xd_pc_transfer");
        if (h.a) {
            h.d("PcStatistics", "xd_pc_transfer");
        }
    }

    public static void transferFailed(long j) {
        String str;
        if (j >= 1048576000) {
            str = "xd_pc_download_failed_over_1g";
        } else if (j >= 524288000) {
            str = "xd_pc_download_failed_over_500M";
        } else {
            str = j >= 104857600 ? "xd_pc_download_failed_over_100M" : "xd_pc_download_failed_under_100M";
        }
        p.firebaseAnalytics(str);
        if (h.a) {
            h.d("PcStatistics", "传输失败大小为： " + j + " and event name: " + str);
        }
    }

    public static void transferStart(long j) {
        String str;
        if (j >= 1048576000) {
            str = "xd_pc_download_start_over_1g";
        } else if (j >= 524288000) {
            str = "xd_pc_download_start_over_500M";
        } else {
            str = j >= 104857600 ? "xd_pc_download_start_over_100M" : "xd_pc_download_start_under_100M";
        }
        p.firebaseAnalytics(str);
        if (h.a) {
            h.d("PcStatistics", "开始传输大小为： " + j + " and event name: " + str);
        }
    }

    public static void transferSuccess(long j) {
        String str;
        if (j >= 1048576000) {
            str = "xd_pc_download_success_over_1g";
        } else if (j >= 524288000) {
            str = "xd_pc_download_success_over_500M";
        } else {
            str = j >= 104857600 ? "xd_pc_download_success_over_100M" : "xd_pc_download_success_under_100M";
        }
        p.firebaseAnalytics(str);
        if (h.a) {
            h.d("PcStatistics", "传输成功大小为： " + j + " and event name: " + str);
        }
    }
}
