package com.userlabs.xshare.views.piechart;

import com.userlabs.xshare.views.piechart.b;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a<T extends b<? extends d>> {
    protected float a = 0.0f;
    protected float b = 0.0f;
    private float c = 0.0f;
    private int d = 0;
    protected ArrayList<T> e;

    public a(ArrayList<T> arrayList) {
        this.e = arrayList;
        init();
    }

    private void init() {
        calcMinMax(this.e);
        calcYValueSum(this.e);
        calcYValueCount(this.e);
    }

    public void calcMinMax(ArrayList<T> arrayList) {
        if (arrayList == null || arrayList.size() < 1) {
            this.a = 0.0f;
            this.b = 0.0f;
            return;
        }
        this.b = arrayList.get(0).getYMin();
        this.a = arrayList.get(0).getYMax();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getYMin() < this.b) {
                this.b = arrayList.get(i).getYMin();
            }
            if (arrayList.get(i).getYMax() > this.a) {
                this.a = arrayList.get(i).getYMax();
            }
        }
    }

    public void calcYValueCount(ArrayList<T> arrayList) {
        this.d = 0;
        if (arrayList == null) {
            return;
        }
        int entryCount = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            entryCount += arrayList.get(i).getEntryCount();
        }
        this.d = entryCount;
    }

    public void calcYValueSum(ArrayList<T> arrayList) {
        this.c = 0.0f;
        if (arrayList == null) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            this.c = Math.abs(arrayList.get(i).getYValueSum()) + this.c;
        }
    }

    public int getDataSetCount() {
        ArrayList<T> arrayList = this.e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public ArrayList<T> getDataSets() {
        return this.e;
    }

    public float getYMax() {
        return this.a;
    }

    public float getYMin() {
        return this.b;
    }

    public int getYValCount() {
        return this.d;
    }

    public float getYValueSum() {
        return this.c;
    }
}
