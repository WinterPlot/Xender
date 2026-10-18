package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class w1 {
    private w1() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void populateMap(Map<K, V> map, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void populateMultimap(j1<K, V> j1Var, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            Collection collection = j1Var.get(objectInputStream.readObject());
            int i3 = objectInputStream.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> void populateMultiset(n1<E> n1Var, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            n1Var.add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    public static <K, V> void writeMap(Map<K, V> map, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public static <K, V> void writeMultimap(j1<K, V> j1Var, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(j1Var.asMap().size());
        for (Map.Entry<K, Collection<V>> entry : j1Var.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public static <E> void writeMultiset(n1<E> n1Var, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(n1Var.entrySet().size());
        for (n1.a<E> aVar : n1Var.entrySet()) {
            objectOutputStream.writeObject(aVar.getElement());
            objectOutputStream.writeInt(aVar.getCount());
        }
    }

    public static <K, V> void populateMap(Map<K, V> map, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        populateMap(map, objectInputStream, objectInputStream.readInt());
    }

    public static <E> void populateMultiset(n1<E> n1Var, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        populateMultiset(n1Var, objectInputStream, objectInputStream.readInt());
    }

    public static <K, V> void populateMultimap(j1<K, V> j1Var, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        populateMultimap(j1Var, objectInputStream, objectInputStream.readInt());
    }
}
