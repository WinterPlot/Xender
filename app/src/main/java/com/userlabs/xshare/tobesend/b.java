package com.userlabs.xshare.tobesend;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class b {
    private int a;

    private b(int i) {
        this.a = i;
    }

    public static b createTaskAddedEvent(int i) {
        return new b(i);
    }

    public int getUnfinishedTasks() {
        return this.a;
    }
}
