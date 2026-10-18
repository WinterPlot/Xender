package androidx.work;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public enum NetworkType {
    NOT_REQUIRED,
    CONNECTED,
    UNMETERED,
    NOT_ROAMING,
    METERED,
    TEMPORARILY_UNMETERED;

    private static final /* synthetic */ kotlin.enums.a b = kotlin.enums.b.enumEntries(values());

    public static kotlin.enums.a<NetworkType> getEntries() {
        return b;
    }
}
