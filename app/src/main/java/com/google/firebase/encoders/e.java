package com.google.firebase.encoders;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface e {
    e add(c cVar, double d) throws IOException;

    e add(c cVar, float f) throws IOException;

    e add(c cVar, int i) throws IOException;

    e add(c cVar, long j) throws IOException;

    e add(c cVar, Object obj) throws IOException;

    e add(c cVar, boolean z) throws IOException;

    @Deprecated
    e add(String str, double d) throws IOException;

    @Deprecated
    e add(String str, int i) throws IOException;

    @Deprecated
    e add(String str, long j) throws IOException;

    @Deprecated
    e add(String str, Object obj) throws IOException;

    @Deprecated
    e add(String str, boolean z) throws IOException;

    e inline(Object obj) throws IOException;

    e nested(c cVar) throws IOException;

    e nested(String str) throws IOException;
}
