package com.google.android.datatransport;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface j {
    <T> i<T> getTransport(String str, Class<T> cls, d dVar, h<T, byte[]> hVar);

    @Deprecated
    <T> i<T> getTransport(String str, Class<T> cls, h<T, byte[]> hVar);
}
