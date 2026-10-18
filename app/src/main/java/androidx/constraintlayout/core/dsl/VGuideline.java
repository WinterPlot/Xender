package androidx.constraintlayout.core.dsl;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class VGuideline extends Guideline {
    public VGuideline(String str, String str2) {
        super(str);
        this.config = str2;
        this.type = new Helper.a(Helper.typeMap.get(Helper.Type.VERTICAL_GUIDELINE));
        this.configMap = convertConfigToMap();
    }

    public VGuideline(String str) {
        super(str);
        this.type = new Helper.a(Helper.typeMap.get(Helper.Type.VERTICAL_GUIDELINE));
    }
}
