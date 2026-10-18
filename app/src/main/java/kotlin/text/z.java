package kotlin.text;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
class z extends y {
    private static final Regex toRegex(String str, RegexOption regexOption) {
        str.getClass();
        regexOption.getClass();
        return new Regex(str, regexOption);
    }

    private static final Regex toRegex(String str) {
        str.getClass();
        return new Regex(str);
    }

    private static final Regex toRegex(String str, Set<? extends RegexOption> set) {
        str.getClass();
        set.getClass();
        return new Regex(str, set);
    }
}
