package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class w0 {
    private final int a;
    private final Field b;
    private final Field c;

    public w0(int i, Field field, Field field2) {
        this.a = i;
        this.b = field;
        this.c = field2;
    }

    public Field getCaseField() {
        return this.b;
    }

    public int getId() {
        return this.a;
    }

    public Field getValueField() {
        return this.c;
    }
}
