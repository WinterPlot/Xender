package androidx.camera.video;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class c extends b {
    private final int b;
    private final double c;
    private final long d;
    private final Throwable e;

    public c(int i, double d, long j, Throwable th) {
        this.b = i;
        this.c = d;
        this.d = j;
        this.e = th;
    }

    public boolean equals(Object obj) {
        Throwable th;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.b == bVar.getAudioState() && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(bVar.getAudioAmplitudeInternal()) && this.d == bVar.getAudioBytesRecorded() && ((th = this.e) != null ? th.equals(bVar.getErrorCause()) : bVar.getErrorCause() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.b
    public double getAudioAmplitudeInternal() {
        return this.c;
    }

    @Override // androidx.camera.video.b
    public long getAudioBytesRecorded() {
        return this.d;
    }

    @Override // androidx.camera.video.b
    public int getAudioState() {
        return this.b;
    }

    @Override // androidx.camera.video.b
    public Throwable getErrorCause() {
        return this.e;
    }

    public int hashCode() {
        int iDoubleToLongBits = (((this.b ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.c) >>> 32) ^ Double.doubleToLongBits(this.c)))) * 1000003;
        long j = this.d;
        int i = (iDoubleToLongBits ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Throwable th = this.e;
        return (th == null ? 0 : th.hashCode()) ^ i;
    }

    public String toString() {
        return "AudioStats{audioState=" + this.b + ", audioAmplitudeInternal=" + this.c + ", audioBytesRecorded=" + this.d + ", errorCause=" + this.e + "}";
    }
}
