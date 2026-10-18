package org.apache.commons.io;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public class FileExistsException extends IOException {
    private static final long serialVersionUID = 1;

    public FileExistsException(File file) {
        super("File " + file + " exists");
    }

    public FileExistsException() {
    }

    public FileExistsException(String str) {
        super(str);
    }
}
