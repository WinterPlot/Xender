package com.google.android.gms.internal.gcm;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
public class f extends Handler {
    public f() {
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        super.dispatchMessage(message);
    }

    public f(Looper looper) {
        super(looper);
    }

    public f(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}
