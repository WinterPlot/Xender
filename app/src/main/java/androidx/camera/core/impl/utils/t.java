package androidx.camera.core.impl.utils;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class t {
    private t() {
    }

    public static androidx.camera.core.resolutionselector.c overrideResolutionSelectors(androidx.camera.core.resolutionselector.c cVar, androidx.camera.core.resolutionselector.c cVar2) {
        if (cVar2 == null) {
            return cVar;
        }
        if (cVar == null) {
            return cVar2;
        }
        androidx.camera.core.resolutionselector.c.a aVarFromResolutionSelector = androidx.camera.core.resolutionselector.c.a.fromResolutionSelector(cVar);
        if (cVar2.getAspectRatioStrategy() != null) {
            aVarFromResolutionSelector.setAspectRatioStrategy(cVar2.getAspectRatioStrategy());
        }
        if (cVar2.getResolutionStrategy() != null) {
            aVarFromResolutionSelector.setResolutionStrategy(cVar2.getResolutionStrategy());
        }
        if (cVar2.getResolutionFilter() != null) {
            aVarFromResolutionSelector.setResolutionFilter(cVar2.getResolutionFilter());
        }
        if (cVar2.getAllowedResolutionMode() != 0) {
            aVarFromResolutionSelector.setAllowedResolutionMode(cVar2.getAllowedResolutionMode());
        }
        return aVarFromResolutionSelector.build();
    }
}
