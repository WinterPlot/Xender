package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.l0;
import androidx.media3.common.t;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface l {
    t getFormat(int i);

    int getIndexInTrackGroup(int i);

    l0 getTrackGroup();

    int getType();

    int indexOf(int i);

    int indexOf(t tVar);

    int length();
}
