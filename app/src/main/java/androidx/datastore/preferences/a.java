package androidx.datastore.preferences;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final File preferencesDataStoreFile(Context context, String str) {
        context.getClass();
        str.getClass();
        return androidx.datastore.a.dataStoreFile(context, str + ".preferences_pb");
    }
}
