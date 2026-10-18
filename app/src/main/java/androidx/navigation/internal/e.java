package androidx.navigation.internal;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {
    private final Context a;

    public e(Context context) {
        this.a = context;
    }

    public final Object getApplication() {
        Context context = this.a;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext instanceof Application) {
            return (Application) applicationContext;
        }
        return null;
    }

    public final Context getContext() {
        return this.a;
    }

    public final String getResourceName(int i) {
        try {
            Context context = this.a;
            context.getClass();
            String resourceName = context.getResources().getResourceName(i);
            resourceName.getClass();
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }
}
