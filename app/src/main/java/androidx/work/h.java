package androidx.work;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {
    private final int a;
    private final int b;
    private final Notification c;

    public h(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.a == hVar.a && this.b == hVar.b) {
            return this.c.equals(hVar.c);
        }
        return false;
    }

    public int getForegroundServiceType() {
        return this.b;
    }

    public Notification getNotification() {
        return this.c;
    }

    public int getNotificationId() {
        return this.a;
    }

    public int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }

    public h(int i, Notification notification) {
        this(i, notification, 0);
    }
}
