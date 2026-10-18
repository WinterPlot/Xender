package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface d extends IInterface {
    public static final String r = "android$support$customtabs$IEngagementSignalsCallback".replace('$', '.');

    int getInterfaceVersion() throws RemoteException;

    void onGreatestScrollPercentageIncreased(int i, Bundle bundle) throws RemoteException;

    void onSessionEnded(boolean z, Bundle bundle) throws RemoteException;

    void onVerticalScrollEvent(boolean z, Bundle bundle) throws RemoteException;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a extends Binder implements d {

        /* JADX INFO: renamed from: android.support.customtabs.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public static class C0004a implements d {
            private IBinder a;
            private int b = -1;

            public C0004a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            public String getInterfaceDescriptor() {
                return d.r;
            }

            @Override // android.support.customtabs.d
            public int getInterfaceVersion() throws RemoteException {
                if (this.b == -1) {
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(d.r);
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

            @Override // android.support.customtabs.d
            public void onGreatestScrollPercentageIncreased(int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.r);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeTypedObject(bundle, 0);
                    if (!this.a.transact(3, parcelObtain, null, 1)) {
                        throw new RemoteException("Method onGreatestScrollPercentageIncreased is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.customtabs.d
            public void onSessionEnded(boolean z, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.r);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeTypedObject(bundle, 0);
                    if (!this.a.transact(4, parcelObtain, null, 1)) {
                        throw new RemoteException("Method onSessionEnded is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.customtabs.d
            public void onVerticalScrollEvent(boolean z, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(d.r);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeTypedObject(bundle, 0);
                    if (!this.a.transact(2, parcelObtain, null, 1)) {
                        throw new RemoteException("Method onVerticalScrollEvent is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }

        public a() {
            attachInterface(this, d.r);
        }

        public static d asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(d.r);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) ? new C0004a(iBinder) : (d) iInterfaceQueryLocalInterface;
        }

        @Override // android.support.customtabs.d
        public abstract /* synthetic */ int getInterfaceVersion() throws RemoteException;

        @Override // android.support.customtabs.d
        public abstract /* synthetic */ void onGreatestScrollPercentageIncreased(int i, Bundle bundle) throws RemoteException;

        @Override // android.support.customtabs.d
        public abstract /* synthetic */ void onSessionEnded(boolean z, Bundle bundle) throws RemoteException;

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = d.r;
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
            if (i == 2) {
                onVerticalScrollEvent(parcel.readInt() != 0, (Bundle) parcel.readTypedObject(Bundle.CREATOR));
            } else if (i == 3) {
                onGreatestScrollPercentageIncreased(parcel.readInt(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onSessionEnded(parcel.readInt() != 0, (Bundle) parcel.readTypedObject(Bundle.CREATOR));
            }
            return true;
        }

        @Override // android.support.customtabs.d
        public abstract /* synthetic */ void onVerticalScrollEvent(boolean z, Bundle bundle) throws RemoteException;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
