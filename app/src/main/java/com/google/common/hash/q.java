package com.google.common.hash;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface q {
    q putBoolean(boolean z);

    q putByte(byte b);

    q putBytes(ByteBuffer byteBuffer);

    q putBytes(byte[] bArr);

    q putBytes(byte[] bArr, int i, int i2);

    q putChar(char c);

    q putDouble(double d);

    q putFloat(float f);

    q putInt(int i);

    q putLong(long j);

    q putShort(short s);

    q putString(CharSequence charSequence, Charset charset);

    q putUnencodedChars(CharSequence charSequence);
}
