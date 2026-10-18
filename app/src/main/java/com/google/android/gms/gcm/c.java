package com.google.android.gms.gcm;

import android.net.Uri;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class c {
    private final String a;
    private final Bundle b;
    private final List<Uri> c;
    private final long d;

    public c(String str, Bundle bundle, long j, List<Uri> list) {
        this.a = str;
        this.b = bundle;
        this.d = j;
        this.c = list;
    }

    public Bundle getExtras() {
        return this.b;
    }

    public String getTag() {
        return this.a;
    }

    public c(String str, Bundle bundle) {
        this(str, bundle, null);
    }

    public c(String str, Bundle bundle, List<Uri> list) {
        this(str, bundle, 180L, list);
    }

    public c(String str) {
        this(str, null);
    }
}
