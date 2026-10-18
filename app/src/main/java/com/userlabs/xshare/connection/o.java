package com.userlabs.xshare.connection;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class o {
    public static boolean matchState(ConnectionConstant.DIALOG_STATE dialog_state, ConnectionConstant.DIALOG_STATE dialog_state2) {
        if (com.userlabs.xshare.core.log.h.a) {
            com.userlabs.xshare.core.log.h.d("ConnectState", "match state,old state=" + dialog_state + ",new state=" + dialog_state2);
        }
        ConnectionConstant.DIALOG_STATE dialog_state3 = ConnectionConstant.DIALOG_STATE.NORMAL;
        if (dialog_state == dialog_state3 && dialog_state2 == ConnectionConstant.DIALOG_STATE.CREATING) {
            return true;
        }
        ConnectionConstant.DIALOG_STATE dialog_state4 = ConnectionConstant.DIALOG_STATE.CREATING;
        if (dialog_state == dialog_state4 && dialog_state2 == ConnectionConstant.DIALOG_STATE.CREATE_SUCCESS) {
            return true;
        }
        ConnectionConstant.DIALOG_STATE dialog_state5 = ConnectionConstant.DIALOG_STATE.CREATE_SUCCESS;
        if (dialog_state == dialog_state5 && dialog_state2 == dialog_state3) {
            return true;
        }
        if (dialog_state == dialog_state5 && dialog_state2 == ConnectionConstant.DIALOG_STATE.CREATE_SUCCESS_CHANGE_BAND) {
            return true;
        }
        ConnectionConstant.DIALOG_STATE dialog_state6 = ConnectionConstant.DIALOG_STATE.CREATE_SUCCESS_CHANGE_BAND;
        if (dialog_state == dialog_state6 && dialog_state2 == dialog_state5) {
            return true;
        }
        if (dialog_state == dialog_state6 && dialog_state2 == ConnectionConstant.DIALOG_STATE.CREATE_FAILED) {
            return true;
        }
        if (dialog_state == dialog_state6 && dialog_state2 == dialog_state3) {
            return true;
        }
        if (dialog_state == dialog_state4 && dialog_state2 == ConnectionConstant.DIALOG_STATE.CREATE_FAILED) {
            return true;
        }
        if (dialog_state == dialog_state4 && dialog_state2 == dialog_state3) {
            return true;
        }
        if (dialog_state == dialog_state5 && dialog_state2 == ConnectionConstant.DIALOG_STATE.CONNECT_SUCCESS) {
            return true;
        }
        if (dialog_state == dialog_state5 && dialog_state2 == ConnectionConstant.DIALOG_STATE.CREATE_HIDDEN) {
            return true;
        }
        ConnectionConstant.DIALOG_STATE dialog_state7 = ConnectionConstant.DIALOG_STATE.CREATE_HIDDEN;
        if (dialog_state == dialog_state7 && dialog_state2 == dialog_state5) {
            return true;
        }
        ConnectionConstant.DIALOG_STATE dialog_state8 = ConnectionConstant.DIALOG_STATE.CREATE_FAILED;
        if (dialog_state == dialog_state8 && dialog_state2 == dialog_state3) {
            return true;
        }
        if (dialog_state == dialog_state8 && dialog_state2 == dialog_state4) {
            return true;
        }
        ConnectionConstant.DIALOG_STATE dialog_state9 = ConnectionConstant.DIALOG_STATE.CONNECT_SUCCESS;
        if (dialog_state == dialog_state9 && dialog_state2 == dialog_state7) {
            return true;
        }
        if (dialog_state == dialog_state7 && dialog_state2 == dialog_state9) {
            return true;
        }
        if (dialog_state == dialog_state7 && dialog_state2 == dialog_state3) {
            return true;
        }
        if (dialog_state == dialog_state3 && dialog_state2 == ConnectionConstant.DIALOG_STATE.SCAN_QR) {
            return true;
        }
        ConnectionConstant.DIALOG_STATE dialog_state10 = ConnectionConstant.DIALOG_STATE.SCAN_QR;
        if (dialog_state == dialog_state10 && dialog_state2 == dialog_state3) {
            return true;
        }
        if (dialog_state == dialog_state10 && dialog_state2 == ConnectionConstant.DIALOG_STATE.JOINING) {
            return true;
        }
        if (dialog_state == dialog_state9 && dialog_state2 == dialog_state3) {
            return true;
        }
        ConnectionConstant.DIALOG_STATE dialog_state11 = ConnectionConstant.DIALOG_STATE.JOINING;
        if (dialog_state == dialog_state11 && dialog_state2 == dialog_state9) {
            return true;
        }
        if (dialog_state == dialog_state11 && dialog_state2 == ConnectionConstant.DIALOG_STATE.JOIN_FAILED) {
            return true;
        }
        if (dialog_state == ConnectionConstant.DIALOG_STATE.JOIN_FAILED && dialog_state2 == dialog_state3) {
            return true;
        }
        if (dialog_state == dialog_state3 && dialog_state2 == dialog_state11) {
            return true;
        }
        if (dialog_state == dialog_state11 && dialog_state2 == dialog_state3) {
            return true;
        }
        return dialog_state == dialog_state3 && dialog_state2 == dialog_state9;
    }
}
