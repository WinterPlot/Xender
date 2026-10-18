package com.userlabs.xshare.videoplayer.service;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static void closeAction(Context context) {
        context.sendBroadcast(closeActionIntent(context));
    }

    public static Intent closeActionIntent(Context context) {
        return new Intent("video.close").setPackage(context.getPackageName());
    }

    public static void pauseOrPlayAction(Context context) {
        context.sendBroadcast(pauseOrPlayActionIntent(context));
    }

    public static Intent pauseOrPlayActionIntent(Context context) {
        return new Intent("video.pause.play").setPackage(context.getPackageName());
    }
}
