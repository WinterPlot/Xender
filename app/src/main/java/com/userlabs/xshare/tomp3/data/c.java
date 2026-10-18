package com.userlabs.xshare.tomp3.data;

import com.android.tools.r8.RecordTag;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c<Data> {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    protected final Data e;
    private float f;
    private int g = 0;
    private boolean h;
    private a i;
    private long j;
    private String k;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a extends RecordTag {
        private final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public int failType() {
            return this.a;
        }

        public final int hashCode() {
            return this.a;
        }

        public final String toString() {
            Object[] objArr = {Integer.valueOf(this.a)};
            String[] strArrSplit = "a".length() == 0 ? new String[0] : "a".split(";");
            StringBuilder sb = new StringBuilder(a.class.getSimpleName());
            sb.append("[");
            for (int i = 0; i < strArrSplit.length; i++) {
                sb.append(strArrSplit[i]);
                sb.append("=");
                sb.append(objArr[i]);
                if (i != strArrSplit.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public c(String str, String str2, String str3, String str4, Data data) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = data;
    }

    public void convertCancel() {
        setStatus(50);
        setStatusChanged(true);
    }

    public void convertFailure() {
        setStatus(40);
        setStatusChanged(true);
    }

    public void convertSuccess() {
        setStatus(30);
        setStatusChanged(true);
    }

    public String getConvertedAudioPath() {
        return this.k;
    }

    public long getConvertedAudioSize() {
        return this.j;
    }

    public String getExt() {
        return this.d;
    }

    public a getFailureType() {
        return this.i;
    }

    public String getFilePath() {
        return this.b;
    }

    public String getName() {
        return this.c;
    }

    public float getProgress() {
        return this.f;
    }

    public int getStatus() {
        return this.g;
    }

    public String getTaskId() {
        return this.a;
    }

    public Data getoData() {
        return this.e;
    }

    public boolean isStatusChanged() {
        return this.h;
    }

    public boolean isStatusFinished() {
        int i = this.g;
        return i == 30 || i == 40 || i == 50;
    }

    public boolean isTaskCanceled() {
        return this.g == 50;
    }

    public void setConvertedAudioPath(String str) {
        this.k = str;
    }

    public void setConvertedAudioSize(long j) {
        this.j = j;
    }

    public void setFailureType(a aVar) {
        this.i = aVar;
    }

    public void setProgress(float f) {
        this.f = f;
        updateODataProgress(this.a, f);
    }

    public void setStatus(int i) {
        this.g = i;
        statusChange();
    }

    public void setStatusChanged(boolean z) {
        this.h = z;
    }

    public void startConvert() {
        setStatus(20);
        setStatusChanged(true);
    }

    public void startWait() {
        setStatus(10);
        setStatusChanged(true);
    }

    public abstract void statusChange();

    public abstract void updateODataProgress(String str, float f);
}
