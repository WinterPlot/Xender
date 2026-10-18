package com.userlabs.xshare.fastdownloader;

import com.userlabs.xshare.fastdownloader.model.exceptions.InsufficientStorageException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static boolean canRetryThrowable(Throwable th) {
        return (!(th instanceof IOException) || (th instanceof InsufficientStorageException) || (th.getMessage() == null ? "" : th.getMessage()).contains("ENOSPC")) ? false : true;
    }

    public static int getRetryCount() {
        return 3;
    }

    public static long getRetryInterval() {
        return 3000L;
    }
}
