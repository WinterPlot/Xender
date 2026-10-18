package com.bumptech.glide.load.resource.transcode;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class f {
    private final List<a<?, ?>> a = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a<Z, R> {
        final Class<Z> a;
        final Class<R> b;
        final e<Z, R> c;

        public a(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
            this.a = cls;
            this.b = cls2;
            this.c = eVar;
        }

        public boolean handles(Class<?> cls, Class<?> cls2) {
            return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.b);
        }
    }

    public synchronized <Z, R> e<Z, R> get(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.get();
        }
        for (a<?, ?> aVar : this.a) {
            if (aVar.handles(cls, cls2)) {
                return (e<Z, R>) aVar.c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized <Z, R> List<Class<R>> getTranscodeClasses(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> aVar : this.a) {
            if (aVar.handles(cls, cls2) && !arrayList.contains(aVar.b)) {
                arrayList.add(aVar.b);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void register(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
        this.a.add(new a<>(cls, cls2, eVar));
    }
}
