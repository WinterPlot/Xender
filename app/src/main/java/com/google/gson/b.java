package com.google.gson;

import j$.util.Objects;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {
    private final Field a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.a = field;
    }

    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        return (T) this.a.getAnnotation(cls);
    }

    public Collection<Annotation> getAnnotations() {
        return Arrays.asList(this.a.getAnnotations());
    }

    public Class<?> getDeclaredClass() {
        return this.a.getType();
    }

    public Type getDeclaredType() {
        return this.a.getGenericType();
    }

    public Class<?> getDeclaringClass() {
        return this.a.getDeclaringClass();
    }

    public String getName() {
        return this.a.getName();
    }

    public boolean hasModifier(int i) {
        return (this.a.getModifiers() & i) != 0;
    }

    public String toString() {
        return this.a.toString();
    }
}
