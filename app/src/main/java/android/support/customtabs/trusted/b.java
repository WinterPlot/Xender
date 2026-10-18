package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {
    public static final String u = "android$support$customtabs$trusted$ITrustedWebActivityService".replace('$', '.');

    Bundle areNotificationsEnabled(Bundle bundle) throws RemoteException;

    void cancelNotification(Bundle bundle) throws RemoteException;

    Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) throws RemoteException;

    Bundle getActiveNotifications() throws RemoteException;

    int getInterfaceVersion() throws RemoteException;

    Bundle getSmallIconBitmap() throws RemoteException;

    int getSmallIconId() throws RemoteException;

    Bundle notifyNotificationWithChannel(Bundle bundle) throws RemoteException;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: android.support.customtabs.trusted.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public static class C0008a implements b {
            private IBinder a;
            private int b = -1;

            public C0008a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.support.customtabs.trusted.b
            public Bundle areNotificationsEnabled(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.u);
                    parcelObtain.writeTypedObject(bundle, 0);
                    if (!this.a.transact(6, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method areNotificationsEnabled is unimplemented.");
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

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // android.support.customtabs.trusted.b
            public void cancelNotification(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.u);
                    parcelObtain.writeTypedObject(bundle, 0);
                    if (!this.a.transact(3, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method cancelNotification is unimplemented.");
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

            @Override // android.support.customtabs.trusted.b
            public Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.u);
                    parcelObtain.writeString(str);
                    parcelObtain.writeTypedObject(bundle, 0);
                    parcelObtain.writeStrongBinder(iBinder);
                    if (!this.a.transact(9, parcelObtain, parcelObtain2, 0)) {
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

            @Override // android.support.customtabs.trusted.b
            public Bundle getActiveNotifications() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.u);
                    if (!this.a.transact(5, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method getActiveNotifications is unimplemented.");
                    }
                    parcelObtain2.readException();
                    Bundle bundle = (Bundle) parcelObtain2.readTypedObject(Bundle.CREATOR);
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return bundle;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            public String getInterfaceDescriptor() {
                return b.u;
            }

            @Override // android.support.customtabs.trusted.b
            public int getInterfaceVersion() throws RemoteException {
                if (this.b == -1) {
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(b.u);
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

            @Override // android.support.customtabs.trusted.b
            public Bundle getSmallIconBitmap() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.u);
                    if (!this.a.transact(7, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method getSmallIconBitmap is unimplemented.");
                    }
                    parcelObtain2.readException();
                    Bundle bundle = (Bundle) parcelObtain2.readTypedObject(Bundle.CREATOR);
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return bundle;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.customtabs.trusted.b
            public int getSmallIconId() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.u);
                    if (!this.a.transact(4, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method getSmallIconId is unimplemented.");
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

            @Override // android.support.customtabs.trusted.b
            public Bundle notifyNotificationWithChannel(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.u);
                    parcelObtain.writeTypedObject(bundle, 0);
                    if (!this.a.transact(2, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method notifyNotificationWithChannel is unimplemented.");
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
        }

        public a() {
            attachInterface(this, b.u);
        }

        public static b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.u);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0008a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.support.customtabs.trusted.b
        public abstract /* synthetic */ Bundle areNotificationsEnabled(Bundle bundle) throws RemoteException;

        @Override // android.support.customtabs.trusted.b
        public abstract /* synthetic */ void cancelNotification(Bundle bundle) throws RemoteException;

        @Override // android.support.customtabs.trusted.b
        public abstract /* synthetic */ Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) throws RemoteException;

        @Override // android.support.customtabs.trusted.b
        public abstract /* synthetic */ Bundle getActiveNotifications() throws RemoteException;

        @Override // android.support.customtabs.trusted.b
        public abstract /* synthetic */ int getInterfaceVersion() throws RemoteException;

        @Override // android.support.customtabs.trusted.b
        public abstract /* synthetic */ Bundle getSmallIconBitmap() throws RemoteException;

        @Override // android.support.customtabs.trusted.b
        public abstract /* synthetic */ int getSmallIconId() throws RemoteException;

        @Override // android.support.customtabs.trusted.b
        public abstract /* synthetic */ Bundle notifyNotificationWithChannel(Bundle bundle) throws RemoteException;

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = b.u;
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
                    Bundle bundleNotifyNotificationWithChannel = notifyNotificationWithChannel((Bundle) parcel.readTypedObject(Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeTypedObject(bundleNotifyNotificationWithChannel, 1);
                    return true;
                case 3:
                    cancelNotification((Bundle) parcel.readTypedObject(Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    int smallIconId = getSmallIconId();
                    parcel2.writeNoException();
                    parcel2.writeInt(smallIconId);
                    return true;
                case 5:
                    Bundle activeNotifications = getActiveNotifications();
                    parcel2.writeNoException();
                    parcel2.writeTypedObject(activeNotifications, 1);
                    return true;
                case 6:
                    Bundle bundleAreNotificationsEnabled = areNotificationsEnabled((Bundle) parcel.readTypedObject(Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeTypedObject(bundleAreNotificationsEnabled, 1);
                    return true;
                case 7:
                    Bundle smallIconBitmap = getSmallIconBitmap();
                    parcel2.writeNoException();
                    parcel2.writeTypedObject(smallIconBitmap, 1);
                    return true;
                case 8:
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
                case 9:
                    Bundle bundleExtraCommand = extraCommand(parcel.readString(), (Bundle) parcel.readTypedObject(Bundle.CREATOR), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    parcel2.writeTypedObject(bundleExtraCommand, 1);
                    return true;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
