package com.userlabs.xshare.arch.separator;

import com.userlabs.xshare.beans.h;
import com.userlabs.xshare.utils.w;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class g implements d<h> {
    @Override // com.userlabs.xshare.arch.separator.d
    public String getGroupKey(h hVar) {
        return w.getFirstLetter(hVar.getName_first_letter());
    }
}
