package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
final class h extends SimpleFileVisitor<Path> {
    private final kotlin.jvm.functions.p<Path, BasicFileAttributes, FileVisitResult> a;
    private final kotlin.jvm.functions.p<Path, BasicFileAttributes, FileVisitResult> b;
    private final kotlin.jvm.functions.p<Path, IOException, FileVisitResult> c;
    private final kotlin.jvm.functions.p<Path, IOException, FileVisitResult> d;

    /* JADX WARN: Multi-variable type inference failed */
    public h(kotlin.jvm.functions.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar, kotlin.jvm.functions.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar2, kotlin.jvm.functions.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar3, kotlin.jvm.functions.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar4) {
        this.a = pVar;
        this.b = pVar2;
        this.c = pVar3;
        this.d = pVar4;
    }

    public FileVisitResult postVisitDirectory(Path path, IOException iOException) throws IOException {
        FileVisitResult fileVisitResultD;
        path.getClass();
        kotlin.jvm.functions.p<Path, IOException, FileVisitResult> pVar = this.d;
        if (pVar != null && (fileVisitResultD = b.d(pVar.invoke(path, iOException))) != null) {
            return fileVisitResultD;
        }
        FileVisitResult fileVisitResultPostVisitDirectory = super.postVisitDirectory(path, iOException);
        fileVisitResultPostVisitDirectory.getClass();
        return fileVisitResultPostVisitDirectory;
    }

    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        FileVisitResult fileVisitResultD;
        path.getClass();
        basicFileAttributes.getClass();
        kotlin.jvm.functions.p<Path, BasicFileAttributes, FileVisitResult> pVar = this.a;
        if (pVar != null && (fileVisitResultD = b.d(pVar.invoke(path, basicFileAttributes))) != null) {
            return fileVisitResultD;
        }
        FileVisitResult fileVisitResultPreVisitDirectory = super.preVisitDirectory(path, basicFileAttributes);
        fileVisitResultPreVisitDirectory.getClass();
        return fileVisitResultPreVisitDirectory;
    }

    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        FileVisitResult fileVisitResultD;
        path.getClass();
        basicFileAttributes.getClass();
        kotlin.jvm.functions.p<Path, BasicFileAttributes, FileVisitResult> pVar = this.b;
        if (pVar != null && (fileVisitResultD = b.d(pVar.invoke(path, basicFileAttributes))) != null) {
            return fileVisitResultD;
        }
        FileVisitResult fileVisitResultVisitFile = super.visitFile(path, basicFileAttributes);
        fileVisitResultVisitFile.getClass();
        return fileVisitResultVisitFile;
    }

    public FileVisitResult visitFileFailed(Path path, IOException iOException) throws IOException {
        FileVisitResult fileVisitResultD;
        path.getClass();
        iOException.getClass();
        kotlin.jvm.functions.p<Path, IOException, FileVisitResult> pVar = this.c;
        if (pVar != null && (fileVisitResultD = b.d(pVar.invoke(path, iOException))) != null) {
            return fileVisitResultD;
        }
        FileVisitResult fileVisitResultVisitFileFailed = super.visitFileFailed(path, iOException);
        fileVisitResultVisitFileFailed.getClass();
        return fileVisitResultVisitFileFailed;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        return postVisitDirectory(b.f(obj), iOException);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return preVisitDirectory(b.f(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return visitFile(b.f(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFileFailed(Object obj, IOException iOException) {
        return visitFileFailed(b.f(obj), iOException);
    }
}
