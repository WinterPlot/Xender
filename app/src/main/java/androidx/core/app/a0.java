package androidx.core.app;

import android.content.res.Configuration;
import okio.j0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    private final boolean a;
    private Configuration b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(boolean z, Configuration configuration) {
        this(z);
        configuration.getClass();
        this.b = configuration;
    }

    public final Configuration getNewConfig() {
        Configuration configuration = this.b;
        if (configuration != null) {
            return configuration;
        }
        j0.g("PictureInPictureModeChangedInfo must be constructed with the constructor that takes a Configuration to access the newConfig. Are you running on an API 26 or higher device that makes this information available?");
        return null;
    }

    public final boolean isInPictureInPictureMode() {
        return this.a;
    }

    public a0(boolean z) {
        this.a = z;
    }
}
