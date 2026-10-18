package com.userlabs.xshare.push.db;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class d {
    private String a;
    private int b;
    private long c;
    private long d;
    private String e;
    private int f;
    private boolean g;
    private Map<String, Object> h;

    public static d newEntity(Map<String, Object> map, long j, int i, boolean z) {
        d dVar = new d();
        dVar.a = String.valueOf(map.get("record_id"));
        dVar.e = String.valueOf(map.get("event_id"));
        long jCurrentTimeMillis = System.currentTimeMillis();
        dVar.c = jCurrentTimeMillis;
        dVar.h = map;
        dVar.d = jCurrentTimeMillis + j;
        dVar.b = 0;
        dVar.f = i;
        dVar.g = z;
        return dVar;
    }

    public Map<String, Object> getEvent_content() {
        return this.h;
    }

    public String getEvent_id() {
        return this.e;
    }

    public int getEvent_type() {
        return this.f;
    }

    public long getExpire_time() {
        return this.d;
    }

    public String getRecord_id() {
        return this.a;
    }

    public long getSave_time() {
        return this.c;
    }

    public int getUp_state() {
        return this.b;
    }

    public boolean isNeed_a_help() {
        return this.g;
    }

    public void setEvent_content(Map<String, Object> map) {
        this.h = map;
    }

    public void setEvent_id(String str) {
        this.e = str;
    }

    public void setEvent_type(int i) {
        this.f = i;
    }

    public void setExpire_time(long j) {
        this.d = j;
    }

    public void setNeed_a_help(boolean z) {
        this.g = z;
    }

    public void setRecord_id(String str) {
        this.a = str;
    }

    public void setSave_time(long j) {
        this.c = j;
    }

    public void setUp_state(int i) {
        this.b = i;
    }
}
