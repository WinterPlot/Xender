package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
class w {
    private final String a;
    private final com.google.firebase.crashlytics.internal.persistence.b b;

    public w(String str, com.google.firebase.crashlytics.internal.persistence.b bVar) {
        this.a = str;
        this.b = bVar;
    }

    private File getMarkerFile() {
        return this.b.getCommonFile(this.a);
    }

    public boolean create() {
        try {
            return getMarkerFile().createNewFile();
        } catch (IOException e) {
            com.google.firebase.crashlytics.internal.f.getLogger().e("Error creating marker: " + this.a, e);
            return false;
        }
    }

    public boolean isPresent() {
        return getMarkerFile().exists();
    }

    public boolean remove() {
        return getMarkerFile().delete();
    }
}
