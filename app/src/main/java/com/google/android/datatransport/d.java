package com.google.android.datatransport;

import androidx.camera.camera2.pipe.w;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    private final String a;

    private d(String str) {
        if (str != null) {
            this.a = str;
        } else {
            com.google.gson.internal.a.j("name is null");
            throw null;
        }
    }

    public static d of(String str) {
        return new d(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return this.a.equals(((d) obj).a);
        }
        return false;
    }

    public String getName() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return w.t(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
