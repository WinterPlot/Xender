package com.bumptech.glide.manager;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class q {
    private final Set<com.bumptech.glide.request.e> a = Collections.newSetFromMap(new WeakHashMap());
    private final Set<com.bumptech.glide.request.e> b = new HashSet();
    private boolean c;

    public void addRequest(com.bumptech.glide.request.e eVar) {
        this.a.add(eVar);
    }

    public boolean clearAndRemove(com.bumptech.glide.request.e eVar) {
        boolean z = true;
        if (eVar == null) {
            return true;
        }
        boolean zRemove = this.a.remove(eVar);
        if (!this.b.remove(eVar) && !zRemove) {
            z = false;
        }
        if (z) {
            eVar.clear();
        }
        return z;
    }

    public void clearRequests() {
        Iterator it = com.bumptech.glide.util.l.getSnapshot(this.a).iterator();
        while (it.hasNext()) {
            clearAndRemove((com.bumptech.glide.request.e) it.next());
        }
        this.b.clear();
    }

    public boolean isPaused() {
        return this.c;
    }

    public void pauseAllRequests() {
        this.c = true;
        for (com.bumptech.glide.request.e eVar : com.bumptech.glide.util.l.getSnapshot(this.a)) {
            if (eVar.isRunning() || eVar.isComplete()) {
                eVar.clear();
                this.b.add(eVar);
            }
        }
    }

    public void pauseRequests() {
        this.c = true;
        for (com.bumptech.glide.request.e eVar : com.bumptech.glide.util.l.getSnapshot(this.a)) {
            if (eVar.isRunning()) {
                eVar.pause();
                this.b.add(eVar);
            }
        }
    }

    public void restartRequests() {
        for (com.bumptech.glide.request.e eVar : com.bumptech.glide.util.l.getSnapshot(this.a)) {
            if (!eVar.isComplete() && !eVar.isCleared()) {
                eVar.clear();
                if (this.c) {
                    this.b.add(eVar);
                } else {
                    eVar.begin();
                }
            }
        }
    }

    public void resumeRequests() {
        this.c = false;
        for (com.bumptech.glide.request.e eVar : com.bumptech.glide.util.l.getSnapshot(this.a)) {
            if (!eVar.isComplete() && !eVar.isRunning()) {
                eVar.begin();
            }
        }
        this.b.clear();
    }

    public void runRequest(com.bumptech.glide.request.e eVar) {
        this.a.add(eVar);
        if (!this.c) {
            eVar.begin();
            return;
        }
        eVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.b.add(eVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.a.size() + ", isPaused=" + this.c + "}";
    }
}
