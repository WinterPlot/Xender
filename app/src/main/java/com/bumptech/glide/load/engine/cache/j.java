package com.bumptech.glide.load.engine.cache;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class j {
    private final int a;
    private final int b;
    private final Context c;
    private final int d;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        static final int i;
        final Context a;
        ActivityManager b;
        c c;
        float e;
        float d = 2.0f;
        float f = 0.4f;
        float g = 0.33f;
        int h = 4194304;

        static {
            i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.e = i;
            this.a = context;
            this.b = (ActivityManager) context.getSystemService("activity");
            this.c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !j.isLowMemoryDevice(this.b)) {
                return;
            }
            this.e = 0.0f;
        }

        public j build() {
            return new j(this);
        }

        public a setActivityManager(ActivityManager activityManager) {
            this.b = activityManager;
            return this;
        }

        public a setArrayPoolSize(int i2) {
            this.h = i2;
            return this;
        }

        public a setBitmapPoolScreens(float f) {
            com.bumptech.glide.util.k.checkArgument(f >= 0.0f, "Bitmap pool screens must be greater than or equal to 0");
            this.e = f;
            return this;
        }

        public a setLowMemoryMaxSizeMultiplier(float f) {
            com.bumptech.glide.util.k.checkArgument(f >= 0.0f && f <= 1.0f, "Low memory max size multiplier must be between 0 and 1");
            this.g = f;
            return this;
        }

        public a setMaxSizeMultiplier(float f) {
            com.bumptech.glide.util.k.checkArgument(f >= 0.0f && f <= 1.0f, "Size multiplier must be between 0 and 1");
            this.f = f;
            return this;
        }

        public a setMemoryCacheScreens(float f) {
            com.bumptech.glide.util.k.checkArgument(f >= 0.0f, "Memory cache screens must be greater than or equal to 0");
            this.d = f;
            return this;
        }

        public a setScreenDimensions(c cVar) {
            this.c = cVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b implements c {
        private final DisplayMetrics a;

        public b(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }

        @Override // com.bumptech.glide.load.engine.cache.j.c
        public int getHeightPixels() {
            return this.a.heightPixels;
        }

        @Override // com.bumptech.glide.load.engine.cache.j.c
        public int getWidthPixels() {
            return this.a.widthPixels;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface c {
        int getHeightPixels();

        int getWidthPixels();
    }

    public j(a aVar) {
        this.c = aVar.a;
        boolean zIsLowMemoryDevice = isLowMemoryDevice(aVar.b);
        int i = aVar.h;
        i = zIsLowMemoryDevice ? i / 2 : i;
        this.d = i;
        int maxSize = getMaxSize(aVar.b, aVar.f, aVar.g);
        float widthPixels = aVar.c.getWidthPixels() * aVar.c.getHeightPixels() * 4;
        int iRound = Math.round(aVar.e * widthPixels);
        int iRound2 = Math.round(widthPixels * aVar.d);
        int i2 = maxSize - i;
        int i3 = iRound2 + iRound;
        if (i3 <= i2) {
            this.b = iRound2;
            this.a = iRound;
        } else {
            float f = i2;
            float f2 = aVar.e;
            float f3 = aVar.d;
            float f4 = f / (f2 + f3);
            int iRound3 = Math.round(f3 * f4);
            this.b = iRound3;
            int iRound4 = Math.round(f4 * aVar.e);
            this.a = iRound4;
            iRound = iRound4;
            iRound2 = iRound3;
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb.append(toMb(iRound2));
            sb.append(", pool size: ");
            sb.append(toMb(iRound));
            sb.append(", byte array size: ");
            sb.append(toMb(i));
            sb.append(", memory class limited? ");
            sb.append(i3 > maxSize);
            sb.append(", max size: ");
            sb.append(toMb(maxSize));
            sb.append(", memoryClass: ");
            sb.append(aVar.b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(isLowMemoryDevice(aVar.b));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    private static int getMaxSize(ActivityManager activityManager, float f, float f2) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (isLowMemoryDevice(activityManager)) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    public static boolean isLowMemoryDevice(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String toMb(int i) {
        return Formatter.formatFileSize(this.c, i);
    }

    public int getArrayPoolSizeInBytes() {
        return this.d;
    }

    public int getBitmapPoolSize() {
        return this.a;
    }

    public int getMemoryCacheSize() {
        return this.b;
    }
}
