package androidx.camera.video;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends y {
    public static final ContentValues c = new ContentValues();
    private final a b;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a extends y.a {
        public abstract Uri getCollectionUri();

        public abstract ContentResolver getContentResolver();

        public abstract ContentValues getContentValues();
    }

    public v(a aVar) {
        super(aVar);
        this.b = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return this.b.equals(((v) obj).b);
        }
        return false;
    }

    public Uri getCollectionUri() {
        return this.b.getCollectionUri();
    }

    public ContentResolver getContentResolver() {
        return this.b.getContentResolver();
    }

    public ContentValues getContentValues() {
        return this.b.getContentValues();
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return this.b.toString().replaceFirst("MediaStoreOutputOptionsInternal", "MediaStoreOutputOptions");
    }
}
