package androidx.media3.session.legacy;

import android.media.VolumeProvider;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    private final int a;
    private final int b;
    private final String c;
    private int d;
    private c e;
    private VolumeProvider f;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a extends VolumeProvider {
        public a(int i, int i2, int i3, String str) {
            super(i, i2, i3, str);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i) {
            f.this.onAdjustVolume(i);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i) {
            f.this.onSetVolumeTo(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class b extends VolumeProvider {
        public b(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i) {
            f.this.onAdjustVolume(i);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i) {
            f.this.onSetVolumeTo(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class c {
        public abstract void onVolumeChanged(f fVar);
    }

    public f(int i, int i2, int i3, String str) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = str;
    }

    public final int getMaxVolume() {
        return this.b;
    }

    public Object getVolumeProvider() {
        f fVar;
        if (this.f != null) {
            fVar = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            fVar = this;
            fVar.f = fVar.new a(this.a, this.b, this.d, this.c);
        } else {
            fVar = this;
            fVar.f = fVar.new b(fVar.a, fVar.b, fVar.d);
        }
        return fVar.f;
    }

    public void setCallback(c cVar) {
        this.e = cVar;
    }

    public final void setCurrentVolume(int i) {
        this.d = i;
        ((VolumeProvider) getVolumeProvider()).setCurrentVolume(i);
        c cVar = this.e;
        if (cVar != null) {
            cVar.onVolumeChanged(this);
        }
    }

    public f(int i, int i2, int i3) {
        this(i, i2, i3, null);
    }

    public void onAdjustVolume(int i) {
    }

    public void onSetVolumeTo(int i) {
    }
}
