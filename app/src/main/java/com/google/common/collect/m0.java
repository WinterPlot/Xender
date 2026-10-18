package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
interface m0<K, V> extends j1<K, V> {
    @Override // com.google.common.collect.j1, com.google.common.collect.g1
    /* synthetic */ Map asMap();

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

    com.google.common.base.n<? super Map.Entry<K, V>> entryPredicate();

    @Override // com.google.common.collect.j1, com.google.common.collect.g1
    /* synthetic */ Collection get(Object obj);

    @Override // com.google.common.collect.j1, com.google.common.collect.x1
    /* synthetic */ boolean isEmpty();

    @Override // com.google.common.collect.j1, com.google.common.collect.x1
    /* synthetic */ Set keySet();

    @Override // com.google.common.collect.j1, com.google.common.collect.x1
    /* synthetic */ n1 keys();

    @Override // com.google.common.collect.j1, com.google.common.collect.g1
    /* synthetic */ boolean put(Object obj, Object obj2);

    @Override // com.google.common.collect.j1, com.google.common.collect.x1
    /* synthetic */ boolean putAll(j1 j1Var);

    @Override // com.google.common.collect.j1, com.google.common.collect.x1
    /* synthetic */ boolean putAll(Object obj, Iterable iterable);

    @Override // com.google.common.collect.j1, com.google.common.collect.x1
    /* synthetic */ boolean remove(Object obj, Object obj2);

    @Override // com.google.common.collect.j1, com.google.common.collect.g1
    /* synthetic */ Collection removeAll(Object obj);

    @Override // com.google.common.collect.j1, com.google.common.collect.g1
    /* synthetic */ Collection replaceValues(Object obj, Iterable iterable);

    @Override // com.google.common.collect.j1
    /* synthetic */ int size();

    j1<K, V> unfiltered();

    @Override // com.google.common.collect.j1
    /* synthetic */ Collection values();
}
