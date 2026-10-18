package com.bumptech.glide.load;

import androidx.camera.camera2.pipe.w;
import com.bumptech.glide.util.k;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class e<T> {
    private static final b<Object> e = new a();
    private final T a;
    private final b<T> b;
    private final String c;
    private volatile byte[] d;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface b<T> {
        void update(byte[] bArr, T t, MessageDigest messageDigest);
    }

    private e(String str, T t, b<T> bVar) {
        this.c = k.checkNotEmpty(str);
        this.a = t;
        this.b = (b) k.checkNotNull(bVar);
    }

    public static <T> e<T> disk(String str, b<T> bVar) {
        return new e<>(str, null, bVar);
    }

    private static <T> b<T> emptyUpdater() {
        return (b<T>) e;
    }

    private byte[] getKeyBytes() {
        if (this.d == null) {
            this.d = this.c.getBytes(c.a);
        }
        return this.d;
    }

    public static <T> e<T> memory(String str) {
        return new e<>(str, null, emptyUpdater());
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.c.equals(((e) obj).c);
        }
        return false;
    }

    public T getDefaultValue() {
        return this.a;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return w.t(new StringBuilder("Option{key='"), this.c, "'}");
    }

    public void update(T t, MessageDigest messageDigest) {
        this.b.update(getKeyBytes(), t, messageDigest);
    }

    public static <T> e<T> disk(String str, T t, b<T> bVar) {
        return new e<>(str, t, bVar);
    }

    public static <T> e<T> memory(String str, T t) {
        return new e<>(str, t, emptyUpdater());
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a implements b<Object> {
        @Override // com.bumptech.glide.load.e.b
        public void update(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
