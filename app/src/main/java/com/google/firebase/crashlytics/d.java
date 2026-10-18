package com.google.firebase.crashlytics;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class d {
    final Map<String, String> a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a {
        private Map<String, String> a = new HashMap();

        public d build() {
            return new d(this);
        }

        public a putBoolean(String str, boolean z) {
            this.a.put(str, Boolean.toString(z));
            return this;
        }

        public a putDouble(String str, double d) {
            this.a.put(str, Double.toString(d));
            return this;
        }

        public a putFloat(String str, float f) {
            this.a.put(str, Float.toString(f));
            return this;
        }

        public a putInt(String str, int i) {
            this.a.put(str, Integer.toString(i));
            return this;
        }

        public a putLong(String str, long j) {
            this.a.put(str, Long.toString(j));
            return this;
        }

        public a putString(String str, String str2) {
            this.a.put(str, str2);
            return this;
        }
    }

    public d(a aVar) {
        this.a = aVar.a;
    }
}
