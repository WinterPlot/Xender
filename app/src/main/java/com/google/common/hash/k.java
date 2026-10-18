package com.google.common.hash;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface k extends q {
    HashCode hash();

    @Deprecated
    int hashCode();

    @Override // com.google.common.hash.q
    k putBoolean(boolean z);
