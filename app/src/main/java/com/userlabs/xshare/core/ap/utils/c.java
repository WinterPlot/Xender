package com.userlabs.xshare.core.ap.utils;

import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class c {
    private c() {
    }

    public static Object getFieldValue(Object obj, String str) throws Exception {
        Field declaredField = obj.getClass().getDeclaredField(str);
        if (declaredField.isAccessible()) {
            return declaredField.get(obj);
        }
        try {
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } finally {
            declaredField.setAccessible(false);
        }
    }

    public static Object invokeMethod(Object obj, String str, Class<?>[] clsArr, Object[] objArr) throws Exception {
        Objects.requireNonNull(obj);
        Method declaredMethod = obj.getClass().getDeclaredMethod(str, clsArr);
        if (declaredMethod.isAccessible()) {
            return declaredMethod.invoke(obj, objArr);
        }
        try {
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(obj, objArr);
        } finally {
            declaredMethod.setAccessible(false);
        }
    }

    public static void setFieldValue(Object obj, String str, String str2) throws Exception {
        Field declaredField = obj.getClass().getDeclaredField(str);
        if (declaredField.isAccessible()) {
            declaredField.set(obj, str2);
            return;
        }
        try {
            declaredField.setAccessible(true);
            declaredField.set(obj, str2);
        } finally {
            declaredField.setAccessible(false);
        }
    }

    public static void setFieldValue(Object obj, String str, int i) throws Exception {
        Field declaredField = obj.getClass().getDeclaredField(str);
        if (!declaredField.isAccessible()) {
            try {
                declaredField.setAccessible(true);
                declaredField.setInt(obj, i);
                return;
            } finally {
                declaredField.setAccessible(false);
            }
        }
        declaredField.setInt(obj, i);
    }
}
