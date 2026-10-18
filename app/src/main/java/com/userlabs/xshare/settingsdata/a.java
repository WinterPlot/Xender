package com.userlabs.xshare.settingsdata;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    private int a;
    private boolean b;
    private String c;
    private String d;
    private boolean e;
    private String f;
    private int g;
    private int h;

    public final void ensureItemCheckedChange(Context context, boolean z) {
        if (this.b != z) {
            this.b = z;
            itemCheckChange(context, z);
        }
    }

    public String getDes1() {
        return this.d;
    }

    public String getDes2() {
        return this.f;
    }

    public int getDes2DrawId() {
        return this.g;
    }

    public int getItemDrawId() {
        return this.h;
    }

    public int getItemType() {
        return this.a;
    }

    public String getTitle() {
        return this.c;
    }

    public boolean isChecked() {
        return this.b;
    }

    public boolean isHasDes2() {
        return this.e;
    }

    public abstract void itemCheckChange(Context context, boolean z);

    public abstract void itemClick(Context context);

    public void setChecked(boolean z) {
        this.b = z;
    }

    public void setDes1(String str) {
        this.d = str;
    }

    public void setDes2(String str) {
        this.f = str;
    }

    public void setDes2DrawId(int i) {
        this.g = i;
    }

    public void setHasDes2(boolean z) {
        this.e = z;
    }

    public void setItemDrawId(int i) {
        this.h = i;
    }

    public void setItemType(int i) {
        this.a = i;
    }

    public void setTitle(String str) {
        this.c = str;
    }

    public void specialHandleItemView(View... viewArr) {
    }
}
