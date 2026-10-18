package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a<I, O> {

    /* JADX INFO: renamed from: androidx.activity.result.contract.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class C0020a<T> {
        private final T a;

        public C0020a(T t) {
            this.a = t;
        }

        public final T getValue() {
            return this.a;
        }
    }

    public abstract Intent createIntent(Context context, I i);

    public C0020a<O> getSynchronousResult(Context context, I i) {
        context.getClass();
        return null;
    }

    public abstract O parseResult(int i, Intent intent);
}
