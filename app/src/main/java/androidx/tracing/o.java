package androidx.tracing;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o {
    public abstract void addCallStackEntry(String str, String str2, int i);

    public abstract void addCategory(String str);

    public abstract void addCorrelationId(long j);

    public abstract void addCorrelationId(String str);

    public abstract void addMetadataEntry(String str, double d);

    public abstract void addMetadataEntry(String str, long j);

    public abstract void addMetadataEntry(String str, String str2);

    public abstract void addMetadataEntry(String str, boolean z);

    public abstract void dispatchToTraceSink();
}
