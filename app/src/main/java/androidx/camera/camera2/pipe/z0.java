package androidx.camera.camera2.pipe;

import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {
    private final int a;
    private final Long b;
    private final Integer c;
    private final Integer d;
    private boolean e;

    public /* synthetic */ z0(int i, Long l, Integer num, Integer num2, int i2, r rVar) {
        this(i, (i2 & 2) != 0 ? null : l, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : num2);
    }

    public final int getCapacity() {
        return this.a;
    }

    public final Integer getDefaultDataSpace() {
        return this.c;
    }

    public final Integer getDefaultHardwareBufferFormat() {
        return this.d;
    }

    public final boolean getEnableConcurrentOutputs() {
        return this.e;
    }

    public final Long getUsageFlags() {
        return this.b;
    }

    public final void setEnableConcurrentOutputs(boolean z) {
        this.e = z;
    }

    public z0(int i, Long l, Integer num, Integer num2) {
        this.a = i;
        this.b = l;
        this.c = num;
        this.d = num2;
    }
}
