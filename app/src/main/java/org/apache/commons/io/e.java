package org.apache.commons.io;

import java.io.File;
import java.util.function.BooleanSupplier;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e implements org.apache.commons.io.function.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ File b;
    public final /* synthetic */ long c;

    public /* synthetic */ e(File file, long j, int i) {
        this.a = i;
        this.b = file;
        this.c = j;
    }

    @Override // org.apache.commons.io.function.k
    public final BooleanSupplier asBooleanSupplier() {
        switch (this.a) {
            case 0:
                break;
        }
        return new org.apache.commons.io.function.j(this);
    }

    @Override // org.apache.commons.io.function.k
    public final boolean getAsBoolean() {
        int i = this.a;
        long j = this.c;
        File file = this.b;
        switch (i) {
            case 0:
                return o.lambda$isFileNewer$4(file, j);
            default:
                return o.lambda$isFileOlder$7(file, j);
        }
    }
}
