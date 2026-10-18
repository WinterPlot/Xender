package androidx.work;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k {
    public abstract j createInputMerger(String str);

    public final j createInputMergerWithDefaultFallback(String str) {
        str.getClass();
        j jVarCreateInputMerger = createInputMerger(str);
        return jVarCreateInputMerger == null ? l.fromClassName(str) : jVarCreateInputMerger;
    }
}
