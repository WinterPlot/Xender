package com.google.zxing.pdf417.decoder;

import com.google.zxing.FormatException;
import java.math.BigInteger;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class DecodedBitStreamParser {
    private static final char[] a = {';', '<', '>', '@', '[', '\\', ']', '_', '`', '~', '!', '\r', '\t', ',', ':', '\n', '-', '.', '$', '/', '\"', '|', '*', '(', ')', '?', '{', '}', '\''};
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '&', '\r', '\t', ',', ':', '#', '-', '.', '$', '/', '+', '%', '*', '=', '^'};
    private static final BigInteger[] c;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum Mode {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = bigIntegerValueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = c;
            if (i >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(bigIntegerValueOf);
            i++;
        }
    }

    private DecodedBitStreamParser() {
    }

    private static int byteCompaction(int i, int[] iArr, int i2, com.google.zxing.common.i iVar) throws FormatException {
        int i3;
        int i4;
        boolean z = false;
        while (i2 < iArr[0] && !z) {
            while (true) {
                i3 = iArr[0];
                if (i2 >= i3 || iArr[i2] != 927) {
                    break;
                }
                iVar.appendECI(iArr[i2 + 1]);
                i2 += 2;
            }
            if (i2 >= i3 || iArr[i2] >= 900) {
                z = true;
            } else {
                long j = 0;
                int i5 = 0;
                while (true) {
                    i4 = i2 + 1;
                    j = (j * 900) + ((long) iArr[i2]);
                    i5++;
                    if (i5 >= 5 || i4 >= iArr[0] || iArr[i4] >= 900) {
                        break;
                    }
                    i2 = i4;
                }
                if (i5 != 5 || (i != 924 && (i4 >= iArr[0] || iArr[i4] >= 900))) {
                    i4 -= i5;
                    while (i4 < iArr[0] && !z) {
                        int i6 = i4 + 1;
                        int i7 = iArr[i4];
                        if (i7 < 900) {
                            iVar.append((byte) i7);
                            i4 = i6;
                        } else if (i7 == 927) {
                            i4 += 2;
                            iVar.appendECI(iArr[i6]);
                        } else {
                            z = true;
                        }
                    }
                } else {
                    for (int i8 = 0; i8 < 6; i8++) {
                        iVar.append((byte) (j >> ((5 - i8) * 8)));
                    }
                }
                i2 = i4;
            }
        }
        return i2;
    }

    public static com.google.zxing.common.d decode(int[] iArr, String str) throws FormatException {
        com.google.zxing.common.i iVar = new com.google.zxing.common.i(iArr.length * 2);
        int iTextCompaction = textCompaction(iArr, 1, iVar);
        com.google.zxing.pdf417.c cVar = new com.google.zxing.pdf417.c();
        while (iTextCompaction < iArr[0]) {
            int i = iTextCompaction + 1;
            int i2 = iArr[iTextCompaction];
            if (i2 != 913) {
                switch (i2) {
                    case 900:
                        iTextCompaction = textCompaction(iArr, i, iVar);
                        continue;
                    case 901:
                        break;
                    case 902:
                        iTextCompaction = numericCompaction(iArr, i, iVar);
                        continue;
                    default:
                        switch (i2) {
                            case 922:
                            case 923:
                                throw FormatException.getFormatInstance();
                            case 924:
                                break;
                            case 925:
                                iTextCompaction += 2;
                                continue;
                            case 926:
                                iTextCompaction += 3;
                                continue;
                            case 927:
                                iTextCompaction += 2;
                                iVar.appendECI(iArr[i]);
                                continue;
                            case 928:
                                iTextCompaction = decodeMacroBlock(iArr, i, cVar);
                                continue;
                            default:
                                iTextCompaction = textCompaction(iArr, iTextCompaction, iVar);
                                continue;
                        }
                        break;
                }
                iTextCompaction = byteCompaction(i2, iArr, i, iVar);
            } else {
                iTextCompaction += 2;
                iVar.append((char) iArr[i]);
            }
        }
        if (iVar.isEmpty() && cVar.getFileId() == null) {
            throw FormatException.getFormatInstance();
        }
        com.google.zxing.common.d dVar = new com.google.zxing.common.d(null, iVar.toString(), null, str);
        dVar.setOther(cVar);
        return dVar;
    }

    private static String decodeBase900toBase10(int[] iArr, int i) throws FormatException {
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigIntegerAdd = bigIntegerAdd.add(c[(i - i2) - 1].multiply(BigInteger.valueOf(iArr[i2])));
        }
        String string = bigIntegerAdd.toString();
        if (string.charAt(0) == '1') {
            return string.substring(1);
        }
        throw FormatException.getFormatInstance();
    }

    public static int decodeMacroBlock(int[] iArr, int i, com.google.zxing.pdf417.c cVar) throws FormatException {
        int i2;
        if (i + 2 > iArr[0]) {
            throw FormatException.getFormatInstance();
        }
        int[] iArr2 = new int[2];
        int i3 = 0;
        while (i3 < 2) {
            iArr2[i3] = iArr[i];
            i3++;
            i++;
        }
        String strDecodeBase900toBase10 = decodeBase900toBase10(iArr2, 2);
        if (strDecodeBase900toBase10.isEmpty()) {
            cVar.setSegmentIndex(0);
        } else {
            try {
                cVar.setSegmentIndex(Integer.parseInt(strDecodeBase900toBase10));
            } catch (NumberFormatException unused) {
                throw FormatException.getFormatInstance();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (i < iArr[0] && i < iArr.length && (i2 = iArr[i]) != 922 && i2 != 923) {
            sb.append(String.format("%03d", Integer.valueOf(i2)));
            i++;
        }
        if (sb.length() == 0) {
            throw FormatException.getFormatInstance();
        }
        cVar.setFileId(sb.toString());
        int i4 = iArr[i] == 923 ? i + 1 : -1;
        while (i < iArr[0]) {
            int i5 = iArr[i];
            if (i5 == 922) {
                i++;
                cVar.setLastSegment(true);
            } else {
                if (i5 != 923) {
                    throw FormatException.getFormatInstance();
                }
                switch (iArr[i + 1]) {
                    case 0:
                        com.google.zxing.common.i iVar = new com.google.zxing.common.i();
                        i = textCompaction(iArr, i + 2, iVar);
                        cVar.setFileName(iVar.toString());
                        break;
                    case 1:
                        com.google.zxing.common.i iVar2 = new com.google.zxing.common.i();
                        i = numericCompaction(iArr, i + 2, iVar2);
                        try {
                            cVar.setSegmentCount(Integer.parseInt(iVar2.toString()));
                        } catch (NumberFormatException unused2) {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                    case 2:
                        com.google.zxing.common.i iVar3 = new com.google.zxing.common.i();
                        i = numericCompaction(iArr, i + 2, iVar3);
                        try {
                            cVar.setTimestamp(Long.parseLong(iVar3.toString()));
                        } catch (NumberFormatException unused3) {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                    case 3:
                        com.google.zxing.common.i iVar4 = new com.google.zxing.common.i();
                        i = textCompaction(iArr, i + 2, iVar4);
                        cVar.setSender(iVar4.toString());
                        break;
                    case 4:
                        com.google.zxing.common.i iVar5 = new com.google.zxing.common.i();
                        i = textCompaction(iArr, i + 2, iVar5);
                        cVar.setAddressee(iVar5.toString());
                        break;
                    case 5:
                        com.google.zxing.common.i iVar6 = new com.google.zxing.common.i();
                        i = numericCompaction(iArr, i + 2, iVar6);
                        try {
                            cVar.setFileSize(Long.parseLong(iVar6.toString()));
                        } catch (NumberFormatException unused4) {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                    case 6:
                        com.google.zxing.common.i iVar7 = new com.google.zxing.common.i();
                        i = numericCompaction(iArr, i + 2, iVar7);
                        try {
                            cVar.setChecksum(Integer.parseInt(iVar7.toString()));
                        } catch (NumberFormatException unused5) {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                    default:
                        throw FormatException.getFormatInstance();
                }
            }
        }
        if (i4 != -1) {
            int i6 = i - i4;
            if (cVar.isLastSegment()) {
                i6--;
            }
            if (i6 > 0) {
                cVar.setOptionalData(Arrays.copyOfRange(iArr, i4, i6 + i4));
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005c A[FALL_THROUGH, PHI: r3 r4
      0x005c: PHI (r3v7 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode) = 
      (r3v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r3v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r3v2 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r3v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r3v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r3v10 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r3v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r3v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r3v11 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r3v16 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
     binds: [B:80:0x00e7, B:75:0x00d6, B:77:0x00da, B:69:0x00c3, B:63:0x00b3, B:66:0x00b9, B:56:0x009f, B:50:0x008d, B:52:0x0091, B:33:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r4v7 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode) = 
      (r4v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r4v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r4v3 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r4v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r4v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r4v12 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r4v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r4v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r4v15 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
      (r4v1 com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode)
     binds: [B:80:0x00e7, B:75:0x00d6, B:77:0x00da, B:69:0x00c3, B:63:0x00b3, B:66:0x00b9, B:56:0x009f, B:50:0x008d, B:52:0x0091, B:33:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6  */
    private static Mode decodeTextCompaction(int[] iArr, int[] iArr2, int i, com.google.zxing.common.i iVar, Mode mode) {
        int i2;
        char c2;
        char c3;
        Mode mode2;
        Mode mode3;
        Mode mode4 = mode;
        Mode mode5 = mode4;
        Mode mode6 = mode5;
        int i3 = 0;
        while (i3 < i) {
            int i4 = iArr[i3];
            int iOrdinal = mode5.ordinal();
            char c4 = ' ';
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            if (iOrdinal != 4) {
                                if (iOrdinal == 5) {
                                    if (i4 < 29) {
                                        c3 = a[i4];
                                    } else if (i4 == 29 || i4 == 900) {
                                        mode5 = Mode.ALPHA;
                                    } else {
                                        if (i4 == 913) {
                                            iVar.append((char) iArr2[i3]);
                                        }
                                        c3 = 0;
                                    }
                                }
                            } else if (i4 < 26) {
                                c3 = (char) (i4 + 65);
                            } else {
                                if (i4 != 26) {
                                    if (i4 != 900) {
                                        c4 = 0;
                                    } else {
                                        mode5 = Mode.ALPHA;
                                        c4 = 0;
                                        mode2 = mode6;
                                        mode6 = mode5;
                                        c3 = c4;
                                    }
                                }
                                mode5 = mode6;
                                mode2 = mode6;
                                mode6 = mode5;
                                c3 = c4;
                            }
                            mode2 = mode6;
                        } else if (i4 < 29) {
                            c2 = a[i4];
                            Mode mode7 = mode6;
                            mode6 = mode5;
                            c3 = c2;
                            mode2 = mode7;
                        } else if (i4 == 29 || i4 == 900) {
                            mode4 = Mode.ALPHA;
                            mode5 = mode4;
                        } else if (i4 == 913) {
                            iVar.append((char) iArr2[i3]);
                        }
                        mode2 = mode6;
                        mode6 = mode5;
                        c3 = 0;
                    } else if (i4 < 25) {
                        c2 = b[i4];
                        Mode mode8 = mode6;
                        mode6 = mode5;
                        c3 = c2;
                        mode2 = mode8;
                    } else {
                        if (i4 == 900) {
                            mode4 = Mode.ALPHA;
                            c4 = 0;
                            mode5 = mode4;
                        } else {
                            if (i4 != 913) {
                                switch (i4) {
                                    case 25:
                                        mode4 = Mode.PUNCT;
                                        c4 = 0;
                                        mode5 = mode4;
                                        break;
                                    case 26:
                                        break;
                                    case 27:
                                        mode4 = Mode.LOWER;
                                        c4 = 0;
                                        mode5 = mode4;
                                        break;
                                    case 28:
                                        mode4 = Mode.ALPHA;
                                        c4 = 0;
                                        mode5 = mode4;
                                        break;
                                    case 29:
                                        mode6 = mode5;
                                        mode5 = Mode.PUNCT_SHIFT;
                                    default:
                                        c4 = 0;
                                        break;
                                }
                            } else {
                                iVar.append((char) iArr2[i3]);
                            }
                            c4 = 0;
                        }
                        mode2 = mode6;
                        mode6 = mode5;
                        c3 = c4;
                    }
                } else if (i4 < 26) {
                    i2 = i4 + 97;
                    c2 = (char) i2;
                    Mode mode9 = mode6;
                    mode6 = mode5;
                    c3 = c2;
                    mode2 = mode9;
                } else {
                    if (i4 != 900) {
                        if (i4 != 913) {
                            switch (i4) {
                                case 27:
                                    mode3 = Mode.ALPHA_SHIFT;
                                    Mode mode10 = mode3;
                                    mode6 = mode5;
                                    mode5 = mode10;
                                    break;
                                case 28:
                                    mode4 = Mode.MIXED;
                                    break;
                                case 29:
                                    mode3 = Mode.PUNCT_SHIFT;
                                    Mode mode11 = mode3;
                                    mode6 = mode5;
                                    mode5 = mode11;
                                    break;
                            }
                            mode2 = mode6;
                            mode6 = mode5;
                            c3 = c4;
                        } else {
                            iVar.append((char) iArr2[i3]);
                        }
                        c4 = 0;
                        mode2 = mode6;
                        mode6 = mode5;
                        c3 = c4;
                    } else {
                        mode4 = Mode.ALPHA;
                    }
                    c4 = 0;
                    mode5 = mode4;
                    mode2 = mode6;
                    mode6 = mode5;
                    c3 = c4;
                }
            } else if (i4 < 26) {
                i2 = i4 + 65;
                c2 = (char) i2;
                Mode mode12 = mode6;
                mode6 = mode5;
                c3 = c2;
                mode2 = mode12;
            } else {
                if (i4 != 900) {
                    if (i4 != 913) {
                        switch (i4) {
                            case 26:
                                break;
                            case 27:
                                mode4 = Mode.LOWER;
                                break;
                            case 28:
                                mode4 = Mode.MIXED;
                                break;
                            case 29:
                                mode6 = mode5;
                                mode5 = Mode.PUNCT_SHIFT;
                            default:
                                c4 = 0;
                                break;
                        }
                        mode2 = mode6;
                        mode6 = mode5;
                        c3 = c4;
                    } else {
                        iVar.append((char) iArr2[i3]);
                    }
                    c4 = 0;
                    mode2 = mode6;
                    mode6 = mode5;
                    c3 = c4;
                } else {
                    mode4 = Mode.ALPHA;
                }
                c4 = 0;
                mode5 = mode4;
                mode2 = mode6;
                mode6 = mode5;
                c3 = c4;
            }
            if (c3 != 0) {
                iVar.append(c3);
            }
            i3++;
            mode5 = mode6;
            mode6 = mode2;
        }
        return mode4;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x003e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0007 A[SYNTHETIC] */
    private static int numericCompaction(int[] iArr, int i, com.google.zxing.common.i iVar) throws FormatException {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (true) {
            int i3 = iArr[0];
            if (i < i3 && !z) {
                int i4 = i + 1;
                int i5 = iArr[i];
                if (i4 == i3) {
                    z = true;
                }
                if (i5 < 900) {
                    iArr2[i2] = i5;
                    i2++;
                } else {
                    if (i5 != 900 && i5 != 901 && i5 != 927 && i5 != 928) {
                        switch (i5) {
                            case 922:
                            case 923:
                            case 924:
                                z = true;
                                break;
                        }
                    } else {
                        z = true;
                    }
                    if (i2 % 15 != 0 || i5 == 902 || z) {
                        if (i2 > 0) {
                            iVar.append(decodeBase900toBase10(iArr2, i2));
                            i2 = 0;
                        }
                    }
                }
                i = i4;
                if (i2 % 15 != 0) {
                }
                if (i2 > 0) {
                    iVar.append(decodeBase900toBase10(iArr2, i2));
                    i2 = 0;
                }
            }
        }
        return i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x003a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x003d. Please report as an issue. */
    private static int textCompaction(int[] iArr, int i, com.google.zxing.common.i iVar) throws FormatException {
        int i2 = iArr[0];
        int[] iArr2 = new int[(i2 - i) * 2];
        int[] iArr3 = new int[(i2 - i) * 2];
        Mode mode = Mode.ALPHA;
        boolean z = false;
        int i3 = 0;
        while (i < iArr[0] && !z) {
            int i4 = i + 1;
            int i5 = iArr[i];
            if (i5 < 900) {
                iArr2[i3] = i5 / 30;
                iArr2[i3 + 1] = i5 % 30;
                i3 += 2;
            } else if (i5 == 913) {
                iArr2[i3] = 913;
                i += 2;
                iArr3[i3] = iArr[i4];
                i3++;
            } else if (i5 != 927) {
                if (i5 != 928) {
                    switch (i5) {
                        case 900:
                            iArr2[i3] = 900;
                            i3++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i5) {
                                case 922:
                                case 923:
                                case 924:
                                    break;
                                default:
                                    break;
                            }
                            break;
                    }
                }
                z = true;
            } else {
                Mode modeDecodeTextCompaction = decodeTextCompaction(iArr2, iArr3, i3, iVar, mode);
                i += 2;
                iVar.appendECI(iArr[i4]);
                int i6 = iArr[0];
                if (i > i6) {
                    throw FormatException.getFormatInstance();
                }
                mode = modeDecodeTextCompaction;
                iArr3 = new int[(i6 - i) * 2];
                iArr2 = new int[(i6 - i) * 2];
                i3 = 0;
            }
            i = i4;
        }
        decodeTextCompaction(iArr2, iArr3, i3, iVar, mode);
        return i;
    }
}
