package com.google.zxing;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class NotFoundException extends ReaderException {
    private static final NotFoundException a;

    static {
        NotFoundException notFoundException = new NotFoundException();
        a = notFoundException;
        notFoundException.setStackTrace(ReaderException.NO_TRACE);
    }

    private NotFoundException() {
    }

    public static NotFoundException getNotFoundInstance() {
        return ReaderException.isStackTrace ? new NotFoundException() : a;
    }
}
