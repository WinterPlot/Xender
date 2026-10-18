package com.userlabs.xshare.importdata.message;

import com.android.tools.r8.RecordTag;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends RecordTag {
    private static com.userlabs.xshare.livedata.a<h> b = new com.userlabs.xshare.livedata.a<>();
    private final SyncMessage a;

    public h(SyncMessage syncMessage) {
        this.a = syncMessage;
    }

    public static h getRequestDataTypePermissionEventValue() {
        return b.getValue();
    }

    public static com.userlabs.xshare.livedata.a<h> getRequestDataTypePermissionEvents() {
        return b;
    }

    public static void post(h hVar) {
        b.postValue(hVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h) && Objects.equals(this.a, ((h) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public SyncMessage msg() {
        return this.a;
    }

    public final String toString() {
        Object[] objArr = {this.a};
        String[] strArrSplit = "a".length() == 0 ? new String[0] : "a".split(";");
        StringBuilder sb = new StringBuilder(h.class.getSimpleName());
        sb.append("[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
