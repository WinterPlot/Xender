package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.camera.camera2.impl.k;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    private static final WeakHashMap<c, SparseArray<b>> b = new WeakHashMap<>(0);
    private static final Object c = new Object();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a {
        private a() {
        }

        public static float getFloat(Resources resources, int i) {
            return resources.getFloat(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class b {
        final ColorStateList a;
        final Configuration b;
        final int c;

        public b(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.a = colorStateList;
            this.b = configuration;
            this.c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class c {
        final Resources a;
        final Resources.Theme b;

        public c(Resources resources, Resources.Theme theme) {
            this.a = resources;
            this.b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.a.equals(cVar.a) && androidx.core.util.d.equals(this.b, cVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return androidx.core.util.d.hash(this.a, this.b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class d {
        public static Handler getHandler(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void callbackFailAsync(int i, Handler handler) {
            getHandler(handler).post(new k(this, i, 3));
        }

        public final void callbackSuccessAsync(Typeface typeface, Handler handler) {
            getHandler(handler).post(new androidx.activity.f(this, typeface, 16));
        }

        /* JADX INFO: renamed from: onFontRetrievalFailed, reason: merged with bridge method [inline-methods] */
        public abstract void lambda$callbackFailAsync$1(int i);

        /* JADX INFO: renamed from: onFontRetrieved, reason: merged with bridge method [inline-methods] */
        public abstract void lambda$callbackSuccessAsync$0(Typeface typeface);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class e {

        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public static class a {
            private static final Object a = new Object();
            private static Method b;
            private static boolean c;

            private a() {
            }

            /* JADX WARN: Code duplicated, block: B:31:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            public static void rebase(Resources.Theme theme) {
                Method method;
                synchronized (a) {
                    if (c) {
                        method = b;
                        if (method != null) {
                            method.invoke(theme, null);
                        }
                    } else {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                        }
                        c = true;
                        method = b;
                        if (method != null) {
                            try {
                                method.invoke(theme, null);
                            } catch (IllegalAccessException | InvocationTargetException e2) {
                                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                b = null;
                            }
                        }
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public static class b {
            private b() {
            }

            public static void rebase(Resources.Theme theme) {
                theme.rebase();
            }
        }

        private e() {
        }

        public static void rebase(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.rebase(theme);
            } else {
                a.rebase(theme);
            }
        }
    }

    private h() {
    }

    private static void addColorStateListToCache(c cVar, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (c) {
            try {
                WeakHashMap<c, SparseArray<b>> weakHashMap = b;
                SparseArray<b> sparseArray = weakHashMap.get(cVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    weakHashMap.put(cVar, sparseArray);
                }
                sparseArray.append(i, new b(colorStateList, cVar.a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void clearCachesForTheme(Resources.Theme theme) {
        synchronized (c) {
            try {
                Iterator<c> it = b.keySet().iterator();
                while (it.hasNext()) {
                    c next = it.next();
                    if (next != null && theme.equals(next.b)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.c == r5.hashCode()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ColorStateList getCachedColorStateList(c cVar, int i) {
        b bVar;
        synchronized (c) {
            try {
                SparseArray<b> sparseArray = b.get(cVar);
                if (sparseArray != null && sparseArray.size() > 0 && (bVar = sparseArray.get(i)) != null) {
                    if (bVar.b.equals(cVar.a.getConfiguration())) {
                        Resources.Theme theme = cVar.b;
                        if (theme != null || bVar.c != 0) {
                            if (theme != null) {
                            }
                        }
                        return bVar.a;
                    }
                    sparseArray.remove(i);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface getCachedFont(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, new TypedValue(), 0, null, null, false, true);
    }

    public static int getColor(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        return resources.getColor(i, theme);
    }

    public static ColorStateList getColorStateList(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        c cVar = new c(resources, theme);
        ColorStateList cachedColorStateList = getCachedColorStateList(cVar, i);
        if (cachedColorStateList != null) {
            return cachedColorStateList;
        }
        ColorStateList colorStateListInflateColorStateList = inflateColorStateList(resources, i, theme);
        if (colorStateListInflateColorStateList == null) {
            return resources.getColorStateList(i, theme);
        }
        addColorStateListToCache(cVar, i, colorStateListInflateColorStateList, theme);
        return colorStateListInflateColorStateList;
    }

    public static Drawable getDrawable(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        return resources.getDrawable(i, theme);
    }

    public static Drawable getDrawableForDensity(Resources resources, int i, int i2, Resources.Theme theme) throws Resources.NotFoundException {
        return resources.getDrawableForDensity(i, i2, theme);
    }

    public static float getFloat(Resources resources, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return a.getFloat(resources, i);
        }
        TypedValue typedValue = getTypedValue();
        resources.getValue(i, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(typedValue.type) + " is not valid");
    }

    public static void getFont(Context context, int i, d dVar, Handler handler) throws Resources.NotFoundException {
        androidx.core.util.i.checkNotNull(dVar);
        if (context.isRestricted()) {
            dVar.callbackFailAsync(-4, handler);
        } else {
            loadFont(context, i, new TypedValue(), 0, dVar, handler, false, false);
        }
    }

    private static TypedValue getTypedValue() {
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList inflateColorStateList(Resources resources, int i, Resources.Theme theme) {
        if (isColorInt(resources, i)) {
            return null;
        }
        try {
            return androidx.core.content.res.c.createFromXml(resources, resources.getXml(i), theme);
        } catch (Exception e2) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }

    private static boolean isColorInt(Resources resources, int i) {
        TypedValue typedValue = getTypedValue();
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        return i2 >= 28 && i2 <= 31;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x009d  */
    private static Typeface loadFont(Context context, Resources resources, TypedValue typedValue, int i, int i2, d dVar, Handler handler, boolean z, boolean z2) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            if (dVar != null) {
                dVar.callbackFailAsync(-3, handler);
            }
            return null;
        }
        Typeface typefaceFindFromCache = androidx.core.graphics.f.findFromCache(resources, i, string, typedValue.assetCookie, i2);
        if (typefaceFindFromCache != null) {
            if (dVar != null) {
                dVar.callbackSuccessAsync(typefaceFindFromCache, handler);
            }
            return typefaceFindFromCache;
        }
        if (z2) {
            return null;
        }
        try {
            if (!string.toLowerCase().endsWith(".xml")) {
                Typeface typefaceCreateFromResourcesFontFile = androidx.core.graphics.f.createFromResourcesFontFile(context, resources, i, string, typedValue.assetCookie, i2);
                if (dVar != null) {
                    if (typefaceCreateFromResourcesFontFile != null) {
                        dVar.callbackSuccessAsync(typefaceCreateFromResourcesFontFile, handler);
                        return typefaceCreateFromResourcesFontFile;
                    }
                    dVar.callbackFailAsync(-3, handler);
                }
                return typefaceCreateFromResourcesFontFile;
            }
            androidx.core.content.res.e.a aVar = androidx.core.content.res.e.parse(resources.getXml(i), resources);
            if (aVar == null) {
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                if (dVar != null) {
                    dVar.callbackFailAsync(-3, handler);
                }
                return null;
            }
            try {
                return androidx.core.graphics.f.createFromResourcesFamilyXml(context, aVar, resources, i, string, typedValue.assetCookie, i2, dVar, handler, z);
            } catch (IOException e2) {
                e = e2;
                string = string;
                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                if (dVar != null) {
                    dVar.callbackFailAsync(-3, handler);
                }
                return null;
            } catch (XmlPullParserException e3) {
                e = e3;
                string = string;
                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e);
                if (dVar != null) {
                    dVar.callbackFailAsync(-3, handler);
                }
                return null;
            }
        } catch (IOException e4) {
            e = e4;
        } catch (XmlPullParserException e5) {
            e = e5;
        }
    }

    public static Typeface getFont(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface getFont(Context context, int i, TypedValue typedValue, int i2, d dVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, typedValue, i2, dVar, null, true, false);
    }

    private static Typeface loadFont(Context context, int i, TypedValue typedValue, int i2, d dVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface typefaceLoadFont = loadFont(context, resources, typedValue, i, i2, dVar, handler, z, z2);
        if (typefaceLoadFont != null || dVar != null || z2) {
            return typefaceLoadFont;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
