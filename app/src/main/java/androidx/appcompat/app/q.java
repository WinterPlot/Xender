package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
class q {
    private static q d;
    private final Context a;
    private final LocationManager b;
    private final a c = new a();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a {
        boolean a;
        long b;
    }

    public q(Context context, LocationManager locationManager) {
        this.a = context;
        this.b = locationManager;
    }

    public static q getInstance(Context context) {
        q qVar = d;
        if (qVar != null) {
            return qVar;
        }
        Context applicationContext = context.getApplicationContext();
        q qVar2 = new q(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        d = qVar2;
        return qVar2;
    }

    private Location getLastKnownLocation() {
        Location lastKnownLocationForProvider = androidx.core.content.h.checkSelfPermission(this.a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? getLastKnownLocationForProvider("network") : null;
        Location lastKnownLocationForProvider2 = androidx.core.content.h.checkSelfPermission(this.a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? getLastKnownLocationForProvider("gps") : null;
        if (lastKnownLocationForProvider2 == null || lastKnownLocationForProvider == null) {
            return lastKnownLocationForProvider2 != null ? lastKnownLocationForProvider2 : lastKnownLocationForProvider;
        }
        return lastKnownLocationForProvider2.getTime() > lastKnownLocationForProvider.getTime() ? lastKnownLocationForProvider2 : lastKnownLocationForProvider;
    }

    private Location getLastKnownLocationForProvider(String str) {
        try {
            if (this.b.isProviderEnabled(str)) {
                return this.b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    private boolean isStateValid() {
        return this.c.b > System.currentTimeMillis();
    }

    public static void setInstance(q qVar) {
        d = qVar;
    }

    private void updateState(Location location) {
        long j;
        a aVar = this.c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        p pVar = p.getInstance();
        pVar.calculateTwilight(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        pVar.calculateTwilight(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = pVar.c == 1;
        long j2 = pVar.b;
        long j3 = pVar.a;
        pVar.calculateTwilight(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j4 = pVar.b;
        if (j2 == -1 || j3 == -1) {
            j = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j3) {
                j2 = j4;
            } else if (jCurrentTimeMillis > j2) {
                j2 = j3;
            }
            j = j2 + 60000;
        }
        aVar.a = z;
        aVar.b = j;
    }

    public boolean isNight() {
        a aVar = this.c;
        if (isStateValid()) {
            return aVar.a;
        }
        Location lastKnownLocation = getLastKnownLocation();
        if (lastKnownLocation != null) {
            updateState(lastKnownLocation);
            return aVar.a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
