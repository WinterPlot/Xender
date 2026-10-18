package com.userlabs.xshare.core.progress;

import com.userlabs.xshare.arch.db.entity.l;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class d {
    private byte a;
    List<l> b;
    private long c;
    private f d;
    private l e;

    private d(byte b, l lVar) {
        this.a = b;
        this.e = lVar;
    }

    public static d createAllTaskFinishedEvent(long j, float f, long j2, long j3) {
        d dVar = new d((byte) 1);
        dVar.c = j;
        dVar.d = f.create(f, j2, j3);
        return dVar;
    }

    public static d createProgressCancelEvent(l lVar) {
        return new d((byte) 4, lVar);
    }

    public static d createProgressUpdateEvent(float f, long j, long j2) {
        d dVar = new d((byte) 2);
        dVar.d = f.create(f, j, j2);
        return dVar;
    }

    public static d createTaskAddedEvent(List<l> list) {
        return new d((byte) 0, list);
    }

    public List<l> getAddTasks() {
        return this.b;
    }

    public long getAllTasksTransferredTime() {
        return this.c;
    }

    public l getCancelTask() {
        return this.e;
    }

    public f getSpeedAndTransferredOperator() {
        return this.d;
    }

    public byte getType() {
        return this.a;
    }

    public boolean isProgressUpdate() {
        return this.a == 2;
    }

    private d(byte b) {
        this.a = b;
    }

    private d(byte b, List<l> list) {
        this.a = b;
        this.b = list;
    }
}
