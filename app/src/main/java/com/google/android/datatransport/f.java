package com.google.android.datatransport;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a {
        public abstract f build();

        public abstract a setExperimentIdsClear(byte[] bArr);

        public abstract a setExperimentIdsEncrypted(byte[] bArr);

        public abstract a setPseudonymousId(String str);
    }

    public static a builder() {
        return new b.C0543b();
    }

    public abstract byte[] getExperimentIdsClear();

    public abstract byte[] getExperimentIdsEncrypted();

    public abstract String getPseudonymousId();
}
