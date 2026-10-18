package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class n {
    private static n b;
    private static final RootTelemetryConfiguration c = new RootTelemetryConfiguration(0, false, false, 0, 0);
    private RootTelemetryConfiguration a;

    private n() {
    }

    public static synchronized n getInstance() {
        n nVar;
        nVar = b;
        if (nVar == null) {
            nVar = new n();
            b = nVar;
        }
        return nVar;
    }

    public RootTelemetryConfiguration getConfig() {
        return this.a;
    }

    public final synchronized void zza(RootTelemetryConfiguration rootTelemetryConfiguration) {
        try {
            if (rootTelemetryConfiguration == null) {
                this.a = c;
                return;
            }
            RootTelemetryConfiguration rootTelemetryConfiguration2 = this.a;
            if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.getVersion() < rootTelemetryConfiguration.getVersion()) {
                this.a = rootTelemetryConfiguration;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
