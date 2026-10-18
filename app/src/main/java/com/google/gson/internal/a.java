package com.google.gson.internal;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.TreeSet;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements i {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    public static /* synthetic */ void a() {
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ void b(int i, int i2) {
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i + ((Object) " is less than minimum ") + i2 + '.');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(int i, Object obj, String str) {
        throw new IllegalArgumentException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void d(int i, String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2 + i).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(int i, String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + ((char) i)).toString());
    }

    public static /* synthetic */ void f(Object obj, Object obj2, Object obj3) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void g(Object obj, String str, long j) {
        throw new IllegalArgumentException((str + j + obj).toString());
    }

    public static /* synthetic */ void h(Object obj, String str, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void i(Object obj, String str, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4 + obj5);
    }

    public static /* synthetic */ void j(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void k(String str, float f) {
        throw new IllegalArgumentException(str + f);
    }

    public static /* synthetic */ void l(String str, Object obj) {
        throw new IllegalArgumentException(str + obj + '.');
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2) {
        throw new NoSuchElementException(str + obj + obj2);
    }

    public static /* synthetic */ void n(StringBuilder sb, Object obj) {
        sb.append(" is less than minimum ");
        sb.append(obj);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void o(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static /* synthetic */ void p(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void q() {
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void r(Object obj, String str, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void s(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void t(String str, Object obj) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void u(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void v(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void w(String str, Object obj) {
        throw new AssertionError(str + obj);
    }

    public static /* synthetic */ void x(String str, Object obj) {
        throw new IllegalStateException((str + obj).toString());
    }

    @Override // com.google.gson.internal.i
    public Object construct() {
        switch (this.a) {
            case 0:
                return new LinkedHashSet();
            case 1:
                return new TreeSet();
            case 2:
                return new ArrayDeque();
            case 3:
                return c.lambda$newMapConstructor$3();
            default:
                return new LinkedHashMap();
        }
    }
}
