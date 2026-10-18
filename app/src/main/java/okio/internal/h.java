package okio.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
final class h {
    private final long a;
    private final long b;
    private final int c;

    public h(long j, long j2, int i) {
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final long getCentralDirectoryOffset() {
        return this.b;
    }

    public final int getCommentByteCount() {
        return this.c;
    }

    public final long getEntryCount() {
        return this.a;
    }
}
