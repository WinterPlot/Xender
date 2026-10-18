package kotlinx.serialization.encoding;

import kotlinx.serialization.j;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public interface h {
    f beginCollection(kotlinx.serialization.descriptors.f fVar, int i);

    f beginStructure(kotlinx.serialization.descriptors.f fVar);

    void encodeBoolean(boolean z);

    void encodeByte(byte b);

    void encodeChar(char c);

    void encodeDouble(double d);

    void encodeEnum(kotlinx.serialization.descriptors.f fVar, int i);

    void encodeFloat(float f);

    h encodeInline(kotlinx.serialization.descriptors.f fVar);

    void encodeInt(int i);

    void encodeLong(long j);

    void encodeNotNullMark();

    void encodeNull();

    <T> void encodeNullableSerializableValue(j<? super T> jVar, T t);

    <T> void encodeSerializableValue(j<? super T> jVar, T t);

    void encodeShort(short s);

    void encodeString(String str);

    kotlinx.serialization.modules.d getSerializersModule();
}
