package com.google.zxing.datamatrix.encoder;

import okio.j0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
class c implements g {
    private int backtrackOneCharacter(h hVar, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        hVar.f--;
        int iEncodeChar = encodeChar(hVar.getCurrentChar(), sb2);
        hVar.resetSymbolInfo();
        return iEncodeChar;
    }

    private static String encodeToCodewords(CharSequence charSequence) {
        int iCharAt = charSequence.charAt(2) + (charSequence.charAt(1) * '(') + (charSequence.charAt(0) * 1600) + 1;
        return new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)});
    }

    public static void writeNextTriplet(h hVar, StringBuilder sb) {
        hVar.writeCodewords(encodeToCodewords(sb));
        sb.delete(0, 3);
    }

    @Override // com.google.zxing.datamatrix.encoder.g
    public void encode(h hVar) {
        StringBuilder sb = new StringBuilder();
        while (hVar.hasMoreCharacters()) {
            char currentChar = hVar.getCurrentChar();
            hVar.f++;
            int iEncodeChar = encodeChar(currentChar, sb);
            int codewordCount = hVar.getCodewordCount() + ((sb.length() / 3) * 2);
            hVar.updateSymbolInfo(codewordCount);
            int dataCapacity = hVar.getSymbolInfo().getDataCapacity() - codewordCount;
            if (!hVar.hasMoreCharacters()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && dataCapacity != 2) {
                    iEncodeChar = backtrackOneCharacter(hVar, sb, sb2, iEncodeChar);
                }
                while (sb.length() % 3 == 1 && (iEncodeChar > 3 || dataCapacity != 1)) {
                    iEncodeChar = backtrackOneCharacter(hVar, sb, sb2, iEncodeChar);
                }
                break;
            }
            if (sb.length() % 3 == 0 && j.lookAheadTest(hVar.getMessage(), hVar.f, getEncodingMode()) != getEncodingMode()) {
                hVar.signalEncoderChange(0);
                break;
            }
        }
        handleEOD(hVar, sb);
    }

    public int encodeChar(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
            return 1;
        }
        if (c >= 'A' && c <= 'Z') {
            sb.append((char) (c - '3'));
            return 1;
        }
        if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        }
        if (c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        }
        if (c <= '@') {
            sb.append((char) 1);
            sb.append((char) (c - '+'));
            return 2;
        }
        if (c <= '_') {
            sb.append((char) 1);
            sb.append((char) (c - 'E'));
            return 2;
        }
        if (c > 127) {
            sb.append("\u0001\u001e");
            return encodeChar((char) (c - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c - '`'));
        return 2;
    }

    public void encodeMaximal(h hVar) {
        StringBuilder sb = new StringBuilder();
        int i = hVar.f;
        int length = 0;
        int iEncodeChar = 0;
        while (hVar.hasMoreCharacters()) {
            char currentChar = hVar.getCurrentChar();
            hVar.f++;
            iEncodeChar = encodeChar(currentChar, sb);
            if (sb.length() % 3 == 0) {
                i = hVar.f;
                length = sb.length();
            }
        }
        if (length != sb.length()) {
            int codewordCount = hVar.getCodewordCount() + ((sb.length() / 3) * 2) + 1;
            hVar.updateSymbolInfo(codewordCount);
            int dataCapacity = hVar.getSymbolInfo().getDataCapacity() - codewordCount;
            int length2 = sb.length() % 3;
            if ((length2 == 2 && dataCapacity != 2) || (length2 == 1 && (iEncodeChar > 3 || dataCapacity != 1))) {
                sb.setLength(length);
                hVar.f = i;
            }
        }
        if (sb.length() > 0) {
            hVar.writeCodeword((char) 230);
        }
        handleEOD(hVar, sb);
    }

    @Override // com.google.zxing.datamatrix.encoder.g
    public int getEncodingMode() {
        return 1;
    }

    public void handleEOD(h hVar, StringBuilder sb) {
        int length = (sb.length() / 3) * 2;
        int length2 = sb.length() % 3;
        int codewordCount = hVar.getCodewordCount() + length;
        hVar.updateSymbolInfo(codewordCount);
        int dataCapacity = hVar.getSymbolInfo().getDataCapacity() - codewordCount;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                writeNextTriplet(hVar, sb);
            }
            if (hVar.hasMoreCharacters()) {
                hVar.writeCodeword((char) 254);
            }
        } else if (dataCapacity == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                writeNextTriplet(hVar, sb);
            }
            if (hVar.hasMoreCharacters()) {
                hVar.writeCodeword((char) 254);
            }
            hVar.f--;
        } else {
            if (length2 != 0) {
                j0.g("Unexpected case. Please report!");
                return;
            }
            while (sb.length() >= 3) {
                writeNextTriplet(hVar, sb);
            }
            if (dataCapacity > 0 || hVar.hasMoreCharacters()) {
                hVar.writeCodeword((char) 254);
            }
        }
        hVar.signalEncoderChange(0);
    }
}
