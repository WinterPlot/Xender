package androidx.webkit;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class j {
    private final int a;
    private final Map<String, Integer> b;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        private final int a;
        private Map<String, Integer> b = new HashMap();

        public a(int i) {
            this.a = i;
        }

        public a addOverrideRule(String str, int i) {
            this.b.put(str, Integer.valueOf(i));
            return this;
        }

        public j build() {
            return new j(this);
        }

        public a setOverrideRules(Map<String, Integer> map) {
            this.b = map;
            return this;
        }
    }

    public j(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
    }

    public int getDefaultStatus() {
        return this.a;
    }

    public Map<String, Integer> getOverrideRules() {
        return this.b;
    }
}
