package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.Config;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final Config.a<Object> createCaptureRequestOption(CaptureRequest.Key<?> key) {
        key.getClass();
        Config.a<Object> aVarCreate = Config.a.create("camera2.captureRequest.option." + key.getName(), Object.class, key);
        aVarCreate.getClass();
        return aVarCreate;
    }

    public static final Map<CaptureRequest.Key<?>, Object> toParameters(Config config) {
        Object objRetrieveOption;
        config.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Config.a<?> aVar : config.listOptions()) {
            Object token = aVar.getToken();
            CaptureRequest.Key key = token instanceof CaptureRequest.Key ? (CaptureRequest.Key) token : null;
            if (key != null && (objRetrieveOption = config.retrieveOption(aVar)) != null) {
                linkedHashMap.put(key, objRetrieveOption);
            }
        }
        return linkedHashMap;
    }
}
