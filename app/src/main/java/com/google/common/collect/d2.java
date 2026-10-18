package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
interface d2<E> extends n1<E> {
    @Override // com.google.common.collect.n1
    /* synthetic */ int add(Object obj, int i);

    @Override // com.google.common.collect.n1, java.util.Collection
    /* synthetic */ boolean add(Object obj);

    @Override // com.google.common.collect.n1, java.util.Collection
    /* synthetic */ boolean contains(Object obj);

    @Override // com.google.common.collect.n1, java.util.Collection
    /* synthetic */ boolean containsAll(Collection collection);

    @Override // com.google.common.collect.n1
    /* synthetic */ int count(Object obj);

    @Override // com.google.common.collect.n1
    /* bridge */ /* synthetic */ Set elementSet();
