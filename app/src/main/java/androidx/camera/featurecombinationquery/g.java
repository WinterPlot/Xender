package androidx.camera.featurecombinationquery;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class g {
    private final List<OutputConfiguration> a;
    private final h b;

    private g(List<OutputConfiguration> list, h hVar) {
        this.a = list;
        this.b = hVar;
    }

    public List<OutputConfiguration> getOutputConfigurations() {
        return this.a;
    }

    public h getSessionParameters() {
        return this.b;
    }
}
