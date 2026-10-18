package androidx.camera.video.internal.compat.quirk;

import android.graphics.Rect;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.i2;
import androidx.camera.core.impl.utils.w;
import androidx.camera.video.internal.encoder.k0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class SizeCannotEncodeVideoQuirk implements i2 {
    private static Set<Size> getProblematicSizes() {
        return isMotoC() ? new HashSet(Collections.singletonList(new Size(720, 1280))) : Collections.EMPTY_SET;
    }

    private static boolean isMotoC() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean load() {
        return isMotoC();
    }

    public Rect adjustCropRectForProblematicEncodeSize(Rect rect, int i, k0 k0Var) {
        Size sizeRotateSize = w.rotateSize(w.rectToSize(rect), i);
        if (!isProblematicEncodeSize(sizeRotateSize)) {
            return rect;
        }
        int heightAlignment = k0Var != null ? k0Var.getHeightAlignment() / 2 : 8;
        Rect rect2 = new Rect(rect);
        if (rect.width() == sizeRotateSize.getHeight()) {
            rect2.left += heightAlignment;
            rect2.right -= heightAlignment;
            return rect2;
        }
        rect2.top += heightAlignment;
        rect2.bottom -= heightAlignment;
        return rect2;
    }

    public boolean isProblematicEncodeSize(Size size) {
        return getProblematicSizes().contains(size);
    }
}
