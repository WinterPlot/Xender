package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.attribute.BasicFileAttributes;
import org.apache.commons.io.file.i;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public interface g extends FileFilter, FilenameFilter, i, PathMatcher {
    public static final String[] q0 = new String[0];

    FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes);

    @Override // java.io.FileFilter
    boolean accept(File file);

    boolean accept(File file, String str);

    g and(g gVar);

    boolean matches(Path path);

    g negate();

    g or(g gVar);
}
