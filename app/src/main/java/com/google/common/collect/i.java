package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface i<K, V> extends Map<K, V> {
    V forcePut(K k, V v);

    i<V, K> inverse();

    @Override // java.util.Map
    V put(K k, V v);

    @Override // java.util.Map
    void putAll(Map<? extends K, ? extends V> map);

    /* bridge */ /* synthetic */ Collection values();
