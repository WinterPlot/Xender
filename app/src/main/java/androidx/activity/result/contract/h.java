package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends androidx.activity.result.contract.a<Intent, ActivityResult> {
    public static final a a = new a(null);

    @Override // androidx.activity.result.contract.a
    public Intent createIntent(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        return intent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.activity.result.contract.a
    public ActivityResult parseResult(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public /* synthetic */ a(r rVar) {
            this();
        }

        private a() {
        }
    }
}
