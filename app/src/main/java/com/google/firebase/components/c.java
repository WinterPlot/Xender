package com.google.firebase.components;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface c {
    <T> T get(w<T> wVar);

    <T> T get(Class<T> cls);

    <T> com.google.firebase.inject.a<T> getDeferred(w<T> wVar);

    <T> com.google.firebase.inject.a<T> getDeferred(Class<T> cls);

    <T> com.google.firebase.inject.b<T> getProvider(w<T> wVar);

    <T> com.google.firebase.inject.b<T> getProvider(Class<T> cls);

    <T> Set<T> setOf(w<T> wVar);

    <T> Set<T> setOf(Class<T> cls);

    <T> com.google.firebase.inject.b<Set<T>> setOfProvider(w<T> wVar);

    <T> com.google.firebase.inject.b<Set<T>> setOfProvider(Class<T> cls);
}
