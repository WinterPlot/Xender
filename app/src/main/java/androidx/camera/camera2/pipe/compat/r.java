package androidx.camera.camera2.pipe.compat;

import android.app.NotificationChannel;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class r {
    public static FileVisitResult a(org.apache.commons.io.filefilter.a aVar, Path path) {
        return org.apache.commons.io.filefilter.a.toDefaultFileVisitResult(path != null && aVar.accept(path.toFile()));
    }

    public static boolean b(org.apache.commons.io.filefilter.g gVar, Path path) {
        return gVar.accept(path, (BasicFileAttributes) null) != FileVisitResult.TERMINATE;
    }

    public static /* synthetic */ NotificationChannel c() {
        return new NotificationChannel("videoPlayer", "player", 3);
    }

    public static /* synthetic */ NotificationChannel d(int i, String str, String str2) {
        return new NotificationChannel(str, str2, i);
    }

    public static /* synthetic */ OutputConfiguration e(Size size, Class cls) {
        return new OutputConfiguration(size, cls);
    }

    public static /* synthetic */ FileSystemException f() {
        return new FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.");
    }

    public static /* synthetic */ FileSystemLoopException g(String str) {
        return new FileSystemLoopException(str);
    }

    public static /* synthetic */ void h() {
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ void j() {
    }

    public static /* synthetic */ void k() {
    }
}
