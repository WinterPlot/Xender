package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class ActivityResult implements Parcelable {
    private final int a;
    private final Intent b;
    public static final b c = new b(null);
    public static final Parcelable.Creator<ActivityResult> CREATOR = new a();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityResult(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        parcel.getClass();
    }

    public static final String resultCodeToString(int i) {
        return c.resultCodeToString(i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Intent getData() {
        return this.b;
    }

    public final int getResultCode() {
        return this.a;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + c.resultCodeToString(this.a) + ", data=" + this.b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        parcel.writeInt(this.b == null ? 0 : 1);
        Intent intent = this.b;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b {
        public /* synthetic */ b(r rVar) {
            this();
        }

        public final String resultCodeToString(int i) {
            if (i != -1) {
                return i != 0 ? String.valueOf(i) : "RESULT_CANCELED";
            }
            return "RESULT_OK";
        }

        private b() {
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a implements Parcelable.Creator<ActivityResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ActivityResult createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ActivityResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ActivityResult[] newArray(int i) {
            return new ActivityResult[i];
        }
    }

    public ActivityResult(int i, Intent intent) {
        this.a = i;
        this.b = intent;
    }
}
