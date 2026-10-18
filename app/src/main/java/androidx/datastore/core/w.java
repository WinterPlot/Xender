package androidx.datastore.core;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public static final a b = new a(null);
    private static final NativeSharedCounter c = new NativeSharedCounter();
    private final long a;

    private w(long j) {
        this.a = j;
    }

    public final int getValue() {
        return c.nativeGetCounterValue(this.a);
    }

    public final int incrementAndGetValue() {
        return c.nativeIncrementAndGetCounterValue(this.a);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public /* synthetic */ a(r rVar) {
            this();
        }

        private final w createCounterFromFd(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            int fd = parcelFileDescriptor.getFd();
            if (getNativeSharedCounter$datastore_core_release().nativeTruncateFile(fd) != 0) {
                okhttp3.b0.t("Failed to truncate counter file");
                return null;
            }
            long jNativeCreateSharedCounter = getNativeSharedCounter$datastore_core_release().nativeCreateSharedCounter(fd);
            if (jNativeCreateSharedCounter >= 0) {
                return new w(jNativeCreateSharedCounter, null);
            }
            okhttp3.b0.t("Failed to mmap counter file");
            return null;
        }

        public final w create$datastore_core_release(kotlin.jvm.functions.a<? extends File> aVar) throws Throwable {
            ParcelFileDescriptor parcelFileDescriptorOpen;
            aVar.getClass();
            try {
                parcelFileDescriptorOpen = ParcelFileDescriptor.open(aVar.invoke(), 939524096);
                try {
                    w wVarCreateCounterFromFd = createCounterFromFd(parcelFileDescriptorOpen);
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    return wVarCreateCounterFromFd;
                } catch (Throwable th) {
                    th = th;
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                parcelFileDescriptorOpen = null;
            }
        }

        public final NativeSharedCounter getNativeSharedCounter$datastore_core_release() {
            return w.c;
        }

        public final void loadLib() {
            System.loadLibrary("datastore_shared_counter");
        }

        private a() {
        }
    }

    public /* synthetic */ w(long j, r rVar) {
        this(j);
    }
}
