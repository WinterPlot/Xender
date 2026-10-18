package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import com.userlabs.xshare.core.create.XCreateApException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class f {
    int[] a = new int[XCreateApException.CODE_CLOSE_AP];
    CustomAttribute[] b = new CustomAttribute[XCreateApException.CODE_CLOSE_AP];
    int c;

    public f() {
        clear();
    }

    public void append(int i, CustomAttribute customAttribute) {
        if (this.b[i] != null) {
            remove(i);
        }
        this.b[i] = customAttribute;
        int[] iArr = this.a;
        int i2 = this.c;
        this.c = i2 + 1;
        iArr[i2] = i;
        Arrays.sort(iArr);
    }

    public void clear() {
        Arrays.fill(this.a, 999);
        Arrays.fill(this.b, (Object) null);
        this.c = 0;
    }

    public void dump() {
        System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.a, this.c)));
        System.out.print("K: [");
        int i = 0;
        while (i < this.c) {
            System.out.print((i == 0 ? "" : ", ") + valueAt(i));
            i++;
        }
        System.out.println("]");
    }

    public int keyAt(int i) {
        return this.a[i];
    }

    public void remove(int i) {
        this.b[i] = null;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = this.c;
            if (i2 >= i4) {
                this.c = i4 - 1;
                return;
            }
            int[] iArr = this.a;
            if (i == iArr[i2]) {
                iArr[i2] = 999;
                i3++;
            }
            if (i2 != i3) {
                iArr[i2] = iArr[i3];
            }
            i3++;
            i2++;
        }
    }

    public int size() {
        return this.c;
    }

    public CustomAttribute valueAt(int i) {
        return this.b[this.a[i]];
    }
}
