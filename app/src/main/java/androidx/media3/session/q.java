package androidx.media3.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.Surface;
import androidx.media3.common.PlaybackException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public interface q extends IInterface {

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
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void addMediaItem(p pVar, int i, Bundle bundle) throws RemoteException;

    void addMediaItemWithIndex(p pVar, int i, int i2, Bundle bundle) throws RemoteException;

    void addMediaItems(p pVar, int i, IBinder iBinder) throws RemoteException;

    void addMediaItemsWithIndex(p pVar, int i, int i2, IBinder iBinder) throws RemoteException;

    void clearMediaItems(p pVar, int i) throws RemoteException;

    void connect(p pVar, int i, Bundle bundle) throws RemoteException;

    void decreaseDeviceVolume(p pVar, int i) throws RemoteException;

    void decreaseDeviceVolumeWithFlags(p pVar, int i, int i2) throws RemoteException;

    void flushCommandQueue(p pVar) throws RemoteException;

    void getChildren(p pVar, int i, String str, int i2, int i3, Bundle bundle) throws RemoteException;

    void getItem(p pVar, int i, String str) throws RemoteException;

    void getLibraryRoot(p pVar, int i, Bundle bundle) throws RemoteException;

    void getSearchResult(p pVar, int i, String str, int i2, int i3, Bundle bundle) throws RemoteException;

    void increaseDeviceVolume(p pVar, int i) throws RemoteException;

    void increaseDeviceVolumeWithFlags(p pVar, int i, int i2) throws RemoteException;

    void moveMediaItem(p pVar, int i, int i2, int i3) throws RemoteException;

    void moveMediaItems(p pVar, int i, int i2, int i3, int i4) throws RemoteException;

    void mute(p pVar, int i) throws RemoteException;

    void onControllerResult(p pVar, int i, Bundle bundle) throws RemoteException;

    void onCustomCommand(p pVar, int i, Bundle bundle, Bundle bundle2) throws RemoteException;

    void onCustomCommandWithProgressUpdate(p pVar, int i, Bundle bundle, Bundle bundle2, boolean z) throws RemoteException;

    void onSurfaceSizeChanged(p pVar, int i, int i2, int i3) throws RemoteException;

    void pause(p pVar, int i) throws RemoteException;

    void play(p pVar, int i) throws RemoteException;

    void prepare(p pVar, int i) throws RemoteException;

    void release(p pVar, int i) throws RemoteException;

    void removeMediaItem(p pVar, int i, int i2) throws RemoteException;

    void removeMediaItems(p pVar, int i, int i2, int i3) throws RemoteException;

    void replaceMediaItem(p pVar, int i, int i2, Bundle bundle) throws RemoteException;

    void replaceMediaItems(p pVar, int i, int i2, int i3, IBinder iBinder) throws RemoteException;

    void search(p pVar, int i, String str, Bundle bundle) throws RemoteException;

    void seekBack(p pVar, int i) throws RemoteException;

    void seekForward(p pVar, int i) throws RemoteException;

    void seekTo(p pVar, int i, long j) throws RemoteException;

    void seekToDefaultPosition(p pVar, int i) throws RemoteException;

    void seekToDefaultPositionWithMediaItemIndex(p pVar, int i, int i2) throws RemoteException;

    void seekToNext(p pVar, int i) throws RemoteException;

    void seekToNextMediaItem(p pVar, int i) throws RemoteException;

    void seekToPrevious(p pVar, int i) throws RemoteException;

    void seekToPreviousMediaItem(p pVar, int i) throws RemoteException;

    void seekToWithMediaItemIndex(p pVar, int i, int i2, long j) throws RemoteException;

    void setAudioAttributes(p pVar, int i, Bundle bundle, boolean z) throws RemoteException;

    void setDeviceMuted(p pVar, int i, boolean z) throws RemoteException;

    void setDeviceMutedWithFlags(p pVar, int i, boolean z, int i2) throws RemoteException;

    void setDeviceVolume(p pVar, int i, int i2) throws RemoteException;

    void setDeviceVolumeWithFlags(p pVar, int i, int i2, int i3) throws RemoteException;

    void setMediaItem(p pVar, int i, Bundle bundle) throws RemoteException;

    void setMediaItemWithResetPosition(p pVar, int i, Bundle bundle, boolean z) throws RemoteException;

    void setMediaItemWithStartPosition(p pVar, int i, Bundle bundle, long j) throws RemoteException;

    void setMediaItems(p pVar, int i, IBinder iBinder) throws RemoteException;

    void setMediaItemsWithResetPosition(p pVar, int i, IBinder iBinder, boolean z) throws RemoteException;

    void setMediaItemsWithStartIndex(p pVar, int i, IBinder iBinder, int i2, long j) throws RemoteException;

    void setPlayWhenReady(p pVar, int i, boolean z) throws RemoteException;

    void setPlaybackParameters(p pVar, int i, Bundle bundle) throws RemoteException;

    void setPlaybackSpeed(p pVar, int i, float f) throws RemoteException;

    void setPlaylistMetadata(p pVar, int i, Bundle bundle) throws RemoteException;

    void setRating(p pVar, int i, Bundle bundle) throws RemoteException;

    void setRatingWithMediaId(p pVar, int i, String str, Bundle bundle) throws RemoteException;

    void setRepeatMode(p pVar, int i, int i2) throws RemoteException;

    void setShuffleModeEnabled(p pVar, int i, boolean z) throws RemoteException;

    void setTrackSelectionParameters(p pVar, int i, Bundle bundle) throws RemoteException;

    void setVideoSurface(p pVar, int i, Surface surface) throws RemoteException;

    void setVideoSurfaceWithSize(p pVar, int i, Surface surface, int i2, int i3) throws RemoteException;

    void setVolume(p pVar, int i, float f) throws RemoteException;

    void stop(p pVar, int i) throws RemoteException;

    void subscribe(p pVar, int i, String str, Bundle bundle) throws RemoteException;

    void unmute(p pVar, int i) throws RemoteException;

    void unsubscribe(p pVar, int i, String str) throws RemoteException;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a extends Binder implements q {

        /* JADX INFO: renamed from: androidx.media3.session.q$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public static class C0222a implements q {
            private IBinder a;

            public C0222a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // androidx.media3.session.q
            public void addMediaItem(p pVar, int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    this.a.transact(3029, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void addMediaItemWithIndex(p pVar, int i, int i2, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    this.a.transact(3030, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void addMediaItems(p pVar, int i, IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.a.transact(3031, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void addMediaItemsWithIndex(p pVar, int i, int i2, IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.a.transact(3032, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // androidx.media3.session.q
            public void clearMediaItems(p pVar, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3021, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void connect(p pVar, int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    this.a.transact(3015, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void decreaseDeviceVolume(p pVar, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3005, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void decreaseDeviceVolumeWithFlags(p pVar, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.a.transact(3053, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void flushCommandQueue(p pVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    this.a.transact(3045, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void getChildren(p pVar, int i, String str, int i2, int i3, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    this.a.transact(PlaybackException.ERROR_CODE_DECODING_FAILED, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return "androidx.media3.session.IMediaSession";
            }

            @Override // androidx.media3.session.q
            public void getItem(p pVar, int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.a.transact(PlaybackException.ERROR_CODE_DECODER_QUERY_FAILED, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void getLibraryRoot(p pVar, int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    this.a.transact(PlaybackException.ERROR_CODE_DECODER_INIT_FAILED, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void getSearchResult(p pVar, int i, String str, int i2, int i3, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    this.a.transact(PlaybackException.ERROR_CODE_DECODING_FORMAT_UNSUPPORTED, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void increaseDeviceVolume(p pVar, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(PlaybackException.ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void increaseDeviceVolumeWithFlags(p pVar, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.a.transact(3052, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void moveMediaItem(p pVar, int i, int i2, int i3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    this.a.transact(3022, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void moveMediaItems(p pVar, int i, int i2, int i3, int i4) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i4);
                    this.a.transact(3023, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void mute(p pVar, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3058, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void onControllerResult(p pVar, int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    this.a.transact(3014, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void onCustomCommand(p pVar, int i, Bundle bundle, Bundle bundle2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    b.writeTypedObject(parcelObtain, bundle2, 0);
                    this.a.transact(3016, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void onCustomCommandWithProgressUpdate(p pVar, int i, Bundle bundle, Bundle bundle2, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    b.writeTypedObject(parcelObtain, bundle2, 0);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.a.transact(3060, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void onSurfaceSizeChanged(p pVar, int i, int i2, int i3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    this.a.transact(3062, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void pause(p pVar, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3025, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void play(p pVar, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3024, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void prepare(p pVar, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3026, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void release(p pVar, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3035, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void removeMediaItem(p pVar, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.a.transact(3019, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void removeMediaItems(p pVar, int i, int i2, int i3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    this.a.transact(3020, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void replaceMediaItem(p pVar, int i, int i2, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    this.a.transact(3055, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void replaceMediaItems(p pVar, int i, int i2, int i3, IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.a.transact(3056, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void search(p pVar, int i, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    this.a.transact(PlaybackException.ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void seekBack(p pVar, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3040, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void seekForward(p pVar, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3041, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void seekTo(p pVar, int i, long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeLong(j);
                    this.a.transact(3038, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void seekToDefaultPosition(p pVar, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3036, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void seekToDefaultPositionWithMediaItemIndex(p pVar, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.a.transact(3037, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void seekToNext(p pVar, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3047, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void seekToNextMediaItem(p pVar, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3043, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void seekToPrevious(p pVar, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3046, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void seekToPreviousMediaItem(p pVar, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3042, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void seekToWithMediaItemIndex(p pVar, int i, int i2, long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeLong(j);
                    this.a.transact(3039, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void setAudioAttributes(p pVar, int i, Bundle bundle, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.a.transact(3057, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void setDeviceMuted(p pVar, int i, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.a.transact(3006, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void setDeviceMutedWithFlags(p pVar, int i, boolean z, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i2);
                    this.a.transact(3054, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void setDeviceVolume(p pVar, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.a.transact(PlaybackException.ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void setDeviceVolumeWithFlags(p pVar, int i, int i2, int i3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    this.a.transact(3051, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void setMediaItem(p pVar, int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    this.a.transact(3007, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void setMediaItemWithResetPosition(p pVar, int i, Bundle bundle, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.a.transact(3009, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void setMediaItemWithStartPosition(p pVar, int i, Bundle bundle, long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    parcelObtain.writeLong(j);
                    this.a.transact(3008, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void setMediaItems(p pVar, int i, IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.a.transact(3010, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void setMediaItemsWithResetPosition(p pVar, int i, IBinder iBinder, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.a.transact(3011, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void setMediaItemsWithStartIndex(p pVar, int i, IBinder iBinder, int i2, long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeLong(j);
                    this.a.transact(3012, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void setPlayWhenReady(p pVar, int i, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.a.transact(3013, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void setPlaybackParameters(p pVar, int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    this.a.transact(3027, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void setPlaybackSpeed(p pVar, int i, float f) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeFloat(f);
                    this.a.transact(3028, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void setPlaylistMetadata(p pVar, int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    this.a.transact(3033, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void setRating(p pVar, int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    this.a.transact(3050, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void setRatingWithMediaId(p pVar, int i, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    this.a.transact(3049, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void setRepeatMode(p pVar, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.a.transact(3017, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void setShuffleModeEnabled(p pVar, int i, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.a.transact(3018, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void setTrackSelectionParameters(p pVar, int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    this.a.transact(3048, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void setVideoSurface(p pVar, int i, Surface surface) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, surface, 0);
                    this.a.transact(3044, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void setVideoSurfaceWithSize(p pVar, int i, Surface surface, int i2, int i3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    b.writeTypedObject(parcelObtain, surface, 0);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    this.a.transact(3061, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void setVolume(p pVar, int i, float f) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeFloat(f);
                    this.a.transact(PlaybackException.ERROR_CODE_PARSING_MANIFEST_MALFORMED, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void stop(p pVar, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3034, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void subscribe(p pVar, int i, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    b.writeTypedObject(parcelObtain, bundle, 0);
                    this.a.transact(PlaybackException.ERROR_CODE_DECODING_RESOURCES_RECLAIMED, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void unmute(p pVar, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    this.a.transact(3059, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.q
            public void unsubscribe(p pVar, int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(pVar);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.a.transact(4007, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.media3.session.IMediaSession");
        }

        public static q asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof q)) ? new C0222a(iBinder) : (q) iInterfaceQueryLocalInterface;
        }

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void addMediaItem(p pVar, int i, Bundle bundle) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void addMediaItemWithIndex(p pVar, int i, int i2, Bundle bundle) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void addMediaItems(p pVar, int i, IBinder iBinder) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void addMediaItemsWithIndex(p pVar, int i, int i2, IBinder iBinder) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void clearMediaItems(p pVar, int i) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void connect(p pVar, int i, Bundle bundle) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void decreaseDeviceVolume(p pVar, int i) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void decreaseDeviceVolumeWithFlags(p pVar, int i, int i2) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void flushCommandQueue(p pVar) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void getChildren(p pVar, int i, String str, int i2, int i3, Bundle bundle) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void getItem(p pVar, int i, String str) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void getLibraryRoot(p pVar, int i, Bundle bundle) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void getSearchResult(p pVar, int i, String str, int i2, int i3, Bundle bundle) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void increaseDeviceVolume(p pVar, int i) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void increaseDeviceVolumeWithFlags(p pVar, int i, int i2) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void moveMediaItem(p pVar, int i, int i2, int i3) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void moveMediaItems(p pVar, int i, int i2, int i3, int i4) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void mute(p pVar, int i) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void onControllerResult(p pVar, int i, Bundle bundle) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void onCustomCommand(p pVar, int i, Bundle bundle, Bundle bundle2) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void onCustomCommandWithProgressUpdate(p pVar, int i, Bundle bundle, Bundle bundle2, boolean z) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void onSurfaceSizeChanged(p pVar, int i, int i2, int i3) throws RemoteException;

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.media3.session.IMediaSession");
            }
            if (i == 1598968902) {
                parcel2.writeString("androidx.media3.session.IMediaSession");
                return true;
            }
            switch (i) {
                case PlaybackException.ERROR_CODE_PARSING_MANIFEST_MALFORMED /* 3002 */:
                    setVolume(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                    return true;
                case PlaybackException.ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED /* 3003 */:
                    setDeviceVolume(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case PlaybackException.ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED /* 3004 */:
                    increaseDeviceVolume(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3005:
                    decreaseDeviceVolume(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3006:
                    setDeviceMuted(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case 3007:
                    setMediaItem(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR));
                    return true;
                case 3008:
                    setMediaItemWithStartPosition(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR), parcel.readLong());
                    return true;
                case 3009:
                    setMediaItemWithResetPosition(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                    return true;
                case 3010:
                    setMediaItems(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case 3011:
                    setMediaItemsWithResetPosition(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                    return true;
                case 3012:
                    setMediaItemsWithStartIndex(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                    return true;
                case 3013:
                    setPlayWhenReady(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case 3014:
                    onControllerResult(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR));
                    return true;
                case 3015:
                    connect(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR));
                    return true;
                case 3016:
                    p pVarAsInterface = p.a.asInterface(parcel.readStrongBinder());
                    int i3 = parcel.readInt();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    onCustomCommand(pVarAsInterface, i3, (Bundle) b.readTypedObject(parcel, creator), (Bundle) b.readTypedObject(parcel, creator));
                    return true;
                case 3017:
                    setRepeatMode(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3018:
                    setShuffleModeEnabled(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case 3019:
                    removeMediaItem(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3020:
                    removeMediaItems(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 3021:
                    clearMediaItems(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3022:
                    moveMediaItem(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 3023:
                    moveMediaItems(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 3024:
                    play(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3025:
                    pause(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3026:
                    prepare(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3027:
                    setPlaybackParameters(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR));
                    return true;
                case 3028:
                    setPlaybackSpeed(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                    return true;
                case 3029:
                    addMediaItem(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR));
                    return true;
                case 3030:
                    addMediaItemWithIndex(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR));
                    return true;
                case 3031:
                    addMediaItems(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case 3032:
                    addMediaItemsWithIndex(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case 3033:
                    setPlaylistMetadata(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR));
                    return true;
                case 3034:
                    stop(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3035:
                    release(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3036:
                    seekToDefaultPosition(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3037:
                    seekToDefaultPositionWithMediaItemIndex(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3038:
                    seekTo(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readLong());
                    return true;
                case 3039:
                    seekToWithMediaItemIndex(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readLong());
                    return true;
                case 3040:
                    seekBack(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3041:
                    seekForward(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3042:
                    seekToPreviousMediaItem(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3043:
                    seekToNextMediaItem(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3044:
                    setVideoSurface(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Surface) b.readTypedObject(parcel, Surface.CREATOR));
                    return true;
                case 3045:
                    flushCommandQueue(p.a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 3046:
                    seekToPrevious(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3047:
                    seekToNext(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3048:
                    setTrackSelectionParameters(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR));
                    return true;
                case 3049:
                    setRatingWithMediaId(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR));
                    return true;
                case 3050:
                    setRating(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR));
                    return true;
                case 3051:
                    setDeviceVolumeWithFlags(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 3052:
                    increaseDeviceVolumeWithFlags(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3053:
                    decreaseDeviceVolumeWithFlags(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3054:
                    setDeviceMutedWithFlags(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt());
                    return true;
                case 3055:
                    replaceMediaItem(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR));
                    return true;
                case 3056:
                    replaceMediaItems(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case 3057:
                    setAudioAttributes(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                    return true;
                case 3058:
                    mute(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3059:
                    unmute(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3060:
                    p pVarAsInterface2 = p.a.asInterface(parcel.readStrongBinder());
                    int i4 = parcel.readInt();
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    onCustomCommandWithProgressUpdate(pVarAsInterface2, i4, (Bundle) b.readTypedObject(parcel, creator2), (Bundle) b.readTypedObject(parcel, creator2), parcel.readInt() != 0);
                    return true;
                case 3061:
                    setVideoSurfaceWithSize(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Surface) b.readTypedObject(parcel, Surface.CREATOR), parcel.readInt(), parcel.readInt());
                    return true;
                case 3062:
                    onSurfaceSizeChanged(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                default:
                    switch (i) {
                        case PlaybackException.ERROR_CODE_DECODER_INIT_FAILED /* 4001 */:
                            getLibraryRoot(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR));
                            return true;
                        case PlaybackException.ERROR_CODE_DECODER_QUERY_FAILED /* 4002 */:
                            getItem(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                            return true;
                        case PlaybackException.ERROR_CODE_DECODING_FAILED /* 4003 */:
                            getChildren(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR));
                            return true;
                        case PlaybackException.ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES /* 4004 */:
                            search(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR));
                            return true;
                        case PlaybackException.ERROR_CODE_DECODING_FORMAT_UNSUPPORTED /* 4005 */:
                            getSearchResult(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR));
                            return true;
                        case PlaybackException.ERROR_CODE_DECODING_RESOURCES_RECLAIMED /* 4006 */:
                            subscribe(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), (Bundle) b.readTypedObject(parcel, Bundle.CREATOR));
                            return true;
                        case 4007:
                            unsubscribe(p.a.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                            return true;
                        default:
                            return super.onTransact(i, parcel, parcel2, i2);
                    }
            }
        }

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void pause(p pVar, int i) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void play(p pVar, int i) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void prepare(p pVar, int i) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void release(p pVar, int i) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void removeMediaItem(p pVar, int i, int i2) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void removeMediaItems(p pVar, int i, int i2, int i3) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void replaceMediaItem(p pVar, int i, int i2, Bundle bundle) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void replaceMediaItems(p pVar, int i, int i2, int i3, IBinder iBinder) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void search(p pVar, int i, String str, Bundle bundle) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void seekBack(p pVar, int i) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void seekForward(p pVar, int i) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void seekTo(p pVar, int i, long j) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void seekToDefaultPosition(p pVar, int i) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void seekToDefaultPositionWithMediaItemIndex(p pVar, int i, int i2) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void seekToNext(p pVar, int i) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void seekToNextMediaItem(p pVar, int i) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void seekToPrevious(p pVar, int i) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void seekToPreviousMediaItem(p pVar, int i) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void seekToWithMediaItemIndex(p pVar, int i, int i2, long j) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void setAudioAttributes(p pVar, int i, Bundle bundle, boolean z) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void setDeviceMuted(p pVar, int i, boolean z) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void setDeviceMutedWithFlags(p pVar, int i, boolean z, int i2) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void setDeviceVolume(p pVar, int i, int i2) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void setDeviceVolumeWithFlags(p pVar, int i, int i2, int i3) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void setMediaItem(p pVar, int i, Bundle bundle) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void setMediaItemWithResetPosition(p pVar, int i, Bundle bundle, boolean z) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void setMediaItemWithStartPosition(p pVar, int i, Bundle bundle, long j) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void setMediaItems(p pVar, int i, IBinder iBinder) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void setMediaItemsWithResetPosition(p pVar, int i, IBinder iBinder, boolean z) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void setMediaItemsWithStartIndex(p pVar, int i, IBinder iBinder, int i2, long j) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void setPlayWhenReady(p pVar, int i, boolean z) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void setPlaybackParameters(p pVar, int i, Bundle bundle) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void setPlaybackSpeed(p pVar, int i, float f) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void setPlaylistMetadata(p pVar, int i, Bundle bundle) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void setRating(p pVar, int i, Bundle bundle) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void setRatingWithMediaId(p pVar, int i, String str, Bundle bundle) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void setRepeatMode(p pVar, int i, int i2) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void setShuffleModeEnabled(p pVar, int i, boolean z) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void setTrackSelectionParameters(p pVar, int i, Bundle bundle) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void setVideoSurface(p pVar, int i, Surface surface) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void setVideoSurfaceWithSize(p pVar, int i, Surface surface, int i2, int i3) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void setVolume(p pVar, int i, float f) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void stop(p pVar, int i) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void subscribe(p pVar, int i, String str, Bundle bundle) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void unmute(p pVar, int i) throws RemoteException;

        @Override // androidx.media3.session.q
        public abstract /* synthetic */ void unsubscribe(p pVar, int i, String str) throws RemoteException;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
