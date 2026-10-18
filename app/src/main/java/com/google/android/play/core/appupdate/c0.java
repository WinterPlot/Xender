package com.google.android.play.core.appupdate;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final class c0 extends d {
    private final int a;
    private final boolean b;

    public /* synthetic */ c0(int i, boolean z, b0 b0Var) {
        this.a = i;
        this.b = z;
    }

    @Override // com.google.android.play.core.appupdate.d
    public final boolean allowAssetPackDeletion() {
        return this.b;
    }

    @Override // com.google.android.play.core.appupdate.d
    public final int appUpdateType() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.a == dVar.appUpdateType() && this.b == dVar.allowAssetPackDeletion()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=" + this.a + ", allowAssetPackDeletion=" + this.b + "}";
    }
}
