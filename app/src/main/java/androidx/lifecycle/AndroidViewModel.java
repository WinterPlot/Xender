package androidx.lifecycle;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class AndroidViewModel extends a1 {
    private final Application b;

    public AndroidViewModel(Application application) {
        application.getClass();
        this.b = application;
    }

    public <T extends Application> T getApplication() {
        T t = (T) this.b;
        t.getClass();
        return t;
    }
}
