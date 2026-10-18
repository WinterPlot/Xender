package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class c<R> implements d<R> {
    static final c<?> a = new c<>();
    private static final e<?> b = new a();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a<R> implements e<R> {
        @Override // com.bumptech.glide.request.transition.e
        public d<R> build(DataSource dataSource, boolean z) {
            return c.a;
        }
    }

    public static <R> d<R> get() {
        return a;
    }

    public static <R> e<R> getFactory() {
        return (e<R>) b;
    }

    @Override // com.bumptech.glide.request.transition.d
    public boolean transition(Object obj, d.a aVar) {
        return false;
    }
}
