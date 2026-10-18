package com.userlabs.xshare.fastdownloader.main;

import android.text.TextUtils;
import androidx.camera.core.impl.f2;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class h implements Runnable {
    private final com.userlabs.xshare.fastdownloader.model.b a;
    private volatile boolean b;
    private a c;
    private long d = -1;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a {
        void onCompleted();

        void onFailed(Throwable th);

        void onProgress();
    }

    public h(com.userlabs.xshare.fastdownloader.model.b bVar, a aVar) {
        this.a = bVar;
        this.c = aVar;
    }

    private void calPercentage(long j) {
        if (System.currentTimeMillis() - this.d > 400) {
            this.d = System.currentTimeMillis();
            com.userlabs.xshare.fastdownloader.model.b bVar = this.a;
            bVar.setRebuildingPercentage((int) ((j / bVar.getSize()) * 100.0f));
            this.c.onProgress();
        }
    }

    private void closeStream(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$run$0(com.userlabs.xshare.fastdownloader.model.a aVar, com.userlabs.xshare.fastdownloader.model.a aVar2) {
        if (aVar.getStartByteIndex() > aVar2.getStartByteIndex()) {
            return 1;
        }
        return aVar.getStartByteIndex() < aVar2.getStartByteIndex() ? -1 : 0;
    }

    public synchronized void cancel() {
        this.b = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.b) {
            return;
        }
        try {
            ArrayList<com.userlabs.xshare.fastdownloader.model.a> chunks = this.a.getChunks();
            if (this.a.isRandomAccessBased() || chunks == null || chunks.size() == 0) {
                throw new IOException("Rebuilder -- served with random access based, null chunks or zero chunks equipped fast download task");
            }
            Collections.sort(chunks, new f2(13));
            if (this.b) {
                return;
            }
            File file = new File(this.a.getDownloadLocation());
            if (!file.exists()) {
                file.mkdirs();
            }
            String downloadLocation = this.a.getDownloadLocation();
            StringBuilder sb = new StringBuilder();
            sb.append(this.a.getFileName());
            sb.append(TextUtils.isEmpty(this.a.getExtension()) ? "" : this.a.getExtension());
            File file2 = new File(downloadLocation, sb.toString());
            if (file2.exists()) {
                file2.delete();
            }
            file2.createNewFile();
            if (this.b) {
                return;
            }
            this.a.setRebuilding(true);
            this.a.setRebuildingPercentage(0);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2, true));
            try {
                byte[] bArr = new byte[8192];
                if (this.b) {
                    closeStream(bufferedOutputStream);
                    return;
                }
                Iterator<com.userlabs.xshare.fastdownloader.model.a> it = chunks.iterator();
                long j = 0;
                while (it.hasNext()) {
                    FileInputStream fileInputStream = new FileInputStream(it.next().getFile());
                    if (this.b) {
                        closeStream(fileInputStream);
                        closeStream(bufferedOutputStream);
                        return;
                    }
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i > 0) {
                            bufferedOutputStream.write(bArr, 0, i);
                            if (this.b) {
                                closeStream(fileInputStream);
                                closeStream(bufferedOutputStream);
                                return;
                            } else {
                                j += (long) i;
                                calPercentage(j);
                            }
                        }
                    }
                    closeStream(fileInputStream);
                    try {
                        bufferedOutputStream.flush();
                    } catch (Exception unused) {
                    }
                    if (this.b) {
                        closeStream(bufferedOutputStream);
                        return;
                    }
                }
                if (j < this.a.getSize()) {
                    throw new IOException("Rebuilder -- reached the end of loop without error but percentage is not 100");
                }
                this.a.setRebuildingPercentage(100);
                this.c.onProgress();
                closeStream(bufferedOutputStream);
                if (this.b) {
                    return;
                }
                this.a.setRebuilding(false);
                this.c.onCompleted();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e2) {
            if (this.b) {
                return;
            }
            this.a.setRebuilding(false);
            this.c.onFailed(e2);
        }
    }
}
