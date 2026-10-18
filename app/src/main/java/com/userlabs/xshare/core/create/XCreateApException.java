package com.userlabs.xshare.core.create;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class XCreateApException extends RuntimeException {
    public static final int CODE_ANDROID_25_CREATED_BUT_NO_IP = -2;
    public static final int CODE_CLOSE_AP = 101;
    public static final int CODE_CLOSE_WIFI = 102;
    public static final int CODE_CONFIG_AND_REAL_SSID_NOT_MATCH = 212;
    public static final int CODE_EX_INVOCATION_TARGET = 210;
    public static final int CODE_EX_M_OTHER = 211;
    public static final int CODE_EX_UNKNOWN = 501;
    public static final int CODE_IP_NULL = 500;
    public static final int CODE_IP_SSID_NOT_MATCH = -1;
    public static final int CODE_OPEN_AP_TIMEOUT = 103;
    public static final int CODE_O_EX_OTHER = 412;
    public static final int CODE_O_GENERIC = 409;
    public static final int CODE_O_INCOMPATIBLE_MODE = 407;
    public static final int CODE_O_LOCATION_MODE = 402;
    public static final int CODE_O_LOCATION_PERMISSION = 403;
    public static final int CODE_O_NO_CHANNEL = 406;
    public static final int CODE_O_NO_PWD = 405;
    public static final int CODE_O_NO_SSID = 404;
    public static final int CODE_O_STARTED_NO_PARAM = 410;
    public static final int CODE_O_START_SERVICE_FAILED = 401;
    public static final int CODE_O_TETHERING_DISALLOWED = 408;
    public static final int CODE_RECEIVE_FAILED = 213;
    public static final int CODE_STATE_EX = 104;
    private final int code;

    public XCreateApException(int i) {
        this.code = i;
    }

    public String codeToErrorType() {
        int i = this.code;
        if (i == 101) {
            return "create_ap_error_pre_ap_enabled";
        }
        if (i == 102) {
            return "create_ap_error_pre_wifi_open";
        }
        if (i == 103) {
            return "create_ap_error_timeout";
        }
        if (i == 104) {
            return "create_ap_error_custom_state_invalid";
        }
        if (i == 210) {
            return "create_ap_error_m_ex_invocation_target";
        }
        if (i == 211) {
            return "create_ap_error_ex_m_unknown";
        }
        if (i == 500) {
            return "create_ap_error_ip_null";
        }
        if (i == 212) {
            return "create_ap_error_m_ssid_not_match";
        }
        if (i == 213) {
            return "create_ap_error_m_broadcast_failed";
        }
        if (i == 401) {
            return "create_ap_error_o_cannot_start_service";
        }
        if (i == 402) {
            return "create_ap_error_o_api_ex_location_mode";
        }
        if (i == 403) {
            return "create_ap_error_o_api_ex_location_permission";
        }
        if (i == 404) {
            return "create_ap_error_o_ssid_null";
        }
        if (i == 405) {
            return "create_ap_error_o_pwd_null";
        }
        if (i == 406) {
            return "create_ap_error_o_no_channel";
        }
        if (i == 407) {
            return "create_ap_error_o_incompatible_mode";
        }
        if (i == 408) {
            return "create_ap_error_o_tethering_disallowed";
        }
        if (i == 409) {
            return "create_ap_error_o_generic";
        }
        if (i == 410) {
            return "create_ap_error_o_reservation_null";
        }
        return i == 412 ? "create_ap_error_o_api_ex_unknown" : "create_ap_error_unexcepted_ex";
    }

    public int getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + ",error type:" + codeToErrorType();
    }

    public XCreateApException(String str, int i) {
        super(str);
        this.code = i;
    }

    public XCreateApException(Throwable th, int i) {
        super(th);
        this.code = i;
    }
}
