package com.google.android.datatransport.runtime.synchronization;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface a {

    /* JADX INFO: renamed from: com.google.android.datatransport.runtime.synchronization.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface InterfaceC0552a<T> {
        T execute();
    }

    <T> T runCriticalSection(InterfaceC0552a<T> interfaceC0552a);
}
