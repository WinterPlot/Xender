package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface o0 {
    public static final a a = a.a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final o0 getInstance() {
            return ((k) com.google.firebase.h.getApp(com.google.firebase.c.a).get(k.class)).getSharedSessionRepository();
        }
    }

    void appBackground();

    void appForeground();

    boolean isInForeground();
}
