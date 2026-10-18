package com.userlabs.xshare.core.storage;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class i implements Cloneable {
    public String a;
    public String b;
    public String c;
    public boolean d;
    public boolean e;
    public boolean f;
    public String i;
    public boolean j;
    public String l;
    public String p;
    public boolean g = false;
    public boolean h = false;
    public boolean k = false;
    public int m = 1;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a {
        public static void appendNewUri(String str) {
            Set<String> stringSetV2 = com.userlabs.xshare.core.preferences.a.getStringSetV2("x_phone_storage_uris");
            stringSetV2.add(str);
            com.userlabs.xshare.core.preferences.a.putStringSetV2("x_phone_storage_uris", stringSetV2);
            com.userlabs.xshare.core.preferences.a.putStringV2("x_phone_storage_current_uri", str);
        }

        public static String getLastSetTreeUri() {
            return com.userlabs.xshare.core.preferences.a.getStringV2("x_phone_storage_current_uri", "");
        }

        public static String getRootPath() {
            return com.userlabs.xshare.core.preferences.a.getStringV2("x_phone_storage_root_path", "");
        }

        public static Set<String> getUriList() {
            return com.userlabs.xshare.core.preferences.a.getStringSetV2("x_phone_storage_uris");
        }

        public static boolean isAuthed() {
            return com.userlabs.xshare.core.preferences.a.getBooleanV2("x_phone_storage_authed", false);
        }

        public static boolean isMyChildPath(String str) {
            return str.startsWith(getRootPath());
        }

        public static void save(i iVar, boolean z) {
            if (iVar.j) {
                setRootPath(iVar.b);
                setAuthed(z);
                if (!z || TextUtils.isEmpty(iVar.i)) {
                    return;
                }
                appendNewUri(iVar.i);
            }
        }

        public static void setAuthed(boolean z) {
            com.userlabs.xshare.core.preferences.a.putBooleanV2("x_phone_storage_authed", Boolean.valueOf(z));
        }

        public static void setRootPath(String str) {
            com.userlabs.xshare.core.preferences.a.putStringV2("x_phone_storage_root_path", str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class b {
        public static void appendNewUri(String str) {
            Set<String> stringSetV2 = com.userlabs.xshare.core.preferences.a.getStringSetV2("x_sd_authed_uris");
            stringSetV2.add(str);
            com.userlabs.xshare.core.preferences.a.putStringSetV2("x_sd_authed_uris", stringSetV2);
            com.userlabs.xshare.core.preferences.a.putStringV2("x_sd_current_uri", str);
        }

        public static void cardRemoved() {
            setRootPath("");
            setAuthed(false);
            clearAllUris();
            if (i.currentStorageLocationIsSdCard()) {
                i.setCurrentStorageLocationToPhoneStorage();
            }
        }

        private static void clearAllUris() {
            com.userlabs.xshare.core.preferences.a.putStringSetV2("x_sd_authed_uris", new HashSet());
            com.userlabs.xshare.core.preferences.a.putStringV2("x_sd_current_uri", "");
        }

        public static String getLastSetTreeUri() {
            return com.userlabs.xshare.core.preferences.a.getStringV2("x_sd_current_uri", "");
        }

        public static String getRootPath() {
            return com.userlabs.xshare.core.preferences.a.getStringV2("x_sd_root_path", "");
        }

        public static Set<String> getUriList() {
            return com.userlabs.xshare.core.preferences.a.getStringSetV2("x_sd_authed_uris");
        }

        public static boolean isAuthed() {
            return com.userlabs.xshare.core.preferences.a.getBooleanV2("x_sd_authed", false);
        }

        public static boolean isMyChildPath(String str) {
            return str.startsWith(getRootPath());
        }

        public static void save(i iVar, boolean z) {
            if (iVar.j) {
                return;
            }
            setRootPath(iVar.b);
            setAuthed(z);
            if (!z || TextUtils.isEmpty(iVar.i)) {
                return;
            }
            appendNewUri(iVar.i);
        }

        public static void setAuthed(boolean z) {
            com.userlabs.xshare.core.preferences.a.putBooleanV2("x_sd_authed", Boolean.valueOf(z));
        }

        public static void setRootPath(String str) {
            com.userlabs.xshare.core.preferences.a.putStringV2("x_sd_root_path", str);
        }
    }

    public i(boolean z, String str) {
        this.j = z;
        this.l = str;
    }

    private static int currentStorageLocation() {
        return com.userlabs.xshare.core.preferences.a.getIntV2("x_current_storage_location", 10);
    }

    public static boolean currentStorageLocationIsPhoneStorage() {
        return currentStorageLocation() == 10;
    }

    public static boolean currentStorageLocationIsSdCard() {
        return currentStorageLocation() == 11;
    }

    public static boolean firstTimeToUse() {
        boolean booleanV2 = com.userlabs.xshare.core.preferences.a.getBooleanV2("x_storage_new_model_use_first_time", true);
        if (booleanV2) {
            com.userlabs.xshare.core.preferences.a.putBooleanV2("x_storage_new_model_use_first_time", Boolean.FALSE);
        }
        return booleanV2;
    }

    public static int getStorageSaveWay() {
        return com.userlabs.xshare.core.preferences.a.getIntV2("x_storage_only_or_first", 1);
    }

    public static void putStorageSaveWay(int i) {
        com.userlabs.xshare.core.preferences.a.putIntV2("x_storage_only_or_first", i);
    }

    public static void saveToItem(i iVar, boolean z) {
        if (iVar.j) {
            setCurrentStorageLocationToPhoneStorage();
            a.save(iVar, z);
        } else {
            setCurrentStorageLocationToSdCard();
            b.save(iVar, z);
        }
    }

    private static void setCurrentStorageLocation(int i) {
        com.userlabs.xshare.core.preferences.a.putIntV2("x_current_storage_location", i);
    }

    public static void setCurrentStorageLocationToPhoneStorage() {
        setCurrentStorageLocation(10);
    }

    public static void setCurrentStorageLocationToSdCard() {
        setCurrentStorageLocation(11);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public i m1062clone() {
        try {
            return (i) super.clone();
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }

    public String toString() {
        return "title:" + this.a + ",path:" + this.b + ",displayPath:" + this.c + ",pathWritable:" + this.d + ",checked:" + this.e + ",storageCanUse:" + this.f + ",needGrantAuth:" + this.g + ",treeUri:" + this.i;
    }
}
