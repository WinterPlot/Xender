package com.google.firebase.messaging;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f0 {
    private static final com.google.firebase.encoders.proto.f a = com.google.firebase.encoders.proto.f.builder().configureWith(a.a).build();

    private f0() {
    }

    public static byte[] encode(Object obj) {
        return a.encode(obj);
    }

    public abstract com.google.firebase.messaging.reporting.a getMessagingClientEventExtension();

    public static void encode(Object obj, OutputStream outputStream) throws IOException {
        a.encode(obj, outputStream);
    }
}
