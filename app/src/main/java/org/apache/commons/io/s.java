package org.apache.commons.io;

import j$.util.Objects;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class s extends RandomAccessFile {
    private final File a;
    private final String b;

    public s(String str, String str2) throws FileNotFoundException {
        super(str, str2);
        this.a = str != null ? new File(str) : null;
        this.b = str2;
    }

    public File getFile() {
        return this.a;
    }

    public String getMode() {
        return this.b;
    }

    public String toString() {
        return Objects.toString(this.a);
    }

    public s(File file, String str) throws FileNotFoundException {
        super(file, str);
        this.a = file;
        this.b = str;
    }
}
