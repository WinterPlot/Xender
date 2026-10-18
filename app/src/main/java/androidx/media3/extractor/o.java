package androidx.media3.extractor;

import java.io.IOException;
import java.util.List;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface o {
    List<n0> getSniffFailureDetails();

    @SideEffectFree
    o getUnderlyingImplementation();

    void init(q qVar);

    int read(p pVar, i0 i0Var) throws IOException;

    void release();

    void seek(long j, long j2);

    boolean sniff(p pVar) throws IOException;
}
