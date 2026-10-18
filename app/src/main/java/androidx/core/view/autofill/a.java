package androidx.core.view.autofill;

import android.view.autofill.AutofillId;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class a {
    private final Object a;

    private a(AutofillId autofillId) {
        this.a = autofillId;
    }

    public static a toAutofillIdCompat(AutofillId autofillId) {
        return new a(autofillId);
    }

    public AutofillId toAutofillId() {
        return (AutofillId) this.a;
    }
}
