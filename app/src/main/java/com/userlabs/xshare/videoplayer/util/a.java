package com.userlabs.xshare.videoplayer.util;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import androidx.activity.e0;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    private static void setLocaleForApi24(Configuration configuration, Locale locale) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(locale);
        LocaleList localeList = LocaleList.getDefault();
        for (int i = 0; i < localeList.size(); i++) {
            linkedHashSet.add(localeList.get(i));
        }
        LocaleList localeListF = e0.f((Locale[]) linkedHashSet.toArray(new Locale[0]));
        LocaleList.setDefault(localeListF);
        configuration.setLocales(localeListF);
    }

    public static Context updateToMyLanguage(Context context, Locale locale) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        if (Build.VERSION.SDK_INT >= 24) {
            setLocaleForApi24(configuration, locale);
        } else {
            configuration.setLocale(locale);
        }
        return context.createConfigurationContext(configuration);
    }
}
