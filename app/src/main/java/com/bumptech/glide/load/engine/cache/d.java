package com.bumptech.glide.load.engine.cache;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class d implements com.bumptech.glide.load.engine.cache.a.InterfaceC0393a {
    private final long a;
    private final c b;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a implements c {
        final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File getCacheDirectory() {
            return new File(this.a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class b implements c {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.bumptech.glide.load.engine.cache.d.c
        public File getCacheDirectory() {
            return new File(this.a, this.b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface c {
        File getCacheDirectory();
    }

    public d(String str, long j) {
        this(new a(str), j);
    }

    @Override // com.bumptech.glide.load.engine.cache.a.InterfaceC0393a
    public com.bumptech.glide.load.engine.cache.a build() {
        File cacheDirectory = this.b.getCacheDirectory();
        if (cacheDirectory == null) {
            return null;
        }
        if (cacheDirectory.isDirectory() || cacheDirectory.mkdirs()) {
            return e.create(cacheDirectory, this.a);
        }
        return null;
    }

    public d(String str, String str2, long j) {
        this(new b(str, str2), j);
    }

    public d(c cVar, long j) {
        this.a = j;
        this.b = cVar;
    }
}
