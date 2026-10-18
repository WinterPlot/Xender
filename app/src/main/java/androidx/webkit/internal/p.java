package androidx.webkit.internal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class p {
    public static Map<String, Object> convertUserAgentMetadataToMap(androidx.webkit.e eVar) {
        HashMap map = new HashMap();
        map.put("BRAND_VERSION_LIST", getBrandVersionArray(eVar.getBrandVersionList()));
        map.put("FULL_VERSION", eVar.getFullVersion());
        map.put("PLATFORM", eVar.getPlatform());
        map.put("PLATFORM_VERSION", eVar.getPlatformVersion());
        map.put("ARCHITECTURE", eVar.getArchitecture());
        map.put("MODEL", eVar.getModel());
        map.put("MOBILE", Boolean.valueOf(eVar.isMobile()));
        map.put("BITNESS", Integer.valueOf(eVar.getBitness()));
        map.put("WOW64", Boolean.valueOf(eVar.isWow64()));
        return map;
    }

    private static String[][] getBrandVersionArray(List<androidx.webkit.e.b> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String[][] strArr = (String[][]) Array.newInstance((Class<?>) String.class, list.size(), 3);
        for (int i = 0; i < list.size(); i++) {
            strArr[i][0] = list.get(i).getBrand();
            strArr[i][1] = list.get(i).getMajorVersion();
            strArr[i][2] = list.get(i).getFullVersion();
        }
        return strArr;
    }

    public static androidx.webkit.e getUserAgentMetadataFromMap(Map<String, Object> map) {
        androidx.webkit.e.c cVar = new androidx.webkit.e.c();
        Object obj = map.get("BRAND_VERSION_LIST");
        if (obj != null) {
            ArrayList arrayList = new ArrayList();
            for (String[] strArr : (String[][]) obj) {
                arrayList.add(new androidx.webkit.e.b.a().setBrand(strArr[0]).setMajorVersion(strArr[1]).setFullVersion(strArr[2]).build());
            }
            cVar.setBrandVersionList(arrayList);
        }
        String str = (String) map.get("FULL_VERSION");
        if (str != null) {
            cVar.setFullVersion(str);
        }
        String str2 = (String) map.get("PLATFORM");
        if (str2 != null) {
            cVar.setPlatform(str2);
        }
        String str3 = (String) map.get("PLATFORM_VERSION");
        if (str3 != null) {
            cVar.setPlatformVersion(str3);
        }
        String str4 = (String) map.get("ARCHITECTURE");
        if (str4 != null) {
            cVar.setArchitecture(str4);
        }
        String str5 = (String) map.get("MODEL");
        if (str5 != null) {
            cVar.setModel(str5);
        }
        Boolean bool = (Boolean) map.get("MOBILE");
        if (bool != null) {
            cVar.setMobile(bool.booleanValue());
        }
        Integer num = (Integer) map.get("BITNESS");
        if (num != null) {
            cVar.setBitness(num.intValue());
        }
        Boolean bool2 = (Boolean) map.get("WOW64");
        if (bool2 != null) {
            cVar.setWow64(bool2.booleanValue());
        }
        return cVar.build();
    }
}
