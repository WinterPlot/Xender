package com.google.firebase.platforminfo;

import androidx.camera.camera2.pipe.w;
import javax.annotation.Nonnull;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class a extends e {
    private final String a;
    private final String b;

    public a(String str, String str2) {
        if (str == null) {
            com.google.gson.internal.a.j("Null libraryName");
            throw null;
        }
        this.a = str;
        if (str2 != null) {
            this.b = str2;
        } else {
            com.google.gson.internal.a.j("Null version");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.a.equals(eVar.getLibraryName()) && this.b.equals(eVar.getVersion())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.platforminfo.e
    @Nonnull
    public String getLibraryName() {
        return this.a;
    }

    @Override // com.google.firebase.platforminfo.e
    @Nonnull
    public String getVersion() {
        return this.b;
    }

    public int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        return w.t(sb, this.b, "}");
    }
}
