package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface l0 {
    /* JADX INFO: renamed from: onCaptureCompleted-rmrZIYk, reason: not valid java name */
    void mo298onCaptureCompletedrmrZIYk(CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult, long j);

    /* JADX INFO: renamed from: onCaptureFailed-RuT0dZU, reason: not valid java name */
    void mo299onCaptureFailedRuT0dZU(CaptureRequest captureRequest, long j);

    void onCaptureProcessProgressed(CaptureRequest captureRequest, int i);

    void onCaptureProgressed(CaptureRequest captureRequest, CaptureResult captureResult);

    void onCaptureSequenceAborted(int i);

    void onCaptureSequenceCompleted(int i, long j);

    void onCaptureStarted(CaptureRequest captureRequest, long j, long j2);
}
