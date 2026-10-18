package androidx.core.content.pm;

import android.os.LocaleList;
import android.text.PrecomputedText;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ LocaleList a(Object obj) {
        return (LocaleList) obj;
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession b(Object obj) {
        return (ContentCaptureSession) obj;
    }

    public static /* synthetic */ void e(Object obj, String str, int i, int i2) {
        throw new IllegalArgumentException(str + i + obj + i2);
    }

    public static /* bridge */ /* synthetic */ boolean f(Object obj) {
        return obj instanceof PrecomputedText;
    }
}
