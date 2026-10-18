package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v0<K, V> extends y0 implements j1<K, V> {
    public Map<K, Collection<V>> asMap() {
        return delegate().asMap();
    }

    public void clear() {
        delegate().clear();
    }

    @Override // com.google.common.collect.j1, com.google.common.collect.x1
    public boolean containsEntry(Object obj, Object obj2) {
        return delegate().containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.j1
    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    @Override // com.google.common.collect.j1, com.google.common.collect.x1
    public boolean containsValue(Object obj) {
        return delegate().containsValue(obj);
    }

    @Override // com.google.common.collect.y0
    public abstract j1<K, V> delegate();

    public Collection<Map.Entry<K, V>> entries() {
        return delegate().entries();
    }

    @Override // com.google.common.collect.j1, com.google.common.collect.g1
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public Collection<V> get(K k) {
        return delegate().get(k);
    }

    @Override // com.google.common.collect.j1
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // com.google.common.collect.j1, com.google.common.collect.x1
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Set<K> keySet() {
        return delegate().keySet();
    }

    public n1<K> keys() {
        return delegate().keys();
    }

    public boolean put(K k, V v) {
        return delegate().put(k, v);
    }

    public boolean putAll(K k, Iterable<? extends V> iterable) {
        return delegate().putAll(k, iterable);
    }

    public boolean remove(Object obj, Object obj2) {
        return delegate().remove(obj, obj2);
    }

    public Collection<V> removeAll(Object obj) {
        return delegate().removeAll(obj);
    }

    public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return delegate().replaceValues(k, iterable);
    }

    @Override // com.google.common.collect.j1
    public int size() {
        return delegate().size();
    }

    public Collection<V> values() {
        return delegate().values();
    }

    public boolean putAll(j1<? extends K, ? extends V> j1Var) {
        return delegate().putAll(j1Var);
    }
}
