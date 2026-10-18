package com.userlabs.xshare.connection;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class ConnectionConstant {
    public static int a = 2;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum DIALOG_STATE {
        NORMAL,
        CREATING,
        CREATE_SUCCESS,
        CREATE_FAILED,
        CREATE_HIDDEN,
        CREATE_SUCCESS_CHANGE_BAND,
        SCAN_QR,
        JOINING,
        JOIN_FAILED,
        CONNECT_SUCCESS
    }

    public static boolean currentIsConnected() {
        return isConnected(a.getInstance().getCurrentState());
    }

    public static boolean currentIsNormal() {
        return isNormal(a.getInstance().getCurrentState());
    }

    public static boolean currentStateIsTarget(DIALOG_STATE dialog_state) {
        return a.getInstance().getCurrentState() == dialog_state;
    }

    public static boolean isConnected(DIALOG_STATE dialog_state) {
        return dialog_state == DIALOG_STATE.CONNECT_SUCCESS;
    }

    public static boolean isCreated(DIALOG_STATE dialog_state) {
        return isCreatedHidden(dialog_state) || dialog_state == DIALOG_STATE.CREATE_SUCCESS;
    }

    public static boolean isCreatedHidden(DIALOG_STATE dialog_state) {
        return dialog_state == DIALOG_STATE.CREATE_HIDDEN;
    }

    public static boolean isNormal(DIALOG_STATE dialog_state) {
        return dialog_state == DIALOG_STATE.NORMAL;
    }

    public static void resetCreateFailedTimes() {
        a = 2;
    }
}
