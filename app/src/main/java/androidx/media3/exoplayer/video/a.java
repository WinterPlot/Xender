package androidx.media3.exoplayer.video;

import androidx.media3.container.ObuParser;
import com.userlabs.xshare.core.create.XCreateApException;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    private final ByteBuffer a = ByteBuffer.allocateDirect(XCreateApException.CODE_IP_NULL);
    private ObuParser.d b;

    private boolean canSkipObu(ObuParser.c cVar, boolean z) {
        ObuParser.d dVar;
        ObuParser.b bVar;
        int i = cVar.a;
        if (i == 2 || i == 15) {
            return true;
        }
        if (i != 3 || z) {
            return ((i != 6 && i != 3) || (dVar = this.b) == null || (bVar = ObuParser.b.parse(dVar, cVar)) == null || bVar.isDependedOn()) ? false : true;
        }
        return false;
    }

    private void emptyDelayedKeyFrameTruncatedSample() {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(byteBuffer.limit());
    }

    private void updateSequenceHeaders(List<ObuParser.c> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).a == 1) {
                this.b = ObuParser.d.parse(list.get(i));
            }
        }
    }

    public void queueInputBuffer(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, iPosition + XCreateApException.CODE_IP_NULL));
        this.a.clear();
        this.a.put(byteBuffer);
        this.a.flip();
        byteBuffer.position(iPosition);
        byteBuffer.limit(iLimit);
    }

    public void reset() {
        this.b = null;
        emptyDelayedKeyFrameTruncatedSample();
    }

    public int sampleLimitAfterSkippingNonReferenceFrame(ByteBuffer byteBuffer, boolean z) {
        if (this.a.hasRemaining()) {
            updateSequenceHeaders(ObuParser.split(this.a));
            emptyDelayedKeyFrameTruncatedSample();
        }
        List<ObuParser.c> listSplit = ObuParser.split(byteBuffer);
        updateSequenceHeaders(listSplit);
        int size = listSplit.size() - 1;
        int i = 0;
        while (size >= 0 && canSkipObu(listSplit.get(size), z)) {
            if (listSplit.get(size).a == 6 || listSplit.get(size).a == 3) {
                i++;
            }
            size--;
        }
        if (i > 1 || size + 1 >= 8) {
            return byteBuffer.limit();
        }
        return size >= 0 ? listSplit.get(size).b.limit() : byteBuffer.position();
    }
}
