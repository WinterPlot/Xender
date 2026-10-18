package androidx.camera.video;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class e extends z {
    private final Uri a;

    public e(Uri uri) {
        if (uri != null) {
            this.a = uri;
        } else {
            com.google.gson.internal.a.j("Null outputUri");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z) {
            return this.a.equals(((z) obj).getOutputUri());
        }
        return false;
    }

    @Override // androidx.camera.video.z
    public Uri getOutputUri() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "OutputResults{outputUri=" + this.a + "}";
    }
}
