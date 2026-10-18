package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface o0 extends p0 {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a extends p0, Cloneable {
        o0 build();

        o0 buildPartial();

        a clear();

        a clone();

        @Override // androidx.datastore.preferences.protobuf.p0
        /* synthetic */ o0 getDefaultInstanceForType();

        @Override // androidx.datastore.preferences.protobuf.p0
        /* synthetic */ boolean isInitialized();

        boolean mergeDelimitedFrom(InputStream inputStream) throws IOException;

        boolean mergeDelimitedFrom(InputStream inputStream, o oVar) throws IOException;

        a mergeFrom(ByteString byteString) throws InvalidProtocolBufferException;

        a mergeFrom(ByteString byteString, o oVar) throws InvalidProtocolBufferException;

        a mergeFrom(i iVar) throws IOException;

        a mergeFrom(i iVar, o oVar) throws IOException;

        a mergeFrom(o0 o0Var);

        a mergeFrom(InputStream inputStream) throws IOException;

        a mergeFrom(InputStream inputStream, o oVar) throws IOException;

        a mergeFrom(byte[] bArr) throws InvalidProtocolBufferException;

        a mergeFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException;

        a mergeFrom(byte[] bArr, int i, int i2, o oVar) throws InvalidProtocolBufferException;

        a mergeFrom(byte[] bArr, o oVar) throws InvalidProtocolBufferException;
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    /* synthetic */ o0 getDefaultInstanceForType();

    x0<? extends o0> getParserForType();

    int getSerializedSize();

    @Override // androidx.datastore.preferences.protobuf.p0
    /* synthetic */ boolean isInitialized();

    a newBuilderForType();

    a toBuilder();

    byte[] toByteArray();

    ByteString toByteString();

    void writeDelimitedTo(OutputStream outputStream) throws IOException;

    void writeTo(CodedOutputStream codedOutputStream) throws IOException;

    void writeTo(OutputStream outputStream) throws IOException;
}
