package com.google.firebase.installations.remote;

import com.google.firebase.installations.k;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
class d {
    private static final long d = 86400000;
    private static final long e = 1800000;
    private final k a;
    private long b;
    private int c;

    public d() {
        this.a = k.getInstance();
    }

    private synchronized long getBackoffDuration(int i) {
        if (isRetryableError(i)) {
            return (long) Math.min(Math.pow(2.0d, this.c) + this.a.getRandomDelayForSyncPrevention(), e);
        }
        return d;
    }

    private static boolean isRetryableError(int i) {
        if (i != 429) {
            return i >= 500 && i < 600;
        }
        return true;
    }

    private static boolean isSuccessfulOrRequiresNewFidCreation(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    private synchronized void resetBackoffStrategy() {
        this.c = 0;
    }

    public synchronized boolean isRequestAllowed() {
        return this.c == 0 || this.a.currentTimeInMillis() > this.b;
    }

    public synchronized void setNextRequestTime(int i) {
        if (isSuccessfulOrRequiresNewFidCreation(i)) {
            resetBackoffStrategy();
            return;
        }
        this.c++;
        this.b = this.a.currentTimeInMillis() + getBackoffDuration(i);
    }

    public d(k kVar) {
        this.a = kVar;
    }
}
