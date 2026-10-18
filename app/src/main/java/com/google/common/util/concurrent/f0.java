package com.google.common.util.concurrent;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface f0 extends ScheduledExecutorService, e0 {
    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.e0
    /* synthetic */ List invokeAll(Collection collection) throws InterruptedException;

    @Override // java.util.concurrent.ExecutorService, com.google.common.util.concurrent.e0
    /* synthetic */ List invokeAll(Collection collection, long j, TimeUnit timeUnit) throws InterruptedException;

    @Override // java.util.concurrent.ScheduledExecutorService
    d0<?> schedule(Runnable runnable, long j, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    <V> d0<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit);
