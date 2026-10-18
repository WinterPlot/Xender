package com.userlabs.xshare.arch.vo;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a<T> {
    private String a;
    private int b;
    private T c;
    private String d;
    private int e = -1;
    private Object f;

    public a(String str, int i, T t) {
        this.a = str;
        this.b = i;
        this.c = t;
    }

    public static <T> a<T> copy(a<T> aVar) {
        return new a<>(aVar != null ? aVar.getErrorMessage() : "", aVar != null ? aVar.getStatus() : 2, aVar != null ? aVar.getData() : null);
    }

    public static <T> a<T> error(String str, T t) {
        return new a<>(str, -1, t);
    }

    public static <T> a<T> loading(T t) {
        return new a<>(null, 1, t);
    }

    public static <T> a<T> success(T t) {
        return new a<>(null, 2, t);
    }

    public T getData() {
        return this.c;
    }

    public String getErrorMessage() {
        return this.a;
    }

    public String getFlag() {
        return this.d;
    }

    public int getPosition() {
        return this.e;
    }

    public int getStatus() {
        return this.b;
    }

    public Object getTag() {
        return this.f;
    }

    public boolean isError() {
        return this.b == -1;
    }

    public boolean isLoading() {
        return this.b == 1;
    }

    public boolean isSuccess() {
        return this.b == 2;
    }

    public a<T> setFlag(String str) {
        this.d = str;
        return this;
    }

    public a<T> setNeedSkipToPosition(int i) {
        this.e = i;
        return this;
    }

    public a<T> setTag(Object obj) {
        this.f = obj;
        return this;
    }

    public static <T> a<T> copy(a<?> aVar, T t) {
        return new a<>(aVar != null ? aVar.getErrorMessage() : "", aVar != null ? aVar.getStatus() : 2, t);
    }

    public static <T> a<T> copy(String str, int i, T t) {
        return new a<>(str, i, t);
    }
}
