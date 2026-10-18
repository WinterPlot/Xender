package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.R;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class c extends j implements DialogInterface {
    final AlertController g;

    public c(Context context, int i) {
        super(context, resolveDialogTheme(context, i));
        this.g = new AlertController(getContext(), this, getWindow());
    }

    public static int resolveDialogTheme(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button getButton(int i) {
        return this.g.getButton(i);
    }

    public ListView getListView() {
        return this.g.getListView();
    }

    @Override // androidx.appcompat.app.j, androidx.activity.o, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.g.installContent();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.g.onKeyDown(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.g.onKeyUp(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setButton(int i, CharSequence charSequence, Message message) {
        this.g.setButton(i, charSequence, null, message, null);
    }

    public void setButtonPanelLayoutHint(int i) {
        this.g.setButtonPanelLayoutHint(i);
    }

    public void setCustomTitle(View view) {
        this.g.setCustomTitle(view);
    }

    public void setIcon(int i) {
        this.g.setIcon(i);
    }

    public void setIconAttribute(int i) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        this.g.setIcon(typedValue.resourceId);
    }

    public void setMessage(CharSequence charSequence) {
        this.g.setMessage(charSequence);
    }

    @Override // androidx.appcompat.app.j, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.g.setTitle(charSequence);
    }

    public void setView(View view) {
        this.g.setView(view);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a {
        private final AlertController.b a;
        private final int b;

        public a(Context context, int i) {
            this.a = new AlertController.b(new ContextThemeWrapper(context, c.resolveDialogTheme(context, i)));
            this.b = i;
        }

        public c create() {
            c cVar = new c(this.a.a, this.b);
            this.a.apply(cVar.g);
            cVar.setCancelable(this.a.r);
            if (this.a.r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.a.s);
            cVar.setOnDismissListener(this.a.t);
            DialogInterface.OnKeyListener onKeyListener = this.a.u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public Context getContext() {
            return this.a.a;
        }

        public a setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.w = listAdapter;
            bVar.x = onClickListener;
            return this;
        }

        public a setCancelable(boolean z) {
            this.a.r = z;
            return this;
        }

        public a setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.b bVar = this.a;
            bVar.K = cursor;
            bVar.L = str;
            bVar.x = onClickListener;
            return this;
        }

        public a setCustomTitle(View view) {
            this.a.g = view;
            return this;
        }

        public a setIcon(int i) {
            this.a.c = i;
            return this;
        }

        public a setIconAttribute(int i) {
            TypedValue typedValue = new TypedValue();
            this.a.a.getTheme().resolveAttribute(i, typedValue, true);
            this.a.c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public a setInverseBackgroundForced(boolean z) {
            this.a.N = z;
            return this;
        }

        public a setItems(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.v = bVar.a.getResources().getTextArray(i);
            this.a.x = onClickListener;
            return this;
        }

        public a setMessage(int i) {
            AlertController.b bVar = this.a;
            bVar.h = bVar.a.getText(i);
            return this;
        }

        public a setMultiChoiceItems(int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.a;
            bVar.v = bVar.a.getResources().getTextArray(i);
            AlertController.b bVar2 = this.a;
            bVar2.J = onMultiChoiceClickListener;
            bVar2.F = zArr;
            bVar2.G = true;
            return this;
        }

        public a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.l = bVar.a.getText(i);
            this.a.n = onClickListener;
            return this;
        }

        public a setNegativeButtonIcon(Drawable drawable) {
            this.a.m = drawable;
            return this;
        }

        public a setNeutralButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.o = bVar.a.getText(i);
            this.a.q = onClickListener;
            return this;
        }

        public a setNeutralButtonIcon(Drawable drawable) {
            this.a.p = drawable;
            return this;
        }

        public a setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.a.s = onCancelListener;
            return this;
        }

        public a setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.a.t = onDismissListener;
            return this;
        }

        public a setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.a.O = onItemSelectedListener;
            return this;
        }

        public a setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.a.u = onKeyListener;
            return this;
        }

        public a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.i = bVar.a.getText(i);
            this.a.k = onClickListener;
            return this;
        }

        public a setPositiveButtonIcon(Drawable drawable) {
            this.a.j = drawable;
            return this;
        }

        public a setRecycleOnMeasureEnabled(boolean z) {
            this.a.P = z;
            return this;
        }

        public a setSingleChoiceItems(int i, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.v = bVar.a.getResources().getTextArray(i);
            AlertController.b bVar2 = this.a;
            bVar2.x = onClickListener;
            bVar2.I = i2;
            bVar2.H = true;
            return this;
        }

        public a setTitle(int i) {
            AlertController.b bVar = this.a;
            bVar.f = bVar.a.getText(i);
            return this;
        }

        @Deprecated
        public a setView(View view, int i, int i2, int i3, int i4) {
            AlertController.b bVar = this.a;
            bVar.z = view;
            bVar.y = 0;
            bVar.E = true;
            bVar.A = i;
            bVar.B = i2;
            bVar.C = i3;
            bVar.D = i4;
            return this;
        }

        public c show() {
            c cVarCreate = create();
            cVarCreate.show();
            return cVarCreate;
        }

        public a setIcon(Drawable drawable) {
            this.a.d = drawable;
            return this;
        }

        public a setMessage(CharSequence charSequence) {
            this.a.h = charSequence;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.a.f = charSequence;
            return this;
        }

        public a setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.l = charSequence;
            bVar.n = onClickListener;
            return this;
        }

        public a setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.o = charSequence;
            bVar.q = onClickListener;
            return this;
        }

        public a setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.i = charSequence;
            bVar.k = onClickListener;
            return this;
        }

        public a setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.v = charSequenceArr;
            bVar.x = onClickListener;
            return this;
        }

        public a setView(View view) {
            AlertController.b bVar = this.a;
            bVar.z = view;
            bVar.y = 0;
            bVar.E = false;
            return this;
        }

        public a(Context context) {
            this(context, c.resolveDialogTheme(context, 0));
        }

        public a setView(int i) {
            AlertController.b bVar = this.a;
            bVar.z = null;
            bVar.y = i;
            bVar.E = false;
            return this;
        }

        public a setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.a;
            bVar.v = charSequenceArr;
            bVar.J = onMultiChoiceClickListener;
            bVar.F = zArr;
            bVar.G = true;
            return this;
        }

        public a setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.K = cursor;
            bVar.x = onClickListener;
            bVar.I = i;
            bVar.L = str;
            bVar.H = true;
            return this;
        }

        public a setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.a;
            bVar.K = cursor;
            bVar.J = onMultiChoiceClickListener;
            bVar.M = str;
            bVar.L = str2;
            bVar.G = true;
            return this;
        }

        public a setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.v = charSequenceArr;
            bVar.x = onClickListener;
            bVar.I = i;
            bVar.H = true;
            return this;
        }

        public a setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.w = listAdapter;
            bVar.x = onClickListener;
            bVar.I = i;
            bVar.H = true;
            return this;
        }
    }

    public void setIcon(Drawable drawable) {
        this.g.setIcon(drawable);
    }

    public void setView(View view, int i, int i2, int i3, int i4) {
        this.g.setView(view, i, i2, i3, i4);
    }

    public void setButton(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.g.setButton(i, charSequence, onClickListener, null, null);
    }

    public void setButton(int i, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.g.setButton(i, charSequence, onClickListener, null, drawable);
    }

    public c(Context context) {
        this(context, 0);
    }

    public c(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }
}
