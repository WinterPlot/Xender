package com.google.android.gms.internal.measurement;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
final class qt {
    private final int[] a;
    private final ot b;
    private ot c;
    private int d;
    private int e;
    private int f;

    private qt(int[] iArr) {
        this.a = iArr;
        ot otVar = new ot(-1, -1, null);
        this.b = otVar;
        this.c = otVar;
    }

    public static qt zza(int[] iArr) {
        ot otVar;
        qt qtVar = new qt(iArr);
        for (int i = 0; i < iArr.length; i++) {
            qtVar.f++;
            int[] iArr2 = qtVar.a;
            int i2 = iArr2[i];
            while (true) {
                ot otVar2 = null;
                while (true) {
                    if (qtVar.f <= 0) {
                        break;
                    }
                    int i3 = qtVar.e;
                    otVar = qtVar.c;
                    if (i3 == 0) {
                        break;
                    }
                    int i4 = ((ot) otVar.d.get(Integer.valueOf(iArr2[qtVar.d]))).a;
                    int i5 = qtVar.e;
                    if (iArr2[i4 + i5] == i2) {
                        if (otVar2 != null) {
                            otVar2.c = qtVar.c;
                        }
                        qtVar.e = i5 + 1;
                        qtVar.zzb();
                        break;
                    }
                    ot otVar3 = (ot) qtVar.c.d.get(Integer.valueOf(iArr2[qtVar.d]));
                    int i6 = otVar3.a;
                    ot otVar4 = new ot(i6, (qtVar.e + i6) - 1, null);
                    qtVar.c.d.put(Integer.valueOf(iArr2[qtVar.d]), otVar4);
                    Map map = otVar4.d;
                    int i7 = otVar4.b + 1;
                    map.put(Integer.valueOf(iArr2[i7]), otVar3);
                    otVar3.a = i7;
                    if (otVar2 != null) {
                        otVar2.c = otVar4;
                    }
                    map.put(Integer.valueOf(i2), new ot(i, 1073741824, null));
                    qtVar.f--;
                    qtVar.zzc();
                    otVar2 = otVar4;
                }
                Map map2 = otVar.d;
                Integer numValueOf = Integer.valueOf(i2);
                if (map2.containsKey(numValueOf)) {
                    if (otVar2 != null) {
                        otVar2.c = qtVar.c;
                    }
                    qtVar.d = i;
                    qtVar.e++;
                    qtVar.zzb();
                    break;
                }
                qtVar.c.d.put(numValueOf, new ot(i, 1073741824, null));
                if (otVar2 != null) {
                    otVar2.c = qtVar.c;
                }
                qtVar.f--;
                qtVar.zzc();
            }
        }
        return qtVar;
    }

    private final void zze(ot otVar, StringBuilder sb) {
        for (ot otVar2 : otVar.d.values()) {
            sb.append("  ");
            sb.append(otVar);
            sb.append(" -> ");
            sb.append(otVar2);
            sb.append(" [label=\"");
            int[] iArr = this.a;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, otVar2.a, Math.min(iArr.length, otVar2.b + 1))));
            sb.append("\"]\n");
            zze(otVar2, sb);
        }
    }

    private final boolean zzf(int i, int i2, int i3, int i4) {
        if (i >= 0 && i3 >= 0) {
            int[] iArr = this.a;
            int length = iArr.length;
            int iMin = Math.min(length, i2);
            if (iMin - i == Math.min(length, i4) - i3) {
                for (int i5 = i; i5 <= iMin; i5++) {
                    if (iArr[i5] != iArr[(i3 + i5) - i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("digraph {\n");
        zze(this.b, sb);
        sb.append("}");
        return sb.toString();
    }

    public final void zzb() {
        if (this.e == 0) {
            return;
        }
        Map map = this.c.d;
        int[] iArr = this.a;
        ot otVar = (ot) map.get(Integer.valueOf(iArr[this.d]));
        while (true) {
            int i = (otVar.b - otVar.a) + 1;
            int i2 = this.e;
            if (i > i2) {
                return;
            }
            int i3 = this.d + i;
            this.d = i3;
            this.c = otVar;
            int i4 = i2 - i;
            this.e = i4;
            if (i4 > 0) {
                otVar = (ot) otVar.d.get(Integer.valueOf(iArr[i3]));
            }
        }
    }

    public final void zzc() {
        ot otVar = this.c.c;
        if (otVar != null) {
            this.c = otVar;
        } else {
            this.c = this.b;
            int i = this.e;
            if (i > 0) {
                this.e = i - 1;
            }
            if (this.f > 0) {
                this.d++;
            }
        }
        zzb();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005a  */
    public final pt zzd() {
        int i;
        int i2;
        nt ntVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        ot otVar = this.b;
        nt ntVar2 = new nt(otVar, 0, -1, -1, null);
        arrayDeque.push(ntVar2);
        while (!arrayDeque.isEmpty()) {
            nt ntVar3 = (nt) arrayDeque.pop();
            for (ot otVar2 : ntVar3.d.d.values()) {
                int i3 = ntVar3.b;
                int i4 = ntVar3.c;
                int i5 = otVar2.a;
                int i6 = otVar2.b;
                if (zzf(i3, i4, i5, i6)) {
                    ntVar = new nt(otVar2, ntVar3.a + 1, i3, i4, null);
                } else {
                    if (otVar2.d.isEmpty()) {
                        int i7 = otVar2.a;
                        if (zzf(i3, i4, i7, (i7 + i4) - i3)) {
                            ntVar = new nt(otVar2, ntVar3.a + 1, i3, i4, null);
                        }
                    }
                    ntVar = new nt(otVar2, 1, otVar2.a, i6, null);
                }
                if (ntVar2.a < ntVar.a) {
                    ntVar2 = ntVar;
                }
                arrayDeque.push(ntVar);
            }
        }
        int[] iArr = this.a;
        int iMin = Math.min(iArr.length, ntVar2.c + 1);
        int i8 = 0;
        loop2: while (true) {
            i = ntVar2.b;
            i2 = iMin - i;
            otVar = (ot) otVar.d.get(Integer.valueOf(iArr[(i8 % i2) + i]));
            if (otVar == null) {
                break;
            }
            for (int i9 = otVar.a; i9 < otVar.b + 1 && i9 < iArr.length; i9++) {
                if (iArr[(i8 % i2) + i] != iArr[i9]) {
                    break loop2;
                }
                i8++;
            }
        }
        return new pt(i, iMin, i8 / i2);
    }
}
