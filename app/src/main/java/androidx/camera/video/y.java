package androidx.camera.video;

import android.location.Location;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    private final a a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a {
        public abstract long getDurationLimitMillis();

        public abstract long getFileSizeLimit();

        public abstract Location getLocation();
    }

    public y(a aVar) {
        this.a = aVar;
    }

    public long getDurationLimitMillis() {
        return this.a.getDurationLimitMillis();
    }

    public long getFileSizeLimit() {
        return this.a.getFileSizeLimit();
    }

    public Location getLocation() {
        return this.a.getLocation();
    }
}
