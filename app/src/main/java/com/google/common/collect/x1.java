package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface x1<K, V> extends j1<K, V> {
    @Override // com.google.common.collect.j1, com.google.common.collect.g1
    Map<K, Collection<V>> asMap();

    @Override // com.google.common.collect.j1
    /* synthetic */ void clear();

    /* synthetic */ boolean containsEntry(Object obj, Object obj2);

    @Override // com.google.common.collect.j1
    /* synthetic */ boolean containsKey(Object obj);

    /* synthetic */ boolean containsValue(Object obj);

    @Override // com.google.common.collect.j1
    /* bridge */ /* synthetic */ Collection entries();
