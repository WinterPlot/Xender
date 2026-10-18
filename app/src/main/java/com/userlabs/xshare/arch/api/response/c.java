package com.userlabs.xshare.arch.api.response;

import android.text.TextUtils;
import java.io.IOException;
import retrofit2.u;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class c<T> {
    public static <T> c<T> create(u<T> uVar) {
        if (uVar.isSuccessful()) {
            T tBody = uVar.body();
            return (tBody == null || uVar.code() == 204) ? new a() : new d(tBody, uVar.headers().get("link"));
        }
        String strMessage = "unknown error";
        try {
            if (uVar.errorBody() != null && TextUtils.isEmpty(uVar.errorBody().string())) {
                strMessage = uVar.message();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new b(strMessage);
    }

    public static <T> b<T> create(Throwable th) {
        return new b<>(TextUtils.isEmpty(th.getMessage()) ? "unknown error" : th.getMessage());
    }
}
