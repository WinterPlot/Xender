package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlinx.serialization.MissingFieldException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class y1 {
    public static final void throwArrayMissingFieldException(int[] iArr, int[] iArr2, kotlinx.serialization.descriptors.f fVar) {
        iArr.getClass();
        iArr2.getClass();
        fVar.getClass();
        ArrayList arrayList = new ArrayList();
        int length = iArr2.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr2[i] & (~iArr[i]);
            if (i2 != 0) {
                for (int i3 = 0; i3 < 32; i3++) {
                    if ((i2 & 1) != 0) {
                        arrayList.add(fVar.getElementName((i * 32) + i3));
                    }
                    i2 >>>= 1;
                }
            }
        }
        throw new MissingFieldException(arrayList, fVar.getSerialName());
    }

    public static final void throwMissingFieldException(int i, int i2, kotlinx.serialization.descriptors.f fVar) {
        fVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(fVar.getElementName(i4));
            }
            i3 >>>= 1;
        }
        throw new MissingFieldException(arrayList, fVar.getSerialName());
    }
}
