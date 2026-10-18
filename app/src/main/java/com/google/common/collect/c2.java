package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface c2<E> extends d2<E>, z1<E> {
    @Override // com.google.common.collect.d2, com.google.common.collect.n1
    /* synthetic */ int add(Object obj, int i);

    @Override // com.google.common.collect.d2, com.google.common.collect.n1, java.util.Collection
    /* synthetic */ boolean add(Object obj);

    Comparator<? super E> comparator();

    @Override // com.google.common.collect.d2, com.google.common.collect.n1, java.util.Collection
    /* synthetic */ boolean contains(Object obj);

    @Override // com.google.common.collect.d2, com.google.common.collect.n1, java.util.Collection
    /* synthetic */ boolean containsAll(Collection collection);

    @Override // com.google.common.collect.d2, com.google.common.collect.n1
    /* synthetic */ int count(Object obj);

    c2<E> descendingMultiset();

    @Override // com.google.common.collect.d2, com.google.common.collect.n1
    NavigableSet<E> elementSet();
