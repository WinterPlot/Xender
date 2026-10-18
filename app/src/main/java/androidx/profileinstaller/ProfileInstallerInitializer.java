package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class ProfileInstallerInitializer implements androidx.startup.b<b> {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a {
        private a() {
        }

        public static Handler createAsync(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class b {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$create$0(Context context, long j) {
        installAfterDelay(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeInBackground(Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new h(context, 1));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.b
    public b create(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new b();
        }
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.profileinstaller.g
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                this.a.lambda$create$0(applicationContext, j);
            }
        });
        return new b();
    }

    @Override // androidx.startup.b
    public List<Class<? extends androidx.startup.b<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }

    public void installAfterDelay(Context context) {
        (Build.VERSION.SDK_INT >= 28 ? a.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new h(context, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
