package com.userlabs.xshare.utils;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class r {
    private Handler b;
    private List<Float> a = new ArrayList();
    private boolean c = false;
    private boolean d = false;

    public r(Handler handler) {
        this.b = handler;
    }

    public void addSpeed(float f) {
        if (this.d && isStartComputeSpeed()) {
            List<Float> list = this.a;
            if (f < 1000000.0f) {
                list.add(Float.valueOf(f));
            } else {
                list.clear();
                this.b.sendEmptyMessage(23);
            }
            if (this.a.size() >= 10) {
                setStartComputeSpeed(false);
                this.a.clear();
                this.b.sendEmptyMessage(22);
            }
        }
    }

    public boolean isStartComputeSpeed() {
        return this.c;
    }

    public void setCanStartComputeSpeed(boolean z) {
        if (this.d != z) {
            this.d = z;
            if (z) {
                return;
            }
            setStartComputeSpeed(false);
            this.a.clear();
        }
    }

    public void setStartComputeSpeed(boolean z) {
        if (this.c != z) {
            this.c = z;
        }
    }
}
