package androidx.camera.core.impl;

import android.util.Size;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t2 {
    public static t2 create(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4, Map<Integer, Size> map5, Map<Integer, Size> map6) {
        return new q(size, map, size2, map2, size3, map3, map4, map5, map6);
    }

    public abstract Size getAnalysisSize();

    public Size getMaximum16x9Size(int i) {
        return getMaximumSizeMap().get(Integer.valueOf(i));
    }

    public abstract Map<Integer, Size> getMaximum16x9SizeMap();

    public Size getMaximum4x3Size(int i) {
        return getMaximumSizeMap().get(Integer.valueOf(i));
    }

    public abstract Map<Integer, Size> getMaximum4x3SizeMap();

    public Size getMaximumSize(int i) {
        return getMaximumSizeMap().get(Integer.valueOf(i));
    }

    public abstract Map<Integer, Size> getMaximumSizeMap();

    public abstract Size getPreviewSize();

    public abstract Size getRecordSize();

    public Size getS1440pSize(int i) {
        return getS1440pSizeMap().get(Integer.valueOf(i));
    }

    public abstract Map<Integer, Size> getS1440pSizeMap();

    public Size getS720pSize(int i) {
        return getS720pSizeMap().get(Integer.valueOf(i));
    }

    public abstract Map<Integer, Size> getS720pSizeMap();

    public Size getUltraMaximumSize(int i) {
        return getUltraMaximumSizeMap().get(Integer.valueOf(i));
    }

    public abstract Map<Integer, Size> getUltraMaximumSizeMap();
}
