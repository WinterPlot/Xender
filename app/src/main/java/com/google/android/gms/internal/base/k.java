package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface k {
    ExecutorService zaa(int i, int i2);

    ExecutorService zab(int i, ThreadFactory threadFactory, int i2);

    ExecutorService zac(ThreadFactory threadFactory, int i);
}
