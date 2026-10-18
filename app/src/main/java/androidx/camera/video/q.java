package androidx.camera.video;

import android.os.ParcelFileDescriptor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends y {
    private final a b;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a extends y.a {
        public abstract ParcelFileDescriptor getParcelFileDescriptor();
    }

    public q(a aVar) {
        super(aVar);
        this.b = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return this.b.equals(((q) obj).b);
        }
        return false;
    }

    public ParcelFileDescriptor getParcelFileDescriptor() {
        return this.b.getParcelFileDescriptor();
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return this.b.toString().replaceFirst("FileDescriptorOutputOptionsInternal", "FileDescriptorOutputOptions");
    }
}
