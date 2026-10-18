package com.userlabs.xshare.utils;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class BlFilterClient<E> implements Serializable {
    static final Charset charset = Charset.forName("UTF-8");
    static final MessageDigest digestFunction;
    static final String hashName = "MD5";
    private final int bitSetSize;
    private final double bitsPerElement;
    private BitSet bitset;
    private final int expectedNumberOfFilterElements;
    private final int k;
    private int numberOfAddedElements;

    static {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance(hashName);
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        digestFunction = messageDigest;
    }

    public BlFilterClient(double d, int i, BitSet bitSet) {
        this(Math.ceil(-(Math.log(d) / Math.log(2.0d))) / Math.log(2.0d), i, (int) Math.ceil(-(Math.log(d) / Math.log(2.0d))));
        this.bitset = bitSet;
    }

    public static byte[] bitSetToByteArray(BitSet bitSet) {
        byte[] bArr = new byte[(bitSet.size() + 7) / 8];
        for (int i = 0; i < bitSet.length(); i++) {
            if (bitSet.get(i)) {
                int i2 = i / 8;
                bArr[i2] = (byte) (bArr[i2] | (1 << (7 - (i % 8))));
            }
        }
        return bArr;
    }

    public static BitSet byteArray2BitSet(byte[] bArr) {
        BitSet bitSet = new BitSet(bArr.length * 8);
        int i = 0;
        for (byte b : bArr) {
            int i2 = 7;
            while (i2 >= 0) {
                int i3 = i + 1;
                boolean z = true;
                if (((b & (1 << i2)) >> i2) != 1) {
                    z = false;
                }
                bitSet.set(i, z);
                i2--;
                i = i3;
            }
        }
        return bitSet;
    }

    public static BitSet convert(String str) {
        try {
            return byteArray2BitSet(c.decode(str.getBytes("utf-8")));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int createHash(String str, Charset charset2) {
        return createHash(str.getBytes(charset2));
    }

    public static int[] createHashes(byte[] bArr, int i) {
        byte[] bArrDigest;
        int[] iArr = new int[i];
        int i2 = 0;
        byte b = 0;
        while (i2 < i) {
            MessageDigest messageDigest = digestFunction;
            synchronized (messageDigest) {
                messageDigest.update(b);
                b = (byte) (b + 1);
                bArrDigest = messageDigest.digest(bArr);
            }
            for (int i3 = 0; i3 < bArrDigest.length / 4 && i2 < i; i3++) {
                int i4 = i3 * 4;
                int i5 = 0;
                for (int i6 = i4; i6 < i4 + 4; i6++) {
                    i5 = (i5 << 8) | (bArrDigest[i6] & 255);
                }
                iArr[i2] = i5;
                i2++;
            }
        }
        return iArr;
    }

    public void add(byte[] bArr) {
        for (int i : createHashes(bArr, this.k)) {
            this.bitset.set(Math.abs(i % this.bitSetSize), true);
        }
        this.numberOfAddedElements++;
    }

    public void addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public void clear() {
        this.bitset.clear();
        this.numberOfAddedElements = 0;
    }

    public boolean contains(byte[] bArr) {
        for (int i : createHashes(bArr, this.k)) {
            if (!this.bitset.get(Math.abs(i % this.bitSetSize))) {
                return false;
            }
        }
        return true;
    }

    public boolean containsAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int count() {
        return this.numberOfAddedElements;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BlFilterClient blFilterClient = (BlFilterClient) obj;
        if (this.expectedNumberOfFilterElements != blFilterClient.expectedNumberOfFilterElements || this.k != blFilterClient.k || this.bitSetSize != blFilterClient.bitSetSize) {
            return false;
        }
        BitSet bitSet = this.bitset;
        BitSet bitSet2 = blFilterClient.bitset;
        if (bitSet != bitSet2) {
            return bitSet != null && bitSet.equals(bitSet2);
        }
        return true;
    }

    public double expectedFalsePositiveProbability() {
        return getFalsePositiveProbability(this.expectedNumberOfFilterElements);
    }

    public boolean getBit(int i) {
        return this.bitset.get(i);
    }

    public BitSet getBitSet() {
        return this.bitset;
    }

    public double getBitsPerElement() {
        return ((double) this.bitSetSize) / ((double) this.numberOfAddedElements);
    }

    public double getExpectedBitsPerElement() {
        return this.bitsPerElement;
    }

    public int getExpectedNumberOfElements() {
        return this.expectedNumberOfFilterElements;
    }

    public double getFalsePositiveProbability(double d) {
        return Math.pow(1.0d - Math.exp((((double) (-this.k)) * d) / ((double) this.bitSetSize)), this.k);
    }

    public int getK() {
        return this.k;
    }

    public int hashCode() {
        BitSet bitSet = this.bitset;
        return ((((((427 + (bitSet != null ? bitSet.hashCode() : 0)) * 61) + this.expectedNumberOfFilterElements) * 61) + this.bitSetSize) * 61) + this.k;
    }

    public void setBit(int i, boolean z) {
        this.bitset.set(i, z);
    }

    public int size() {
        return this.bitSetSize;
    }

    public static int createHash(String str) {
        return createHash(str, charset);
    }

    public static int createHash(byte[] bArr) {
        return createHashes(bArr, 1)[0];
    }

    public static String convert(BitSet bitSet) {
        return c.encode(bitSetToByteArray(bitSet));
    }

    public double getFalsePositiveProbability() {
        return getFalsePositiveProbability(this.numberOfAddedElements);
    }

    public void add(E e) {
        add(e.toString().getBytes(charset));
    }

    public boolean contains(E e) {
        return contains(e.toString().getBytes(charset));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BlFilterClient(int i, int i2) {
        this(((double) i) / ((double) i2), i2, (int) Math.round(Math.log(2.0d) * (((double) i) / ((double) i2))));
    }

    public BlFilterClient(double d, int i) {
        this(Math.ceil(-(Math.log(d) / Math.log(2.0d))) / Math.log(2.0d), i, (int) Math.ceil(-(Math.log(d) / Math.log(2.0d))));
    }

    public BlFilterClient(double d, int i, int i2) {
        this.expectedNumberOfFilterElements = i;
        this.k = i2;
        this.bitsPerElement = d;
        int iCeil = (int) Math.ceil(d * ((double) i));
        this.bitSetSize = iCeil;
        this.numberOfAddedElements = 0;
        this.bitset = new BitSet(iCeil);
    }

    public BlFilterClient(int i, int i2, int i3, BitSet bitSet) {
        this(i, i2);
        this.bitset = bitSet;
        this.numberOfAddedElements = i3;
    }
}
