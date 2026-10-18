package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public interface f {
    void onPostVisitDirectory(kotlin.jvm.functions.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar);

    void onPreVisitDirectory(kotlin.jvm.functions.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar);

    void onVisitFile(kotlin.jvm.functions.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar);

    void onVisitFileFailed(kotlin.jvm.functions.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar);
}
