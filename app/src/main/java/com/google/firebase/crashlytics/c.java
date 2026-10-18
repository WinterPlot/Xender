package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.f;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
class c implements com.google.firebase.analytics.connector.a.b {
    private com.google.firebase.crashlytics.internal.analytics.b a;
    private com.google.firebase.crashlytics.internal.analytics.b b;

    private static void notifyEventReceiver(com.google.firebase.crashlytics.internal.analytics.b bVar, String str, Bundle bundle) {
        if (bVar == null) {
            return;
        }
        bVar.onEvent(str, bundle);
    }

    private void notifyEventReceivers(String str, Bundle bundle) {
        notifyEventReceiver("clx".equals(bundle.getString("_o")) ? this.a : this.b, str, bundle);
    }

    @Override // com.google.firebase.analytics.connector.a.b
    public void onMessageTriggered(int i, Bundle bundle) {
        String string;
        f logger = f.getLogger();
        Locale locale = Locale.US;
        logger.v("Analytics listener received message. ID: " + i + ", Extras: " + bundle);
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        notifyEventReceivers(string, bundle2);
    }

    public void setBreadcrumbEventReceiver(com.google.firebase.crashlytics.internal.analytics.b bVar) {
        this.b = bVar;
    }

    public void setCrashlyticsOriginEventReceiver(com.google.firebase.crashlytics.internal.analytics.b bVar) {
        this.a = bVar;
    }
}
