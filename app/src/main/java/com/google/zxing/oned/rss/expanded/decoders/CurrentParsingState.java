package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class CurrentParsingState {
    private int a = 0;
    private State b = State.NUMERIC;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum State {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    public int getPosition() {
        return this.a;
    }

    public void incrementPosition(int i) {
        this.a += i;
    }

    public boolean isAlpha() {
        return this.b == State.ALPHA;
    }

    public boolean isIsoIec646() {
        return this.b == State.ISO_IEC_646;
    }

    public boolean isNumeric() {
        return this.b == State.NUMERIC;
    }

    public void setAlpha() {
        this.b = State.ALPHA;
    }

    public void setIsoIec646() {
        this.b = State.ISO_IEC_646;
    }

    public void setNumeric() {
        this.b = State.NUMERIC;
    }

    public void setPosition(int i) {
        this.a = i;
    }
}
