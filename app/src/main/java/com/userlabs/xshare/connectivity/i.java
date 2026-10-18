package com.userlabs.xshare.connectivity;

import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a<T> implements b<T> {
        private volatile T a;
        final /* synthetic */ b b;

        public a(b bVar) {
            this.b = bVar;
        }

        @Override // com.userlabs.xshare.connectivity.i.b
        public T get() {
            if (this.a == null) {
                synchronized (this) {
                    try {
                        if (this.a == null) {
                            T t = (T) this.b.get();
                            Objects.requireNonNull(t);
                            this.a = t;
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

    private i() {
    }

    public static <T> b<T> memorize(b<T> bVar) {
        return new a(bVar);
    }
}
