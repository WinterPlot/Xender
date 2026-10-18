package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public enum DataCollectionState implements com.google.firebase.encoders.json.e {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);

    private static final /* synthetic */ kotlin.enums.a b = kotlin.enums.b.enumEntries(values());
    private final int number;

    DataCollectionState(int i) {
        this.number = i;
    }

    public static kotlin.enums.a<DataCollectionState> getEntries() {
        return b;
    }

    @Override // com.google.firebase.encoders.json.e
    public int getNumber() {
        return this.number;
    }
}
