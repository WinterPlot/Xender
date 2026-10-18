package com.userlabs.xshare.importdata.adapter;

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
import androidx.core.content.res.h;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.uuid.Uuid;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class g extends RecyclerView.e0 {
    SparseArray<View> b;
    private int c;
    View d;
    protected Context e;
    private int f;

    public g(Context context, View view, ViewGroup viewGroup, int i) {
        super(view);
        this.e = context;
        this.d = view;
        this.c = i;
        this.b = new SparseArray<>();
        this.d.setTag(this);
    }

    public static g get(Context context, View view, ViewGroup viewGroup, int i, int i2) {
        if (view == null) {
            g gVar = new g(context, LayoutInflater.from(context).inflate(i, viewGroup, false), viewGroup, i2);
            gVar.f = i;
            return gVar;
        }
        g gVar2 = (g) view.getTag();
        gVar2.c = i2;
        return gVar2;
    }

    public void clearViews() {
        this.b.clear();
    }

    public View getConvertView() {
        return this.d;
    }

    public int getLayoutId() {
        return this.f;
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

    public g linkify(int i) {
        Linkify.addLinks((TextView) getView(i), 15);
        return this;
    }

    public g setAlpha(int i, float f) {
        getView(i).setAlpha(f);
        return this;
    }

    public g setBackgroundColor(int i, int i2) {
        getView(i).setBackgroundColor(i2);
        return this;
    }

    public g setBackgroundDrawable(int i, Drawable drawable) {
        View view = getView(i);
        if (view == null) {
            return this;
        }
        view.setBackground(drawable);
        return this;
    }

    public g setBackgroundRes(int i, int i2) {
        getView(i).setBackgroundResource(i2);
        return this;
    }

    public g setButtonText(int i, int i2) {
        ((Button) getView(i)).setText(i2);
        return this;
    }

    public g setChecked(int i, boolean z) {
        ((Checkable) getView(i)).setChecked(z);
        return this;
    }

    public g setImageBitmap(int i, Bitmap bitmap) {
        ((ImageView) getView(i)).setImageBitmap(bitmap);
        return this;
    }

    public g setImageDrawable(int i, Drawable drawable) {
        ((ImageView) getView(i)).setImageDrawable(drawable);
        return this;
    }

    public g setImageResource(int i, int i2) {
        ((ImageView) getView(i)).setImageResource(i2);
        return this;
    }

    public g setMax(int i, int i2) {
        ((ProgressBar) getView(i)).setMax(i2);
        return this;
    }

    public g setOnClickListener(int i, View.OnClickListener onClickListener) {
        getView(i).setOnClickListener(onClickListener);
        return this;
    }

    public g setOnLongClickListener(int i, View.OnLongClickListener onLongClickListener) {
        getView(i).setOnLongClickListener(onLongClickListener);
        return this;
    }

    public g setOnTouchListener(int i, View.OnTouchListener onTouchListener) {
        getView(i).setOnTouchListener(onTouchListener);
        return this;
    }

    public g setProgress(int i, int i2, int i3) {
        ProgressBar progressBar = (ProgressBar) getView(i);
        progressBar.setMax(i3);
        progressBar.setProgress(i2);
        return this;
    }

    public g setProgressDrawable(int i, int i2) {
        ((ProgressBar) getView(i)).setProgressDrawable(h.getDrawable(this.e.getResources(), i2, null));
        return this;
    }

    public g setRating(int i, float f, int i2) {
        RatingBar ratingBar = (RatingBar) getView(i);
        ratingBar.setMax(i2);
        ratingBar.setRating(f);
        return this;
    }

    public g setTag(int i, Object obj) {
        getView(i).setTag(obj);
        return this;
    }

    public g setText(int i, CharSequence charSequence) {
        ((TextView) getView(i)).setText(charSequence);
        return this;
    }

    public g setTextColor(int i, int i2) {
        ((TextView) getView(i)).setTextColor(i2);
        return this;
    }

    public g setTextColorRes(int i, int i2) {
        ((TextView) getView(i)).setTextColor(this.e.getResources().getColor(i2));
        return this;
    }

    public g setTypeface(Typeface typeface, int... iArr) {
        for (int i : iArr) {
            TextView textView = (TextView) getView(i);
            textView.setTypeface(typeface);
            textView.setPaintFlags(textView.getPaintFlags() | Uuid.SIZE_BITS);
        }
        return this;
    }

    public g setVisible(int i, boolean z) {
        getView(i).setVisibility(z ? 0 : 8);
        return this;
    }

    public void updatePosition(int i) {
        this.c = i;
    }

    public g setTag(int i, int i2, Object obj) {
        getView(i).setTag(i2, obj);
        return this;
    }

    public Object getTag(int i, int i2) {
        return getView(i).getTag(i2);
    }

    public g setText(int i, int i2) {
        ((TextView) getView(i)).setText(i2);
        return this;
    }

    public g setTextColor(int i, ColorStateList colorStateList) {
        ((TextView) getView(i)).setTextColor(colorStateList);
        return this;
    }

    public g setProgress(int i, int i2) {
        ((ProgressBar) getView(i)).setProgress(i2);
        return this;
    }

    public g setRating(int i, float f) {
        ((RatingBar) getView(i)).setRating(f);
        return this;
    }

    public g setProgressDrawable(int i, Drawable drawable) {
        ((ProgressBar) getView(i)).setProgressDrawable(drawable);
        return this;
    }
}
