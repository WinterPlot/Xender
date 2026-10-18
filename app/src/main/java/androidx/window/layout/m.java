package androidx.window.layout;

import android.app.Activity;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public interface m {
    void registerLayoutChangeCallback(Activity activity, Executor executor, androidx.core.util.b<r> bVar);

    void unregisterLayoutChangeCallback(androidx.core.util.b<r> bVar);
}
