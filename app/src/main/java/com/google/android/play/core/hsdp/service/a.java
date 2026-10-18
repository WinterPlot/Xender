package com.google.android.play.core.hsdp.service;

import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public interface a {

    /* JADX INFO: renamed from: com.google.android.play.core.hsdp.service.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface InterfaceC0585a {
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface b {
        void onAffordanceEnded();

        void onAffordanceStarted();

        void onDeepLinkStarted();

        void onDismissed(Bundle bundle);

        void onError(Bundle bundle);

        void onShown(Bundle bundle);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface c {
        void onCompleted(Bundle bundle);

        void onError(Bundle bundle);
    }

    void detach();

    void dismiss(String str);

    void endSession(String str);

    void open(String str, String str2, b bVar);

    void open(String str, String str2, b bVar, Map<String, String> map);

    void open(String str, String str2, b bVar, Map<String, String> map, boolean z);

    void prewarm(List<com.google.android.play.core.hsdp.service.b> list, c cVar);

    void stopAffordance(String str, InterfaceC0585a interfaceC0585a);
}
