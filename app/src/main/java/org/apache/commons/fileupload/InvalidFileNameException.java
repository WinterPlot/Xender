package org.apache.commons.fileupload;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public class InvalidFileNameException extends RuntimeException {
    private static final long serialVersionUID = 7922042602454350470L;
    private final String name;

    public InvalidFileNameException(String str, String str2) {
        super(str2);
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
