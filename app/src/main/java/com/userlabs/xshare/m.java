package com.userlabs.xshare;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class m {
    /* JADX WARN: Bottom block not found for handler: all -> 0x001f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean canHandleEx(Throwable th) {
        if (th == null) {
            return false;
        }
        if (th instanceof OutOfMemoryError) {
            Process.killProcess(Process.myPid());
            System.exit(5);
            return false;
        }
        if (!canHandleExInternal(th)) {
            return false;
        }
        while (true) {
            Looper.loop();
        }
    }

    public static boolean canHandleExInternal(Throwable th) {
        String stackTraceString = Log.getStackTraceString(th);
        if (TextUtils.isEmpty(stackTraceString)) {
            return false;
        }
        return isRemoteServiceException(th, stackTraceString) || isChromeException(th, stackTraceString) || isRecyclerViewOutOfBoundsException(th, stackTraceString) || isCannotDeliverBroadcastException(th, stackTraceString) || isSecurityException(th, stackTraceString) || isChoreographerCallback(th, stackTraceString) || isTranssionAndroid15AIHelperEx(th, stackTraceString) || isRuntimeEx(th, stackTraceString) || isTimerTaskReadyEx(th, stackTraceString) || isReportSizeConfigurationsEx(th, stackTraceString) || isDeadSystemEx(th, stackTraceString) || isWindowGlobalAddViewEx(th, stackTraceString) || isNullPointerException(th, stackTraceString);
    }

    private static boolean isCannotDeliverBroadcastException(Throwable th, String str) {
        return th.getClass().getName().contains("CannotDeliverBroadcastException");
    }

    private static boolean isChoreographerCallback(Throwable th, String str) {
        return (th instanceof RuntimeException) && Build.VERSION.SDK_INT >= 27 && str.contains("Choreographer$CallbackRecord.run");
    }

    private static boolean isChromeException(Throwable th, String str) {
        int i = Build.VERSION.SDK_INT;
        boolean z = th instanceof RuntimeException;
        if (z && i >= 27 && str.contains("org.chromium")) {
            return true;
        }
        return (z || (th instanceof PackageManager.NameNotFoundException)) && i >= 26 && i <= 28 && str.contains("org.chromium.content.browser.ChildProcessLauncherHelperImpl");
    }

    private static boolean isDeadSystemEx(Throwable th, String str) {
        return (th instanceof RuntimeException) && str.contains("DeadSystemException");
    }

    private static boolean isNotFoundEx(Throwable th) {
        Throwable cause = th.getCause();
        Throwable cause2 = cause != null ? cause.getCause() : null;
        return (th instanceof NoClassDefFoundError) || (cause instanceof NoClassDefFoundError) || (cause2 instanceof NoClassDefFoundError) || (th instanceof ClassNotFoundException) || (cause instanceof ClassNotFoundException) || (cause2 instanceof ClassNotFoundException) || (th instanceof NoSuchFieldException) || (cause instanceof NoSuchFieldException) || (cause2 instanceof NoSuchFieldException) || (th instanceof NoSuchFieldError) || (cause instanceof NoSuchFieldError) || (cause2 instanceof NoSuchFieldError) || (th instanceof NoSuchMethodError) || (cause instanceof NoSuchMethodError) || (cause2 instanceof NoSuchMethodError);
    }

    private static boolean isNullPointerException(Throwable th, String str) {
        return (th instanceof NullPointerException) && !str.contains("com.userlabs.xshare");
    }

    private static boolean isRecyclerViewOutOfBoundsException(Throwable th, String str) {
        return ((th instanceof IndexOutOfBoundsException) || (th.getCause() instanceof IndexOutOfBoundsException)) && str.contains("Inconsistency detected");
    }

    private static boolean isRemoteServiceException(Throwable th, String str) {
        String name = th.getClass().getName();
        if (name.contains("RemoteServiceException") || name.contains("BadForegroundServiceNotificationException") || name.contains("ForegroundServiceDidNotStartInTimeException") || name.contains("CannotPostForegroundServiceNotificationException")) {
            return str.contains("startForegroundService() did not") || str.contains("Bad notification");
        }
        return false;
    }

    private static boolean isReportSizeConfigurationsEx(Throwable th, String str) {
        return (th instanceof IllegalArgumentException) && str.contains("reportSizeConfigurations: ActivityRecord not found");
    }

    private static boolean isRuntimeEx(Throwable th, String str) {
        boolean z = th instanceof RuntimeException;
        if (z && str.contains("android.app.job.JobService")) {
            return true;
        }
        if (z && (str.contains("androidx.navigation.fragment.FragmentNavigator") || str.contains("is unknown to the FragmentNavigator"))) {
            return true;
        }
        return z && Build.VERSION.SDK_INT <= 27 && str.contains("android.app.KeyguardManager");
    }

    private static boolean isSecurityException(Throwable th, String str) {
        boolean z = th instanceof SecurityException;
        if (z && Build.VERSION.SDK_INT == 23 && str.contains("Unable to find app")) {
            return true;
        }
        if (z && Build.VERSION.SDK_INT == 30 && str.contains("getNetworkCapabilities")) {
            return true;
        }
        if (z && str.contains("Not allowed to bind to service")) {
            return true;
        }
        if (z && Build.VERSION.SDK_INT <= 27 && str.contains("OBSERVE_GRANT_REVOKE_PERMISSIONS")) {
            return true;
        }
        if (com.userlabs.xshare.core.permission.c.isVivoByBrand() && ((z || (th.getCause() instanceof SecurityException)) && str.contains("GET_INTENT_SENDER_INTENT"))) {
            return true;
        }
        if (!z) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return (i == 28 || i == 29) && str.contains("com.google.android.gsf.gservices");
    }

    private static boolean isTimerTaskReadyEx(Throwable th, String str) {
        return false;
    }

    private static boolean isTranssionAndroid15AIHelperEx(Throwable th, String str) {
        if (Build.VERSION.SDK_INT >= 35 && (th instanceof RuntimeException) && com.userlabs.xshare.core.permission.c.isTranssionDevice()) {
            return str.contains("com.transsion.widget.v1.AIHelper");
        }
        return false;
    }

    private static boolean isWindowGlobalAddViewEx(Throwable th, String str) {
        return str.contains("view.WindowManagerGlobal.addView");
    }
}
