package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface d0<V> extends ScheduledFuture<V>, ListenableFuture<V> {
    @Override // com.google.common.util.concurrent.ListenableFuture
    /* synthetic */ void addListener(Runnable runnable, Executor executor);
}
