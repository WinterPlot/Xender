package kotlin.uuid;

import java.security.SecureRandom;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
final class a {
    public static final a a = new a();
    private static final SecureRandom b = new SecureRandom();

    private a() {
    }

    public final SecureRandom getInstance() {
        return b;
    }
}
