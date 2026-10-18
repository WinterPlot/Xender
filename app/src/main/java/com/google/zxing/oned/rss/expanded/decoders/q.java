package com.google.zxing.oned.rss.expanded.decoders;

import androidx.constraintlayout.core.motion.key.MotionKeyTrigger;
import com.google.zxing.NotFoundException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class q {
    private static final Map<String, a> a;
    private static final Map<String, a> b;
    private static final Map<String, a> c;
    private static final Map<String, a> d;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        final boolean a;
        final int b;

        private a(boolean z, int i) {
            this.a = z;
            this.b = i;
        }

        public static a fixed(int i) {
            return new a(false, i);
        }

        public static a variable(int i) {
            return new a(true, i);
        }
    }

    static {
        HashMap map = new HashMap();
        a = map;
        map.put("00", a.fixed(18));
        map.put("01", a.fixed(14));
        map.put("02", a.fixed(14));
        map.put("10", a.variable(20));
        map.put("11", a.fixed(6));
        map.put("12", a.fixed(6));
        map.put("13", a.fixed(6));
        map.put("15", a.fixed(6));
        map.put("16", a.fixed(6));
        map.put("17", a.fixed(6));
        map.put("20", a.fixed(2));
        map.put("21", a.variable(20));
        map.put("22", a.variable(29));
        map.put("30", a.variable(8));
        map.put("37", a.variable(8));
        for (int i = 90; i <= 99; i++) {
            a.put(String.valueOf(i), a.variable(30));
        }
        HashMap map2 = new HashMap();
        b = map2;
        map2.put("235", a.variable(28));
        map2.put("240", a.variable(30));
        map2.put("241", a.variable(30));
        map2.put("242", a.variable(6));
        map2.put("243", a.variable(20));
        map2.put("250", a.variable(30));
        map2.put("251", a.variable(30));
        map2.put("253", a.variable(30));
        map2.put("254", a.variable(20));
        map2.put("255", a.variable(25));
        map2.put("400", a.variable(30));
        map2.put("401", a.variable(30));
        map2.put("402", a.fixed(17));
        map2.put("403", a.variable(30));
        map2.put("410", a.fixed(13));
        map2.put("411", a.fixed(13));
        map2.put("412", a.fixed(13));
        map2.put("413", a.fixed(13));
        map2.put("414", a.fixed(13));
        map2.put("415", a.fixed(13));
        map2.put("416", a.fixed(13));
        map2.put("417", a.fixed(13));
        map2.put("420", a.variable(20));
        map2.put("421", a.variable(15));
        map2.put("422", a.fixed(3));
        map2.put("423", a.variable(15));
        map2.put("424", a.fixed(3));
        map2.put("425", a.variable(15));
        map2.put("426", a.fixed(3));
        map2.put("427", a.variable(3));
        map2.put("710", a.variable(20));
        map2.put("711", a.variable(20));
        map2.put("712", a.variable(20));
        map2.put("713", a.variable(20));
        map2.put("714", a.variable(20));
        map2.put("715", a.variable(20));
        c = new HashMap();
        for (int i2 = MotionKeyTrigger.TYPE_NEGATIVE_CROSS; i2 <= 316; i2++) {
            c.put(String.valueOf(i2), a.fixed(6));
        }
        for (int i3 = 320; i3 <= 337; i3++) {
            c.put(String.valueOf(i3), a.fixed(6));
        }
        for (int i4 = 340; i4 <= 357; i4++) {
            c.put(String.valueOf(i4), a.fixed(6));
        }
        for (int i5 = 360; i5 <= 369; i5++) {
            c.put(String.valueOf(i5), a.fixed(6));
        }
        Map<String, a> map3 = c;
        map3.put("390", a.variable(15));
        map3.put("391", a.variable(18));
        map3.put("392", a.variable(15));
        map3.put("393", a.variable(18));
        map3.put("394", a.fixed(4));
        map3.put("395", a.fixed(6));
        map3.put("703", a.variable(30));
        map3.put("723", a.variable(30));
        HashMap map4 = new HashMap();
        d = map4;
        map4.put("4300", a.variable(35));
        map4.put("4301", a.variable(35));
        map4.put("4302", a.variable(70));
        map4.put("4303", a.variable(70));
        map4.put("4304", a.variable(70));
        map4.put("4305", a.variable(70));
        map4.put("4306", a.variable(70));
        map4.put("4307", a.fixed(2));
        map4.put("4308", a.variable(30));
        map4.put("4309", a.fixed(20));
        map4.put("4310", a.variable(35));
        map4.put("4311", a.variable(35));
        map4.put("4312", a.variable(70));
        map4.put("4313", a.variable(70));
        map4.put("4314", a.variable(70));
        map4.put("4315", a.variable(70));
        map4.put("4316", a.variable(70));
        map4.put("4317", a.fixed(2));
        map4.put("4318", a.variable(20));
        map4.put("4319", a.variable(30));
        map4.put("4320", a.variable(35));
        map4.put("4321", a.fixed(1));
        map4.put("4322", a.fixed(1));
        map4.put("4323", a.fixed(1));
        map4.put("4324", a.fixed(10));
        map4.put("4325", a.fixed(10));
        map4.put("4326", a.fixed(6));
        map4.put("7001", a.fixed(13));
        map4.put("7002", a.variable(30));
        map4.put("7003", a.fixed(10));
        map4.put("7004", a.variable(4));
        map4.put("7005", a.variable(12));
        map4.put("7006", a.fixed(6));
        map4.put("7007", a.variable(12));
        map4.put("7008", a.variable(3));
        map4.put("7009", a.variable(10));
        map4.put("7010", a.variable(2));
        map4.put("7011", a.variable(10));
        map4.put("7020", a.variable(20));
        map4.put("7021", a.variable(20));
        map4.put("7022", a.variable(20));
        map4.put("7023", a.variable(30));
        map4.put("7040", a.fixed(4));
        map4.put("7240", a.variable(20));
        map4.put("8001", a.fixed(14));
        map4.put("8002", a.variable(20));
        map4.put("8003", a.variable(30));
        map4.put("8004", a.variable(30));
        map4.put("8005", a.fixed(6));
        map4.put("8006", a.fixed(18));
        map4.put("8007", a.variable(34));
        map4.put("8008", a.variable(12));
        map4.put("8009", a.variable(50));
        map4.put("8010", a.variable(30));
        map4.put("8011", a.variable(12));
        map4.put("8012", a.variable(20));
        map4.put("8013", a.variable(25));
        map4.put("8017", a.fixed(18));
        map4.put("8018", a.fixed(18));
        map4.put("8019", a.variable(10));
        map4.put("8020", a.variable(25));
        map4.put("8026", a.fixed(18));
        map4.put("8100", a.fixed(6));
        map4.put("8101", a.fixed(10));
        map4.put("8102", a.fixed(2));
        map4.put("8110", a.variable(70));
        map4.put("8111", a.fixed(4));
        map4.put("8112", a.variable(70));
        map4.put("8200", a.variable(70));
    }

    private q() {
    }

    public static String parseFieldsInGeneralPurpose(String str) throws NotFoundException {
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() < 2) {
            throw NotFoundException.getNotFoundInstance();
        }
        a aVar = a.get(str.substring(0, 2));
        if (aVar != null) {
            boolean z = aVar.a;
            int i = aVar.b;
            return z ? processVariableAI(2, i, str) : processFixedAI(2, i, str);
        }
        if (str.length() < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        String strSubstring = str.substring(0, 3);
        a aVar2 = b.get(strSubstring);
        if (aVar2 != null) {
            boolean z2 = aVar2.a;
            int i2 = aVar2.b;
            return z2 ? processVariableAI(3, i2, str) : processFixedAI(3, i2, str);
        }
        if (str.length() < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        a aVar3 = c.get(strSubstring);
        if (aVar3 != null) {
            boolean z3 = aVar3.a;
            int i3 = aVar3.b;
            return z3 ? processVariableAI(4, i3, str) : processFixedAI(4, i3, str);
        }
        a aVar4 = d.get(str.substring(0, 4));
        if (aVar4 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean z4 = aVar4.a;
        int i4 = aVar4.b;
        return z4 ? processVariableAI(4, i4, str) : processFixedAI(4, i4, str);
    }

    private static String processFixedAI(int i, int i2, String str) throws NotFoundException {
        if (str.length() < i) {
            throw NotFoundException.getNotFoundInstance();
        }
        String strSubstring = str.substring(0, i);
        int i3 = i2 + i;
        if (str.length() < i3) {
            throw NotFoundException.getNotFoundInstance();
        }
        String strSubstring2 = str.substring(i, i3);
        String str2 = "(" + strSubstring + ')' + strSubstring2;
        String fieldsInGeneralPurpose = parseFieldsInGeneralPurpose(str.substring(i3));
        return fieldsInGeneralPurpose == null ? str2 : str2.concat(fieldsInGeneralPurpose);
    }

    private static String processVariableAI(int i, int i2, String str) throws NotFoundException {
        String strSubstring = str.substring(0, i);
        int iMin = Math.min(str.length(), i2 + i);
        String strSubstring2 = str.substring(i, iMin);
        String str2 = "(" + strSubstring + ')' + strSubstring2;
        String fieldsInGeneralPurpose = parseFieldsInGeneralPurpose(str.substring(iMin));
        return fieldsInGeneralPurpose == null ? str2 : str2.concat(fieldsInGeneralPurpose);
    }
}
