package androidx.activity.result;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {
    private final IntentSender a;
    private final Intent b;
    private final int c;
    private final int d;
    public static final c e = new c(null);
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new b();

    /* JADX WARN: Illegal instructions before constructor call */
    public IntentSenderRequest(Parcel parcel) {
        this((IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader()), (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Intent getFillInIntent() {
        return this.b;
    }

    public final int getFlagsMask() {
        return this.c;
    }

    public final int getFlagsValues() {
        return this.d;
    }

    public final IntentSender getIntentSender() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class c {
        public /* synthetic */ c(r rVar) {
            this();
        }

        private c() {
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b implements Parcelable.Creator<IntentSenderRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new IntentSenderRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IntentSenderRequest[] newArray(int i) {
            return new IntentSenderRequest[i];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        private final IntentSender a;
        private Intent b;
        private int c;
        private int d;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(PendingIntent pendingIntent) {
            this(pendingIntent.getIntentSender());
        }

        public final IntentSenderRequest build() {
            return new IntentSenderRequest(this.a, this.b, this.c, this.d);
        }

        public final a setFillInIntent(Intent intent) {
            this.b = intent;
            return this;
        }

        public final a setFlags(int i, int i2) {
            this.d = i;
            this.c = i2;
            return this;
        }

        public a(IntentSender intentSender) {
            intentSender.getClass();
            this.a = intentSender;
        }
    }

    public /* synthetic */ IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2, int i3, r rVar) {
        this(intentSender, (i3 & 2) != 0 ? null : intent, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        intentSender.getClass();
        this.a = intentSender;
        this.b = intent;
        this.c = i;
        this.d = i2;
    }
}
