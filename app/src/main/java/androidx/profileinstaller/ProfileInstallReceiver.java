package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a implements f.c {
        public a() {
        }

        @Override // androidx.profileinstaller.f.c
        public void onDiagnosticReceived(int i, Object obj) {
            f.b.onDiagnosticReceived(i, obj);
        }

        @Override // androidx.profileinstaller.f.c
        public void onResultReceived(int i, Object obj) {
            f.b.onResultReceived(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }
    }

    public static void saveProfile(f.c cVar) {
        if (Build.VERSION.SDK_INT < 24) {
            cVar.onResultReceived(13, null);
        } else {
            Process.sendSignal(Process.myPid(), 10);
            cVar.onResultReceived(12, null);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            f.writeProfile(context, new androidx.media3.exoplayer.offline.b(), new a(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    f.writeSkipFile(context, new androidx.media3.exoplayer.offline.b(), new a());
                    return;
                } else {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        f.deleteSkipFile(context, new androidx.media3.exoplayer.offline.b(), new a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            saveProfile(new a());
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        a aVar = new a();
        if ("DROP_SHADER_CACHE".equals(string2)) {
            androidx.profileinstaller.a.dropShaderCache(context, aVar);
        } else {
            aVar.onResultReceived(16, null);
        }
    }
}
