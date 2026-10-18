package com.bumptech.glide.load.model;

import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class m<A, B> {
    private final com.bumptech.glide.util.h<b<A>, B> a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b<A> {
        private static final Queue<b<?>> d = com.bumptech.glide.util.l.createQueue(0);
        private int a;
        private int b;
        private A c;

        private b() {
        }

        public static <A> b<A> get(A a, int i, int i2) {
            b<A> bVar;
            Queue<b<?>> queue = d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.init(a, i, i2);
            return bVar;
        }

        private void init(A a, int i, int i2) {
            this.c = a;
            this.b = i;
            this.a = i2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.b == bVar.b && this.a == bVar.a && this.c.equals(bVar.c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
        }

        public void release() {
            Queue<b<?>> queue = d;
            synchronized (queue) {
                queue.offer(this);
            }
        }
    }

    public m(long j) {
        this.a = new a(j);
    }

    public void clear() {
        this.a.clearMemory();
    }

    public B get(A a2, int i, int i2) {
        b<A> bVar = b.get(a2, i, i2);
        B b2 = this.a.get(bVar);
        bVar.release();
        return b2;
    }

    public void put(A a2, int i, int i2, B b2) {
        this.a.put(b.get(a2, i, i2), b2);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a extends com.bumptech.glide.util.h<b<A>, B> {
        public a(long j) {
            super(j);
        }

        @Override // com.bumptech.glide.util.h
        public void onItemEvicted(b<A> bVar, B b) {
            bVar.release();
        }
    }

    public m() {
        this(250L);
    }
}
