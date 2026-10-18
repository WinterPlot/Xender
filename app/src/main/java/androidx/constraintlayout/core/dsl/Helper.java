package androidx.constraintlayout.core.dsl;

import androidx.camera.camera2.pipe.w;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class Helper {
    protected static final Map<Constraint.Side, String> sideMap;
    protected static final Map<Type, String> typeMap;
    protected String config;
    protected Map<String, String> configMap;
    protected final String name;
    protected a type;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum Type {
        VERTICAL_GUIDELINE,
        HORIZONTAL_GUIDELINE,
        VERTICAL_CHAIN,
        HORIZONTAL_CHAIN,
        BARRIER
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        final String a;

        public a(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    static {
        HashMap map = new HashMap();
        sideMap = map;
        map.put(Constraint.Side.LEFT, "'left'");
        map.put(Constraint.Side.RIGHT, "'right'");
        map.put(Constraint.Side.TOP, "'top'");
        map.put(Constraint.Side.BOTTOM, "'bottom'");
        map.put(Constraint.Side.START, "'start'");
        map.put(Constraint.Side.END, "'end'");
        map.put(Constraint.Side.BASELINE, "'baseline'");
        HashMap map2 = new HashMap();
        typeMap = map2;
        map2.put(Type.VERTICAL_GUIDELINE, "vGuideline");
        map2.put(Type.HORIZONTAL_GUIDELINE, "hGuideline");
        map2.put(Type.VERTICAL_CHAIN, "vChain");
        map2.put(Type.HORIZONTAL_CHAIN, "hChain");
        map2.put(Type.BARRIER, "barrier");
    }

    public Helper(String str, a aVar, String str2) {
        this.type = null;
        this.configMap = new HashMap();
        this.name = str;
        this.type = aVar;
        this.config = str2;
        this.configMap = convertConfigToMap();
    }

    public static void main(String[] strArr) {
        System.out.println(new Barrier("abc", "['a1', 'b2']").toString());
    }

    public void append(Map<String, String> map, StringBuilder sb) {
        if (map.isEmpty()) {
            return;
        }
        for (String str : map.keySet()) {
            sb.append(str);
            sb.append(":");
            sb.append(map.get(str));
            sb.append(",\n");
        }
    }

    public Map<String, String> convertConfigToMap() {
        String str = this.config;
        if (str == null || str.length() == 0) {
            return null;
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder();
        String string = "";
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.config.length(); i3++) {
            char cCharAt = this.config.charAt(i3);
            if (cCharAt == ':') {
                string = sb.toString();
                sb.setLength(0);
            } else if (cCharAt == ',' && i == 0 && i2 == 0) {
                map.put(string, sb.toString());
                sb.setLength(0);
                string = "";
            } else if (cCharAt != ' ') {
                if (cCharAt == '[') {
                    i++;
                } else if (cCharAt == ']') {
                    i--;
                } else if (cCharAt == '{') {
                    i2++;
                } else if (cCharAt == '}') {
                    i2--;
                }
                sb.append(cCharAt);
            }
        }
        map.put(string, sb.toString());
        return map;
    }

    public String getConfig() {
        return this.config;
    }

    public String getId() {
        return this.name;
    }

    public a getType() {
        return this.type;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(w.t(new StringBuilder(), this.name, ":{\n"));
        if (this.type != null) {
            sb.append("type:'");
            sb.append(this.type.toString());
            sb.append("',\n");
        }
        Map<String, String> map = this.configMap;
        if (map != null) {
            append(map, sb);
        }
        sb.append("},\n");
        return sb.toString();
    }

    public Helper(String str, a aVar) {
        this.type = null;
        this.configMap = new HashMap();
        this.name = str;
        this.type = aVar;
    }
}
