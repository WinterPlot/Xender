package kotlinx.serialization.json;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class JsonEncodingException extends JsonException {
    private final String classSerialName;
    private final String hint;
    private final String shortMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonEncodingException(String str, String str2, String str3) {
        super(kotlinx.serialization.json.internal.v.formatEncodingException(str, str3), null);
        str.getClass();
        this.shortMessage = str;
        this.classSerialName = str2;
        this.hint = str3;
    }

    public final String getClassSerialName() {
        return this.classSerialName;
    }

    @Override // kotlinx.serialization.json.JsonException
    public String getHint() {
        return this.hint;
    }

    @Override // kotlinx.serialization.json.JsonException
    public String getShortMessage() {
        return this.shortMessage;
    }

    public /* synthetic */ JsonEncodingException(String str, String str2, String str3, int i, kotlin.jvm.internal.r rVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
