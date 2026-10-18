package com.userlabs.xshare.utils;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a0 implements View.OnClickListener {
    private int a;
    private Long[] b;
    private final Runnable c;

    public a0(int i) {
        this.a = 0;
        this.c = new com.userlabs.xshare.ui.activity.viewmodel.a(this, 7);
        Long[] lArr = new Long[Math.max(i, 2)];
        this.b = lArr;
        Arrays.fill((Object[]) lArr, (Object) 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        this.a = 0;
        Arrays.fill((Object[]) this.b, (Object) 0L);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long jLongValue;
        int i = this.a;
        Long[] lArr = this.b;
        lArr[i % lArr.length] = Long.valueOf(System.currentTimeMillis());
        this.a++;
        int length = this.b.length;
        do {
            length--;
            if (length <= 0) {
                onMultiClick(view);
                break;
            } else {
                jLongValue = this.b[length].longValue() - this.b[length - 1].longValue();
                if (jLongValue > 400) {
                    break;
                }
            }
        } while (jLongValue > 0);
        view.removeCallbacks(this.c);
        view.postDelayed(this.c, 400L);
    }

    public abstract void onMultiClick(View view);

    public a0() {
        this(2);
    }
}
