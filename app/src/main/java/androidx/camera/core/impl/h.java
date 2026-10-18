package androidx.camera.core.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class h extends u0 {
    private final Executor a;
    private final Handler b;

    public h(Executor executor, Handler handler) {
        if (executor == null) {
            com.google.gson.internal.a.j("Null cameraExecutor");
            throw null;
        }
        this.a = executor;
        if (handler != null) {
            this.b = handler;
        } else {
            com.google.gson.internal.a.j("Null schedulerHandler");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u0) {
            u0 u0Var = (u0) obj;
            if (this.a.equals(u0Var.getCameraExecutor()) && this.b.equals(u0Var.getSchedulerHandler())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.u0
    public Executor getCameraExecutor() {
        return this.a;
    }

    @Override // androidx.camera.core.impl.u0
    public Handler getSchedulerHandler() {
        return this.b;
    }

    public int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.a + ", schedulerHandler=" + this.b + "}";
    }
}
