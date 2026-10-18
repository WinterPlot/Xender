package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.c;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class MessagingClientEvent {
    private static final MessagingClientEvent p = new a().build();
    private final long a;
    private final String b;
    private final String c;
    private final MessageType d;
    private final SDKPlatform e;
    private final String f;
    private final String g;
    private final int h;
    private final int i;
    private final String j;
    private final long k;
    private final Event l;
    private final String m;
    private final long n;
    private final String o;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum Event implements c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);

        private final int number_;

        Event(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.c
        public int getNumber() {
            return this.number_;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum MessageType implements c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int number_;

        MessageType(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.c
        public int getNumber() {
            return this.number_;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum SDKPlatform implements c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);

        private final int number_;

        SDKPlatform(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.c
        public int getNumber() {
            return this.number_;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        private long a = 0;
        private String b = "";
        private String c = "";
        private MessageType d = MessageType.UNKNOWN;
        private SDKPlatform e = SDKPlatform.UNKNOWN_OS;
        private String f = "";
        private String g = "";
        private int h = 0;
        private int i = 0;
        private String j = "";
        private long k = 0;
        private Event l = Event.UNKNOWN_EVENT;
        private String m = "";
        private long n = 0;
        private String o = "";

        public MessagingClientEvent build() {
            return new MessagingClientEvent(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
        }

        public a setAnalyticsLabel(String str) {
            this.m = str;
            return this;
        }

        public a setBulkId(long j) {
            this.k = j;
            return this;
        }

        public a setCampaignId(long j) {
            this.n = j;
            return this;
        }

        public a setCollapseKey(String str) {
            this.g = str;
            return this;
        }

        public a setComposerLabel(String str) {
            this.o = str;
            return this;
        }

        public a setEvent(Event event) {
            this.l = event;
            return this;
        }

        public a setInstanceId(String str) {
            this.c = str;
            return this;
        }

        public a setMessageId(String str) {
            this.b = str;
            return this;
        }

        public a setMessageType(MessageType messageType) {
            this.d = messageType;
            return this;
        }

        public a setPackageName(String str) {
            this.f = str;
            return this;
        }

        public a setPriority(int i) {
            this.h = i;
            return this;
        }

        public a setProjectNumber(long j) {
            this.a = j;
            return this;
        }

        public a setSdkPlatform(SDKPlatform sDKPlatform) {
            this.e = sDKPlatform;
            return this;
        }

        public a setTopic(String str) {
            this.j = str;
            return this;
        }

        public a setTtl(int i) {
            this.i = i;
            return this;
        }
    }

    public MessagingClientEvent(long j, String str, String str2, MessageType messageType, SDKPlatform sDKPlatform, String str3, String str4, int i, int i2, String str5, long j2, Event event, String str6, long j3, String str7) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = messageType;
        this.e = sDKPlatform;
        this.f = str3;
        this.g = str4;
        this.h = i;
        this.i = i2;
        this.j = str5;
        this.k = j2;
        this.l = event;
        this.m = str6;
        this.n = j3;
        this.o = str7;
    }

    public static MessagingClientEvent getDefaultInstance() {
        return p;
    }

    public static a newBuilder() {
        return new a();
    }

    public String getAnalyticsLabel() {
        return this.m;
    }

    public long getBulkId() {
        return this.k;
    }

    public long getCampaignId() {
        return this.n;
    }

    public String getCollapseKey() {
        return this.g;
    }

    public String getComposerLabel() {
        return this.o;
    }

    public Event getEvent() {
        return this.l;
    }

    public String getInstanceId() {
        return this.c;
    }

    public String getMessageId() {
        return this.b;
    }

    public MessageType getMessageType() {
        return this.d;
    }

    public String getPackageName() {
        return this.f;
    }

    public int getPriority() {
        return this.h;
    }

    public long getProjectNumber() {
        return this.a;
    }

    public SDKPlatform getSdkPlatform() {
        return this.e;
    }

    public String getTopic() {
        return this.j;
    }

    public int getTtl() {
        return this.i;
    }
}
