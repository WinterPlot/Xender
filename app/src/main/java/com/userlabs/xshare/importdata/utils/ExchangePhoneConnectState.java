package com.userlabs.xshare.importdata.utils;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class ExchangePhoneConnectState {
    public static STATE a = STATE.STATE_NORMAL;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum STATE {
        STATE_NORMAL,
        STATE_ANIM_RUNNING,
        STATE_SCANING,
        STATE_SCAN_RESULT,
        STATE_SCAN_FAILURE,
        STATE_CONNECTING,
        STATE_CONNECTED,
        STATE_CONNECT_FAILURE,
        STATE_CONNECT_LIMIT
    }

    public static STATE getCurrentState() {
        return a;
    }
}
