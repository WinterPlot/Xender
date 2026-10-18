package com.google.firebase.platforminfo;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    private d() {
    }

    public static String detectVersion() {
        try {
            return kotlin.h.f.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
