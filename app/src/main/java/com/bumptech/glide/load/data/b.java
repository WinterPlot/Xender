package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b<T> implements d<T> {
    private final String a;
    private final AssetManager b;
    private T c;

    public b(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cleanup() {
        T t = this.c;
        if (t == null) {
            return;
        }
        try {
            close(t);
        } catch (IOException unused) {
        }
    }

    public abstract void close(T t) throws IOException;

    @Override // com.bumptech.glide.load.data.d
    public abstract /* synthetic */ Class getDataClass();

    @Override // com.bumptech.glide.load.data.d
    public DataSource getDataSource() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void loadData(Priority priority, d.a<? super T> aVar) {
        try {
            T tLoadResource = loadResource(this.b, this.a);
            this.c = tLoadResource;
            aVar.onDataReady(tLoadResource);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            aVar.onLoadFailed(e);
        }
    }

    public abstract T loadResource(AssetManager assetManager, String str) throws IOException;

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
