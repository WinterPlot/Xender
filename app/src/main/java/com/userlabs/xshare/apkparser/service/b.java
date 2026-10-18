package com.userlabs.xshare.apkparser.service;

import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public interface b extends IInterface {

    /* JADX INFO: renamed from: com.userlabs.xshare.apkparser.service.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class C0313b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
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

    void basicTypes(int i, long j, boolean z, float f, double d, String str) throws RemoteException;

    Bitmap loadApkIcon(String str, int i, int i2) throws RemoteException;

    PackageInfo parserApkFile(String str, int i) throws RemoteException;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: com.userlabs.xshare.apkparser.service.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public static class C0312a implements b {
            private IBinder a;

            public C0312a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.userlabs.xshare.apkparser.service.b
            public void basicTypes(int i, long j, boolean z, float f, double d, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.userlabs.xshare.apkparser.service.IApkParser");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeFloat(f);
                    parcelObtain.writeDouble(d);
                    parcelObtain.writeString(str);
                    this.a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return "com.userlabs.xshare.apkparser.service.IApkParser";
            }

            @Override // com.userlabs.xshare.apkparser.service.b
            public Bitmap loadApkIcon(String str, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.userlabs.xshare.apkparser.service.IApkParser");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bitmap) C0313b.readTypedObject(parcelObtain2, Bitmap.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.userlabs.xshare.apkparser.service.b
            public PackageInfo parserApkFile(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.userlabs.xshare.apkparser.service.IApkParser");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (PackageInfo) C0313b.readTypedObject(parcelObtain2, PackageInfo.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.userlabs.xshare.apkparser.service.IApkParser");
        }

        public static b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.userlabs.xshare.apkparser.service.IApkParser");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0312a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        public abstract /* synthetic */ void basicTypes(int i, long j, boolean z, float f, double d, String str) throws RemoteException;

        public abstract /* synthetic */ Bitmap loadApkIcon(String str, int i, int i2) throws RemoteException;

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.userlabs.xshare.apkparser.service.IApkParser");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.userlabs.xshare.apkparser.service.IApkParser");
                return true;
            }
            if (i == 1) {
                PackageInfo packageInfo = parserApkFile(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                C0313b.writeTypedObject(parcel2, packageInfo, 1);
                return true;
            }
            if (i == 2) {
                Bitmap bitmapLoadApkIcon = loadApkIcon(parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                C0313b.writeTypedObject(parcel2, bitmapLoadApkIcon, 1);
                return true;
            }
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            basicTypes(parcel.readInt(), parcel.readLong(), parcel.readInt() != 0, parcel.readFloat(), parcel.readDouble(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }

        public abstract /* synthetic */ PackageInfo parserApkFile(String str, int i) throws RemoteException;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
