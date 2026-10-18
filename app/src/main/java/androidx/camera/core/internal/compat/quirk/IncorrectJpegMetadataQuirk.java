package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.i1;
import androidx.camera.core.impl.i2;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class IncorrectJpegMetadataQuirk implements i2 {
    private static final Set<String> b = new HashSet(Arrays.asList("A24", "BEYOND0", "BEYOND2"));

    private boolean canParseSosMarker(byte[] bArr) {
        byte b2;
        int i = 2;
        while (i + 4 <= bArr.length && (b2 = bArr[i]) == -1) {
            if (b2 == -1 && bArr[i + 1] == -38) {
                return true;
            }
            i += (((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255)) + 2;
        }
        return false;
    }

    private int findSecondFfd8Position(byte[] bArr) {
        int i = 2;
        while (true) {
            int i2 = i + 1;
            if (i2 > bArr.length) {
                return -1;
            }
            if (bArr[i] == -1 && bArr[i2] == -40) {
                return i;
            }
            i = i2;
        }
    }

    private static boolean isSamsungProblematicDevice() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && b.contains(Build.DEVICE.toUpperCase(Locale.US));
    }

    public static boolean load() {
        return isSamsungProblematicDevice();
    }

    public byte[] jpegImageToJpegByteArray(i1 i1Var) {
        int iFindSecondFfd8Position = 0;
        ByteBuffer buffer = i1Var.getPlanes()[0].getBuffer();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.rewind();
        buffer.get(bArr);
        return (canParseSosMarker(bArr) || (iFindSecondFfd8Position = findSecondFfd8Position(bArr)) != -1) ? Arrays.copyOfRange(bArr, iFindSecondFfd8Position, buffer.limit()) : bArr;
    }
}
