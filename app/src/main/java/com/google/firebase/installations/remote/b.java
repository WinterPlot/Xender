package com.google.firebase.installations.remote;

import okio.j0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class b extends TokenResult {
    private final String a;
    private final long b;
    private final TokenResult.ResponseCode c;

    private b(String str, long j, TokenResult.ResponseCode responseCode) {
        this.a = str;
        this.b = j;
        this.c = responseCode;
    }

    public boolean equals(Object obj) {
        TokenResult.ResponseCode responseCode;
        if (obj == this) {
            return true;
        }
        if (obj instanceof TokenResult) {
            TokenResult tokenResult = (TokenResult) obj;
            String str = this.a;
            if (str != null ? str.equals(tokenResult.getToken()) : tokenResult.getToken() == null) {
                if (this.b == tokenResult.getTokenExpirationTimestamp() && ((responseCode = this.c) != null ? responseCode.equals(tokenResult.getResponseCode()) : tokenResult.getResponseCode() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public TokenResult.ResponseCode getResponseCode() {
        return this.c;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public String getToken() {
        return this.a;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public long getTokenExpirationTimestamp() {
        return this.b;
    }

    public int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        TokenResult.ResponseCode responseCode = this.c;
        return i ^ (responseCode != null ? responseCode.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public TokenResult.a toBuilder() {
        return new C0642b(this);
    }

    public String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.c + "}";
    }

    /* JADX INFO: renamed from: com.google.firebase.installations.remote.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class C0642b extends TokenResult.a {
        private String a;
        private long b;
        private TokenResult.ResponseCode c;
        private byte d;

        private C0642b(TokenResult tokenResult) {
            this.a = tokenResult.getToken();
            this.b = tokenResult.getTokenExpirationTimestamp();
            this.c = tokenResult.getResponseCode();
            this.d = (byte) 1;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.a
        public TokenResult build() {
            if (this.d == 1) {
                return new b(this.a, this.b, this.c);
            }
            j0.g("Missing required properties: tokenExpirationTimestamp");
            return null;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.a
        public TokenResult.a setResponseCode(TokenResult.ResponseCode responseCode) {
            this.c = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.a
        public TokenResult.a setToken(String str) {
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.a
        public TokenResult.a setTokenExpirationTimestamp(long j) {
            this.b = j;
            this.d = (byte) (this.d | 1);
            return this;
        }

        public C0642b() {
        }
    }
}
