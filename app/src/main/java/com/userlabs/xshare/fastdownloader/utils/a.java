package com.userlabs.xshare.fastdownloader.utils;

import android.system.ErrnoException;
import android.system.OsConstants;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static boolean isStorageSpaceException(Throwable th) {
        String message;
        String message2;
        if (th == null) {
            return false;
        }
        if ((th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.ENOSPC) {
            return true;
        }
        Throwable cause = th.getCause();
        if ((cause instanceof ErrnoException) && ((ErrnoException) cause).errno == OsConstants.ENOSPC) {
            return true;
        }
        if ((th instanceof IOException) && (message2 = th.getMessage()) != null) {
            String lowerCase = message2.toLowerCase(Locale.getDefault());
            return lowerCase.contains("no space") || lowerCase.contains("space left") || lowerCase.contains("insufficient space");
        }
        if (!(th instanceof IllegalStateException) || (message = th.getMessage()) == null) {
            return false;
        }
        String lowerCase2 = message.toLowerCase(Locale.getDefault());
        return lowerCase2.contains("no space") || lowerCase2.contains("space left") || lowerCase2.contains("insufficient space");
    }
}
