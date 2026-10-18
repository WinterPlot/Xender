package androidx.datastore.core;

import android.os.Build;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class k {
    public static final boolean atomicMoveTo(File file, File file2) {
        file.getClass();
        file2.getClass();
        return Build.VERSION.SDK_INT >= 26 ? b.a.move(file, file2) : file.renameTo(file2);
    }
}
