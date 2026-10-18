package com.google.android.datatransport.cct.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class e extends ClientInfo {
    private final ClientInfo.ClientType a;
    private final com.google.android.datatransport.cct.internal.a b;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b extends ClientInfo.a {
        private ClientInfo.ClientType a;
        private com.google.android.datatransport.cct.internal.a b;

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.a
        public ClientInfo build() {
            return new e(this.a, this.b);
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.a
        public ClientInfo.a setAndroidClientInfo(com.google.android.datatransport.cct.internal.a aVar) {
            this.b = aVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.a
        public ClientInfo.a setClientType(ClientInfo.ClientType clientType) {
            this.a = clientType;
            return this;
        }
    }

    private e(ClientInfo.ClientType clientType, com.google.android.datatransport.cct.internal.a aVar) {
        this.a = clientType;
        this.b = aVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ClientInfo) {
            ClientInfo clientInfo = (ClientInfo) obj;
            ClientInfo.ClientType clientType = this.a;
            if (clientType != null ? clientType.equals(clientInfo.getClientType()) : clientInfo.getClientType() == null) {
                com.google.android.datatransport.cct.internal.a aVar = this.b;
                if (aVar != null ? aVar.equals(clientInfo.getAndroidClientInfo()) : clientInfo.getAndroidClientInfo() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public com.google.android.datatransport.cct.internal.a getAndroidClientInfo() {
        return this.b;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public ClientInfo.ClientType getClientType() {
        return this.a;
    }

    public int hashCode() {
        ClientInfo.ClientType clientType = this.a;
        int iHashCode = ((clientType == null ? 0 : clientType.hashCode()) ^ 1000003) * 1000003;
        com.google.android.datatransport.cct.internal.a aVar = this.b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }
}
