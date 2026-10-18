package com.userlabs.xshare.adapter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.util.Linkify;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.uuid.Uuid;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class s0 extends RecyclerView.e0 {
    SparseArray<View> b;
    private int c;
    View d;
    protected Context e;

    public s0(Context context, View view, ViewGroup viewGroup, int i) {
        super(view);
        this.e = context;
        this.d = view;
        this.c = i;
        this.b = new SparseArray<>();
        this.d.setTag(this);
    }

    public static s0 get(Context context, View view, ViewGroup viewGroup, int i, int i2) {
        if (view == null) {
            return new s0(context, LayoutInflater.from(context).inflate(i, viewGroup, false), viewGroup, i2);
        }
        s0 s0Var = (s0) view.getTag();
        s0Var.c = i2;
        return s0Var;
    }

    public void clearViews() {
        this.b.clear();
    }

    public View getConvertView() {
        return this.d;
    }

    public Object getTag(int i) {
        return getView(i).getTag();
    }

    public <T extends View> T getView(int i) {
        T t = (T) this.b.get(i);
        if (t != null) {
            return t;
        }
        T t2 = (T) this.d.findViewById(i);
        this.b.put(i, t2);
        return t2;
    }

    public int getmPosition() {
        return this.c;
    }

    public s0 linkify(int i) {
        Linkify.addLinks((TextView) getView(i), 15);
        return this;
    }

    public s0 setAlpha(int i, float f) {
        getView(i).setAlpha(f);
        return this;
    }

    public s0 setBackgroundColor(int i, int i2) {
        getView(i).setBackgroundColor(i2);
        return this;
    }

    public s0 setBackgroundDrawable(int i, Drawable drawable) {
        View view = getView(i);
        if (view == null) {
            return this;
        }
        view.setBackground(drawable);
        return this;
    }

    public s0 setBackgroundRes(int i, int i2) {
        getView(i).setBackgroundResource(i2);
        return this;
    }

    public s0 setButtonText(int i, int i2) {
        ((Button) getView(i)).setText(i2);
        return this;
    }

    public s0 setChecked(int i, boolean z) {
        ((Checkable) getView(i)).setChecked(z);
        return this;
    }

    public s0 setImageBitmap(int i, Bitmap bitmap) {
        ((ImageView) getView(i)).setImageBitmap(bitmap);
        return this;
    }

    public s0 setImageDrawable(int i, Drawable drawable) {
        ((ImageView) getView(i)).setImageDrawable(drawable);
        return this;
    }

    public s0 setImageResource(int i, int i2) {
        ((ImageView) getView(i)).setImageResource(i2);
        return this;
    }

    public s0 setMax(int i, int i2) {
        ((ProgressBar) getView(i)).setMax(i2);
        return this;
    }

    public s0 setOnClickListener(int i, View.OnClickListener onClickListener) {
        getView(i).setOnClickListener(onClickListener);
        return this;
    }

    public s0 setOnLongClickListener(int i, View.OnLongClickListener onLongClickListener) {
        getView(i).setOnLongClickListener(onLongClickListener);
        return this;
    }

    public s0 setOnTouchListener(int i, View.OnTouchListener onTouchListener) {
        getView(i).setOnTouchListener(onTouchListener);
        return this;
    }

    public s0 setProgress(int i, int i2) {
        ProgressBar progressBar = (ProgressBar) getView(i);
        if (com.userlabs.xshare.core.utils.n.canUseAnim()) {
            progressBar.setProgress(i2, true);
            return this;
        }
        progressBar.setProgress(i2);
        return this;
    }

    public s0 setProgressDrawable(int i, int i2) {
        ((ProgressBar) getView(i)).setProgressDrawable(androidx.core.content.res.h.getDrawable(this.e.getResources(), i2, null));
        return this;
    }

    public s0 setRating(int i, float f, int i2) {
        RatingBar ratingBar = (RatingBar) getView(i);
        ratingBar.setMax(i2);
        ratingBar.setRating(f);
        return this;
    }

    public s0 setTag(int i, Object obj) {
        getView(i).setTag(obj);
        return this;
    }

    public s0 setText(int i, CharSequence charSequence) {
        ((TextView) getView(i)).setText(charSequence);
        return this;
    }

    public s0 setTextColor(int i, int i2) {
        ((TextView) getView(i)).setTextColor(i2);
        return this;
    }

    public s0 setTextColorRes(int i, int i2) {
        ((TextView) getView(i)).setTextColor(androidx.core.content.res.h.getColor(this.e.getResources(), i2, null));
        return this;
    }

    public s0 setTypeface(Typeface typeface, int... iArr) {
        for (int i : iArr) {
            TextView textView = (TextView) getView(i);
            textView.setTypeface(typeface);
            textView.setPaintFlags(textView.getPaintFlags() | Uuid.SIZE_BITS);
        }
        return this;
    }

    public s0 setVisible(int i, boolean z) {
        getView(i).setVisibility(z ? 0 : 8);
        return this;
    }

    public void updatePosition(int i) {
        this.c = i;
    }

    public s0 setTag(int i, int i2, Object obj) {
        getView(i).setTag(i2, obj);
        return this;
    }

    public Object getTag(int i, int i2) {
        return getView(i).getTag(i2);
    }

    public s0 setText(int i, int i2) {
        ((TextView) getView(i)).setText(i2);
        return this;
    }

    public s0 setTextColor(int i, ColorStateList colorStateList) {
        ((TextView) getView(i)).setTextColor(colorStateList);
        return this;
    }

    public s0 setRating(int i, float f) {
        ((RatingBar) getView(i)).setRating(f);
        return this;
    }

    public s0 setProgress(int i, int i2, int i3) {
        ProgressBar progressBar = (ProgressBar) getView(i);
        progressBar.setMax(i3);
        progressBar.setProgress(i2);
        return this;
    }

    public s0 setProgressDrawable(int i, Drawable drawable) {
        ((ProgressBar) getView(i)).setProgressDrawable(drawable);
        return this;
    }

    public static s0 get(Context context, View view, ViewGroup viewGroup, View view2, int i) {
        if (view == null) {
            return new s0(context, view2, viewGroup, i);
        }
        s0 s0Var = (s0) view.getTag();
        s0Var.c = i;
        return s0Var;
    }
}
