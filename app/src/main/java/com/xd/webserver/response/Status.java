package com.xd.webserver.response;

import androidx.constraintlayout.core.motion.key.MotionKeyTrigger;
import com.userlabs.xshare.core.create.XCreateApException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public enum Status implements b {
    SWITCH_PROTOCOL(XCreateApException.CODE_CLOSE_AP, "Switching Protocols"),
    OK(200, "OK"),
    CREATED(201, "Created"),
    ACCEPTED(202, "Accepted"),
    NO_CONTENT(204, "No Content"),
    PARTIAL_CONTENT(206, "Partial Content"),
    MULTI_STATUS(207, "Multi-Status"),
    REDIRECT(MotionKeyTrigger.TYPE_VIEW_TRANSITION_ON_CROSS, "Moved Permanently"),
    FOUND(MotionKeyTrigger.TYPE_VIEW_TRANSITION_ON_POSITIVE_CROSS, "Found"),
    REDIRECT_SEE_OTHER(MotionKeyTrigger.TYPE_VIEW_TRANSITION_ON_NEGATIVE_CROSS, "See Other"),
    NOT_MODIFIED(MotionKeyTrigger.TYPE_POST_LAYOUT, "Not Modified"),
    TEMPORARY_REDIRECT(MotionKeyTrigger.TYPE_TRIGGER_COLLISION_ID, "Temporary Redirect"),
    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
    NOT_ACCEPTABLE(406, "Not Acceptable"),
    REQUEST_TIMEOUT(408, "Request Timeout"),
    CONFLICT(409, "Conflict"),
    GONE(410, "Gone"),
    LENGTH_REQUIRED(411, "Length Required"),
    PRECONDITION_FAILED(412, "Precondition Failed"),
    PAYLOAD_TOO_LARGE(413, "Payload Too Large"),
    UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type"),
    RANGE_NOT_SATISFIABLE(416, "Requested Range Not Satisfiable"),
    EXPECTATION_FAILED(417, "Expectation Failed"),
    TOO_MANY_REQUESTS(429, "Too Many Requests"),
    INTERNAL_ERROR(XCreateApException.CODE_IP_NULL, "Internal Server Error"),
    NOT_IMPLEMENTED(501, "Not Implemented"),
    SERVICE_UNAVAILABLE(503, "Service Unavailable"),
    UNSUPPORTED_HTTP_VERSION(505, "HTTP Version Not Supported");

    private final String description;
    private final int requestStatus;

    Status(int i, String str) {
        this.requestStatus = i;
        this.description = str;
    }

    public static Status lookup(int i) {
        for (Status status : values()) {
            if (status.getRequestStatus() == i) {
                return status;
            }
        }
        return null;
    }

    @Override // com.xd.webserver.response.b
    public String getDescription() {
        return "" + this.requestStatus + " " + this.description;
    }

    @Override // com.xd.webserver.response.b
    public int getRequestStatus() {
        return this.requestStatus;
    }
}
