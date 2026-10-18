package com.google.firebase.installations.remote;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class InstallationResponse {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum ResponseCode {
        OK,
        BAD_CONFIG
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a {
        public abstract InstallationResponse build();

        public abstract a setAuthToken(TokenResult tokenResult);

        public abstract a setFid(String str);

        public abstract a setRefreshToken(String str);

        public abstract a setResponseCode(ResponseCode responseCode);

        public abstract a setUri(String str);
    }

    public static a builder() {
        return new com.google.firebase.installations.remote.a.b();
    }

    public abstract TokenResult getAuthToken();

    public abstract String getFid();

    public abstract String getRefreshToken();

    public abstract ResponseCode getResponseCode();

    public abstract String getUri();

    public abstract a toBuilder();
}
