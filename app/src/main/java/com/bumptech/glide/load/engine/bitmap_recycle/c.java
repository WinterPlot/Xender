package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.l;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
abstract class c<T extends l> {
    private final Queue<T> a = com.bumptech.glide.util.l.createQueue(20);

    public abstract T create();

    public T get() {
        T tPoll = this.a.poll();
        return tPoll == null ? (T) create() : tPoll;
    }

    public void offer(T t) {
        if (this.a.size() < 20) {
            this.a.offer(t);
        }
    }
}
