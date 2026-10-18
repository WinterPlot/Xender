package com.userlabs.xshare.precondition.data;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements Cloneable {
    protected int a;
    protected int b;
    protected int d;
    protected int e;
    protected int c = 0;
    private boolean f = true;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public abstract boolean doOption(com.userlabs.xshare.precondition.f fVar, int i);

    public boolean doOption2(Context context) {
        return false;
    }

    public boolean doOption2NeedDoInBackground() {
        return false;
    }

    public boolean doOption2ReturnResultCanUse() {
        return false;
    }

    public abstract boolean doOptionBackground(Context context);

    public boolean doOptionNeedDoInBackground() {
        return false;
    }

    public boolean doOptionReturnResultCanUse() {
        return false;
    }

    public int getCondition_name_str_id() {
        return this.a;
    }

    public int getCondition_opt_text_id() {
        return this.b;
    }

    public int getFlag_drawable_id() {
        return this.e;
    }

    public int getGet_condition_state() {
        return this.c;
    }

    public int getItem_type() {
        return this.d;
    }

    public abstract int getRequestCode();

    public boolean isChecked() {
        return this.f;
    }

    public boolean isShowBtn() {
        return true;
    }

    public boolean mustReadyCondition() {
        return true;
    }

    public boolean needCheckStateInWhile() {
        return false;
    }

    public boolean needDoOption2() {
        return false;
    }

    public void setChecked(boolean z) {
        this.f = z;
    }

    public void setCondition_name_str_id(int i) {
        this.a = i;
    }

    public void setCondition_opt_text_id(int i) {
        this.b = i;
    }

    public void setFlag_drawable_id(int i) {
        this.e = i;
    }

    public void setGet_condition_state(int i) {
        this.c = i;
    }

    public void setItem_type(int i) {
        this.d = i;
    }
}
