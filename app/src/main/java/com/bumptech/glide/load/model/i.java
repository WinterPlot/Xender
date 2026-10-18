package com.bumptech.glide.load.model;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface i {

    @Deprecated
    public static final i a = new a();
    public static final i b = new k.a().build();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a implements i {
        @Override // com.bumptech.glide.load.model.i
        public Map<String, String> getHeaders() {
            return Collections.EMPTY_MAP;
        }
    }

    Map<String, String> getHeaders();
}
