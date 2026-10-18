package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface c extends IInterface {
    public static final String q = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedList(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeTypedObject(list.get(i2), i);
            }
        }
    }

    Bundle extraCommand(String str, Bundle bundle) throws RemoteException;

    int getInterfaceVersion() throws RemoteException;

    boolean isEngagementSignalsApiAvailable(android.support.customtabs.b bVar, Bundle bundle) throws RemoteException;

    boolean mayLaunchUrl(android.support.customtabs.b bVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    boolean newAuthTabSession(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException;

    boolean newSession(android.support.customtabs.b bVar) throws RemoteException;

    boolean newSessionWithExtras(android.support.customtabs.b bVar, Bundle bundle) throws RemoteException;

    int postMessage(android.support.customtabs.b bVar, String str, Bundle bundle) throws RemoteException;

    void prefetch(android.support.customtabs.b bVar, Uri uri, Bundle bundle) throws RemoteException;

    void prefetchWithMultipleUrls(android.support.customtabs.b bVar, List<Uri> list, Bundle bundle) throws RemoteException;

    boolean receiveFile(android.support.customtabs.b bVar, Uri uri, int i, Bundle bundle) throws RemoteException;

    boolean requestPostMessageChannel(android.support.customtabs.b bVar, Uri uri) throws RemoteException;

    boolean requestPostMessageChannelWithExtras(android.support.customtabs.b bVar, Uri uri, Bundle bundle) throws RemoteException;

    boolean setEngagementSignalsCallback(android.support.customtabs.b bVar, IBinder iBinder, Bundle bundle) throws RemoteException;

    boolean updateVisuals(android.support.customtabs.b bVar, Bundle bundle) throws RemoteException;

    boolean validateRelationship(android.support.customtabs.b bVar, int i, Uri uri, Bundle bundle) throws RemoteException;

    boolean warmup(long j) throws RemoteException;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a extends Binder implements c {

        /* JADX INFO: renamed from: android.support.customtabs.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public static class C0003a implements c {
            private IBinder a;
            private int b = -1;

            public C0003a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // android.support.customtabs.c
            public Bundle extraCommand(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.q);
                    parcelObtain.writeString(str);
                    parcelObtain.writeTypedObject(bundle, 0);
                    if (!this.a.transact(5, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method extraCommand is unimplemented.");
                    }
                    parcelObtain2.readException();
                    Bundle bundle2 = (Bundle) parcelObtain2.readTypedObject(Bundle.CREATOR);
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return bundle2;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            public String getInterfaceDescriptor() {
                return c.q;
            }

            @Override // android.support.customtabs.c
            public int getInterfaceVersion() throws RemoteException {
                if (this.b == -1) {
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(c.q);
                        this.a.transact(16777215, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        this.b = parcelObtain2.readInt();
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                }
                return this.b;
            }

            @Override // android.support.customtabs.c
            public boolean isEngagementSignalsApiAvailable(android.support.customtabs.b bVar, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.q);
                    parcelObtain.writeStrongInterface(bVar);
                    parcelObtain.writeTypedObject(bundle, 0);
                    if (!this.a.transact(13, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method isEngagementSignalsApiAvailable is unimplemented.");
                    }
                    parcelObtain2.readException();
                    boolean z = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.customtabs.c
            public boolean mayLaunchUrl(android.support.customtabs.b bVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.q);
                    parcelObtain.writeStrongInterface(bVar);
                    parcelObtain.writeTypedObject(uri, 0);
                    parcelObtain.writeTypedObject(bundle, 0);
                    b.writeTypedList(parcelObtain, list, 0);
                    if (!this.a.transact(4, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method mayLaunchUrl is unimplemented.");
                    }
                    parcelObtain2.readException();
                    boolean z = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.customtabs.c
            public boolean newAuthTabSession(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.q);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeTypedObject(bundle, 0);
                    if (!this.a.transact(18, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method newAuthTabSession is unimplemented.");
                    }
                    parcelObtain2.readException();
                    boolean z = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.customtabs.c
            public boolean newSession(android.support.customtabs.b bVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.q);
                    parcelObtain.writeStrongInterface(bVar);
                    if (!this.a.transact(3, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method newSession is unimplemented.");
                    }
                    parcelObtain2.readException();
                    boolean z = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.customtabs.c
            public boolean newSessionWithExtras(android.support.customtabs.b bVar, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.q);
                    parcelObtain.writeStrongInterface(bVar);
                    parcelObtain.writeTypedObject(bundle, 0);
                    if (!this.a.transact(10, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method newSessionWithExtras is unimplemented.");
                    }
                    parcelObtain2.readException();
                    boolean z = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.customtabs.c
            public int postMessage(android.support.customtabs.b bVar, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.q);
                    parcelObtain.writeStrongInterface(bVar);
                    parcelObtain.writeString(str);
                    parcelObtain.writeTypedObject(bundle, 0);
                    if (!this.a.transact(8, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method postMessage is unimplemented.");
                    }
                    parcelObtain2.readException();
                    int i = parcelObtain2.readInt();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return i;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.customtabs.c
            public void prefetch(android.support.customtabs.b bVar, Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.q);
                    parcelObtain.writeStrongInterface(bVar);
                    parcelObtain.writeTypedObject(uri, 0);
                    parcelObtain.writeTypedObject(bundle, 0);
                    if (!this.a.transact(15, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method prefetch is unimplemented.");
                    }
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.customtabs.c
            public void prefetchWithMultipleUrls(android.support.customtabs.b bVar, List<Uri> list, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.q);
                    parcelObtain.writeStrongInterface(bVar);
                    b.writeTypedList(parcelObtain, list, 0);
                    parcelObtain.writeTypedObject(bundle, 0);
                    if (!this.a.transact(16, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method prefetchWithMultipleUrls is unimplemented.");
                    }
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.customtabs.c
            public boolean receiveFile(android.support.customtabs.b bVar, Uri uri, int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.q);
                    parcelObtain.writeStrongInterface(bVar);
                    parcelObtain.writeTypedObject(uri, 0);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeTypedObject(bundle, 0);
                    if (!this.a.transact(12, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method receiveFile is unimplemented.");
                    }
                    parcelObtain2.readException();
                    boolean z = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.customtabs.c
            public boolean requestPostMessageChannel(android.support.customtabs.b bVar, Uri uri) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.q);
                    parcelObtain.writeStrongInterface(bVar);
                    parcelObtain.writeTypedObject(uri, 0);
                    if (!this.a.transact(7, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method requestPostMessageChannel is unimplemented.");
                    }
                    parcelObtain2.readException();
                    boolean z = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.customtabs.c
            public boolean requestPostMessageChannelWithExtras(android.support.customtabs.b bVar, Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.q);
                    parcelObtain.writeStrongInterface(bVar);
                    parcelObtain.writeTypedObject(uri, 0);
                    parcelObtain.writeTypedObject(bundle, 0);
                    if (!this.a.transact(11, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method requestPostMessageChannelWithExtras is unimplemented.");
                    }
                    parcelObtain2.readException();
                    boolean z = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.customtabs.c
            public boolean setEngagementSignalsCallback(android.support.customtabs.b bVar, IBinder iBinder, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.q);
                    parcelObtain.writeStrongInterface(bVar);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeTypedObject(bundle, 0);
                    if (!this.a.transact(14, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method setEngagementSignalsCallback is unimplemented.");
                    }
                    parcelObtain2.readException();
                    boolean z = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.customtabs.c
            public boolean updateVisuals(android.support.customtabs.b bVar, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.q);
                    parcelObtain.writeStrongInterface(bVar);
                    parcelObtain.writeTypedObject(bundle, 0);
                    if (!this.a.transact(6, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method updateVisuals is unimplemented.");
                    }
                    parcelObtain2.readException();
                    boolean z = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.customtabs.c
            public boolean validateRelationship(android.support.customtabs.b bVar, int i, Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.q);
                    parcelObtain.writeStrongInterface(bVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeTypedObject(uri, 0);
                    parcelObtain.writeTypedObject(bundle, 0);
                    if (!this.a.transact(9, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method validateRelationship is unimplemented.");
                    }
                    parcelObtain2.readException();
                    boolean z = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.customtabs.c
            public boolean warmup(long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c.q);
                    parcelObtain.writeLong(j);
                    if (!this.a.transact(2, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method warmup is unimplemented.");
                    }
                    parcelObtain2.readException();
                    boolean z = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }

        public a() {
            attachInterface(this, c.q);
        }

        public static c asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(c.q);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new C0003a(iBinder) : (c) iInterfaceQueryLocalInterface;
        }

        @Override // android.support.customtabs.c
        public abstract /* synthetic */ Bundle extraCommand(String str, Bundle bundle) throws RemoteException;

        @Override // android.support.customtabs.c
        public abstract /* synthetic */ int getInterfaceVersion() throws RemoteException;

        @Override // android.support.customtabs.c
        public abstract /* synthetic */ boolean isEngagementSignalsApiAvailable(android.support.customtabs.b bVar, Bundle bundle) throws RemoteException;

        @Override // android.support.customtabs.c
        public abstract /* synthetic */ boolean mayLaunchUrl(android.support.customtabs.b bVar, Uri uri, Bundle bundle, List list) throws RemoteException;

        @Override // android.support.customtabs.c
        public abstract /* synthetic */ boolean newAuthTabSession(android.support.customtabs.a aVar, Bundle bundle) throws RemoteException;

        @Override // android.support.customtabs.c
        public abstract /* synthetic */ boolean newSession(android.support.customtabs.b bVar) throws RemoteException;

        @Override // android.support.customtabs.c
        public abstract /* synthetic */ boolean newSessionWithExtras(android.support.customtabs.b bVar, Bundle bundle) throws RemoteException;

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = c.q;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 16777215) {
                parcel2.writeNoException();
                parcel2.writeInt(getInterfaceVersion());
                return true;
            }
            switch (i) {
                case 2:
                    boolean zWarmup = warmup(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zWarmup ? 1 : 0);
                    return true;
                case 3:
                    boolean zNewSession = newSession(android.support.customtabs.b.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zNewSession ? 1 : 0);
                    return true;
                case 4:
                    android.support.customtabs.b bVarAsInterface = android.support.customtabs.b.a.asInterface(parcel.readStrongBinder());
                    Uri uri = (Uri) parcel.readTypedObject(Uri.CREATOR);
                    Parcelable.Creator creator = Bundle.CREATOR;
                    boolean zMayLaunchUrl = mayLaunchUrl(bVarAsInterface, uri, (Bundle) parcel.readTypedObject(creator), parcel.createTypedArrayList(creator));
                    parcel2.writeNoException();
                    parcel2.writeInt(zMayLaunchUrl ? 1 : 0);
                    return true;
                case 5:
                    Bundle bundleExtraCommand = extraCommand(parcel.readString(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeTypedObject(bundleExtraCommand, 1);
                    return true;
                case 6:
                    boolean zUpdateVisuals = updateVisuals(android.support.customtabs.b.a.asInterface(parcel.readStrongBinder()), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zUpdateVisuals ? 1 : 0);
                    return true;
                case 7:
                    boolean zRequestPostMessageChannel = requestPostMessageChannel(android.support.customtabs.b.a.asInterface(parcel.readStrongBinder()), (Uri) parcel.readTypedObject(Uri.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRequestPostMessageChannel ? 1 : 0);
                    return true;
                case 8:
                    int iPostMessage = postMessage(android.support.customtabs.b.a.asInterface(parcel.readStrongBinder()), parcel.readString(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iPostMessage);
                    return true;
                case 9:
                    boolean zValidateRelationship = validateRelationship(android.support.customtabs.b.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Uri) parcel.readTypedObject(Uri.CREATOR), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zValidateRelationship ? 1 : 0);
                    return true;
                case 10:
                    boolean zNewSessionWithExtras = newSessionWithExtras(android.support.customtabs.b.a.asInterface(parcel.readStrongBinder()), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zNewSessionWithExtras ? 1 : 0);
                    return true;
                case 11:
                    boolean zRequestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(android.support.customtabs.b.a.asInterface(parcel.readStrongBinder()), (Uri) parcel.readTypedObject(Uri.CREATOR), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRequestPostMessageChannelWithExtras ? 1 : 0);
                    return true;
                case 12:
                    boolean zReceiveFile = receiveFile(android.support.customtabs.b.a.asInterface(parcel.readStrongBinder()), (Uri) parcel.readTypedObject(Uri.CREATOR), parcel.readInt(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zReceiveFile ? 1 : 0);
                    return true;
                case 13:
                    boolean zIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(android.support.customtabs.b.a.asInterface(parcel.readStrongBinder()), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsEngagementSignalsApiAvailable ? 1 : 0);
                    return true;
                case 14:
                    boolean engagementSignalsCallback = setEngagementSignalsCallback(android.support.customtabs.b.a.asInterface(parcel.readStrongBinder()), parcel.readStrongBinder(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(engagementSignalsCallback ? 1 : 0);
                    return true;
                case 15:
                    prefetch(android.support.customtabs.b.a.asInterface(parcel.readStrongBinder()), (Uri) parcel.readTypedObject(Uri.CREATOR), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    prefetchWithMultipleUrls(android.support.customtabs.b.a.asInterface(parcel.readStrongBinder()), parcel.createTypedArrayList(Uri.CREATOR), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 17:
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
                case 18:
                    boolean zNewAuthTabSession = newAuthTabSession(android.support.customtabs.a.AbstractBinderC0000a.asInterface(parcel.readStrongBinder()), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zNewAuthTabSession ? 1 : 0);
                    return true;
            }
        }

        @Override // android.support.customtabs.c
        public abstract /* synthetic */ int postMessage(android.support.customtabs.b bVar, String str, Bundle bundle) throws RemoteException;

        @Override // android.support.customtabs.c
        public abstract /* synthetic */ void prefetch(android.support.customtabs.b bVar, Uri uri, Bundle bundle) throws RemoteException;

        @Override // android.support.customtabs.c
        public abstract /* synthetic */ void prefetchWithMultipleUrls(android.support.customtabs.b bVar, List list, Bundle bundle) throws RemoteException;

        @Override // android.support.customtabs.c
        public abstract /* synthetic */ boolean receiveFile(android.support.customtabs.b bVar, Uri uri, int i, Bundle bundle) throws RemoteException;

        @Override // android.support.customtabs.c
        public abstract /* synthetic */ boolean requestPostMessageChannel(android.support.customtabs.b bVar, Uri uri) throws RemoteException;

        @Override // android.support.customtabs.c
        public abstract /* synthetic */ boolean requestPostMessageChannelWithExtras(android.support.customtabs.b bVar, Uri uri, Bundle bundle) throws RemoteException;

        @Override // android.support.customtabs.c
        public abstract /* synthetic */ boolean setEngagementSignalsCallback(android.support.customtabs.b bVar, IBinder iBinder, Bundle bundle) throws RemoteException;

        @Override // android.support.customtabs.c
        public abstract /* synthetic */ boolean updateVisuals(android.support.customtabs.b bVar, Bundle bundle) throws RemoteException;

        @Override // android.support.customtabs.c
        public abstract /* synthetic */ boolean validateRelationship(android.support.customtabs.b bVar, int i, Uri uri, Bundle bundle) throws RemoteException;

        @Override // android.support.customtabs.c
        public abstract /* synthetic */ boolean warmup(long j) throws RemoteException;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
