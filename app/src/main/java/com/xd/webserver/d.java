package com.xd.webserver;

import com.xd.webserver.request.Method;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public interface d {
    void execute() throws IOException;

    com.xd.webserver.content.c getCookies();

    Map<String, String> getHeaders();

    InputStream getInputStream();

    Method getMethod();

    Map<String, List<String>> getParameters();

    Map<String, String> getParams();

    String getQueryParameterString();

    String getRemoteIpAddress();

    String getUri();

    void parseBody(Map<String, String> map) throws IOException, NanoHTTPD.ResponseException;
}
