package androidx.media3.session;

import android.app.Notification;
import android.app.PendingIntent;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
class r4 {
    private r4() {
    }

    public static Notification.MediaStyle setRemotePlaybackInfo(Notification.MediaStyle mediaStyle, CharSequence charSequence, int i, PendingIntent pendingIntent) {
        mediaStyle.setRemotePlaybackInfo(charSequence, i, pendingIntent);
        return mediaStyle;
    }
}
