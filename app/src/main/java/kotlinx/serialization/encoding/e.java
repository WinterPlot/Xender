package kotlinx.serialization.encoding;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public interface e {
    public static final a a = a.a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }
    }

    boolean decodeBooleanElement(kotlinx.serialization.descriptors.f fVar, int i);

    byte decodeByteElement(kotlinx.serialization.descriptors.f fVar, int i);

    char decodeCharElement(kotlinx.serialization.descriptors.f fVar, int i);

    int decodeCollectionSize(kotlinx.serialization.descriptors.f fVar);

    double decodeDoubleElement(kotlinx.serialization.descriptors.f fVar, int i);

    int decodeElementIndex(kotlinx.serialization.descriptors.f fVar);

    float decodeFloatElement(kotlinx.serialization.descriptors.f fVar, int i);

    g decodeInlineElement(kotlinx.serialization.descriptors.f fVar, int i);

    int decodeIntElement(kotlinx.serialization.descriptors.f fVar, int i);

    long decodeLongElement(kotlinx.serialization.descriptors.f fVar, int i);

    <T> T decodeNullableSerializableElement(kotlinx.serialization.descriptors.f fVar, int i, kotlinx.serialization.a<? extends T> aVar, T t);

    boolean decodeSequentially();

    <T> T decodeSerializableElement(kotlinx.serialization.descriptors.f fVar, int i, kotlinx.serialization.a<? extends T> aVar, T t);

    short decodeShortElement(kotlinx.serialization.descriptors.f fVar, int i);

    String decodeStringElement(kotlinx.serialization.descriptors.f fVar, int i);

    void endStructure(kotlinx.serialization.descriptors.f fVar);

    kotlinx.serialization.modules.d getSerializersModule();
}
