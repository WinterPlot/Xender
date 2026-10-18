package com.google.common.base;

import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class o extends b.v {
    private final char[] b;
    private final boolean c;
    private final long d;

    private o(char[] cArr, long j, boolean z, String str) {
        super(str);
        this.b = cArr;
        this.d = j;
        this.c = z;
    }

    private boolean checkFilter(int i) {
        return ((this.d >> i) & 1) == 1;
    }

    public static int chooseTableSize(int i) {
        if (i == 1) {
            return 2;
        }
        int iHighestOneBit = Integer.highestOneBit(i - 1) << 1;
        while (((double) iHighestOneBit) * 0.5d < i) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static b from(BitSet bitSet, String str) {
        int i;
        int iCardinality = bitSet.cardinality();
        boolean z = bitSet.get(0);
        int iChooseTableSize = chooseTableSize(iCardinality);
        char[] cArr = new char[iChooseTableSize];
        int i2 = iChooseTableSize - 1;
        int iNextSetBit = bitSet.nextSetBit(0);
        long j = 0;
        while (iNextSetBit != -1) {
            long j2 = (1 << iNextSetBit) | j;
            int iSmear = smear(iNextSetBit);
            while (true) {
                i = iSmear & i2;
                if (cArr[i] == 0) {
                    break;
                }
                iSmear = i + 1;
            }
            cArr[i] = (char) iNextSetBit;
            iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1);
            j = j2;
        }
        return new o(cArr, j, z, str);
    }

    public static int smear(int i) {
        return Integer.rotateLeft(i * (-862048943), 15) * 461845907;
    }

    @Override // com.google.common.base.b
    public boolean matches(char c) {
        if (c == 0) {
            return this.c;
        }
        if (!checkFilter(c)) {
            return false;
        }
        int length = this.b.length - 1;
        int iSmear = smear(c) & length;
        int i = iSmear;
        do {
            char c2 = this.b[i];
            if (c2 == 0) {
                return false;
            }
            if (c2 == c) {
                return true;
            }
            i = (i + 1) & length;
        } while (i != iSmear);
        return false;
    }

    @Override // com.google.common.base.b
    public void setBits(BitSet bitSet) {
        if (this.c) {
            bitSet.set(0);
        }
        for (char c : this.b) {
            if (c != 0) {
                bitSet.set(c);
            }
        }
    }
}
