package com.userlabs.xshare.open;

import android.content.Context;
import android.content.Intent;
import com.userlabs.xshare.core.storage.j;
import com.userlabs.xshare.t;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class h extends d {
    public h(Context context, String str) {
        super(context, str);
    }

    private boolean play() {
        return playWithSystemPlayer();
    }

    private boolean playWithSystemPlayer() {
        try {
            Intent intent = new Intent();
            intent.setDataAndType(t.getOpenFileUriFrom(this.b), "video/*");
            intent.putExtra("video_title", j.create(this.b).getName());
            intent.setAction("android.intent.action.VIEW");
            com.userlabs.xshare.core.utils.files.a.addFlagToIntent(intent, 536870912);
            this.a.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.userlabs.xshare.open.d
    public boolean open() {
        return play();
    }

    public h(Context context, String str, String str2, String str3) {
        super(context, str);
    }
}
