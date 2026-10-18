package com.xd.webserver.tempfiles;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface d {
    void delete() throws Exception;

    String getName();

    OutputStream open() throws Exception;
}
