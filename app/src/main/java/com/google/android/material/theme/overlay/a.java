package com.google.android.material.theme.overlay;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.d;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public class a {
    private static final int[] a = {R.attr.theme, androidx.appcompat.R.attr.theme};
    private static final int[] b = {com.google.android.material.R.attr.materialThemeOverlay};

    private a() {
    }

    private static int obtainAndroidThemeOverlayId(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    private static int[] obtainMaterialOverlayIds(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        int[] iArr2 = new int[iArr.length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i3 = 0; i3 < iArr.length; i3++) {
                iArr2[i3] = typedArrayObtainStyledAttributes.getResourceId(i3, 0);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        return iArr2;
    }

    private static int obtainMaterialThemeOverlayId(Context context, AttributeSet attributeSet, int i, int i2) {
        return obtainMaterialOverlayIds(context, attributeSet, b, i, i2)[0];
    }

    public static Context wrap(Context context, AttributeSet attributeSet, int i, int i2, int[] iArr) {
        int iObtainMaterialThemeOverlayId = obtainMaterialThemeOverlayId(context, attributeSet, i, i2);
        boolean z = (context instanceof d) && ((d) context).getThemeResId() == iObtainMaterialThemeOverlayId;
        if (iObtainMaterialThemeOverlayId == 0 || z) {
            return context;
        }
        d dVar = new d(context, iObtainMaterialThemeOverlayId);
        for (int i3 : obtainMaterialOverlayIds(context, attributeSet, iArr, i, i2)) {
            if (i3 != 0) {
                dVar.getTheme().applyStyle(i3, true);
            }
        }
        int iObtainAndroidThemeOverlayId = obtainAndroidThemeOverlayId(context, attributeSet);
        if (iObtainAndroidThemeOverlayId != 0) {
            dVar.getTheme().applyStyle(iObtainAndroidThemeOverlayId, true);
        }
        return dVar;
    }

    public static Context wrap(Context context, AttributeSet attributeSet, int i, int i2) {
        return wrap(context, attributeSet, i, i2, new int[0]);
    }
}
