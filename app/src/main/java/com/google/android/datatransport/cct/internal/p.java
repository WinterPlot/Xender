package com.google.android.datatransport.cct.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a {
        public abstract p build();

        public abstract a setOriginAssociatedProductId(Integer num);
    }

    public static a builder() {
        return new h.b();
    }

    public abstract Integer getOriginAssociatedProductId();
}
