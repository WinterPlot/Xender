package com.google.firebase.concurrent;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface t extends ScheduledExecutorService, r {
    @Override // com.google.firebase.concurrent.r, com.google.firebase.concurrent.p
    /* synthetic */ boolean isPaused();

    @Override // com.google.firebase.concurrent.r, com.google.firebase.concurrent.p
    /* synthetic */ void pause();

    @Override // com.google.firebase.concurrent.r, com.google.firebase.concurrent.p
    /* synthetic */ void resume();
}
