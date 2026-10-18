package com.google.android.datatransport.runtime;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
abstract class o {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a {
        public abstract o build();

        public abstract a setEncoding(com.google.android.datatransport.d dVar);

        public abstract a setEvent(com.google.android.datatransport.e<?> eVar);

        public <T> a setEvent(com.google.android.datatransport.e<T> eVar, com.google.android.datatransport.d dVar, com.google.android.datatransport.h<T, byte[]> hVar) {
            setEvent(eVar);
            setEncoding(dVar);
            setTransformer(hVar);
            return this;
        }

        public abstract a setTransformer(com.google.android.datatransport.h<?, byte[]> hVar);

        public abstract a setTransportContext(p pVar);

        public abstract a setTransportName(String str);
    }

    public static a builder() {
        return new c.b();
    }

    public abstract com.google.android.datatransport.d getEncoding();

    public abstract com.google.android.datatransport.e<?> getEvent();

    public byte[] getPayload() {
        return getTransformer().apply(getEvent().getPayload());
    }

    public abstract com.google.android.datatransport.h<?, byte[]> getTransformer();

    public abstract p getTransportContext();

    public abstract String getTransportName();
}
