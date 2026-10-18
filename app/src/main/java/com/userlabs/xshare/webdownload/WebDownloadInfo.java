package com.userlabs.xshare.webdownload;

import com.userlabs.xshare.core.storage.n;
import java.io.File;
import java.io.Serializable;
import okhttp3.b0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class WebDownloadInfo extends com.userlabs.xshare.beans.a implements Serializable, Cloneable {
    public static final int FAILURE_TYPE_NO_SPACE = -100;
    public static final int FAILURE_TYPE_UNKNOWN = -101;
    public static final int STATE_DOWNLOADING = 11;
    public static final int STATE_DOWNLOAD_FAILURE = 13;
    public static final int STATE_DOWNLOAD_SUCCESS = 12;
    public static final int STATE_WAITING = 10;
    private String acceptEncoding;
    private boolean cancelTask;
    protected String category;
    private String clientToken;
    private String cookie;
    private long downloadSize;
    private int downloadType;
    private int download_state = 0;
    private int failType = FAILURE_TYPE_UNKNOWN;
    private String id;
    private String mimeType;
    protected String name;
    private String path;
    private float progress;
    private String referer;
    private boolean showWA;
    private String totalFormatterSize;
    private long totalSize;
    private String uniqueKey;
    private String url;

    @Override // com.userlabs.xshare.beans.a
    public WebDownloadInfo clone() {
        try {
            return (WebDownloadInfo) super.clone();
        } catch (CloneNotSupportedException unused) {
            b0.c();
            return null;
        }
    }

    public void computeProgress() {
        long j = this.totalSize;
        setProgress(j != 0 ? (this.downloadSize * 100.0f) / j : 0.0f);
    }

    public void downloadFailure() {
        this.download_state = 13;
    }

    public String getAcceptEncoding() {
        return this.acceptEncoding;
    }

    public String getCategory() {
        return this.category;
    }

    public String getClientToken() {
        return this.clientToken;
    }

    public String getCookie() {
        return this.cookie;
    }

    public long getDownloadSize() {
        return this.downloadSize;
    }

    public int getDownloadType() {
        return this.downloadType;
    }

    public int getDownload_state() {
        return this.download_state;
    }

    public int getFailType() {
        return this.failType;
    }

    public String getId() {
        return this.id;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public String getPreSavePath() {
        return com.userlabs.xshare.core.phone.protocol.b.a.isApp(this.category) ? n.getInstance().getFileSavePath(this.category, this.name) : n.getInstance().getDownloadsFileSavePath(this.category, this.name);
    }

    public float getProgress() {
        return this.progress;
    }

    public String getReferer() {
        return this.referer;
    }

    public long getRetryInterval() {
        return com.userlabs.xshare.fastdownloader.a.getRetryInterval();
    }

    public int getRetryTimesWhenFailed() {
        return com.userlabs.xshare.fastdownloader.a.getRetryCount();
    }

    public String getTotalFormatterSize() {
        return this.totalFormatterSize;
    }

    public long getTotalSize() {
        return this.totalSize;
    }

    public String getUniqueKey() {
        return this.uniqueKey;
    }

    public String getUrl() {
        return this.url;
    }

    public void handleSuccess() {
        this.download_state = 12;
    }

    public void increaseDownloadedSize(long j) {
        this.downloadSize += j;
    }

    public boolean isCancelTask() {
        return this.cancelTask;
    }

    public boolean isDeleteChunksWhenError() {
        return true;
    }

    public boolean isDownloadFailure() {
        return this.download_state == 13;
    }

    public boolean isDownloadSuccess() {
        return this.download_state == 12;
    }

    public boolean isDownloading() {
        return this.download_state == 11;
    }

    public boolean isShowWA() {
        return this.showWA;
    }

    public boolean isWaiting() {
        return this.download_state == 10;
    }

    public void setAcceptEncoding(String str) {
        this.acceptEncoding = str;
    }

    public void setCancelTask(boolean z) {
        this.cancelTask = z;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setClientToken(String str) {
        this.clientToken = str;
    }

    public void setCookie(String str) {
        this.cookie = str;
    }

    public void setDownloadSize(long j) {
        this.downloadSize = j;
    }

    public void setDownloadType(int i) {
        this.downloadType = i;
    }

    public void setDownload_state(int i) {
        this.download_state = i;
    }

    public void setFailType(int i) {
        this.failType = i;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setProgress(float f) {
        this.progress = f;
    }

    public void setReferer(String str) {
        this.referer = str;
    }

    public void setShowWA(boolean z) {
        this.showWA = z;
    }

    public void setTotalFormatterSize(String str) {
        this.totalFormatterSize = str;
    }

    public void setTotalSize(long j) {
        this.totalSize = j;
    }

    public void setUniqueKey(String str) {
        this.uniqueKey = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void startDownload() {
        this.download_state = 11;
    }

    public boolean verifyFileIntegrity(File file) {
        return true;
    }

    public void handleError(Throwable th) {
    }
}
