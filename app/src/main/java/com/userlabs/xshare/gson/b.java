package com.userlabs.xshare.gson;

import java.lang.annotation.Annotation;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class b implements com.google.gson.a {
    @Override // com.google.gson.a
    public boolean shouldSkipClass(Class<?> cls) {
        return false;
    }

    @Override // com.google.gson.a
    public boolean shouldSkipField(com.google.gson.b bVar) {
        Iterator<Annotation> it = bVar.getAnnotations().iterator();
        while (it.hasNext()) {
            if (it.next().annotationType() == a.class) {
                return true;
            }
        }
        return false;
    }
}
