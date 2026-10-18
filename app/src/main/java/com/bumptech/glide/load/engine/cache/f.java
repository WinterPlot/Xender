package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends d {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a implements d.c {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        public a(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        private File getInternalCacheDirectory() {
            File cacheDir = this.a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.b != null ? new File(cacheDir, this.b) : cacheDir;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File getCacheDirectory() {
            File externalCacheDir;
            File internalCacheDirectory = getInternalCacheDirectory();
            if ((internalCacheDirectory == null || !internalCacheDirectory.exists()) && (externalCacheDir = this.a.getExternalCacheDir()) != null && externalCacheDir.canWrite()) {
                return this.b != null ? new File(externalCacheDir, this.b) : externalCacheDir;
            }
            return internalCacheDirectory;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public f(Context context, long j) {
        this(context, "image_manager_disk_cache", j);
    }

    public f(Context context, String str, long j) {
        super(new a(context, str), j);
    }
}
