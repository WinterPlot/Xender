package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class h0 implements p {
    private static final List<b> b = new ArrayList(50);
    private final Handler a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b implements p.a {
        private Message a;
        private h0 b;

        private b() {
        }

        private void recycle() {
            this.a = null;
            this.b = null;
            h0.recycleMessage(this);
        }

        @Override // androidx.media3.common.util.p.a
        public p getTarget() {
            return (p) com.google.common.base.m.checkNotNull(this.b);
        }

        public boolean sendAtFrontOfQueue(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) com.google.common.base.m.checkNotNull(this.a));
            recycle();
            return zSendMessageAtFrontOfQueue;
        }

        @Override // androidx.media3.common.util.p.a
        public void sendToTarget() {
            ((Message) com.google.common.base.m.checkNotNull(this.a)).sendToTarget();
            recycle();
        }

        public b setMessage(Message message, h0 h0Var) {
            this.a = message;
            this.b = h0Var;
            return this;
        }
    }

    public h0(Handler handler) {
        this.a = handler;
    }

    private static b obtainSystemMessage() {
        b bVar;
        List<b> list = b;
        synchronized (list) {
            try {
                bVar = list.isEmpty() ? new b() : list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void recycleMessage(b bVar) {
        List<b> list = b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.common.util.p
    public Looper getLooper() {
        return this.a.getLooper();
    }

    @Override // androidx.media3.common.util.p
    public boolean hasMessages(int i) {
        com.google.common.base.m.checkArgument(i != 0);
        return this.a.hasMessages(i);
    }

    @Override // androidx.media3.common.util.p
    public p.a obtainMessage(int i) {
        return obtainSystemMessage().setMessage(this.a.obtainMessage(i), this);
    }

    @Override // androidx.media3.common.util.p
    public boolean post(Runnable runnable) {
        return this.a.post(runnable);
    }

    @Override // androidx.media3.common.util.p
    public boolean postAtFrontOfQueue(Runnable runnable) {
        return this.a.postAtFrontOfQueue(runnable);
    }

    @Override // androidx.media3.common.util.p
    public boolean postDelayed(Runnable runnable, long j) {
        return this.a.postDelayed(runnable, j);
    }

    @Override // androidx.media3.common.util.p
    public void removeCallbacks(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    @Override // androidx.media3.common.util.p
    public void removeCallbacksAndMessages(Object obj) {
        this.a.removeCallbacksAndMessages(obj);
    }

    @Override // androidx.media3.common.util.p
    public void removeMessages(int i) {
        com.google.common.base.m.checkArgument(i != 0);
        this.a.removeMessages(i);
    }

    @Override // androidx.media3.common.util.p
    public boolean sendEmptyMessage(int i) {
        return this.a.sendEmptyMessage(i);
    }

    @Override // androidx.media3.common.util.p
    public boolean sendEmptyMessageAtTime(int i, long j) {
        return this.a.sendEmptyMessageAtTime(i, j);
    }

    @Override // androidx.media3.common.util.p
    public boolean sendEmptyMessageDelayed(int i, int i2) {
        return this.a.sendEmptyMessageDelayed(i, i2);
    }

    @Override // androidx.media3.common.util.p
    public boolean sendMessageAtFrontOfQueue(p.a aVar) {
        return ((b) aVar).sendAtFrontOfQueue(this.a);
    }

    @Override // androidx.media3.common.util.p
    public p.a obtainMessage(int i, Object obj) {
        return obtainSystemMessage().setMessage(this.a.obtainMessage(i, obj), this);
    }

    @Override // androidx.media3.common.util.p
    public p.a obtainMessage(int i, int i2, int i3) {
        return obtainSystemMessage().setMessage(this.a.obtainMessage(i, i2, i3), this);
    }

    @Override // androidx.media3.common.util.p
    public p.a obtainMessage(int i, int i2, int i3, Object obj) {
        return obtainSystemMessage().setMessage(this.a.obtainMessage(i, i2, i3, obj), this);
    }
}
