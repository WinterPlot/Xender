package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.R;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
class j {
    private final TextView a;
    private final androidx.emoji2.viewsintegration.f b;

    public j(TextView textView) {
        this.a = textView;
        this.b = new androidx.emoji2.viewsintegration.f(textView, false);
    }

    public InputFilter[] getFilters(InputFilter[] inputFilterArr) {
        return this.b.getFilters(inputFilterArr);
    }

    public boolean isEnabled() {
        return this.b.isEnabled();
    }

    public void loadFromAttributes(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, R.styleable.AppCompatTextView, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(R.styleable.AppCompatTextView_emojiCompatEnabled) ? typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppCompatTextView_emojiCompatEnabled, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            setEnabled(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setAllCaps(boolean z) {
        this.b.setAllCaps(z);
    }

    public void setEnabled(boolean z) {
        this.b.setEnabled(z);
    }

    public TransformationMethod wrapTransformationMethod(TransformationMethod transformationMethod) {
        return this.b.wrapTransformationMethod(transformationMethod);
    }
}
