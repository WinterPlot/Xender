package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class a {
    private int a;
    private int b;
    private int c;
    protected ByteBuffer d;

    public int __element(int i) {
        return (i * this.c) + this.a;
    }

    public void __reset(int i, int i2, ByteBuffer byteBuffer) {
        this.d = byteBuffer;
        if (byteBuffer != null) {
            this.a = i;
            this.b = byteBuffer.getInt(i - 4);
            this.c = i2;
        } else {
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }
    }

    public int __vector() {
        return this.a;
    }

    public int length() {
        return this.b;
    }

    public void reset() {
        __reset(0, 0, null);
    }
}
