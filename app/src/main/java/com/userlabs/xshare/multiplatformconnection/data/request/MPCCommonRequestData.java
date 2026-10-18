package com.userlabs.xshare.multiplatformconnection.data.request;

import android.text.TextUtils;
import com.userlabs.xshare.utils.l;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class MPCCommonRequestData extends MPCRequestData<Map<String, Object>> {
    public static Map<String, Object> appendFailedData(Map<String, Object> map, String str, int i) {
        map.put("code", Integer.valueOf(i));
        map.put("reason", str);
        return map;
    }

    public static Map<String, Object> newEmptySuccessDataInstance() {
        HashMap map = new HashMap();
        map.put("code", 0);
        map.put("reason", "");
        return map;
    }

    public static Map<String, Object> newFailedDataInstance(String str, int i) {
        HashMap map = new HashMap();
        map.put("code", Integer.valueOf(i));
        map.put("reason", str);
        return map;
    }

    public static MPCCommonRequestData newInstance(MPCHeader mPCHeader, Map<String, Object> map) {
        MPCCommonRequestData mPCCommonRequestData = new MPCCommonRequestData();
        mPCCommonRequestData.setHeader(mPCHeader);
        mPCCommonRequestData.setData(map);
        return mPCCommonRequestData;
    }

    public <T> T getDataByNode(String str, Class<T> cls) {
        Object obj;
        if (getData() == null || TextUtils.isEmpty(str) || (obj = getData().get(str)) == null) {
            return null;
        }
        try {
            Gson gson = l.getGson();
            return (T) gson.fromJson(gson.toJson(obj), (Class) cls);
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getDataCode() {
        return getDataInt("code", 1120);
    }

    public int getDataInt(String str, int i) {
        if (getData() != null) {
            Object obj = getData().get(str);
            if (obj instanceof Double) {
                return ((Double) obj).intValue();
            }
        }
        return i;
    }

    public List<?> getDataList(String str) {
        if (getData() == null) {
            return null;
        }
        Object obj = getData().get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        return null;
    }

    public long getDataLong(String str, long j) {
        if (getData() != null) {
            Object obj = getData().get(str);
            if (obj instanceof Double) {
                return ((Double) obj).longValue();
            }
        }
        return j;
    }

    public String getDataReason() {
        return getDataString("reason", "unknown");
    }

    public String getDataString(String str, String str2) {
        return getData() != null ? String.valueOf(getData().get(str)) : str2;
    }

    public boolean isValidData() {
        return getDataCode() == 0;
    }

    public <T> T getDataByNode(String str, Type type) {
        Object obj;
        if (getData() == null || TextUtils.isEmpty(str) || (obj = getData().get(str)) == null) {
            return null;
        }
        try {
            Gson gson = l.getGson();
            return (T) gson.fromJson(gson.toJson(obj), type);
        } catch (Throwable unused) {
            return null;
        }
    }
}
