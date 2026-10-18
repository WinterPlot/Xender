package com.google.common.reflect;

import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements com.google.common.base.e {
    public final /* synthetic */ Types.JavaVersion a;

    @Override // com.google.common.base.e
    public final Object apply(Object obj) {
        return this.a.typeName((Type) obj);
    }
}
