package com.google.android.datatransport;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e<T> {
    public static <T> e<T> ofData(int i, T t, g gVar, f fVar) {
        return new a(Integer.valueOf(i), t, Priority.DEFAULT, gVar, fVar);
    }

    public static <T> e<T> ofTelemetry(int i, T t, g gVar, f fVar) {
        return new a(Integer.valueOf(i), t, Priority.VERY_LOW, gVar, fVar);
    }

    public static <T> e<T> ofUrgent(int i, T t, g gVar, f fVar) {
        return new a(Integer.valueOf(i), t, Priority.HIGHEST, gVar, fVar);
    }

    public abstract Integer getCode();

    public abstract f getEventContext();

    public abstract T getPayload();

    public abstract Priority getPriority();

    public abstract g getProductData();

    public static <T> e<T> ofData(int i, T t, g gVar) {
        return new a(Integer.valueOf(i), t, Priority.DEFAULT, gVar, null);
    }

    public static <T> e<T> ofTelemetry(int i, T t, g gVar) {
        return new a(Integer.valueOf(i), t, Priority.VERY_LOW, gVar, null);
    }

    public static <T> e<T> ofUrgent(int i, T t, g gVar) {
        return new a(Integer.valueOf(i), t, Priority.HIGHEST, gVar, null);
    }

    public static <T> e<T> ofData(int i, T t, f fVar) {
        return new a(Integer.valueOf(i), t, Priority.DEFAULT, null, fVar);
    }

    public static <T> e<T> ofTelemetry(int i, T t, f fVar) {
        return new a(Integer.valueOf(i), t, Priority.VERY_LOW, null, fVar);
    }

    public static <T> e<T> ofUrgent(int i, T t, f fVar) {
        return new a(Integer.valueOf(i), t, Priority.HIGHEST, null, fVar);
    }

    public static <T> e<T> ofData(int i, T t) {
        return new a(Integer.valueOf(i), t, Priority.DEFAULT, null, null);
    }

    public static <T> e<T> ofTelemetry(int i, T t) {
        return new a(Integer.valueOf(i), t, Priority.VERY_LOW, null, null);
    }

    public static <T> e<T> ofUrgent(int i, T t) {
        return new a(Integer.valueOf(i), t, Priority.HIGHEST, null, null);
    }

    public static <T> e<T> ofData(T t, g gVar, f fVar) {
        return new a(null, t, Priority.DEFAULT, gVar, fVar);
    }

    public static <T> e<T> ofTelemetry(T t, g gVar, f fVar) {
        return new a(null, t, Priority.VERY_LOW, gVar, fVar);
    }

    public static <T> e<T> ofUrgent(T t, g gVar, f fVar) {
        return new a(null, t, Priority.HIGHEST, gVar, fVar);
    }

    public static <T> e<T> ofData(T t, g gVar) {
        return new a(null, t, Priority.DEFAULT, gVar, null);
    }

    public static <T> e<T> ofTelemetry(T t, g gVar) {
        return new a(null, t, Priority.VERY_LOW, gVar, null);
    }

    public static <T> e<T> ofUrgent(T t, g gVar) {
        return new a(null, t, Priority.HIGHEST, gVar, null);
    }

    public static <T> e<T> ofData(T t, f fVar) {
        return new a(null, t, Priority.DEFAULT, null, fVar);
    }

    public static <T> e<T> ofTelemetry(T t, f fVar) {
        return new a(null, t, Priority.VERY_LOW, null, fVar);
    }

    public static <T> e<T> ofUrgent(T t, f fVar) {
        return new a(null, t, Priority.HIGHEST, null, fVar);
    }

    public static <T> e<T> ofData(T t) {
        return new a(null, t, Priority.DEFAULT, null, null);
    }

    public static <T> e<T> ofTelemetry(T t) {
        return new a(null, t, Priority.VERY_LOW, null, null);
    }

    public static <T> e<T> ofUrgent(T t) {
        return new a(null, t, Priority.HIGHEST, null, null);
    }
}
