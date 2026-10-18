package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class o0 {
    private final SharedPreferences a;
    private final String b;
    private final String c;
    private final Executor e;
    final ArrayDeque<String> d = new ArrayDeque<>();
    private boolean f = false;

    private o0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = str2;
        this.e = executor;
    }

    private boolean checkAndSyncState(boolean z) {
        if (z && !this.f) {
            syncStateAsync();
        }
        return z;
    }

    public static o0 createInstance(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        o0 o0Var = new o0(sharedPreferences, str, str2, executor);
        o0Var.initQueue();
        return o0Var;
    }

    private void initQueue() {
        synchronized (this.d) {
            try {
                this.d.clear();
                String string = this.a.getString(this.b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.c)) {
                    String[] strArrSplit = string.split(this.c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.d.add(str);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void syncState() {
        synchronized (this.d) {
            this.a.edit().putString(this.b, serialize()).apply();
        }
    }

    private void syncStateAsync() {
        this.e.execute(new n0(this, 0));
    }

    public boolean add(String str) {
        boolean zCheckAndSyncState;
        if (TextUtils.isEmpty(str) || str.contains(this.c)) {
            return false;
        }
        synchronized (this.d) {
            zCheckAndSyncState = checkAndSyncState(this.d.add(str));
        }
        return zCheckAndSyncState;
    }

    public void beginTransaction() {
        this.f = true;
    }

    public void beginTransactionSync() {
        synchronized (this.d) {
            beginTransaction();
        }
    }

    public void clear() {
        synchronized (this.d) {
            this.d.clear();
            checkAndSyncState(true);
        }
    }

    public void commitTransaction() {
        this.f = false;
        syncStateAsync();
    }

    public void commitTransactionSync() {
        synchronized (this.d) {
            commitTransaction();
        }
    }

    public String peek() {
        String strPeek;
        synchronized (this.d) {
            strPeek = this.d.peek();
        }
        return strPeek;
    }

    public String remove() {
        String strCheckAndSyncState;
        synchronized (this.d) {
            strCheckAndSyncState = checkAndSyncState(this.d.remove());
        }
        return strCheckAndSyncState;
    }

    public String serialize() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.c);
        }
        return sb.toString();
    }

    public String serializeSync() {
        String strSerialize;
        synchronized (this.d) {
            strSerialize = serialize();
        }
        return strSerialize;
    }

    public int size() {
        int size;
        synchronized (this.d) {
            size = this.d.size();
        }
        return size;
    }

    public List<String> toList() {
        ArrayList arrayList;
        synchronized (this.d) {
            arrayList = new ArrayList(this.d);
        }
        return arrayList;
    }

    private String checkAndSyncState(String str) {
        checkAndSyncState(str != null);
        return str;
    }

    public boolean remove(Object obj) {
        boolean zCheckAndSyncState;
        synchronized (this.d) {
            zCheckAndSyncState = checkAndSyncState(this.d.remove(obj));
        }
        return zCheckAndSyncState;
    }
}
