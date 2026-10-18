package androidx.media3.session;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.media3.common.PlaybackException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public interface p extends IInterface {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedList(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                writeTypedObject(parcel, list.get(i2), i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void onAvailableCommandsChangedFromPlayer(int i, Bundle bundle) throws RemoteException;

    void onAvailableCommandsChangedFromSession(int i, Bundle bundle, Bundle bundle2) throws RemoteException;

    void onChildrenChanged(int i, String str, int i2, Bundle bundle) throws RemoteException;

    void onConnected(int i, Bundle bundle) throws RemoteException;

    void onCustomCommand(int i, Bundle bundle, Bundle bundle2) throws RemoteException;

    void onCustomCommandProgressUpdate(int i, Bundle bundle, Bundle bundle2, Bundle bundle3) throws RemoteException;

    void onDisconnected(int i) throws RemoteException;

    void onError(int i, Bundle bundle) throws RemoteException;

    void onExtrasChanged(int i, Bundle bundle) throws RemoteException;

    void onLibraryResult(int i, Bundle bundle) throws RemoteException;

    void onPeriodicSessionPositionInfoChanged(int i, Bundle bundle) throws RemoteException;

    void onPlayerInfoChanged(int i, Bundle bundle, boolean z) throws RemoteException;

    void onPlayerInfoChangedWithExclusions(int i, Bundle bundle, Bundle bundle2) throws RemoteException;

    void onRenderedFirstFrame(int i) throws RemoteException;

    void onSearchResultChanged(int i, String str, int i2, Bundle bundle) throws RemoteException;

    void onSessionActivityChanged(int i, PendingIntent pendingIntent) throws RemoteException;

    void onSessionResult(int i, Bundle bundle) throws RemoteException;

    void onSetCustomLayout(int i, List<Bundle> list) throws RemoteException;

    void onSetMediaButtonPreferences(int i, List<Bundle> list) throws RemoteException;

    void onSurfaceSizeChanged(int i, int i2, int i3) throws RemoteException;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a extends Binder implements p {

        /* JADX INFO: renamed from: androidx.media3.session.p$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public static class C0221a implements p {
            private IBinder a;

            public C0221a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            public String getInterfaceDescriptor() {
                return "androidx.media3.session.IMediaController";
            }

            @Override // androidx.media3.session.p
            public void onAvailableCommandsChangedFromPlayer(int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    this.a.transact(3009, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.p
            public void onAvailableCommandsChangedFromSession(int i, Bundle bundle, Bundle bundle2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    b.writeTypedObject(parcelObtain, bundle2, 0);
                    this.a.transact(3010, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.p
            public void onChildrenChanged(int i, String str, int i2, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i2);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    this.a.transact(PlaybackException.ERROR_CODE_DECODER_INIT_FAILED, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.p
            public void onConnected(int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    this.a.transact(PlaybackException.ERROR_CODE_PARSING_CONTAINER_MALFORMED, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.p
            public void onCustomCommand(int i, Bundle bundle, Bundle bundle2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    b.writeTypedObject(parcelObtain, bundle2, 0);
                    this.a.transact(3005, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.p
            public void onCustomCommandProgressUpdate(int i, Bundle bundle, Bundle bundle2, Bundle bundle3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    b.writeTypedObject(parcelObtain, bundle2, 0);
                    b.writeTypedObject(parcelObtain, bundle3, 0);
                    this.a.transact(3017, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.p
            public void onDisconnected(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    this.a.transact(3006, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.p
            public void onError(int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    this.a.transact(3015, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.p
            public void onExtrasChanged(int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    this.a.transact(3012, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.p
            public void onLibraryResult(int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    this.a.transact(PlaybackException.ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.p
            public void onPeriodicSessionPositionInfoChanged(int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    this.a.transact(3008, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.p
            public void onPlayerInfoChanged(int i, Bundle bundle, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.a.transact(3007, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.p
            public void onPlayerInfoChangedWithExclusions(int i, Bundle bundle, Bundle bundle2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    b.writeTypedObject(parcelObtain, bundle2, 0);
                    this.a.transact(3013, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.p
            public void onRenderedFirstFrame(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    this.a.transact(3011, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.p
            public void onSearchResultChanged(int i, String str, int i2, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i2);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    this.a.transact(PlaybackException.ERROR_CODE_DECODER_QUERY_FAILED, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.p
            public void onSessionActivityChanged(int i, PendingIntent pendingIntent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, pendingIntent, 0);
                    this.a.transact(3014, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.p
            public void onSessionResult(int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    this.a.transact(PlaybackException.ERROR_CODE_PARSING_MANIFEST_MALFORMED, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.p
            public void onSetCustomLayout(int i, List<Bundle> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    b.writeTypedList(parcelObtain, list, 0);
                    this.a.transact(PlaybackException.ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.p
            public void onSetMediaButtonPreferences(int i, List<Bundle> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    b.writeTypedList(parcelObtain, list, 0);
                    this.a.transact(3016, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.p
            public void onSurfaceSizeChanged(int i, int i2, int i3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    this.a.transact(3018, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.media3.session.IMediaController");
        }

        public static p asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof p)) ? new C0221a(iBinder) : (p) iInterfaceQueryLocalInterface;
        }

        public abstract /* synthetic */ void onAvailableCommandsChangedFromPlayer(int i, Bundle bundle) throws RemoteException;

        public abstract /* synthetic */ void onAvailableCommandsChangedFromSession(int i, Bundle bundle, Bundle bundle2) throws RemoteException;

        public abstract /* synthetic */ void onChildrenChanged(int i, String str, int i2, Bundle bundle) throws RemoteException;

        public abstract /* synthetic */ void onConnected(int i, Bundle bundle) throws RemoteException;

        public abstract /* synthetic */ void onCustomCommand(int i, Bundle bundle, Bundle bundle2) throws RemoteException;

        public abstract /* synthetic */ void onCustomCommandProgressUpdate(int i, Bundle bundle, Bundle bundle2, Bundle bundle3) throws RemoteException;

        public abstract /* synthetic */ void onDisconnected(int i) throws RemoteException;

        public abstract /* synthetic */ void onError(int i, Bundle bundle) throws RemoteException;

        public abstract /* synthetic */ void onExtrasChanged(int i, Bundle bundle) throws RemoteException;

        public abstract /* synthetic */ void onLibraryResult(int i, Bundle bundle) throws RemoteException;

        public abstract /* synthetic */ void onPeriodicSessionPositionInfoChanged(int i, Bundle bundle) throws RemoteException;

        public abstract /* synthetic */ void onPlayerInfoChanged(int i, Bundle bundle, boolean z) throws RemoteException;

        public abstract /* synthetic */ void onPlayerInfoChangedWithExclusions(int i, Bundle bundle, Bundle bundle2) throws RemoteException;

        public abstract /* synthetic */ void onRenderedFirstFrame(int i) throws RemoteException;

        public abstract /* synthetic */ void onSearchResultChanged(int i, String str, int i2, Bundle bundle) throws RemoteException;

        public abstract /* synthetic */ void onSessionActivityChanged(int i, PendingIntent pendingIntent) throws RemoteException;

        public abstract /* synthetic */ void onSessionResult(int i, Bundle bundle) throws RemoteException;

        public abstract /* synthetic */ void onSetCustomLayout(int i, List list) throws RemoteException;

        public abstract /* synthetic */ void onSetMediaButtonPreferences(int i, List list) throws RemoteException;

        public abstract /* synthetic */ void onSurfaceSizeChanged(int i, int i2, int i3) throws RemoteException;

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.media3.session.IMediaController");
            }
            if (i == 1598968902) {
                parcel2.writeString("androidx.media3.session.IMediaController");
                return true;
            }
            if (i == 4001) {
                onChildrenChanged(parcel.readInt(), parcel.readString(), parcel.readInt(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR));
            } else if (i != 4002) {
                switch (i) {
                    case PlaybackException.ERROR_CODE_PARSING_CONTAINER_MALFORMED /* 3001 */:
                        onConnected(parcel.readInt(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR));
                        break;
                    case PlaybackException.ERROR_CODE_PARSING_MANIFEST_MALFORMED /* 3002 */:
                        onSessionResult(parcel.readInt(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR));
                        break;
                    case PlaybackException.ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED /* 3003 */:
                        onLibraryResult(parcel.readInt(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR));
                        break;
                    case PlaybackException.ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED /* 3004 */:
                        onSetCustomLayout(parcel.readInt(), parcel.createTypedArrayList(Bundle.CREATOR));
                        break;
                    case 3005:
                        int i3 = parcel.readInt();
                        Parcelable.Creator creator = Bundle.CREATOR;
                        onCustomCommand(i3, (Bundle) b.readTypedObject(parcel, creator), (Bundle) b.readTypedObject(parcel, creator));
                        break;
                    case 3006:
                        onDisconnected(parcel.readInt());
                        break;
                    case 3007:
                        onPlayerInfoChanged(parcel.readInt(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                        break;
                    case 3008:
                        onPeriodicSessionPositionInfoChanged(parcel.readInt(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR));
                        break;
                    case 3009:
                        onAvailableCommandsChangedFromPlayer(parcel.readInt(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR));
                        break;
                    case 3010:
                        int i4 = parcel.readInt();
                        Parcelable.Creator creator2 = Bundle.CREATOR;
                        onAvailableCommandsChangedFromSession(i4, (Bundle) b.readTypedObject(parcel, creator2), (Bundle) b.readTypedObject(parcel, creator2));
                        break;
                    case 3011:
                        onRenderedFirstFrame(parcel.readInt());
                        break;
                    case 3012:
                        onExtrasChanged(parcel.readInt(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR));
                        break;
                    case 3013:
                        int i5 = parcel.readInt();
                        Parcelable.Creator creator3 = Bundle.CREATOR;
                        onPlayerInfoChangedWithExclusions(i5, (Bundle) b.readTypedObject(parcel, creator3), (Bundle) b.readTypedObject(parcel, creator3));
                        break;
                    case 3014:
                        onSessionActivityChanged(parcel.readInt(), (PendingIntent) b.readTypedObject(parcel, PendingIntent.CREATOR));
                        break;
                    case 3015:
                        onError(parcel.readInt(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR));
                        break;
                    case 3016:
                        onSetMediaButtonPreferences(parcel.readInt(), parcel.createTypedArrayList(Bundle.CREATOR));
                        break;
                    case 3017:
                        int i6 = parcel.readInt();
                        Parcelable.Creator creator4 = Bundle.CREATOR;
                        onCustomCommandProgressUpdate(i6, (Bundle) b.readTypedObject(parcel, creator4), (Bundle) b.readTypedObject(parcel, creator4), (Bundle) b.readTypedObject(parcel, creator4));
                        break;
                    case 3018:
                        onSurfaceSizeChanged(parcel.readInt(), parcel.readInt(), parcel.readInt());
                        break;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                onSearchResultChanged(parcel.readInt(), parcel.readString(), parcel.readInt(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR));
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
