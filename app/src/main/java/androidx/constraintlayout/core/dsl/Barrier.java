package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class Barrier extends Helper {
    private Constraint.Side mDirection;
    private int mMargin;
    private ArrayList<b> references;

    public Barrier(String str, String str2) {
        super(str, new Helper.a(Helper.typeMap.get(Helper.Type.BARRIER)), str2);
        this.mDirection = null;
        this.mMargin = Integer.MIN_VALUE;
        this.references = new ArrayList<>();
        Map<String, String> mapConvertConfigToMap = convertConfigToMap();
        this.configMap = mapConvertConfigToMap;
        if (mapConvertConfigToMap.containsKey("contains")) {
            b.addStringToReferences(this.configMap.get("contains"), this.references);
        }
    }

    public Barrier addReference(b bVar) {
        this.references.add(bVar);
        this.configMap.put("contains", referencesToString());
        return this;
    }

    public Constraint.Side getDirection() {
        return this.mDirection;
    }

    public int getMargin() {
        return this.mMargin;
    }

    public String referencesToString() {
        if (this.references.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("[");
        ArrayList<b> arrayList = this.references;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            b bVar = arrayList.get(i);
            i++;
            sb.append(bVar.toString());
        }
        sb.append("]");
        return sb.toString();
    }

    public void setDirection(Constraint.Side side) {
        this.mDirection = side;
        this.configMap.put("direction", Helper.sideMap.get(side));
    }

    public void setMargin(int i) {
        this.mMargin = i;
        this.configMap.put("margin", String.valueOf(i));
    }

    public Barrier addReference(String str) {
        return addReference(b.parseStringToRef(str));
    }

    public Barrier(String str) {
        super(str, new Helper.a(Helper.typeMap.get(Helper.Type.BARRIER)));
        this.mDirection = null;
        this.mMargin = Integer.MIN_VALUE;
        this.references = new ArrayList<>();
    }
}
