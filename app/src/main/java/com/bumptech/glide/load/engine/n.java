package com.bumptech.glide.load.engine;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
class n<Z> implements s<Z> {
    private final boolean a;
    private final boolean b;
    private final s<Z> c;
    private final a d;
    private final com.bumptech.glide.load.c e;
    private int f;
    private boolean g;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a {
        void onResourceReleased(com.bumptech.glide.load.c cVar, n<?> nVar);
    }

    public n(s<Z> sVar, boolean z, boolean z2, com.bumptech.glide.load.c cVar, a aVar) {
        this.c = (s) com.bumptech.glide.util.k.checkNotNull(sVar);
        this.a = z;
        this.b = z2;
        this.e = cVar;
        this.d = (a) com.bumptech.glide.util.k.checkNotNull(aVar);
    }

    public synchronized void acquire() {
        if (this.g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f++;
    }

    @Override // com.bumptech.glide.load.engine.s
    public Z get() {
        return this.c.get();
    }

    public s<Z> getResource() {
        return this.c;
    }

    @Override // com.bumptech.glide.load.engine.s
    public Class<Z> getResourceClass() {
        return this.c.getResourceClass();
    }

    @Override // com.bumptech.glide.load.engine.s
    public int getSize() {
        return this.c.getSize();
    }

    public boolean isMemoryCacheable() {
        return this.a;
    }

    @Override // com.bumptech.glide.load.engine.s
    public synchronized void recycle() {
        if (this.f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.g = true;
        if (this.b) {
            this.c.recycle();
        }
    }

    public void release() {
        boolean z;
        synchronized (this) {
            int i = this.f;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.d.onResourceReleased(this.e, this);
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.d + ", key=" + this.e + ", acquired=" + this.f + ", isRecycled=" + this.g + ", resource=" + this.c + '}';
    }
}
