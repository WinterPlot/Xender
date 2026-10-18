package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.i0;
import com.google.android.material.R;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public class TabItem extends View {
    public final CharSequence a;
    public final Drawable b;
    public final int c;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i0 i0VarObtainStyledAttributes = i0.obtainStyledAttributes(context, attributeSet, R.styleable.TabItem);
        this.a = i0VarObtainStyledAttributes.getText(R.styleable.TabItem_android_text);
        this.b = i0VarObtainStyledAttributes.getDrawable(R.styleable.TabItem_android_icon);
        this.c = i0VarObtainStyledAttributes.getResourceId(R.styleable.TabItem_android_layout, 0);
        i0VarObtainStyledAttributes.recycle();
    }

    public TabItem(Context context) {
        this(context, null);
    }
}
