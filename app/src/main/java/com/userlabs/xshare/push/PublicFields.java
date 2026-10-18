package com.userlabs.xshare.push;

import com.userlabs.xshare.core.utils.q;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class PublicFields {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class AddDataInterruptionException extends IllegalArgumentException {
        public AddDataInterruptionException() {
            super("add data interruption");
        }
    }

    public Map<String, Object> createPublicFields() {
        HashMap map = new HashMap();
        map.put("event_id", getEventId());
        map.put("event_t", Long.valueOf(System.currentTimeMillis()));
        map.put("record_id", q.create());
        return map;
    }

    public abstract String getEventId();
}
