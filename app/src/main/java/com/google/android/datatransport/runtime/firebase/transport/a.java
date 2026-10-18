package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.m;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final a e = new C0549a().build();
    private final e a;
    private final List<c> b;
    private final b c;
    private final String d;

    /* JADX INFO: renamed from: com.google.android.datatransport.runtime.firebase.transport.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class C0549a {
        private e a = null;
        private List<c> b = new ArrayList();
        private b c = null;
        private String d = "";

        public C0549a addLogSourceMetrics(c cVar) {
            this.b.add(cVar);
            return this;
        }

        public a build() {
            return new a(this.a, DesugarCollections.unmodifiableList(this.b), this.c, this.d);
        }

        public C0549a setAppNamespace(String str) {
            this.d = str;
            return this;
        }

        public C0549a setGlobalMetrics(b bVar) {
            this.c = bVar;
            return this;
        }

        public C0549a setLogSourceMetricsList(List<c> list) {
            this.b = list;
            return this;
        }

        public C0549a setWindow(e eVar) {
            this.a = eVar;
            return this;
        }
    }

    public a(e eVar, List<c> list, b bVar, String str) {
        this.a = eVar;
        this.b = list;
        this.c = bVar;
        this.d = str;
    }

    public static a getDefaultInstance() {
        return e;
    }

    public static C0549a newBuilder() {
        return new C0549a();
    }

    public String getAppNamespace() {
        return this.d;
    }

    public b getGlobalMetrics() {
        b bVar = this.c;
        return bVar == null ? b.getDefaultInstance() : bVar;
    }

    public b getGlobalMetricsInternal() {
        return this.c;
    }

    public List<c> getLogSourceMetricsList() {
        return this.b;
    }

    public e getWindow() {
        e eVar = this.a;
        return eVar == null ? e.getDefaultInstance() : eVar;
    }

    public e getWindowInternal() {
        return this.a;
    }

    public byte[] toByteArray() {
        return m.encode(this);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        m.encode(this, outputStream);
    }
}
