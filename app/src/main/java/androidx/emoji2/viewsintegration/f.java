package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.core.util.i;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    private final b a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a extends b {
        private final TextView a;
        private final d b;
        private boolean c = true;

        public a(TextView textView) {
            this.a = textView;
            this.b = new d(textView);
        }

        private InputFilter[] addEmojiInputFilterIfMissing(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.b;
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> getEmojiInputFilterPositionArray(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof d) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] removeEmojiInputFilterIfPresent(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> emojiInputFilterPositionArray = getEmojiInputFilterPositionArray(inputFilterArr);
            if (emojiInputFilterPositionArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - emojiInputFilterPositionArray.size()];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (emojiInputFilterPositionArray.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod unwrapForDisabled(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).getOriginalTransformationMethod() : transformationMethod;
        }

        private void updateFilters() {
            this.a.setFilters(getFilters(this.a.getFilters()));
        }

        private TransformationMethod wrapForEnabled(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public InputFilter[] getFilters(InputFilter[] inputFilterArr) {
            return !this.c ? removeEmojiInputFilterIfPresent(inputFilterArr) : addEmojiInputFilterIfMissing(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public boolean isEnabled() {
            return this.c;
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public void setAllCaps(boolean z) {
            if (z) {
                updateTransformationMethod();
            }
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public void setEnabled(boolean z) {
            this.c = z;
            updateTransformationMethod();
            updateFilters();
        }

        public void setEnabledUnsafe(boolean z) {
            this.c = z;
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public void updateTransformationMethod() {
            this.a.setTransformationMethod(wrapTransformationMethod(this.a.getTransformationMethod()));
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public TransformationMethod wrapTransformationMethod(TransformationMethod transformationMethod) {
            return this.c ? wrapForEnabled(transformationMethod) : unwrapForDisabled(transformationMethod);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class c extends b {
        private final a a;

        public c(TextView textView) {
            this.a = new a(textView);
        }

        private boolean skipBecauseEmojiCompatNotInitialized() {
            return !androidx.emoji2.text.e.isConfigured();
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public InputFilter[] getFilters(InputFilter[] inputFilterArr) {
            return skipBecauseEmojiCompatNotInitialized() ? inputFilterArr : this.a.getFilters(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public boolean isEnabled() {
            return this.a.isEnabled();
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public void setAllCaps(boolean z) {
            if (skipBecauseEmojiCompatNotInitialized()) {
                return;
            }
            this.a.setAllCaps(z);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public void setEnabled(boolean z) {
            boolean zSkipBecauseEmojiCompatNotInitialized = skipBecauseEmojiCompatNotInitialized();
            a aVar = this.a;
            if (zSkipBecauseEmojiCompatNotInitialized) {
                aVar.setEnabledUnsafe(z);
            } else {
                aVar.setEnabled(z);
            }
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public void updateTransformationMethod() {
            if (skipBecauseEmojiCompatNotInitialized()) {
                return;
            }
            this.a.updateTransformationMethod();
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public TransformationMethod wrapTransformationMethod(TransformationMethod transformationMethod) {
            return skipBecauseEmojiCompatNotInitialized() ? transformationMethod : this.a.wrapTransformationMethod(transformationMethod);
        }
    }

    public f(TextView textView, boolean z) {
        i.checkNotNull(textView, "textView cannot be null");
        if (z) {
            this.a = new a(textView);
        } else {
            this.a = new c(textView);
        }
    }

    public InputFilter[] getFilters(InputFilter[] inputFilterArr) {
        return this.a.getFilters(inputFilterArr);
    }

    public boolean isEnabled() {
        return this.a.isEnabled();
    }

    public void setAllCaps(boolean z) {
        this.a.setAllCaps(z);
    }

    public void setEnabled(boolean z) {
        this.a.setEnabled(z);
    }

    public void updateTransformationMethod() {
        this.a.updateTransformationMethod();
    }

    public TransformationMethod wrapTransformationMethod(TransformationMethod transformationMethod) {
        return this.a.wrapTransformationMethod(transformationMethod);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class b {
        public boolean isEnabled() {
            return false;
        }

        public void updateTransformationMethod() {
        }

        public InputFilter[] getFilters(InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        public void setAllCaps(boolean z) {
        }

        public void setEnabled(boolean z) {
        }

        public TransformationMethod wrapTransformationMethod(TransformationMethod transformationMethod) {
            return transformationMethod;
        }
    }

    public f(TextView textView) {
        this(textView, true);
    }
}
