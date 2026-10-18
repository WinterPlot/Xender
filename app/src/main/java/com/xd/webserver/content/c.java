package com.xd.webserver.content;

import com.xd.webserver.response.Response;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class c implements Iterable<String> {
    private final HashMap<String, String> a = new HashMap<>();
    private final ArrayList<b> b = new ArrayList<>();

    public c(Map<String, String> map) {
        String str = map.get("cookie");
        if (str != null) {
            for (String str2 : str.split(";")) {
                String[] strArrSplit = str2.trim().split("=");
                if (strArrSplit.length == 2) {
                    this.a.put(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
    }

    public void delete(String str) {
        set(str, "-delete-", -30);
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        return this.a.keySet().iterator();
    }

    public String read(String str) {
        return this.a.get(str);
    }

    public void set(String str, String str2, int i) {
        this.b.add(new b(str, str2, b.getHTTPTime(i)));
    }

    public void unloadQueue(Response response) {
        ArrayList<b> arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            b bVar = arrayList.get(i);
            i++;
            response.addCookieHeader(bVar.getHTTPHeader());
        }
    }

    public void set(b bVar) {
        this.b.add(bVar);
    }
}
