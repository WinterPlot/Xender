package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class m {
    final String a;
    CharSequence b;
    int c;
    String d;
    String e;
    boolean f;
    Uri g;
    AudioAttributes h;
    boolean i;
    int j;
    boolean k;
    long[] l;
    String m;
    String n;
    private boolean o;
    private int p;
    private boolean q;
    private boolean r;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a {
        private a() {
        }

        public static boolean canBypassDnd(NotificationChannel notificationChannel) {
            return notificationChannel.canBypassDnd();
        }

        public static boolean canShowBadge(NotificationChannel notificationChannel) {
            return notificationChannel.canShowBadge();
        }

        public static NotificationChannel createNotificationChannel(String str, CharSequence charSequence, int i) {
            return new NotificationChannel(str, charSequence, i);
        }

        public static void enableLights(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.enableLights(z);
        }

        public static void enableVibration(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.enableVibration(z);
        }

        public static AudioAttributes getAudioAttributes(NotificationChannel notificationChannel) {
            return notificationChannel.getAudioAttributes();
        }

        public static String getDescription(NotificationChannel notificationChannel) {
            return notificationChannel.getDescription();
        }

        public static String getGroup(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        public static String getId(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        public static int getImportance(NotificationChannel notificationChannel) {
            return notificationChannel.getImportance();
        }

        public static int getLightColor(NotificationChannel notificationChannel) {
            return notificationChannel.getLightColor();
        }

        public static int getLockscreenVisibility(NotificationChannel notificationChannel) {
            return notificationChannel.getLockscreenVisibility();
        }

        public static CharSequence getName(NotificationChannel notificationChannel) {
            return notificationChannel.getName();
        }

        public static Uri getSound(NotificationChannel notificationChannel) {
            return notificationChannel.getSound();
        }

        public static long[] getVibrationPattern(NotificationChannel notificationChannel) {
            return notificationChannel.getVibrationPattern();
        }

        public static void setDescription(NotificationChannel notificationChannel, String str) {
            notificationChannel.setDescription(str);
        }

        public static void setGroup(NotificationChannel notificationChannel, String str) {
            notificationChannel.setGroup(str);
        }

        public static void setLightColor(NotificationChannel notificationChannel, int i) {
            notificationChannel.setLightColor(i);
        }

        public static void setShowBadge(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.setShowBadge(z);
        }

        public static void setSound(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        public static void setVibrationPattern(NotificationChannel notificationChannel, long[] jArr) {
            notificationChannel.setVibrationPattern(jArr);
        }

        public static boolean shouldShowLights(NotificationChannel notificationChannel) {
            return notificationChannel.shouldShowLights();
        }

        public static boolean shouldVibrate(NotificationChannel notificationChannel) {
            return notificationChannel.shouldVibrate();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class b {
        private b() {
        }

        public static boolean canBubble(NotificationChannel notificationChannel) {
            return notificationChannel.canBubble();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class c {
        private c() {
        }

        public static String getConversationId(NotificationChannel notificationChannel) {
            return notificationChannel.getConversationId();
        }

        public static String getParentChannelId(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }

        public static boolean isImportantConversation(NotificationChannel notificationChannel) {
            return notificationChannel.isImportantConversation();
        }

        public static void setConversationId(NotificationChannel notificationChannel, String str, String str2) {
            notificationChannel.setConversationId(str, str2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class d {
        private final m a;

        public d(String str, int i) {
            this.a = new m(str, i);
        }

        public m build() {
            return this.a;
        }

        public d setConversationId(String str, String str2) {
            if (Build.VERSION.SDK_INT >= 30) {
                m mVar = this.a;
                mVar.m = str;
                mVar.n = str2;
            }
            return this;
        }

        public d setDescription(String str) {
            this.a.d = str;
            return this;
        }

        public d setGroup(String str) {
            this.a.e = str;
            return this;
        }

        public d setImportance(int i) {
            this.a.c = i;
            return this;
        }

        public d setLightColor(int i) {
            this.a.j = i;
            return this;
        }

        public d setLightsEnabled(boolean z) {
            this.a.i = z;
            return this;
        }

        public d setName(CharSequence charSequence) {
            this.a.b = charSequence;
            return this;
        }

        public d setShowBadge(boolean z) {
            this.a.f = z;
            return this;
        }

        public d setSound(Uri uri, AudioAttributes audioAttributes) {
            m mVar = this.a;
            mVar.g = uri;
            mVar.h = audioAttributes;
            return this;
        }

        public d setVibrationEnabled(boolean z) {
            this.a.k = z;
            return this;
        }

        public d setVibrationPattern(long[] jArr) {
            m mVar = this.a;
            mVar.k = jArr != null && jArr.length > 0;
            mVar.l = jArr;
            return this;
        }
    }

    public m(NotificationChannel notificationChannel) {
        this(a.getId(notificationChannel), a.getImportance(notificationChannel));
        this.b = a.getName(notificationChannel);
        this.d = a.getDescription(notificationChannel);
        this.e = a.getGroup(notificationChannel);
        this.f = a.canShowBadge(notificationChannel);
        this.g = a.getSound(notificationChannel);
        this.h = a.getAudioAttributes(notificationChannel);
        this.i = a.shouldShowLights(notificationChannel);
        this.j = a.getLightColor(notificationChannel);
        this.k = a.shouldVibrate(notificationChannel);
        this.l = a.getVibrationPattern(notificationChannel);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.m = c.getParentChannelId(notificationChannel);
            this.n = c.getConversationId(notificationChannel);
        }
        this.o = a.canBypassDnd(notificationChannel);
        this.p = a.getLockscreenVisibility(notificationChannel);
        if (i >= 29) {
            this.q = b.canBubble(notificationChannel);
        }
        if (i >= 30) {
            this.r = c.isImportantConversation(notificationChannel);
        }
    }

    public boolean canBubble() {
        return this.q;
    }

    public boolean canBypassDnd() {
        return this.o;
    }

    public boolean canShowBadge() {
        return this.f;
    }

    public AudioAttributes getAudioAttributes() {
        return this.h;
    }

    public String getConversationId() {
        return this.n;
    }

    public String getDescription() {
        return this.d;
    }

    public String getGroup() {
        return this.e;
    }

    public String getId() {
        return this.a;
    }

    public int getImportance() {
        return this.c;
    }

    public int getLightColor() {
        return this.j;
    }

    public int getLockscreenVisibility() {
        return this.p;
    }

    public CharSequence getName() {
        return this.b;
    }

    public NotificationChannel getNotificationChannel() {
        String str;
        String str2;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return null;
        }
        NotificationChannel notificationChannelCreateNotificationChannel = a.createNotificationChannel(this.a, this.b, this.c);
        a.setDescription(notificationChannelCreateNotificationChannel, this.d);
        a.setGroup(notificationChannelCreateNotificationChannel, this.e);
        a.setShowBadge(notificationChannelCreateNotificationChannel, this.f);
        a.setSound(notificationChannelCreateNotificationChannel, this.g, this.h);
        a.enableLights(notificationChannelCreateNotificationChannel, this.i);
        a.setLightColor(notificationChannelCreateNotificationChannel, this.j);
        a.setVibrationPattern(notificationChannelCreateNotificationChannel, this.l);
        a.enableVibration(notificationChannelCreateNotificationChannel, this.k);
        if (i >= 30 && (str = this.m) != null && (str2 = this.n) != null) {
            c.setConversationId(notificationChannelCreateNotificationChannel, str, str2);
        }
        return notificationChannelCreateNotificationChannel;
    }

    public String getParentChannelId() {
        return this.m;
    }

    public Uri getSound() {
        return this.g;
    }

    public long[] getVibrationPattern() {
        return this.l;
    }

    public boolean isImportantConversation() {
        return this.r;
    }

    public boolean shouldShowLights() {
        return this.i;
    }

    public boolean shouldVibrate() {
        return this.k;
    }

    public d toBuilder() {
        return new d(this.a, this.c).setName(this.b).setDescription(this.d).setGroup(this.e).setShowBadge(this.f).setSound(this.g, this.h).setLightsEnabled(this.i).setLightColor(this.j).setVibrationEnabled(this.k).setVibrationPattern(this.l).setConversationId(this.m, this.n);
    }

    public m(String str, int i) {
        this.f = true;
        this.g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.j = 0;
        this.a = (String) androidx.core.util.i.checkNotNull(str);
        this.c = i;
        this.h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }
}
