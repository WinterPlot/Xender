package com.userlabs.xshare.views.swbtn;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import okhttp3.b0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    private static int h = 256;
    private static int i = 7;
    private static int j = 16;
    private b b;
    private int d;
    private int e;
    private int f;
    private boolean c = false;
    private int g = i;
    private HandlerC0378a a = new HandlerC0378a(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.userlabs.xshare.views.swbtn.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class HandlerC0378a extends Handler {
        public HandlerC0378a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object obj;
            if (message.what != a.h || (obj = message.obj) == null) {
                return;
            }
            ((Runnable) obj).run();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface b {
        boolean continueAnimating();

        void onAnimateComplete();

        void onAnimationStart();

        void onFrameUpdate(int i);
    }

    private a() {
    }

    public static a getDefault() {
        return new a();
    }

    public a init(b bVar) {
        if (bVar != null) {
            this.b = bVar;
            return this;
        }
        b0.i("onAnimateListener can not be null");
        return null;
    }

    public void setVelocity(int i2) {
        if (i2 <= 0) {
            this.g = i;
        } else {
            this.g = i2;
        }
    }

    public void startAnimation(int i2, int i3) {
        this.c = true;
        this.e = i2;
        this.f = i3;
        int i4 = this.g;
        this.d = i4;
        if (i3 > i2) {
            this.d = Math.abs(i4);
        } else {
            if (i3 >= i2) {
                this.c = false;
                this.b.onAnimateComplete();
                return;
            }
            this.d = -Math.abs(i4);
        }
        this.b.onAnimationStart();
        new c().run();
    }

    public void stopAnimation() {
        this.c = false;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class c implements Runnable {
        public c() {
        }

        private void requireNextFrame() {
            Message messageObtainMessage = a.this.a.obtainMessage();
            messageObtainMessage.what = a.h;
            messageObtainMessage.obj = this;
            a.this.a.sendMessageDelayed(messageObtainMessage, a.j);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.c) {
                calcNextFrame();
                a.this.b.onFrameUpdate(a.this.d);
                if (a.this.b.continueAnimating()) {
                    requireNextFrame();
                } else {
                    a.this.stopAnimation();
                    a.this.b.onAnimateComplete();
                }
            }
        }

        private void calcNextFrame() {
        }
    }
}
