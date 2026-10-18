package androidx.camera.core.internal.compat.workaround;

import androidx.camera.core.i1;
import androidx.camera.core.impl.l2;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class d {
    private final IncorrectJpegMetadataQuirk a;

    public d(l2 l2Var) {
        this.a = (IncorrectJpegMetadataQuirk) l2Var.get(IncorrectJpegMetadataQuirk.class);
    }

    public byte[] jpegImageToJpegByteArray(i1 i1Var) {
        IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = this.a;
        if (incorrectJpegMetadataQuirk != null) {
            return incorrectJpegMetadataQuirk.jpegImageToJpegByteArray(i1Var);
        }
        ByteBuffer buffer = i1Var.getPlanes()[0].getBuffer();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.rewind();
        buffer.get(bArr);
        return bArr;
    }

    public boolean needCorrectJpegMetadata() {
        return this.a != null;
    }
}
