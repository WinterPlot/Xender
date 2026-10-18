package androidx.camera.core.impl;

import android.util.Size;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface i1 {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a {
        public static a create(int i, String str, int i2, int i3, int i4, int i5) {
            return new j(i, str, i2, i3, i4, i5);
        }

        public abstract int getBitrate();

        public abstract int getChannels();

        public abstract int getCodec();

        public abstract String getMediaType();

        public abstract int getProfile();

        public abstract int getSampleRate();
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class b implements i1 {
        public static b create(int i, int i2, List<a> list, List<c> list2) {
            return new k(i, i2, DesugarCollections.unmodifiableList(new ArrayList(list)), DesugarCollections.unmodifiableList(new ArrayList(list2)));
        }

        @Override // androidx.camera.core.impl.i1
        public abstract /* synthetic */ List getAudioProfiles();

        @Override // androidx.camera.core.impl.i1
        public abstract /* synthetic */ int getDefaultDurationSeconds();

        @Override // androidx.camera.core.impl.i1
        public abstract /* synthetic */ int getRecommendedFileFormat();

        @Override // androidx.camera.core.impl.i1
        public abstract /* synthetic */ List getVideoProfiles();
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class c {
        public static c create(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            return new l(i, str, i2, i3, i4, i5, i6, i7, i8, i9);
        }

        public abstract int getBitDepth();

        public abstract int getBitrate();

        public abstract int getChromaSubsampling();

        public abstract int getCodec();

        public abstract int getFrameRate();

        public abstract int getHdrFormat();

        public abstract int getHeight();

        public abstract String getMediaType();

        public abstract int getProfile();

        public Size getResolution() {
            return new Size(getWidth(), getHeight());
        }

        public abstract int getWidth();
    }

    List<a> getAudioProfiles();

    int getDefaultDurationSeconds();

    int getRecommendedFileFormat();

    List<c> getVideoProfiles();
}
