package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.util.i;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    private final b a;
    private int b;
    private int c;

    /* JADX INFO: renamed from: androidx.emoji2.viewsintegration.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class C0155a extends b {
        private final EditText a;
        private final g b;

        public C0155a(EditText editText, boolean z) {
            this.a = editText;
            g gVar = new g(editText, z);
            this.b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(androidx.emoji2.viewsintegration.b.getInstance());
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        public KeyListener getKeyListener(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        public boolean isEnabled() {
            return this.b.isEnabled();
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        public InputConnection onCreateInputConnection(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.a, inputConnection, editorInfo);
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        public void setEmojiReplaceStrategy(int i) {
            this.b.setEmojiReplaceStrategy(i);
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        public void setEnabled(boolean z) {
            this.b.setEnabled(z);
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        public void setMaxEmojiCount(int i) {
            this.b.setMaxEmojiCount(i);
        }
    }

    public a(EditText editText, boolean z) {
        this.b = Integer.MAX_VALUE;
        this.c = 0;
        i.checkNotNull(editText, "editText cannot be null");
        this.a = new C0155a(editText, z);
    }

    public int getEmojiReplaceStrategy() {
        return this.c;
    }

    public KeyListener getKeyListener(KeyListener keyListener) {
        return this.a.getKeyListener(keyListener);
    }

    public int getMaxEmojiCount() {
        return this.b;
    }

    public boolean isEnabled() {
        return this.a.isEnabled();
    }

    public InputConnection onCreateInputConnection(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.a.onCreateInputConnection(inputConnection, editorInfo);
    }

    public void setEmojiReplaceStrategy(int i) {
        this.c = i;
        this.a.setEmojiReplaceStrategy(i);
    }

    public void setEnabled(boolean z) {
        this.a.setEnabled(z);
    }

    public void setMaxEmojiCount(int i) {
        i.checkArgumentNonnegative(i, "maxEmojiCount should be greater than 0");
        this.b = i;
        this.a.setMaxEmojiCount(i);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class b {
        public boolean isEnabled() {
            return false;
        }

        public KeyListener getKeyListener(KeyListener keyListener) {
            return keyListener;
        }

        public void setEmojiReplaceStrategy(int i) {
        }

        public void setEnabled(boolean z) {
        }

        public void setMaxEmojiCount(int i) {
        }

        public InputConnection onCreateInputConnection(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection;
        }
    }

    public a(EditText editText) {
        this(editText, true);
    }
}
