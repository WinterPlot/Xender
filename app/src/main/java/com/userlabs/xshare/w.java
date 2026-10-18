package com.userlabs.xshare;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class w {
    private w() {
    }

    public static void registerReceiverCompat(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        androidx.core.content.a.registerReceiver(context, broadcastReceiver, intentFilter, 2);
    }
}
