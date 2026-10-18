package com.google.firebase.encoders;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface a {
    String encode(Object obj);

    void encode(Object obj, Writer writer) throws IOException;
}
