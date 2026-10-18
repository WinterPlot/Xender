package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((AudioTrackAudioOutput.c) obj2).lambda$onRoutingChanged$0((AudioDeviceInfo) obj);
                break;
            case 1:
                ((AudioTrackAudioOutput.c) obj2).lambda$onRoutingChanged$1((AudioRouting) obj);
                break;
            case 2:
                ((n.a) obj2).lambda$audioCodecParametersChanged$13((androidx.media3.exoplayer.c) obj);
                break;
            default:
                ((n.a) obj2).lambda$decoderReleased$5((String) obj);
                break;
        }
    }
}
