package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g {
    public static void ValidateVersion() {
        b.FLATBUFFERS_1_12_0();
    }

    public static void addList(c cVar, int i) {
        cVar.addOffset(1, i, 0);
    }

    public static void addSourceSha(c cVar, int i) {
        cVar.addOffset(2, i, 0);
    }

    public static void addVersion(c cVar, int i) {
        cVar.addInt(0, i, 0);
    }

    public static int createListVector(c cVar, int[] iArr) {
        cVar.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            cVar.addOffset(iArr[length]);
        }
        return cVar.endVector();
    }

    public static int createMetadataList(c cVar, int i, int i2, int i3) {
        cVar.startTable(3);
        addSourceSha(cVar, i3);
        addList(cVar, i2);
        addVersion(cVar, i);
        return endMetadataList(cVar);
    }

    public static int endMetadataList(c cVar) {
        return cVar.endTable();
    }

    public static void finishMetadataListBuffer(c cVar, int i) {
        cVar.finish(i);
    }

    public static void finishSizePrefixedMetadataListBuffer(c cVar, int i) {
        cVar.finishSizePrefixed(i);
    }

    public static f getRootAsMetadataList(ByteBuffer byteBuffer, f fVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return fVar.__assign(byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()), byteBuffer);
    }

    public static void startListVector(c cVar, int i) {
        cVar.startVector(4, i, 4);
    }

    public static void startMetadataList(c cVar) {
        cVar.startTable(3);
    }

    public f __assign(int i, ByteBuffer byteBuffer) {
        __init(i, byteBuffer);
        return this;
    }

    public void __init(int i, ByteBuffer byteBuffer) {
        __reset(i, byteBuffer);
    }

    public e list(e eVar, int i) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return null;
        }
        return eVar.__assign(__indirect((i * 4) + __vector(i__offset)), this.b);
    }

    public int listLength() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public e.a listVector(e.a aVar) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return aVar.__assign(__vector(i__offset), 4, this.b);
        }
        return null;
    }

    public String sourceSha() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __string(i__offset + this.a);
        }
        return null;
    }

    public ByteBuffer sourceShaAsByteBuffer() {
        return __vector_as_bytebuffer(8, 1);
    }

    public ByteBuffer sourceShaInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 8, 1);
    }

    public int version() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.b.getInt(i__offset + this.a);
        }
        return 0;
    }

    public e.a listVector() {
        return listVector(new e.a());
    }

    public static f getRootAsMetadataList(ByteBuffer byteBuffer) {
        return getRootAsMetadataList(byteBuffer, new f());
    }

    public e list(int i) {
        return list(new e(), i);
    }
}
