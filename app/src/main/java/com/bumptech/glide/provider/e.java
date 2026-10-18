package com.bumptech.glide.provider;

import com.bumptech.glide.load.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class e {
    private final List<String> a = new ArrayList();
    private final Map<String, List<a<?, ?>>> b = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a<T, R> {
        private final Class<T> a;
        final Class<R> b;
        final g<T, R> c;

        public a(Class<T> cls, Class<R> cls2, g<T, R> gVar) {
            this.a = cls;
            this.b = cls2;
            this.c = gVar;
        }

        public boolean handles(Class<?> cls, Class<?> cls2) {
            return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.b);
        }
    }

    private synchronized List<a<?, ?>> getOrAddEntryList(String str) {
        List<a<?, ?>> arrayList;
        try {
            if (!this.a.contains(str)) {
                this.a.add(str);
            }
            arrayList = this.b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.b.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized <T, R> void append(String str, g<T, R> gVar, Class<T> cls, Class<R> cls2) {
        getOrAddEntryList(str).add(new a<>(cls, cls2, gVar));
    }

    public synchronized <T, R> List<g<T, R>> getDecoders(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.handles(cls, cls2)) {
                        arrayList.add(aVar.c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> List<Class<R>> getResourceClasses(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.handles(cls, cls2) && !arrayList.contains(aVar.b)) {
                        arrayList.add(aVar.b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> void prepend(String str, g<T, R> gVar, Class<T> cls, Class<R> cls2) {
        getOrAddEntryList(str).add(0, new a<>(cls, cls2, gVar));
    }

    public synchronized void setBucketPriorityList(List<String> list) {
        try {
            ArrayList arrayList = new ArrayList(this.a);
            this.a.clear();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.a.add(it.next());
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String str = (String) obj;
                if (!list.contains(str)) {
                    this.a.add(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
