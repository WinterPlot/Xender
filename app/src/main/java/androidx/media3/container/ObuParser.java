package androidx.media3.container;

import androidx.media3.common.util.a0;
import com.google.common.base.m;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class ObuParser {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class NotYetImplementedException extends Exception {
        private NotYetImplementedException() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b {
        private final boolean a;

        private b(d dVar, c cVar) throws NotYetImplementedException {
            int i = cVar.a;
            m.checkArgument(i == 6 || i == 3);
            byte[] bArr = new byte[Math.min(4, cVar.b.remaining())];
            cVar.b.asReadOnlyBuffer().get(bArr);
            a0 a0Var = new a0(bArr);
            ObuParser.throwWhenFeatureRequired(dVar.a);
            if (a0Var.readBit()) {
                this.a = false;
                return;
            }
            int bits = a0Var.readBits(2);
            boolean bit = a0Var.readBit();
            ObuParser.throwWhenFeatureRequired(dVar.b);
            if (!bit) {
                this.a = true;
                return;
            }
            boolean bit2 = (bits == 3 || bits == 0) ? true : a0Var.readBit();
            a0Var.skipBit();
            ObuParser.throwWhenFeatureRequired(!dVar.d);
            if (a0Var.readBit()) {
                ObuParser.throwWhenFeatureRequired(!dVar.e);
                a0Var.skipBit();
            }
            ObuParser.throwWhenFeatureRequired(dVar.c);
            if (bits != 3) {
                a0Var.skipBit();
            }
            a0Var.skipBits(dVar.f);
            if (bits != 2 && bits != 0 && !bit2) {
                a0Var.skipBits(3);
            }
            this.a = ((bits == 3 || bits == 0) ? 255 : a0Var.readBits(8)) != 0;
        }

        public static b parse(d dVar, c cVar) {
            try {
                return new b(dVar, cVar);
            } catch (NotYetImplementedException unused) {
                return null;
            }
        }

        public boolean isDependedOn() {
            return this.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class c {
        public final int a;
        public final ByteBuffer b;

        private c(int i, ByteBuffer byteBuffer) {
            this.a = i;
            this.b = byteBuffer;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class d {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final boolean j;
        public final int k;
        public final boolean l;
        public final boolean m;
        public final boolean n;
        public final boolean o;
        public final boolean p;
        public final int q;
        public final byte r;
        public final byte s;
        public final byte t;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v4, types: [int] */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6 */
        private d(c cVar) throws NotYetImplementedException {
            int bits;
            int bits2;
            boolean bit;
            int r8; // TODO(recovery): JADX could not infer type; AV1 sequence-header parsing here is lossy
            boolean bit2;
            boolean bit3;
            boolean bit4;
            boolean bit5;
            byte bits3;
            byte bits4;
            byte bits5;
            boolean bit6;
            boolean bit7 = true;
            m.checkArgument(cVar.a == 1);
            byte[] bArr = new byte[cVar.b.remaining()];
            cVar.b.asReadOnlyBuffer().get(bArr);
            a0 a0Var = new a0(bArr);
            this.g = a0Var.readBits(3);
            a0Var.skipBit();
            boolean bit8 = a0Var.readBit();
            this.a = bit8;
            if (bit8) {
                bits2 = a0Var.readBits(5);
                this.b = false;
                this.j = false;
                r8 = 0;
                bits = 0;
            } else {
                if (a0Var.readBit()) {
                    skipTimingInfo(a0Var);
                    boolean bit9 = a0Var.readBit();
                    this.b = bit9;
                    if (bit9) {
                        a0Var.skipBits(47);
                    }
                } else {
                    this.b = false;
                }
                this.j = a0Var.readBit();
                int bits6 = a0Var.readBits(5);
                int bits7 = 0;
                int i = 0;
                boolean z = false;
                bits = 0;
                while (i <= bits6) {
                    a0Var.skipBits(12);
                    if (i == 0) {
                        bits7 = a0Var.readBits(5);
                        if (bits7 > 7) {
                            bit = z;
                            bit = a0Var.readBit();
                        }
                    } else if (a0Var.readBits(5) > 7) {
                        bit = z;
                        a0Var.skipBit();
                        bit = z;
                    }
                    bit = z;
                    bit = z;
                    if (this.b) {
                        a0Var.skipBit();
                    }
                    if (this.j && a0Var.readBit()) {
                        if (i == 0) {
                            bits = a0Var.readBits(4);
                        } else {
                            a0Var.skipBits(4);
                        }
                    }
                    i++;
                    z = bit;
                }
                bits2 = bits7;
                r8 = z ? 1 : 0;
            }
            int bits8 = a0Var.readBits(4);
            int bits9 = a0Var.readBits(4);
            a0Var.skipBits(bits8 + 1);
            a0Var.skipBits(bits9 + 1);
            if (this.a) {
                this.c = false;
                bit2 = false;
            } else {
                bit2 = a0Var.readBit();
                this.c = bit2;
            }
            if (bit2) {
                a0Var.skipBits(4);
                a0Var.skipBits(3);
            }
            a0Var.skipBits(3);
            if (this.a) {
                this.e = true;
                this.d = true;
                this.f = 0;
            } else {
                a0Var.skipBits(4);
                boolean bit10 = a0Var.readBit();
                if (bit10) {
                    a0Var.skipBits(2);
                }
                if (a0Var.readBit()) {
                    this.d = true;
                    bit3 = true;
                } else {
                    bit3 = a0Var.readBit();
                    this.d = bit3;
                }
                if (!bit3 || a0Var.readBit()) {
                    this.e = true;
                } else {
                    this.e = a0Var.readBit();
                }
                if (bit10) {
                    this.f = a0Var.readBits(3) + 1;
                } else {
                    this.f = 0;
                }
            }
            this.h = bits2;
            this.i = r8;
            this.k = bits;
            a0Var.skipBits(3);
            boolean bit11 = a0Var.readBit();
            this.l = bit11;
            if (this.g == 2 && bit11) {
                bit4 = a0Var.readBit();
                this.m = bit4;
            } else {
                this.m = false;
                bit4 = false;
            }
            if (this.g != 1) {
                bit5 = a0Var.readBit();
                this.n = bit5;
            } else {
                this.n = false;
                bit5 = false;
            }
            if (a0Var.readBit()) {
                bits4 = (byte) a0Var.readBits(8);
                this.r = bits4;
                bits5 = (byte) a0Var.readBits(8);
                this.s = bits5;
                bits3 = (byte) a0Var.readBits(8);
                this.t = bits3;
            } else {
                this.r = (byte) 0;
                this.s = (byte) 0;
                this.t = (byte) 0;
                bits3 = 0;
                bits4 = 0;
                bits5 = 0;
            }
            if (bit5) {
                a0Var.skipBit();
                this.o = false;
                this.p = false;
                this.q = 0;
            } else if (bits4 == 1 && bits5 == 13 && bits3 == 0) {
                this.o = false;
                this.p = false;
                this.q = 0;
            } else {
                a0Var.skipBit();
                int i2 = this.g;
                if (i2 == 0) {
                    this.o = true;
                    this.p = true;
                    bit6 = true;
                } else if (i2 == 1) {
                    this.o = false;
                    this.p = false;
                    bit6 = false;
                    bit7 = false;
                } else {
                    if (bit4) {
                        bit7 = a0Var.readBit();
                        this.o = bit7;
                        if (bit7) {
                            bit6 = a0Var.readBit();
                            this.p = bit6;
                        } else {
                            this.p = false;
                        }
                    } else {
                        this.o = true;
                        this.p = false;
                    }
                    bit6 = false;
                }
                if (bit7 && bit6) {
                    this.q = a0Var.readBits(2);
                } else {
                    this.q = 0;
                }
            }
            a0Var.skipBit();
        }

        public static d parse(c cVar) {
            try {
                return new d(cVar);
            } catch (NotYetImplementedException unused) {
                return null;
            }
        }

        private static void skipTimingInfo(a0 a0Var) {
            a0Var.skipBits(64);
            if (a0Var.readBit()) {
                ObuParser.skipUvlc(a0Var);
            }
        }
    }

    private ObuParser() {
    }

    private static int leb128(ByteBuffer byteBuffer) {
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            byte b2 = byteBuffer.get();
            i |= (b2 & 127) << (i2 * 7);
            if ((b2 & 128) == 0) {
                return i;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void skipUvlc(a0 a0Var) {
        int i = 0;
        while (!a0Var.readBit()) {
            i++;
        }
        if (i < 32) {
            a0Var.skipBits(i);
        }
    }

    public static List<c> split(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            try {
                byte b2 = byteBufferAsReadOnlyBuffer.get();
                int i = (b2 >> 3) & 15;
                if (((b2 >> 2) & 1) != 0) {
                    byteBufferAsReadOnlyBuffer.get();
                }
                int iLeb128 = ((b2 >> 1) & 1) != 0 ? leb128(byteBufferAsReadOnlyBuffer) : byteBufferAsReadOnlyBuffer.remaining();
                if (byteBufferAsReadOnlyBuffer.position() + iLeb128 > byteBufferAsReadOnlyBuffer.limit()) {
                    break;
                }
                ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
                byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iLeb128);
                arrayList.add(new c(i, byteBufferDuplicate));
                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iLeb128);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void throwWhenFeatureRequired(boolean z) throws NotYetImplementedException {
        if (z) {
            throw new NotYetImplementedException();
        }
    }
}
