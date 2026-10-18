package kotlinx.serialization.json;

import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class JsonException extends SerializationException {
    private final String message;

    private JsonException(String str) {
        super(str);
        this.message = str;
    }

    public abstract String getHint();

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public abstract String getShortMessage();

    public /* synthetic */ JsonException(String str, kotlin.jvm.internal.r rVar) {
        this(str);
    }
}
