package androidx.media3.common.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import androidx.media3.common.util.p;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private final Context a;
    private final C0168b b;
    private final p c;
    private boolean d;

    /* JADX INFO: renamed from: androidx.media3.common.audio.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public final class C0168b extends BroadcastReceiver {
        private final c a;
        private final p b;

        private C0168b(p pVar, c cVar) {
            this.b = pVar;
            this.a = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void callListenerIfEnabled() {
            if (b.this.d) {
                this.a.onAudioBecomingNoisy();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.b.post(new androidx.media3.common.audio.a(this, 2));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface c {
        void onAudioBecomingNoisy();
    }

    public b(Context context, Looper looper, Looper looper2, c cVar, androidx.media3.common.util.g gVar) {
        this.a = context.getApplicationContext();
        this.c = gVar.createHandler(looper, null);
        this.b = new C0168b(gVar.createHandler(looper2, null), cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setEnabled$0() {
        this.a.registerReceiver(this.b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setEnabled$1() {
        this.a.unregisterReceiver(this.b);
    }

    public void setEnabled(boolean z) {
        if (z == this.d) {
            return;
        }
        p pVar = this.c;
        if (z) {
            pVar.post(new androidx.media3.common.audio.a(this, 0));
            this.d = true;
        } else {
            pVar.post(new androidx.media3.common.audio.a(this, 1));
            this.d = false;
        }
    }
}
