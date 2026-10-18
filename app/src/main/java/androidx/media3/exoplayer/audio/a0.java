package androidx.media3.exoplayer.audio;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class a0 {
    private a0() {
    }

    public static boolean isBluetoothDevice(int i) {
        if (i == 8 || i == 7) {
            return true;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 31 || !(i == 26 || i == 27)) {
            return i2 >= 33 && i == 30;
        }
        return true;
    }

    public static boolean isBuiltInEarpiece(int i) {
        return i == 1;
    }

    public static boolean isBuiltInSpeaker(int i) {
        return i == 2;
    }

    public static boolean isHdmiArc(int i) {
        return i == 10;
    }

    public static boolean isHdmiEarc(int i) {
        return Build.VERSION.SDK_INT >= 31 && i == 29;
    }

    public static boolean isUsbDevice(int i) {
        if (i == 11 || i == 12) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 31 && i == 22;
    }
}
