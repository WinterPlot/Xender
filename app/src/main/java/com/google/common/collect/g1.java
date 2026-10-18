package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface g1<K, V> extends j1<K, V> {
    Map<K, Collection<V>> asMap();

    @Override // com.google.common.collect.j1
    /* synthetic */ void clear();

    @Override // com.google.common.collect.j1, com.google.common.collect.x1
    /* synthetic */ boolean containsEntry(Object obj, Object obj2);

    @Override // com.google.common.collect.j1
    /* synthetic */ boolean containsKey(Object obj);

    @Override // com.google.common.collect.j1, com.google.common.collect.x1
    /* synthetic */ boolean containsValue(Object obj);

    @Override // com.google.common.collect.j1
    /* synthetic */ Collection entries();

    boolean equals(Object obj);

    /* bridge */ /* synthetic */ Collection get(Object obj);

    @Override // com.google.common.collect.j1, com.google.common.collect.g1
    List<V> get(K k);

    @Override // com.google.common.collect.j1, com.google.common.collect.x1
    /* synthetic */ boolean isEmpty();

    @Override // com.google.common.collect.j1, com.google.common.collect.x1
    /* synthetic */ Set keySet();

    @Override // com.google.common.collect.j1, com.google.common.collect.x1
    /* synthetic */ n1 keys();

    /* synthetic */ boolean put(Object obj, Object obj2);

    @Override // com.google.common.collect.j1, com.google.common.collect.x1
    /* synthetic */ boolean putAll(j1 j1Var);

    @Override // com.google.common.collect.j1, com.google.common.collect.x1
    /* synthetic */ boolean putAll(Object obj, Iterable iterable);

    @Override // com.google.common.collect.j1, com.google.common.collect.x1
    /* synthetic */ boolean remove(Object obj, Object obj2);

    /* bridge */ /* synthetic */ Collection removeAll(Object obj);
