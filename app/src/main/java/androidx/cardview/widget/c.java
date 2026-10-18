package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
interface c {
    ColorStateList getBackgroundColor(b bVar);

    float getElevation(b bVar);

    float getMaxElevation(b bVar);

    float getMinHeight(b bVar);

    float getMinWidth(b bVar);

    float getRadius(b bVar);

    void initStatic();

    void initialize(b bVar, Context context, ColorStateList colorStateList, float f, float f2, float f3);

    void onCompatPaddingChanged(b bVar);

    void onPreventCornerOverlapChanged(b bVar);

    void setBackgroundColor(b bVar, ColorStateList colorStateList);

    void setElevation(b bVar, float f);

    void setMaxElevation(b bVar, float f);

    void setRadius(b bVar, float f);

    void updatePadding(b bVar);
}
