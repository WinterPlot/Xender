package com.userlabs.xshare.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class XCheckBox extends AppCompatImageView {
    public XCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void click() {
        setCheck(!isSelected());
    }

    public boolean isChecked() {
        return isSelected();
    }

    public void setCheck(boolean z) {
        setSelected(z);
    }

    public void setImage(int i) {
        setImageResource(i);
    }
}
