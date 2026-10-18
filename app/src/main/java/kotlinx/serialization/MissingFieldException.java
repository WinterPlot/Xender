package kotlinx.serialization;

import androidx.camera.camera2.pipe.w;
import java.util.List;
import kotlin.collections.v;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class MissingFieldException extends SerializationException {
    private final List<String> missingFields;
    private final String serialName;

    /* JADX WARN: Illegal instructions before constructor call */
    public MissingFieldException(List<String> list, String str) {
        this(buildMessage(list, str), null, list, str);
    }

    private static String buildMessage(List<String> list, String str) {
        if (list.size() == 1) {
            return "Field '" + list.get(0) + "' is required for type with serial name '" + str + "', but it was missing";
        }
        return "Fields " + list + " are required for type with serial name '" + str + "', but they were missing";
    }

    public final List<String> getMissingFields() {
        return this.missingFields;
    }

    public final String getSerialName() {
        return this.serialName;
    }

    public final MissingFieldException withNewMessageInternal$kotlinx_serialization_core(String str) {
        str.getClass();
        return new MissingFieldException(str, this, this.missingFields, this.serialName);
    }

    private MissingFieldException(String str, Throwable th, List<String> list, String str2) {
        super(str, th);
        this.missingFields = list;
        this.serialName = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(String str, String str2) {
        this("Field '" + str + "' is required for type with serial name '" + str2 + "', but it was missing", null, v.listOf(str), str2);
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(List<String> list, String str, Throwable th) {
        this(str, th, list, null);
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MissingFieldException(String str) {
        this("Field '" + str + "' is required, but it was missing", null, v.listOf(str), null);
        str.getClass();
    }
}
