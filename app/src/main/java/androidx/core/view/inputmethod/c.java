package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private final InterfaceC0136c a;

    /* JADX INFO: renamed from: androidx.core.view.inputmethod.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface InterfaceC0136c {
        Uri getContentUri();

        ClipDescription getDescription();

        Object getInputContentInfo();

        Uri getLinkUri();

        void releasePermission();

        void requestPermission();
    }

    public c(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.a = new a(uri, clipDescription, uri2);
        } else {
            this.a = new b(uri, clipDescription, uri2);
        }
    }

    public static c wrap(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new c(new a(obj));
        }
        return null;
    }

    public Uri getContentUri() {
        return this.a.getContentUri();
    }

    public ClipDescription getDescription() {
        return this.a.getDescription();
    }

    public Uri getLinkUri() {
        return this.a.getLinkUri();
    }

    public void releasePermission() {
        this.a.releasePermission();
    }

    public void requestPermission() {
        this.a.requestPermission();
    }

    public Object unwrap() {
        return this.a.getInputContentInfo();
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a implements InterfaceC0136c {
        final InputContentInfo a;

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = new InputContentInfo(uri, clipDescription, uri2);
        }

        @Override // androidx.core.view.inputmethod.c.InterfaceC0136c
        public Uri getContentUri() {
            return this.a.getContentUri();
        }

        @Override // androidx.core.view.inputmethod.c.InterfaceC0136c
        public ClipDescription getDescription() {
            return this.a.getDescription();
        }

        @Override // androidx.core.view.inputmethod.c.InterfaceC0136c
        public Object getInputContentInfo() {
            return this.a;
        }

        @Override // androidx.core.view.inputmethod.c.InterfaceC0136c
        public Uri getLinkUri() {
            return this.a.getLinkUri();
        }

        @Override // androidx.core.view.inputmethod.c.InterfaceC0136c
        public void releasePermission() {
            this.a.releasePermission();
        }

        @Override // androidx.core.view.inputmethod.c.InterfaceC0136c
        public void requestPermission() {
            this.a.requestPermission();
        }

        public a(Object obj) {
            this.a = (InputContentInfo) obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class b implements InterfaceC0136c {
        private final Uri a;
        private final ClipDescription b;
        private final Uri c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = uri;
            this.b = clipDescription;
            this.c = uri2;
        }

        @Override // androidx.core.view.inputmethod.c.InterfaceC0136c
        public Uri getContentUri() {
            return this.a;
        }

        @Override // androidx.core.view.inputmethod.c.InterfaceC0136c
        public ClipDescription getDescription() {
            return this.b;
        }

        @Override // androidx.core.view.inputmethod.c.InterfaceC0136c
        public Object getInputContentInfo() {
            return null;
        }

        @Override // androidx.core.view.inputmethod.c.InterfaceC0136c
        public Uri getLinkUri() {
            return this.c;
        }

        @Override // androidx.core.view.inputmethod.c.InterfaceC0136c
        public void releasePermission() {
        }

        @Override // androidx.core.view.inputmethod.c.InterfaceC0136c
        public void requestPermission() {
        }
    }

    private c(InterfaceC0136c interfaceC0136c) {
        this.a = interfaceC0136c;
    }
}
