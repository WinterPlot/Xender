package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h {
    public static final h a = new a();
    public static final h b = new b();
    public static final h c = new c();
    public static final h d = new d();
    public static final h e = new e();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a extends h {
        @Override // com.bumptech.glide.load.engine.h
        public boolean decodeCachedData() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean decodeCachedResource() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean isDataCacheable(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean isResourceCacheable(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class b extends h {
        @Override // com.bumptech.glide.load.engine.h
        public boolean decodeCachedData() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean decodeCachedResource() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean isDataCacheable(DataSource dataSource) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean isResourceCacheable(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class c extends h {
        @Override // com.bumptech.glide.load.engine.h
        public boolean decodeCachedData() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean decodeCachedResource() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean isDataCacheable(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean isResourceCacheable(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class d extends h {
        @Override // com.bumptech.glide.load.engine.h
        public boolean decodeCachedData() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean decodeCachedResource() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean isDataCacheable(DataSource dataSource) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean isResourceCacheable(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class e extends h {
        @Override // com.bumptech.glide.load.engine.h
        public boolean decodeCachedData() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean decodeCachedResource() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean isDataCacheable(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // com.bumptech.glide.load.engine.h
        public boolean isResourceCacheable(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    public abstract boolean decodeCachedData();

    public abstract boolean decodeCachedResource();

    public abstract boolean isDataCacheable(DataSource dataSource);

    public abstract boolean isResourceCacheable(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);
}
