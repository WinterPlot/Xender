package com.google.common.collect;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i2 implements com.google.common.base.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Synchronized.SynchronizedTable b;

    public /* synthetic */ i2(Synchronized.SynchronizedTable synchronizedTable, int i) {
        this.a = i;
        this.b = synchronizedTable;
    }

    @Override // com.google.common.base.e
    public final Object apply(Object obj) {
        int i = this.a;
        Synchronized.SynchronizedTable synchronizedTable = this.b;
        Map map = (Map) obj;
        switch (i) {
            case 0:
                return synchronizedTable.lambda$rowMap$0(map);
            default:
                return synchronizedTable.lambda$columnMap$0(map);
        }
    }
}
