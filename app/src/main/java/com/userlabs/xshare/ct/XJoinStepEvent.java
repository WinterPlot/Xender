package com.userlabs.xshare.ct;

import com.userlabs.xshare.multiplatformconnection.data.MPCStatus;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class XJoinStepEvent implements Serializable {
    public static final int JOIN_AP_FAILED_BIND_NETWORK = 32;
    public static final int JOIN_AP_FAILED_REASON_MAYBE_NOT_SUPPORT_5G = 30;
    public static final int JOIN_AP_FAILED_REASON_UNKNOWN = 33;
    public static final int JOIN_AP_FAILED_REASON_WRONG_PW = 31;
    public static final int SHAKE_HAND_FAILED_REASON_DIFF_WIFI = 5;
    public static final int SHAKE_HAND_FAILED_REASON_FROM_SERVER = 9;
    public static final int SHAKE_HAND_FAILED_REASON_JOIN_LIMIT = 1;
    public static final int SHAKE_HAND_FAILED_REASON_LOCAL_IP_EX = 3;
    public static final int SHAKE_HAND_FAILED_REASON_PING_FAILED = 7;
    public static final int SHAKE_HAND_FAILED_REASON_QR_IP_INVALID = 2;
    public static final int SHAKE_HAND_FAILED_REASON_TIMEOUT = 4;
    public static final int SHAKE_HAND_FAILED_REASON_WIFI_NOT_CONNECT = 6;
    public static final int STATE_FAILED = 3;
    public static final int STATE_START = 1;
    public static final int STATE_SUCCESS = 2;
    public static final int STEP_CONNECT_START = 10;
    public static final int STEP_JOINED_AP_EXIT = 7;
    public static final int STEP_JOIN_AP = 1;
    public static final int STEP_SHAKE_HAND = 5;
    public static final int STEP_START_SERVER = 3;
    private int connectMode;
    private final int reason;
    private MPCStatus serverStatus;
    private final int step;
    private final int stepState;

    public XJoinStepEvent(int i, int i2, int i3, MPCStatus mPCStatus) {
        this.step = i;
        this.stepState = i2;
        this.reason = i3;
        this.serverStatus = mPCStatus;
    }

    public static XJoinStepEvent joinApStepFailedEvent(int i) {
        return new XJoinStepEvent(1, 3, i);
    }

    public static XJoinStepEvent joinApStepStartEvent() {
        return new XJoinStepEvent(1, 1);
    }

    public static XJoinStepEvent joinApStepSuccessEvent() {
        return new XJoinStepEvent(1, 2);
    }

    public static XJoinStepEvent modeStepStart() {
        return new XJoinStepEvent(10, 2);
    }

    public static XJoinStepEvent modeStepStartFailed() {
        return new XJoinStepEvent(10, 3);
    }

    public static XJoinStepEvent shakeHandStepFailedEvent(int i, MPCStatus mPCStatus) {
        return new XJoinStepEvent(5, 3, i, mPCStatus);
    }

    public static XJoinStepEvent shakeHandStepStartEvent() {
        return new XJoinStepEvent(5, 1);
    }

    public static XJoinStepEvent shakeHandStepSuccessEvent() {
        return new XJoinStepEvent(5, 2);
    }

    public static XJoinStepEvent startServerStepFailedEvent() {
        return new XJoinStepEvent(3, 3);
    }

    public static XJoinStepEvent startServerStepStartEvent() {
        return new XJoinStepEvent(3, 1);
    }

    public static XJoinStepEvent startServerStepSuccessEvent() {
        return new XJoinStepEvent(3, 2);
    }

    public static XJoinStepEvent wifiExitStepEvent() {
        return new XJoinStepEvent(7, 3);
    }

    public int getReason() {
        return this.reason;
    }

    public MPCStatus getServerStatus() {
        return this.serverStatus;
    }

    public int getStep() {
        return this.step;
    }

    public boolean isApMode() {
        return this.connectMode == 1;
    }

    public boolean isRouteMode() {
        return this.connectMode == 2;
    }

    public boolean isStepFailed() {
        return this.stepState == 3;
    }

    public boolean isStepStart() {
        return this.stepState == 1;
    }

    public boolean isStepSuccess() {
        return this.stepState == 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XJoinStepEvent{");
        int i = this.step;
        if (i == 10) {
            sb.append("step : connect start");
        } else if (i == 1) {
            sb.append("step : join ap");
        } else if (i == 3) {
            sb.append("step : start server");
        } else if (i == 5) {
            sb.append("step : shake hand");
        } else if (i == 7) {
            sb.append("step : wifi exit");
        }
        int i2 = this.stepState;
        if (i2 == 1) {
            sb.append(", state : STATE_START");
        } else if (i2 == 2) {
            sb.append(", state : STATE_SUCCESS");
        } else if (i2 == 3) {
            sb.append(", state : STATE_FAILED");
        }
        int i3 = this.connectMode;
        if (i3 == 1) {
            sb.append(", connect mode : ap");
        } else if (i3 == 2) {
            sb.append(", connect mode : route");
        }
        sb.append(", reason=");
        sb.append(this.reason);
        if (this.serverStatus != null) {
            sb.append(", serverStatus=");
            sb.append(this.serverStatus.getCode());
        }
        sb.append("}");
        return sb.toString();
    }

    public XJoinStepEvent withApMode() {
        this.connectMode = 1;
        return this;
    }

    public XJoinStepEvent withRouteMode() {
        this.connectMode = 2;
        return this;
    }

    public XJoinStepEvent(int i, int i2, int i3) {
        this.step = i;
        this.stepState = i2;
        this.reason = i3;
    }

    public XJoinStepEvent(int i, int i2) {
        this.step = i;
        this.stepState = i2;
        this.reason = -1;
    }
}
