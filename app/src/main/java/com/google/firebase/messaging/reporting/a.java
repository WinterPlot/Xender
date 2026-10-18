package com.google.firebase.messaging.reporting;

import com.google.firebase.messaging.f0;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final a b = new C0644a().build();
    private final MessagingClientEvent a;

    /* JADX INFO: renamed from: com.google.firebase.messaging.reporting.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class C0644a {
        private MessagingClientEvent a = null;

        public a build() {
            return new a(this.a);
        }

        public C0644a setMessagingClientEvent(MessagingClientEvent messagingClientEvent) {
            this.a = messagingClientEvent;
            return this;
        }
    }

    public a(MessagingClientEvent messagingClientEvent) {
        this.a = messagingClientEvent;
    }

    public static a getDefaultInstance() {
        return b;
    }

    public static C0644a newBuilder() {
        return new C0644a();
    }

    public MessagingClientEvent getMessagingClientEvent() {
        MessagingClientEvent messagingClientEvent = this.a;
        return messagingClientEvent == null ? MessagingClientEvent.getDefaultInstance() : messagingClientEvent;
    }

    public MessagingClientEvent getMessagingClientEventInternal() {
        return this.a;
    }

    public byte[] toByteArray() {
        return f0.encode(this);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        f0.encode(this, outputStream);
    }
}
