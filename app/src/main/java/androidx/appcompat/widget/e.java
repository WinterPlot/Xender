package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements androidx.core.util.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextView b;

    public /* synthetic */ e(TextView textView, int i) {
        this.a = i;
        this.b = textView;
    }

    @Override // androidx.core.util.b
    public final void accept(Object obj) {
        int i = this.a;
        TextView textView = this.b;
        switch (i) {
            case 0:
                ((AppCompatButton) textView).lambda$getFontVariationSettingsManager$0((Typeface) obj);
                break;
            case 1:
                ((AppCompatEditText) textView).lambda$getFontVariationSettingsManager$0((Typeface) obj);
                break;
            default:
                ((AppCompatTextView) textView).lambda$getFontVariationSettingsManager$0((Typeface) obj);
                break;
        }
    }
}
