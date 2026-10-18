package com.google.firebase.encoders.proto;

import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private int a;
    private Protobuf.IntEncoding b = Protobuf.IntEncoding.DEFAULT;

    /* JADX INFO: renamed from: com.google.firebase.encoders.proto.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class C0636a implements Protobuf {
        private final int b;
        private final Protobuf.IntEncoding c;

        public C0636a(int i, Protobuf.IntEncoding intEncoding) {
            this.b = i;
            this.c = intEncoding;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return Protobuf.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Protobuf)) {
                return false;
            }
            Protobuf protobuf = (Protobuf) obj;
            return this.b == protobuf.tag() && this.c.equals(protobuf.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.b) + (this.c.hashCode() ^ 2041407134);
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public Protobuf.IntEncoding intEncoding() {
            return this.c;
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public int tag() {
            return this.b;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.b + "intEncoding=" + this.c + ')';
        }
    }

    public static a builder() {
        return new a();
    }

    public Protobuf build() {
        return new C0636a(this.a, this.b);
    }

    public a intEncoding(Protobuf.IntEncoding intEncoding) {
        this.b = intEncoding;
        return this;
    }

    public a tag(int i) {
        this.a = i;
        return this;
    }
}
