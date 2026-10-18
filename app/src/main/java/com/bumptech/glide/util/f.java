package com.bumptech.glide.util;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a<T> implements b<T> {
        private volatile T a;
        final /* synthetic */ b b;

        public a(b bVar) {
            this.b = bVar;
        }

        @Override // com.bumptech.glide.util.f.b
        public T get() {
            if (this.a == null) {
                synchronized (this) {
                    try {
                        if (this.a == null) {
                            this.a = (T) k.checkNotNull(this.b.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface b<T> {
        T get();
    }

    private f() {
    }

    public static <T> b<T> memorize(b<T> bVar) {
        return new a(bVar);
    }
}
