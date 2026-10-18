package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.l;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class d {
    public final Uri a;

    public d(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return l.equal(((d) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return l.hashCode(this.a);
    }
}
